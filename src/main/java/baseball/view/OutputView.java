package baseball.view;

import baseball.constant.PrintMessage;

public class OutputView {
    public void printGameStart(){
        System.out.println(PrintMessage.OUTPUT_GAME_START);
    }

    public void printGameResult(String result){
        System.out.println(result);
    }
}
