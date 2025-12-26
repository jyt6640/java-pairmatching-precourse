package pairmatching.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PairTest {

    @DisplayName("크루 이름을 입력하면 페어 객체 생성")
    @Test
    void 리스트를_입력하면_페어_객체_생성() {
        //given
        String input1 = "용태";
        String input2 = "수미";

        //when&then
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

        //then
        assertThatCode(() -> result.addCrew(input))
                .doesNotThrowAnyException();
    }

    @DisplayName("크루를 추가할 때 사이즈가 3이 넘을 경우 예외 발생")
    @Test
    void 크루를_추가할_때_사이즈가_3이_넘을_경우_예외_발생() {
        //given
        String input1 = "지현";
        String input2 = "희태";

        //when
        Pair result = new Pair("용태", "수미");
        result.addCrew(input1);

        //then
        assertThatThrownBy(() -> result.addCrew(input2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }

    @DisplayName("페어를 문자열로 변환")
    @Test
    void 페어를_문자열로_변환() {
        //given
        Pair pair = new Pair("용태", "수미");
        pair.addCrew("희태");

        //when
        String result = pair.toString();

        //then
        assertThat(result).isEqualTo("용태 : 수미 : 희태");
    }
}
