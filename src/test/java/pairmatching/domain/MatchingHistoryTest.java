package pairmatching.domain;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MatchingHistoryTest {

    private MatchingHistory history;

    @BeforeEach
    void setUp() {
        history = new MatchingHistory();
    }

    @DisplayName("매칭 결과를 저장")
    @Test
    void 매칭_결과를_저장() {
        //given
        List<Pair> pairs = List.of(new Pair("용태", "수미"));
        PairMatchingResult result = new PairMatchingResult(
                Course.BACKEND, Level.LEVEL1, "자동차경주", pairs
        );

        //when&then
        assertThatCode(() -> history.add(result))
                .doesNotThrowAnyException();
    }

    @DisplayName("매칭 이력이 있는지 조회")
    @Test
    void 매칭_이력이_있는지_조회() {
        //given
        List<Pair> pairs = List.of(new Pair("용태", "수미"));
        PairMatchingResult result = new PairMatchingResult(
                Course.BACKEND, Level.LEVEL1, "자동차경주", pairs
        );
        history.add(result);

        //when&then
        assertThat(history.exists(Course.BACKEND, Level.LEVEL1, "자동차경주")).isTrue();
        assertThat(history.exists(Course.BACKEND, Level.LEVEL1, "로또")).isFalse();
    }
}