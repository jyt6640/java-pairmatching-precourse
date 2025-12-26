package pairmatching.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CourseTest {
    @DisplayName("코스 enum 생성")
    @ValueSource(strings = {"백엔드", "프론트엔드"})
    @ParameterizedTest
    void 레벨_enum_생성(String input) {
        //when&than
        assertThatCode(() -> Course.from(input))
                .doesNotThrowAnyException();
    }

    @DisplayName("다른 입력값을 입력 시 예외 발생")
    @Test
    void 다른_입력값을_입력_시_예외_발생() {
        //given
        String input = "모바일";

        //when&then
        assertThatThrownBy(() -> Course.from(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}
