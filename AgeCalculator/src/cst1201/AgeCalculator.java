//Extra credit 1
package cst1201;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Calculates ages using a given year.
 *
 * @author Yadadye Abramov
 */
public class AgeCalculator {

    public static void main(String[] args) {
        //Get the current year.
        int currentYear = LocalDate.now().getYear();

        //Ask the user for their age.
        System.out.print("How old are you? ");

        //Create a scanner to retrieve user input.
        Scanner scanner = new Scanner(System.in);

        //Retrieve user input.
        int currentAge = scanner.nextInt();

        //Ask the user for another year.
        System.out.print("Enter another year: ");
        int anotherYear = scanner.nextInt();

        //Calculate the user's age in the year retrieved in the previous step.
        //First, we need to know how many years to add to the user's current age.
        //This will be the other year minus the current year.
        int yearsToAdd = anotherYear - currentYear;

        //Next, we add the result from above to the user's current age.
        int newAge = currentAge + yearsToAdd;

        //Finally, display the user's age in this year, but only if it's valid.
        if (newAge >= 0){
            System.out.println("You will be " + newAge + "-years-old in "
                + anotherYear + ".");}
                else {
                    System.out.println("Invalid age, Please try agian");
                
