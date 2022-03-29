package com.swe.design.composition.tournament.newTree;

import com.swe.design.composition.tournament.old_fashion_tree.Match;

public class ClientNewTree {
  public static void executer() {
    Match match1 = new Match();
    match1.setPlayer1("Tam");
    match1.setPlayer2("Hoang");
    match1.setScore1(1);
    match1.setScore2(2);

    Match match2 = new Match();
    match2.setPlayer1("Triet");
    match2.setPlayer2("Thinh");
    match2.setScore1(4);
    match2.setScore2(3);

    Match finalMatch = new Match();
    finalMatch.setPlayer1(match1.getWinner());
    finalMatch.setPlayer2(match2.getWinner());
    finalMatch.setScore1(5);
    finalMatch.setScore2(10);

    Node leafOne = new LeafNode(match1);
    Node leafTwo = new LeafNode(match2);

    BranchNode branch = new BranchNode(finalMatch);
    branch.setLeftBranch(leafOne);
    branch.setRightBranch(leafTwo);

    branch.printAll();
  }
}
