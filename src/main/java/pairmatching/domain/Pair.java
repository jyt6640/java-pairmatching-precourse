package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;

public class Pair {
    private final List<String> crewNames;

    public Pair(String crew1, String crew2) {
        this.crewNames = new ArrayList<>();
        this.crewNames.add(crew1);
        this.crewNames.add(crew2);
    }

    public void addCrew(String crew) {
        crewNames.add(crew);
    }
}
