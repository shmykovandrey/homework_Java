public class Worker {
    int id;
    public Worker(int number){
        this.id = number;
    }
    public String doWork(String taskSummary){
        return "Worker "+ this.id+ " is doing " + taskSummary;
    }
}
