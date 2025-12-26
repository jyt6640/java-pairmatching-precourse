package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;

public class MatchingHistory {

    private final List<PairMatchingResult> matchingHistory;

    public MatchingHistory() {
        this.matchingHistory = new ArrayList<>();
    }

    public void add(PairMatchingResult result) {
        matchingHistory.add(result);
    }

    public boolean exists(Course course, Level level, String missions) {
        return matchingHistory.stream()
                .anyMatch(result -> result.matches(course, level, missions));
    }
}
