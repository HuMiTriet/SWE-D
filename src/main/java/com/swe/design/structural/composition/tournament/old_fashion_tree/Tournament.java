package com.swe.design.structural.composition.tournament.old_fashion_tree;

public class Tournament {
  Tournament tournament1 = null;
  Tournament tournament2 = null;
  Match match = null;

  public void setMatch(Match match) {
    this.match = match;
  }

  public void setTournament(Tournament tournament) {
    if (tournament1 == null) {
      tournament1 = tournament;
    } else if (tournament2 == null) {
      tournament2 = tournament;
    }
  }

  public void displayWinner() {
    if (tournament1 != null && tournament2 != null) {
      System.out.println(match.getWinner());
      tournament1.displayWinner();
      tournament2.displayWinner();
    } else if (tournament1 != null) {
      System.out.println(match.getWinner());
      tournament1.displayWinner();
    } else if (tournament2 != null) {
      System.out.println(match.getWinner());
      tournament2.displayWinner();
    } else {
      System.out.println(match.getWinner());
    }
  }
}
