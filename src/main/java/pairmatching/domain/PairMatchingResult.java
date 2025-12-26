package pairmatching.domain;

import java.util.List;

public class PairMatchingResult {

    private Course course;
    private Level level;
    private String mission;
    private List<Pair> pairs;

    public PairMatchingResult(Course course, Level level, String mission, List<Pair> pairs) {
        this.course = course;
        this.level = level;
        this.mission = mission;
        this.pairs = pairs;
    }

    public boolean matches(Course course, Level level, String mission) {
        return this.course.equals(course)
                && this.level.equals(level)
                && this.mission.equals(mission);
    }
}
