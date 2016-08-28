/**
 * Created by Adroso360 on 28/08/2016.
 */
import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        String babyName1, babyName2, babyName3;

        // Can be looped but it can also be CTR+V :p

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a potential title for your child ");
        babyName1 = keyboard.nextLine();

        keyboard = new Scanner(System.in);
        System.out.print("Enter a potential title for your child ");
        babyName2 = keyboard.nextLine();

        keyboard = new Scanner(System.in);
        System.out.print("Enter a potential title for your child ");
        babyName3 = keyboard.nextLine();

        System.out.println(babyName1 + " " + babyName2);
        System.out.println(babyName2 + " " + babyName3 );
        System.out.println(babyName3 + " " + babyName1 );
        System.out.println(babyName1 + " " + babyName1 );
        System.out.println(babyName2 + " " + babyName2 );
        System.out.println(babyName3 + " " + babyName3 );
        System.out.println(babyName1 + " " + babyName3 );
        System.out.println(babyName2 + " " + babyName1 );
        System.out.println(babyName3 + " " + babyName2 );
    }
}
