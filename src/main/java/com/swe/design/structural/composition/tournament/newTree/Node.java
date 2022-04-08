package com.swe.design.structural.composition.tournament.newTree;

import com.swe.design.structural.composition.tournament.old_fashion_tree.Match;

public abstract class Node {
  public Match match = new Match();

  public Node() {
  }

  public Node(Match match) {
    this.match.setScore1(match.getScore1());
    this.match.setScore2(match.getScore2());
    this.match.setPlayer1(match.getPlayer1());
    this.match.setPlayer2(match.getPlayer2());
  }

  public void printAll() {
  };

}
