package com.swe.design.composition.tournament.newTree;

import com.swe.design.composition.tournament.old_fashion_tree.Match;

public class BranchNode extends Node {
  private Node leftBranch;
  private Node rightBranch;

  public BranchNode() {
    super();
  }

  public BranchNode(Match match) {
    super(match);
  }

  @Override
  public void printAll() {
    System.out.println(match.getMatchName());
    leftBranch.printAll();
    rightBranch.printAll();
  }

  public void setLeftBranch(Node branchNode) {
    this.leftBranch = branchNode;
  }

  public void setRightBranch(Node branchNode) {
    this.rightBranch = branchNode;
  }

}
