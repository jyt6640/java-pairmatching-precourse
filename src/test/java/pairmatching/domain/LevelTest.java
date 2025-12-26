package pairmatching.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LevelTest {
    @DisplayName("레벨 enum 생성")
    @ValueSource(strings = {"레벨1", "레벨2", "레벨3", "레벨4", "레벨5"})
    @ParameterizedTest
    void 레벨_enum_생성(String input) {
        //when&than
        assertThatCode(() -> Level.from(input))
                .doesNotThrowAnyException();
    }

    @DisplayName("다른 입력값을 입력 시 예외 발생")
    @Test
    void 다른_입력값을_입력_시_예외_발생() {
        //given
        String input = "레벨6";

        //when&than
        assertThatThrownBy(() -> Level.from(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}
