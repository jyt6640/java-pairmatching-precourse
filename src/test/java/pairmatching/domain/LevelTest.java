package pairmatching.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.DisplayName;
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
}
