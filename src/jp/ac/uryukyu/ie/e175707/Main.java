package jp.ac.uryukyu.ie.e175707;

public class Main {
    public static void main(String[] args){
        Player1 p1 =new Player1();//Player1オブジェクトをつくる
        Player2 p2 = new Player2();//Player2オブジェクトをつくる
        System.out.println("ぐう、ちょき、ぱあの中から１つ入力してね");
        System.out.println("最初はぐう、じゃんけん");

        while (p1.getPon1()==p2.getPon2()){//勝ち負けを判定し、あいこならもう一度行う

            p1.player1();
            p2.player2();
            p2.random();

            if (p1.getPon1() ==p1.getRock() && p2.getPon2()==p2.getScissors()){
                System.out.println("Player2は"+p2.getHand2()+"を出した");
                System.out.println("君の勝利だ");
            }

            else if (p1.getPon1() ==p1.getScissors() && p2.getPon2()==p2.getPaper()){
                System.out.println("Player2は"+p2.getHand2()+"を出した");
                System.out.println("君の勝利だ");
            }

            else if (p1.getPon1() ==p1.getPaper() && p2.getPon2()==p2.getRock()){
                System.out.println("Player2は"+p2.getHand2()+"を出した");
                System.out.println("君の勝利だ");
            }

            else if (p1.getPon1() == p2.getPon2()){
                System.out.println("Player2は"+p2.getHand2()+"を出した");
                System.out.println("あいこで");
            }
            else if (p1.getPon1()==-1){
                System.out.println("るーるをまもろう");
            }

            else {
                System.out.println("Player2は"+p2.getHand2()+"を出した");
                System.out.println("Player2は勝利した");
            }
        }
    }
}