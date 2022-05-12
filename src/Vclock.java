import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Vclock extends Timer {

    private ArrayList<Vcpu> vcpulist;

    public Vclock(){
        vcpulist = new ArrayList<Vcpu>();
    }

    public void register(Vcpu vcpu){
        vcpulist.add(vcpu);
    }

    public void start(long delay, long period){
        TimerTask ts = new TimerTask() {
            int timestamp = 1;
            @Override
            public void run() {
                System.out.println("-----Tick#"+ timestamp +"-----");
                timestamp++;
                for(Vcpu i : vcpulist){
                    i.run();
                 }
                }
            };
        schedule(ts, delay, period);
        }

}

