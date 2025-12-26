package pairmatching.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PairMatchingResultTest {

    @DisplayName("코스, 레벨, 미션 정보를 가진 매칭 결과 객체 생성")
    @Test
    void 코스_레벨_미션_정보를_가진_매칭_결과_객체_생성() {
        //given
        Course course = Course.BACKEND;
        Level level = Level.LEVEL1;
        String mission = "자동차경주";
        List<Pair> pairs = List.of(
                new Pair("용태", "수미"),
                new Pair ("지현", "희태")
        );

        //when&then
        assertThatCode(() -> new PairMatchingResult(course, level, mission, pairs))
                .doesNotThrowAnyException();
    }
}
