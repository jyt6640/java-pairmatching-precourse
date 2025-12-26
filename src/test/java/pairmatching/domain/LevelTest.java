package pairmatching.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class LevelTest {
    @DisplayName("레벨 enum 생성")
    @ValueSource(strings = {"레벨1", "레벨2", "레벨3", "레벨4", "레벨5"})
    @ParameterizedTest
    void 레벨_enum_생성(String input) {
        //when&then
        assertThatCode(() -> Level.from(input))
                .doesNotThrowAnyException();
    }

    @DisplayName("다른 입력값을 입력 시 예외 발생")
    @Test
    void 다른_입력값을_입력_시_예외_발생() {
        //given
        String input = "레벨6";

        //when&then
        assertThatThrownBy(() -> Level.from(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }

    @DisplayName("레벨에 해당하는 미션 목록 반환")
    @Test
    void 레벨에_해당하는_미션_목록_반환() {
        //given
        Level level = Level.LEVEL1;

        //when
        List<String> result = level.getMissions();

        //then
        assertThat(result).isEqualTo(List.of("자동차경주", "로또", "숫자야구게임"));
    }

    @DisplayName("해당 레벨에 존재하는 미션인지 확인")
    @CsvSource({
            "LEVEL1, 자동차경주",
            "LEVEL1, 로또",
            "LEVEL2, 장바구니",
            "LEVEL4, 성능개선"
    })
    @ParameterizedTest
    void 해당_레벨에_존재하는_미션인지_확인(Level level, String missionName) {
        //when&then
        assertThat(level.hasMission(missionName)).isTrue();
    }
}
