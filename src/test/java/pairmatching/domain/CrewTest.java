package pairmatching.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CrewTest {

    @DisplayName("배열로 Crew 객체 생성")
    @Test
    void 배열로_Crew_객체_생성() {
        //given
        List<String> input = new ArrayList<>();
        input.add("용태");
        input.add("수미");

        //when&than
        assertThatCode(() -> new Crew(input))
                .doesNotThrowAnyException();
    }
}
