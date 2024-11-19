package baseball.constant;

public enum InputErrorMessage {
    INVALID_NUMBERS_FORM("1~9 사이의 3자리 숫자를 입력해 주세요."),
    INVALID_NUMBER_FORM("입력은 1,2 중 하나만 입력 가능합니다.");

    private final String message;

    InputErrorMessage(String message) {
        this.message = message;
    }

    public String get(){
        return message;
    }
}
