package jp.ac.uryukyu.ie.e175707;

public class Main {
    public static void main(String[] args){
        Player p1 =new Player();
        Player2 p2 = new Player2();
        System.out.println("グー　チョキ　パー　の中から１つ選んで入力してください");
        System.out.println("最初はグー、じゃんけんぽん");

        while (p1.getPon1()==p2.getPon2()){

            p1.player();
            p2.player2();
            p2.random();

            if (p1.getPon1() ==p1.getRock() && p2.getPon2()==p2.getScissors()){
                System.out.println("Player2は"+p2.getHand2()+"を出しました");
                System.out.println("あなたの勝ちです");
            }

            else if (p1.getPon1() ==p1.getScissors() && p2.getPon2()==p2.getPaper()){
                System.out.println("Player2は"+p2.getHand2()+"を出しました");
                System.out.println("あなたの勝ちです");
            }

            else if (p1.getPon1() ==p1.getPaper() && p2.getPon2()==p2.getRock()){
                System.out.println("Player2は"+p2.getHand2()+"を出しました");
                System.out.println("あなたの勝ちです");
            }

            else if (p1.getPon1() == p2.getPon2()){
                System.out.println("Player2は"+p2.getHand2()+"を出しました");
                System.out.println("あいこで");
            }
            else if (p1.getPon1()==-1){
                System.out.println("もう一度");
            }

            else {
                System.out.println("Player2は"+p2.getHand2()+"を出しました");
                System.out.println("Player2は勝利した");
            }
        }
    }
}