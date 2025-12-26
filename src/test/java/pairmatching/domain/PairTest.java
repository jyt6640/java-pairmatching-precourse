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

    @DisplayName("페어 리스트에 크루 추가 기능")
    @Test
    void 페어_리스트에_크루_추가_기능() {
        //given
        String input = "지현";

        //when
        Pair result = new Pair("용태", "수미");

        //than
        assertThatCode(() -> result.addCrew(input))
                .doesNotThrowAnyException();
    }
}
