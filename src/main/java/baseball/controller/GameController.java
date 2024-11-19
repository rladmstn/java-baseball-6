package baseball.controller;

import baseball.constant.CommandConstant;
import baseball.domain.GameResult;
import baseball.service.GameService;
import baseball.util.InputValidator;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.Arrays;
import java.util.List;

public class GameController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final GameService gameService = new GameService();

    public void run(){
        outputView.printGameStart();
        do {
            gameService.initNumbers();
            while (true) {
                GameResult result = gameService.checkNumbersStatus(getNumbers());
                outputView.printGameResult(result.toString());
                if (result.end()) {
                    break;
                }
            }
        } while (restart());
    }

    private List<Integer> getNumbers(){
        String input = inputView.inputNumbers();
        InputValidator.validateNumbers(input);
        return Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .toList();
    }

    private boolean restart(){
        String input = inputView.inputGameRestart();
        InputValidator.validateRestartCommand(input);
        return Integer.parseInt(input) == CommandConstant.RESTART.get();
    }
}
