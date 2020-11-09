package oit.is.z0968.kaizi.janken.model;

public class Janken {
  int player;

  public Janken(int player) {
    this.player = player;
  }

  public String hand() {
    String hand = "";
    if (player == 0) {
      hand = "GU";
    } else if (player == 1) {
      hand = "TYOKI";
    } else if (player == 2) {
      hand = "PA";
    }
    return hand;
  }

  public String jankenresult() {
    String result="";
    if (player == 0) {
      result = "You Draw";
    } else if (player == 1) {
      result = "You Lose!!";
    } else {
      result = "You Win!!";
    }
    return result;
  }
}
