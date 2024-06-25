package state;

public class MyProgram {
    public static void main(String[] args){
        final ModeSwitch modeSwitch = new ModeSwitch();

        for (int i=0;i<4;i++){
            modeSwitch.onSwitch();
        }
    }
}
