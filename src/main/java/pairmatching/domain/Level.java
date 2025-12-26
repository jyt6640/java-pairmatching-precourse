package pairmatching.domain;

public enum Level {
    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private String name;

    Level(String name) {
        this.name = name;
    }

    public static Level from(String input) {
        for (Level level : Level.values()) {
            if (level.name.equals(input)) {
                return level;
            }
        }
        throw new IllegalArgumentException("[ERROR] 유효하지 않은 입력값입니다.");
    }
}
