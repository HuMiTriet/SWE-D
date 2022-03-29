package com.swe.design.composition.tournament.old_fashion_tree;

public class ClientTournament {
  public static void execute() {
    Match match1 = new Match();
    match1.setScore1(1);
    match1.setScore2(2);
    match1.setPlayer1("Player1");
    match1.setPlayer2("Player2");

    Match match2 = new Match();
    match2.setScore1(3);
    match2.setScore2(4);
    match2.setPlayer1("Player3");
    match2.setPlayer2("Player4");

    Match match3 = new Match();
    match3.setScore1(2);
    match3.setScore2(4);
    match3.setPlayer1("Player2");
    match3.setPlayer2("Player4");

    Tournament tournamentRoot = new Tournament();
    Tournament tournamentLeft = new Tournament();
    Tournament tournamentRight = new Tournament();

    tournamentLeft.setMatch(match1);

    tournamentRight.setMatch(match2);

    tournamentRoot.setMatch(match3);

    tournamentRoot.setTournament(tournamentLeft);
    tournamentRoot.setTournament(tournamentRight);

    tournamentRoot.displayWinner();

  }
}
