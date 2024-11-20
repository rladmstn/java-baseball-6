package baseball.constant;

public enum CommandConstant {
    RESTART(1),
    EXIT(2);

    private final int value;
    CommandConstant(int value) {
        this.value = value;
    }

    public int get(){
        return value;
    }
}
