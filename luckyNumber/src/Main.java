import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* In this program, after making a calculation using the textual
        and numeric information obtained from the user, a fun 'Lucky Number'
        application was made, taking into account the age of the user.
        The questions here can be increased as desired,
        the calculations can be changed as desired.
         */
        Scanner reader = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = reader.next();

        System.out.println("Hello, " + name);
        System.out.println("Which country do you live?");
        String country = reader.next();

        System.out.println("How old are you?");
        int age = reader.nextInt();

        System.out.println("What is your favorite colour?");
        String colour = reader.next();

        int numberOfNameLetters = name.length();
        int numberOfCountryLetters = country.length();
        int numberOfColourLetters = colour.length();

        int luckyNumber = 0;

        if (age < 15) {
            luckyNumber = ((numberOfNameLetters + numberOfCountryLetters - numberOfColourLetters)* age) % 10;

        } else if (age < 20) {
            luckyNumber = (age * age - (numberOfNameLetters + numberOfCountryLetters - numberOfColourLetters) ) % 10;

        } else if (age < 40) {
            luckyNumber = ((numberOfNameLetters + 2*numberOfCountryLetters - numberOfColourLetters) - age) % 10;

        } else if (age < 60) {
            luckyNumber = (age + (numberOfNameLetters + numberOfCountryLetters - numberOfColourLetters)) % 10;

        } else {
            luckyNumber = (luckyNumber * 5 - age) % 10;
                  }
        if (luckyNumber < 0)
            luckyNumber = luckyNumber * -1;

        System.out.println(luckyNumber);
    }
}