public class Vgpu implements Synchronizable {

    private int id;

    public Vgpu(int id){
        setId(id);
    }

    private void setId(int id) {
        this.id = id;
    }

    public void run(){
        System.out.println("Gpu " +id+ " is running");
    }
}
