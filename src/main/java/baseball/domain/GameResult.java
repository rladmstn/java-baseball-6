package baseball.domain;

import baseball.constant.PrintMessage;

public class GameResult {
    private int strike = 0;
    private int ball = 0;

    public void addStrike(){
        strike++;
    }

    public void addBall(){
        ball++;
    }

    public boolean isNothing(){
        return strike == 0 && ball == 0;
    }

    public boolean end(){
        return strike == 3;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        if(ball>0){
            builder.append(ball).append(PrintMessage.BALL).append(" ");
        }
        if(strike>0){
            builder.append(strike).append(PrintMessage.STRIKE);
        }
        if(isNothing()){
            builder.append(PrintMessage.NOTHING);
        }
        return builder.toString();
    }
}
