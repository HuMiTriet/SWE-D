package com.swe.design.composition.tournament.newTree;

import com.swe.design.composition.tournament.old_fashion_tree.Match;

public class LeafNode extends Node {

  public LeafNode(Match match) {
    super(match);
  }

  @Override
  public void printAll() {
    System.out.println(match.getMatchName());
  }
}
