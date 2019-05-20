package ladder;

import ladder.domain.UserOutput;

import java.util.List;

public class Validator {
    public static void checkLadderHeight(String height) {
        try {
            Integer.parseInt(height);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(UserOutput.VIOLATE_LADDER_HEIGHT.getOutputMessage());
        }
    }

    public static void checkNumberOfResult(List<String> names, List<String> results) {
        if (names.size() != results.size()) {
            throw new IllegalArgumentException(UserOutput.VIOLATE_GAME_RESULTS.getOutputMessage());
        }
    }

    public static void checkNameForResult(List<String> names, String name) {
        if (!(name.equals("all")) && (!names.contains(name))) {
            throw new IllegalArgumentException(UserOutput.VIOLATE_PLAYER_NAME_FOR_RESULT.getOutputMessage());
        }
    }
}
