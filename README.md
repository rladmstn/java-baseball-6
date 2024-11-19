# java-baseball

## Input

✅ 서로 다른 3자리 수를 입력한다.
```
숫자를 입력해주세요 : 123
```

✅ 게임이 끝난 경우, 재시작/종료를 구분할 1,2 중 하나를 입력한다.
```
게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
1
```

### [Input Validation]

✅ 잘못된 입력에 대해 `IllegalArgumentException`이 발생할 경우, 애플리케이션이 종료된다.

✅ 서로 다른 3자리 수를 입력할 때, 아래와 같은 경우 `IllegalArgumentException`을 발생한다.
  1. 1~9 외의 문자를 입력 할 경우, 예외가 발생한다.
  2. 3자리가 아닌 숫자를 입력 할 경우, 예외가 발생한다.

✅ 게임이 끝났을 때, 아래와 같은 경우 `IllegalArgumentException`을 발생한다.
  1. 1, 2 외의 문자를 입력할 경우, 예외가 발생한다.

## Key Function

✅ 게임 시작 시, 서로 다른 랜덤 숫자를 3개 가져와 정답으로 지정한다.
✅ 숫자 야구 게임의 룰은 아래와 같다.
  1. 스트라이크 : 같은 숫자가 같은 자리에 있는 경우
  2. 볼 : 같은 숫자가 다른 자리에 있는 경우
  3. 낫싱 : 같은 수가 없는 경우

✅ 3스트라이크가 되면 해당 게임을 종료한다.

## Output

✅ 게임 시작 시 시작 문구를 출력한다.
```
숫자 야구 게임을 시작합니다.
```

✅ 입력한 수에 대해 결과를 볼, 스트라이크 개수로 출력한다.
```
1볼 1스트라이크
```

✅ 볼, 스트라이크가 하나도 없을 경우, `낫싱`을 출력한다.
```
낫싱
```

✅ 3개 숫자를 모두 맞힐 경우, 3스트라이크 출력과 함께 게임을 종료한다.
```
3스트라이크
3개의 숫자를 모두 맞히셨습니다! 게임 종료
```