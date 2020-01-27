package homework;
import java.util.Scanner;

public class homework＿1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //標準入力から読み込むスキャナを用意
        String input;
        int count = 1;

        System.out.println("akanechan: 「じゃ〜ん！プロちゃんの驚く顔が見たい野々原茜ちゃん登場ーっ！" +
                "ね、驚いた？驚いた？茜みたいなダイヤの原石を前にしてビックリしちゃった？」");

        for(;;) {
            System.out.println("話しかけてみよう！: "); //入力を促す説明文を出力
            input = in.nextLine(); //inputにユーザ入力を保存する

            if (input.equals("こんにちは")) {
                System.out.println("akanechan: 「プロちゃん元気ないね？　茜ちゃんと一緒にプリン食べる？」");
            }
            else if (input.equals("bye.")) {
                System.out.println("akanechan: 「茜ちゃん人形作って待ってるね！」");
                if (count == 1) {
                    System.out.println("え、もう帰っちゃうの？...じゃあ、また話そうね。");
                }
                else{
                    System.out.println("今日はプロちゃんとたった" + (count) + "回しか話してないよ？");
                }
                break;
            }
            else {
                System.out.println("akanechan: 「そんなことよりプロちゃん、茜ちゃんをどうプロデュースするか考えてる？」");
            }
            count += 1;
        }
    }
}