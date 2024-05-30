public abstract class Remote {
    protected Device device;

    public Remote(Device ob) {
        this.device = ob;
    }

    public void togglePower(){
        if(device.isEnabled()){

            System.out.println("powered off");
            device.disable();
        }
        else{
            System.out.println("powered ON");
            device.enable();
        }
    }
    public void volumeUp(){
        if(device.getVolume()<100){
            device.setVolume(device.getVolume()+10);
            System.out.println("Volume :"+device.getVolume());
        }else{
            System.out.println("Max volume Reached");
        }
    }
    public  void volumeDown(){
        if(device.getVolume()>0){
            device.setVolume(device.getVolume()-10);
            System.out.println("Volume :"+device.getVolume());
        }else{
            System.out.println("Device Volume Already zero");
        }
    }
    public void channelUp(){
        if (device.getChannel()==50) {
            device.setChannel(1);
            System.out.println("Channel :" + device.getChannel());
        }else {
            device.setChannel(device.getChannel()+1);
            System.out.println("Channel :" + device.getChannel());

        }
    }

    public  void channelDown() {
        if (device.getChannel()==1) {
            device.setChannel(50);
        System.out.println("Channel :" + device.getChannel());
        }else {
            device.setChannel(device.getChannel()-1);
            System.out.println("Channel :" + device.getChannel());

        }

    }

}
