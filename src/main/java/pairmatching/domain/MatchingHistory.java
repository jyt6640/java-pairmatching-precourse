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
}
