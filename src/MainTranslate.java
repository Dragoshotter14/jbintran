/* Any bug found,
please report to my email, emersonvianna0@tutanota.com.

Github:https://github.com/Dragoshotter14*/

import com.sun.source.util.SourcePositions;
import java.net.SocketOption;
import java.util.Locale;
import java.util.Scanner;

public class MainTranslate {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int bincode;
        int option;
        String wordcode;

        System.out.println("Hi, this is my binary code translator developed in java, hope you like it");
        System.out.print("\nYou want to convert word/number to binary code or binary code to number/word; please enter 1 or 2 proportionally:");
        option = sc.nextInt();
        sc.nextLine();
        System.out.println(option);
        if (option == 1) {
            System.out.print("Please type your phrase/word here:");
            wordcode = sc.nextLine();
            System.out.println(wordcode);

        }
        if (option == 2) {
            System.out.print("\nPlease enter your binary code here:");
            bincode = sc.nextInt();
        }
        else {}

        /* System.out.printf("You have entered the following binary code: %08d%n", bincode);*/
        sc.close();
    }
}