package jp.ac.uryukyu.ie.e175707;

import java.util.Random;

/**
 * 対戦相手のじゃんけんクラス
 */
public class Player2 {
    /**
     * ぐう、ちょき、ぱあの変数
     */
    private int rock = 0;
    private int scissors = 1;
    private int paper = 2;

    private String hand2;
    private int pon2;
    int choice;

    /**
     *choiceに０〜２の乱数を入れるメゾット。
     */
    public void random(){
        Random random = new Random();
        this.choice = random.nextInt(3);
    }

    /**
     * choiceに入れた乱数をぐう、ちょき、ぱあのどれか判定するメゾット。
     * 0はぐう、1はちょき、2はぱあと判定する。
     */
    public void player2(){
        if (choice == 0){
            hand2 = "ぐう";
            pon2 = rock;
        }
        if (choice == 1){
            hand2 = "ちょき";
            pon2 = scissors;
        }
        if (choice == 2){
            hand2 = "ぱあ";
            pon2 = paper;
        }
    }

    /**
     * rockを取得します。
     * @return
     */
    public int getRock() {
        return rock;
    }

    /**
     * rockを設定します。
     * @param rock　ぐう
     */
    public void setRock(int rock) {
        this.rock = rock;
    }
    /**
     * scissorsを取得します。
     * @return
     */
    public int getScissors() {
        return scissors;
    }
    /**
     *  scissorsを設定します。
     * @param  scissors ちょき
     */
    public void setScissors(int scissors) {
        this.scissors = scissors;
    }
    /**
     * peparを取得します。
     * @return
     */
    public int getPaper() {
        return paper;
    }
    /**
     * peperを設定します。
     * @param paper　ぱあ
     *
     */
    public void setPeper(int paper) {
        this.paper = paper;
    }
    /**
     * pon2を取得します。
     * @return
     */
    public int getPon2() {
        return pon2;
    }
    /**
     * pon2を設定します。
     * @param pon2　rock,scissors,paper:(0,1,2)のどれか１つ
     */
    public void setPon2(int pon2) {
        this.pon2 = pon2;
    }
    /**
     *hand2を取得します。
     * @return
     */
    public String getHand2() {
        return hand2;
    }
    /**
     * hand2を設定します。
     * @param hand2　ぐう、ちょき、ぱあのどれか１つ
     */
    public void setHand2(String hand2) {
        this.hand2 = hand2;
    }
}