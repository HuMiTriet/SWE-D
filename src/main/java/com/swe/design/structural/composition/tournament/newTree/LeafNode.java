package com.swe.design.structural.composition.tournament.newTree;

import com.swe.design.structural.composition.tournament.old_fashion_tree.Match;

public class LeafNode extends Node {

  public LeafNode(Match match) {
    super(match);
  }

  @Override
  public void printAll() {
    System.out.println(match.getMatchName());
  }
}
