public class AdvanceRemote extends Remote{
    public AdvanceRemote(Device ob) {
        super(ob);
    }

    public void toggleMute(){

            device.setVolume(0);
            System.out.println("Device muted. Volume :"+device.getVolume());
        }
}
