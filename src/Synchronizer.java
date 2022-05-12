public class Synchronizer {

    private Vcpu[] syncedCpus;
    private Vclock clock;

    public Synchronizer(Vcpu[] cpus, Vclock clock){
        setSyncedCpus(cpus);
        setClock(clock);
    }

    public void Run(){
        //clock.schedule(500, 500, syncedCpus);
    }

    public void setClock(Vclock clock) {
        this.clock = clock;
    }
    public void setSyncedCpus(Vcpu[] syncedCpus) {
        this.syncedCpus = syncedCpus;
    }

    public Vclock getClock() {
        return clock;
    }
    public Vcpu[] getSyncedCpus() {
        return syncedCpus;
    }
}
