package state;

public class ModeSwitch {
    private ModeState modeState = new ModeStateLight();

    public void setState(ModeState modestate){
        this.modeState = modestate;
    }

    public void onSwitch(){
        modeState.toggle(this);
    }
}
