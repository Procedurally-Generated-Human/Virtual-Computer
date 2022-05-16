public class Vcpu extends Synchronizable{

    private Task CurrentTask;
    private int id;

    public Vcpu(int id){
        setId(id);
    }

    public void run(){
        System.out.println("Cpu " +id+ " is running");
        //CurrentTask.execute();
    }

    public void setCurrentTask(Task currentTask) {
        CurrentTask = currentTask;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Task getCurrentTask() {
        return CurrentTask;
    }
    public int getId() {
        return id;
    }
}
