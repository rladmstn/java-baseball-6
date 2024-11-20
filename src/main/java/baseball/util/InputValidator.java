package baseball.util;

import baseball.constant.CommandConstant;
import baseball.constant.InputErrorMessage;

public final class InputValidator {
    public static final String NUMBERS_REGEX = "[1-9][1-9][1-9]";

    public static void validateNumbers(String input){
        if(!input.matches(NUMBERS_REGEX)){
            throw new IllegalArgumentException(InputErrorMessage.INVALID_NUMBERS_FORM.get());
        }
    }

    public static void validateRestartCommand(String input){
        try{
            int command = Integer.parseInt(input);
            checkNumber(command);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException(InputErrorMessage.INVALID_NUMBER_FORM.get());
        }
    }

    private static void checkNumber(int command) {
        if(command != CommandConstant.RESTART.get() && command != CommandConstant.EXIT.get()){
            throw new IllegalArgumentException(InputErrorMessage.INVALID_NUMBER_FORM.get());
        }
    }
}
