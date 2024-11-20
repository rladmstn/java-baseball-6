package baseball.service;

import baseball.domain.GameResult;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class GameService {
    private List<Integer> computer;

    public void initNumbers(){
        computer = new ArrayList<>();

        while(computer.size() < 3){
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if(!computer.contains(randomNumber)){
                computer.add(randomNumber);
            }
        }
    }

    public GameResult checkNumbersStatus(List<Integer> numbers) {
        GameResult gameResult = new GameResult();
        for(int number : numbers){
            judgeNumberStatus(numbers, number, gameResult);
        }
        return gameResult;
    }

    private void judgeNumberStatus(List<Integer> numbers, int number, GameResult gameResult) {
        if(isStrikeNumber(numbers, number)) {
            gameResult.addStrike();
            return;
        }
        if(isBallNumber(number)){
            gameResult.addBall();
        }
    }

    private boolean isStrikeNumber(List<Integer> numbers, int number) {
        return computer.contains(number) && computer.indexOf(number) == numbers.indexOf(number);
    }

    private boolean isBallNumber(int number){
        return computer.contains(number);
    }
}
