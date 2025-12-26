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
        validateSize(crewNames);
        crewNames.add(crew);
    }

    private void validateSize(List<String> crewNames) {
        if (crewNames.size() >= 3) {
            throw new IllegalArgumentException("[ERROR] 페어는 4명 이상일 수 없습니다.");
        }
    }

    public int size() {
        return crewNames.size();
    }

    @Override
    public String toString() {
        return String.join(" : ", crewNames);
    }
}
