package baseball.view;

import baseball.constant.PrintMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String inputNumbers(){
        System.out.printf(PrintMessage.INPUT_NUMBERS);
        return Console.readLine();
    }

    public String inputGameRestart(){
        System.out.println(PrintMessage.INPUT_RESTART_COMMAND);
        return Console.readLine();
    }
}
