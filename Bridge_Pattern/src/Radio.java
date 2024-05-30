public class Radio implements Device{

    int volume;
    int channel;
    boolean isEnable=false;
    @Override
    public boolean isEnabled() {
        return isEnable;
    }

    @Override
    public void enable() {
        isEnable=true;
    }

    @Override
    public void disable() {
        isEnable=false;

    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume=volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel=channel;
    }
}
