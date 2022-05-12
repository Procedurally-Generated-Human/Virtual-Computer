public class Task {

    private Task[] dependencies;

    public Task(Task[] dependencies){
        setDependencies(dependencies);
    }
    public void execute(){
        System.out.println(this + "...DONE");
    }

    public void setDependencies(Task[] dependencies) {
        this.dependencies = dependencies;
    }
    public Task[] getDependencies() {
        return dependencies;
    }
}
