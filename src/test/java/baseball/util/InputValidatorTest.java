package baseball.util;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import baseball.constant.InputErrorMessage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class InputValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"","1345","a12","012"})
    @DisplayName("3자리 숫자 검증 실패")
    void validateNumbersFailed(String input) {
        assertThatThrownBy(() -> InputValidator.validateNumbers(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(InputErrorMessage.INVALID_NUMBERS_FORM.get());
    }

    @Test
    @DisplayName("3자리 숫자 검증 성공")
    void validateNumbersSuccess() {
        InputValidator.validateNumbers("457");
    }

    @ParameterizedTest
    @ValueSource(strings = {"","3","a","30dj"})
    @DisplayName("게임 종료 시 커맨드 입력 검증 실패")
    void validateRestartCommandFailed(String input) {
        assertThatThrownBy(() -> InputValidator.validateRestartCommand(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(InputErrorMessage.INVALID_NUMBER_FORM.get());
    }

    @ParameterizedTest
    @ValueSource(strings = {"1","2"})
    @DisplayName("게임 종료 시 커맨드 입력 검증 성공")
    void validateRestartCommandSuccess(String input) {
        InputValidator.validateRestartCommand(input);
    }
}