import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k, i;
        Scanner mec = new Scanner(System.in);
        System.out.print("Üstü alınacak sayıyı giriniz: ");
        n = mec.nextInt();

        System.out.print("Üstü giriniz: ");
        k = mec.nextInt();
        int total = 1;

        //3*4 = 3 * 3 * 3 * 3

        for (i = 1; i <= k; i++) {

            total *= n;

        }

        System.out.println("Cevap: " + total);

    }
}