package state;

public interface ModeState {
    public void toggle(ModeSwitch modeSwitch);
}

class ModeStateLight implements ModeState{
    @Override
    public void toggle(ModeSwitch modeSwitch){
        System.out.println("FROM LIGHT TO DARK");
        // 화면을 어둡게 만드는 코드
        // ..
        modeSwitch.setState(new ModeStateDark()); // 모드(state) 변경
    }
}

class ModeStateDark implements ModeState{
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("FROM DARK TO LIGHT");
        // 화면을 밝게 만드는 코드
        // ..
        modeSwitch.setState(new ModeStateLight()); // 모드 변경
    }
}
