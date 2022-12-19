public class WorkInThread extends Thread {
    @Override
    public void run() {
        for(int i =0;i<=100;i++){
            System.out.println(i + " Watek nr : " + Thread.currentThread().getId());
        }
    }
}
