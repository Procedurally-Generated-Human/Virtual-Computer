import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Vclock extends Timer {

    private ArrayList<Synchronizable> slist;

    public Vclock(){
        slist = new ArrayList<Synchronizable>();
    }

    public void register(Synchronizable vcpu){
        slist.add(vcpu);
    }

    public void start(long delay, long period){
        TimerTask ts = new TimerTask() {
            int timestamp = 1;
            @Override
            public void run() {
                System.out.println("-----Tick#"+ timestamp +"-----");
                timestamp++;
                for(Synchronizable i : slist){
                    i.run();
                 }
                }
            };
        schedule(ts, delay, period);
        }

}

