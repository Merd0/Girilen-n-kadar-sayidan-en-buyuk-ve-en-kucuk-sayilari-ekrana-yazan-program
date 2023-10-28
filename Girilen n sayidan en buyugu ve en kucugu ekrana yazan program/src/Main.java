import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç sayı girceksiniz :");
        int sayi = inp.nextInt();

        System.out.print("1. Sayıyı giriniz :");
        int number1 = inp.nextInt();
        int enBüyük = number1;
        int enKücük = number1;

        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + 1 + ". Sayıyı giriniz :");
            number1 = inp.nextInt();

            if (number1 <= enKücük) {
                enKücük = number1;
            } else if (number1 > enBüyük) {
                enBüyük = number1;
            }

        }
        System.out.print("En büyük sayı :" + enBüyük );
        System.out.println("");
        System.out.print("En kücük sayı :" + enKücük);
    }
}