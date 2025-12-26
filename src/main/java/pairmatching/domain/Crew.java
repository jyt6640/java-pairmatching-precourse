package pairmatching.domain;

import java.util.List;

public class Crew {

    private Course course;
    private List<String> crewNames;

    public Crew(Course course, List<String> crewNames) {
        this.course = course;
        this.crewNames = crewNames;
    }
}
