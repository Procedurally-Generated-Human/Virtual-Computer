import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args){
    /*
        Vcpu cpu1 = new Vcpu();
        Vcpu[] cpus = {cpu1};
        Vclock vclock = new Vclock();
        Synchronizer sync = new Synchronizer(cpus, vclock);

        Task[] deps = {};
        Task t1 = new Task(deps);

        cpu1.setCurrentTask(t1);
        sync.Run();
     */
        Vcpu cpu1 = new Vcpu(1);
        Vcpu cpu2 = new Vcpu(2);
        Vcpu cpu3 = new Vcpu(3);
        Vgpu gpu1 = new Vgpu(1);
        Vgpu gpu2 = new Vgpu(2);


        Vclock vc = new Vclock();
        vc.register(cpu1);
        vc.register(cpu2);
        vc.register(cpu3);
        vc.register(gpu1);
        vc.register(gpu2);
        vc.register(new Synchronizable() {
            @Override
            public void run() {
                System.out.println("Salam");
            }
        });
        vc.start(1000, 1000);
    }


}
