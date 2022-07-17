/* Any bug found,
please report to my email, emersonvianna0@tutanota.com.

Github:https://github.com/Dragoshotter14*/

import java.util.*;
import java.util.regex.Pattern;

public class MainTranslate {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int bincode;
        int option;
        String wordcode;

        System.out.println("Hi, this is my binary code translator developed in java, hope you like it.");
        while (true) {
            System.out.print("\nYou want to convert word/number to binary code, binary code to number/word or quit the program?; please enter 1, 2 or 3 proportionally:");
            try {
                option = sc.nextInt();
                sc.nextLine();
                if (option == 1) {
                        System.out.print("Please type your binary code here: (development)");
                        bincode = sc.nextInt();
                        try {
                        } catch (InputMismatchException e){
                         System.out.print("Your number is too large for a binary code");
                         break;
                        }
                } else if (option == 2) {
                        System.out.print("Please type your phrase/word here:");
                        wordcode = sc.nextLine();
                        if (Pattern.matches("[a-zA-Z]+", wordcode))
                            for (int i=0; i<wordcode.length(); i++){
                                    char character = wordcode.charAt(i);
                                    switch (character){
                                        case 'a':
                                            System.out.print("01100001 ");
                                            break;
                                        case 'A':
                                            System.out.print("01000001 ");
                                            break;
                                        case 'b':
                                            System.out.print("01100010 ");
                                            break;
                                        case 'B':
                                            System.out.print("01000010 ");
                                            break;
                                        case 'c':
                                            System.out.print("01100011 ");
                                            break;
                                        case 'C':
                                            System.out.print("01000011 ");
                                            break;
                                        case 'd':
                                            System.out.print("01100100 ");
                                            break;
                                        case 'D':
                                            System.out.print("01000100 ");
                                            break;
                                        case 'e':
                                            System.out.print("01100101 ");
                                            break;
                                        case 'E':
                                            System.out.print("01000101 ");
                                            break;
                                        case 'f':
                                            System.out.print("01100110 ");
                                            break;
                                        case 'F':
                                            System.out.print("01000110 ");
                                            break;
                                        case 'g':
                                            System.out.print("01100111 ");
                                            break;
                                        case 'G':
                                            System.out.print("01000111 ");
                                            break;
                                        case 'h':
                                            System.out.print("01101000 ");
                                            break;
                                        case 'H':
                                            System.out.print("01001000 ");
                                            break;
                                        case 'i':
                                            System.out.print("01101001 ");
                                            break;
                                        case 'I':
                                            System.out.print("01001001 ");
                                            break;
                                        case 'j':
                                            System.out.print("01101010 ");
                                            break;
                                        case 'J':
                                            System.out.print("01001010 ");
                                            break;
                                        case 'k':
                                            System.out.print("01101011 ");
                                            break;
                                        case 'K':
                                            System.out.print("01001011 ");
                                            break;
                                        case 'l':
                                            System.out.print("01101100 ");
                                            break;
                                        case 'L':
                                            System.out.print("01001100 ");
                                            break;
                                        case 'm':
                                            System.out.print("01101101 ");
                                            break;
                                        case 'M':
                                            System.out.print("01001101 ");
                                            break;
                                        case 'n':
                                            System.out.print("01101110 ");
                                            break;
                                        case 'N':
                                            System.out.print("01001110 ");
                                            break;
                                        case 'o':
                                            System.out.print("01101111 ");
                                            break;
                                        case 'O':
                                            System.out.print("01001111 ");
                                            break;
                                        case 'p':
                                            System.out.print("01110000 ");
                                            break;
                                        case 'P':
                                            System.out.print("01010000 ");
                                            break;
                                        case 'q':
                                            System.out.print("01110001 ");
                                            break;
                                        case 'Q':
                                            System.out.print("01010001 ");
                                            break;
                                        case 'r':
                                            System.out.print("01110010 ");
                                            break;
                                        case 'R':
                                            System.out.print("01010010 ");
                                            break;
                                        case 's':
                                            System.out.print("01110011 ");
                                            break;
                                        case 'S':
                                            System.out.print("01010011 ");
                                            break;
                                        case 't':
                                            System.out.print("01110100 ");
                                            break;
                                        case 'T':
                                            System.out.print("01010100 ");
                                            break;
                                        case 'u':
                                            System.out.print("01110101 ");
                                            break;
                                        case 'U':
                                            System.out.print("01010101 ");
                                            break;
                                        case 'v':
                                            System.out.print("01110110 ");
                                            break;
                                        case 'V':
                                            System.out.print("01010110 ");
                                            break;
                                        case 'w':
                                            System.out.print("01110111 ");
                                            break;
                                        case 'W':
                                            System.out.print("01010111 ");
                                            break;
                                        case 'x':
                                            System.out.print("01111000 ");
                                            break;
                                        case 'X':
                                            System.out.print("01011000 ");
                                            break;
                                        case 'y':
                                            System.out.print("01111001 ");
                                            break;
                                        case 'Y':
                                            System.out.print("01011001 ");
                                            break;
                                        case 'z':
                                            System.out.print("01111010 ");
                                            break;
                                        case 'Z':
                                            System.out.print("01011010 ");
                                            break;
                                    }
                        }
                        else {
                            System.out.print("You did not type a phrase/word.");
                            break;
                        }
                } else if (option == 3) {
                    System.out.print("You have chosen to leave the program.");
                    break;
                } else {
                    System.out.print("You have entered the wrong number, exiting.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.print("Sorry your option is too large, leaving");
                break;
            }
        }
    }
}
