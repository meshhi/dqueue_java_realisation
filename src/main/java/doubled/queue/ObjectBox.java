package doubled.queue;

class ObjectBox {
    private Object object;
    private ObjectBox next;
    private ObjectBox prev;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return this.object;
    }

    public void setNext(ObjectBox next) {
        this.next = next;
    }

    public void setPrev(ObjectBox prev) {
        this.prev = prev;
    }

    public ObjectBox getNext() {
        return this.next;
    }

    public ObjectBox getPrev() {
        return this.prev;
    }
}