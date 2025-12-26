package pairmatching.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Level {
    LEVEL1("레벨1", List.of("자동차경주", "로또", "숫자야구게임")),
    LEVEL2("레벨2", List.of("장바구니", "결제", "지하철노선도")),
    LEVEL3("레벨3", Collections.EMPTY_LIST),
    LEVEL4("레벨4", List.of("성능개선", "배포")),
    LEVEL5("레벨5", Collections.EMPTY_LIST),;

    private String name;
    private List<String> missions;

    Level(String name, List<String> missions) {
        this.name = name;
        this.missions = missions;
    }

    public static Level from(String input) {
        return Arrays.stream(Level.values())
                .filter(level -> level.name.equals(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 유효하지 않은 입력값입니다."));
    }

    public List<String> getMissions() {
        return missions;
    }
}
