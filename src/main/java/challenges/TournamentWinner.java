package challenges;

import java.util.*;

public class TournamentWinner {
  public String tournamentWinner(
    ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
  ) {
    String winnerSoFar = null;
    int highestScoreSoFar = 0;
    Map<String, Integer> tally = new TreeMap<String, Integer>();
    for (int c = 0; c < competitions.size(); ++c) {
      ArrayList<String> competition = competitions.get(c);
      boolean isHomeWin = results.get(c) == 1;
      String team = competition.get(isHomeWin ? 0 : 1);
      int score = tallyUp(tally, team);

      if (score > highestScoreSoFar) {
        highestScoreSoFar = score;
        winnerSoFar = team;
      }
    }
    return winnerSoFar;
  }

  private static int tallyUp(Map<String, Integer> tally, String winner) {
    Integer score = tally.get(winner);

    if (score == null) {
      score = 0;
    }
    score += 3;
    tally.put(winner, score);
    return score;
  }
}
