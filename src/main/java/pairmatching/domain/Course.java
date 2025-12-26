package pairmatching.domain;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private String name;

    Course(String name) {
        this.name = name;
    }

    public static Course from(String input) {
        for (Course course : Course.values()) {
            if (course.name.equals(input)) {
                return course;
            }
        }
        throw new IllegalArgumentException("[ERROR] 유효하지 않은 입력값입니다.");
    }
}
