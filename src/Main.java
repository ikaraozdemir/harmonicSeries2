import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        number = input.nextInt();

        double sum = 0, numerator = 1;
        for (int denom = 1; denom<=number; denom++){
            sum += (numerator/denom);

        }
        System.out.print("Girilen sayının harmonik serisinin toplamı :" + sum);
    }
}