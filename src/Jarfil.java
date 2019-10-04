import java.util.Scanner;

public class Jarfil {
    public static void main (String[] args) {
        double number1;
        double number2;
        String input;
        String plus = "plus";
        String minus = "minus";
        String gange = "gange";
        String divider = "divider";

        System.out.println("Skriv operation - ( plus, minus, gange, divider ) og derefter 2 tal");
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        number1 = scan.nextDouble();
        number2 = scan.nextDouble();

        if (plus.equals(input)) {
            System.out.println(number1 + number2);

        } else if (minus.equals(input)) {
            System.out.println(number1 - number2);

        } else if (gange.equals(input)) {
            System.out.println(number1 * number2);

        } else if (divider.equals(input)) {
            System.out.println(number1 / number2);

        }
        else {
            System.out.println("Det er ikke et gyldigt svar");
        }











    }
}
