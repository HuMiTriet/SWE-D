package com.swe.design.WIP.Tournament;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Match {
  private String player1;
  private String player2;
  private int score1;
  private int score2;

  public String getWinner() {
    if (score1 > score2) {
      return player1;
    } else if (score1 < score2) {
      return player2;
    } else {
      return null;
    }
  }

}
