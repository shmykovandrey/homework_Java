public class WorkerPool {
    int maxCount;
    int currentCount = 0;
    Worker workers[];

    public WorkerPool(int maxCount){
        this.maxCount = maxCount;
        this.workers = new Worker[this.maxCount];

    }


    public Worker getWorker(){

        if (this.currentCount < this.maxCount){
            workers[this.currentCount] = new Worker(this.currentCount);
            this.currentCount++;
            return workers[this.currentCount-1];
        }else {
            this.currentCount++;
            return workers[this.currentCount % this.maxCount - 1];
        }

    }

}
