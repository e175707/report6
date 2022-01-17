package jp.ac.uryukyu.ie.e175707;

import java.util.Scanner;

public class Player{
    private int rock = 0;
    private int scissors = 1;
    private int paper = 2;
    private int pon1;

    public void player() {
        String input; 
        Scanner in = new Scanner(System.in);
        input = in.nextLine(); 

        switch (input) {
            case "グー":
                pon1 = rock;
                break;
            case "チョキ":
                pon1 = scissors;
                break;
            case "パー":
                pon1 = paper;
                break;
            default:
                pon1 = -1;
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
    public void setPaper(int paper) {
        this.paper = paper;
    }
    public int getPon1() {
        return pon1;
    }
    public void setPon1(int pon1) {
        this.pon1 = pon1;
    }
}