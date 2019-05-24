package ladder;

import ladder.domain.gamecomponent.Ladder;
import ladder.domain.gamecomponent.LadderGameResult;
import ladder.domain.gamecomponent.Players;
import ladder.domain.gamecomponent.Results;
import ladder.view.InputView;
import ladder.view.OutputView;

public class LadderGameApp {
    public static void main(String[] args) {
        Players players = new Players(InputView.getNames());
        Results results = InputView.getResult(players.getPlayerNum());
        Ladder ladder = InputView.createLadder(players.getPlayerNum());

        OutputView.printLadderGameBoard(players, results, ladder);

        LadderGame game = new LadderGame(ladder);
        game.movePlayers(players);

        LadderGameResult gameResult = new LadderGameResult(players, results);

        String inputName;

        do {
            inputName = lookupGameResult(gameResult);
        } while (!"all".equals(inputName));

        OutputView.printAllGameResults(gameResult);
        OutputView.printEnd();
    }

    private static String lookupGameResult(LadderGameResult gameResult) {
        String inputName = InputView.getNameForResult();
        if (!"all".equals(inputName)) {
            OutputView.printGameResult(inputName, gameResult);
        }
        return inputName;
    }
}
