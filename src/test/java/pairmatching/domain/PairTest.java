package pairmatching.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PairTest {

    @DisplayName("크루 이름을 입력하면 페어 객체 생성")
    @Test
    void 리스트를_입력하면_페어_객체_생성() {
        //given
        String input1 = "용태";
        String input2 = "수미";

        //when&than
        assertThatCode(() -> new Pair(input1, input2))
                .doesNotThrowAnyException();
    }
}
