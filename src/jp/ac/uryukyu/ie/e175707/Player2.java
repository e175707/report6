package jp.ac.uryukyu.ie.e175707;

import java.util.Random;

public class Player2 {
    private int rock = 0;
    private int scissors = 1;
    private int paper = 2;
    private String hand2;
    private int pon2;
    int choice;

    public void random(){
        Random random = new Random();
        this.choice = random.nextInt(3);
    }

    public void player2(){
        if (choice == 0){
            hand2 = "グー";
            pon2 = rock;
        }
        if (choice == 1){
            hand2 = "チョキ";
            pon2 = scissors;
        }
        if (choice == 2){
            hand2 = "パー";
            pon2 = paper;
        }
    }
    public int getRock() {
        return rock;
    }
    public void setRock(int rock) {
        this.rock = rock;
    }
    public int getScissors() {
        return scissors;
    }
    public void setScissors(int scissors) {
        this.scissors = scissors;
    }
    public int getPaper() {
        return paper;
    }
    public void setPeper(int paper) {
        this.paper = paper;
    }
    public int getPon2() {
        return pon2;
    }
    public void setPon2(int pon2) {
        this.pon2 = pon2;
    }
    public String getHand2() {
        return hand2;
    }
    public void setHand2(String hand2) {
        this.hand2 = hand2;
    }
}