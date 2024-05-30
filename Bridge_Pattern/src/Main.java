
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]   args) {

        TV tcl=new TV();
        AdvanceRemote AR =new AdvanceRemote(tcl);
        System.out.println(tcl.isEnabled());
        AR.togglePower();
        AR.channelUp();
        AR.volumeUp();
        AR.channelUp();
        AR.channelDown();

        AR.togglePower();

        Radio radio=new Radio();
        BasicRemote BR =new BasicRemote(radio);
        System.out.println(radio.isEnabled());
        BR.togglePower();
        BR.channelUp();
        BR.volumeUp();
        BR.channelUp();
        BR.channelDown();

        BR.togglePower();
    }
}