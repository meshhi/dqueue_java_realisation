package doubled.queue;

public class DoubleQueue {
    private ObjectBox head;
    private ObjectBox tail;
    private int size = 0;

    public void pushStart(Object value) {
        ObjectBox element = new ObjectBox();
        element.setObject(value);

        if (this.head == null && this.tail == null) {
            this.head = element;
            this.tail = element;
        } else {
            this.head.setPrev(element);
            element.setNext(this.head);
            this.head = element;
        }
        this.size++;
    }

    public void pushBack(Object value) {
        ObjectBox element = new ObjectBox();
        element.setObject(value);

        if (this.head == null && this.tail == null) {
            this.head = element;
            this.tail = element;
        } else {
            this.tail.setNext(element);
            element.setPrev(this.tail);
            this.tail = element;
        }
        this.size++;
    }

    public Object pullBack() {
        Object temp;
        if (this.size == 0)
            return null;
        temp = this.tail.getObject();
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            size--;
            return temp;
        } else {
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);
        }
        size--;
        return temp;
    }

    public Object pullStart() {
        Object temp;
        if (this.size == 0)
            return null;
        temp = this.head.getObject();
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            size--;
            return temp;
        } else {
            this.head = this.head.getNext();
            this.head.setPrev(null);
        }
        size--;
        return temp;
    }

    public Object getByIndex(int index) {
        if (index < 0 || index > this.size || size == 0) {
            return null;
        }
        int counter;
        int median = this.size / 2;
        ObjectBox temp;
        System.out.println(median);
        if (index <= median) {
            counter = 0;
            temp = this.head;
            while (counter < index) {
                counter++;
                temp = temp.getNext();
            }
            
        } else {
            counter = this.size;
            temp = this.tail;
            while (counter > index) {
                counter--;
                temp = temp.getPrev();
            }
        }
        return temp.getObject();
    }

    public int size() {
        return this.size;
    }
}