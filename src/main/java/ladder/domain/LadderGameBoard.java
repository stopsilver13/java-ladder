package ladder.domain;

import java.util.List;

public class LadderGameBoard {
    private List<String> names;
    private List<String> results;
    private Ladder ladder;

    public LadderGameBoard(List<String> names,
                           List<String> results, Ladder ladder) {
        this.names = names;
        this.results = results;
        this.ladder = ladder;
    }
}
