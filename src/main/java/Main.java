public class Main {
    public static void main(String[] args) {
        WorkerPool wp = new WorkerPool(3);
        System.out.println(wp.getWorker().doWork("fine work"));
        System.out.println(wp.getWorker().doWork("fine work1"));
        System.out.println(wp.getWorker().doWork("fine work2"));
        System.out.println(wp.getWorker().doWork("fine work3"));
        System.out.println(wp.getWorker().doWork("fine work4"));




    }
}
