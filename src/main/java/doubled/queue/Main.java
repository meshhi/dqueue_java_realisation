package doubled.queue;

public class Main {
    public static void main(String[] args) {
        DoubleQueue dq = new DoubleQueue();

        dq.pushStart("first");
        dq.pushStart("second");
        dq.pushStart("third");
        dq.pushStart(4);
        dq.pushStart(5);
        dq.pushStart(6);
        dq.pushStart(7);

        System.out.println(dq.getByIndex(2));
    }
}