public class MainWorkInThread {
    public static void main(String[] args) {

        WorkInThread t1 = new WorkInThread();
        WorkInThread t2 = new WorkInThread();
        t1.run();
        t2.run();
        t1.start();
        t2.start();

    }
}
