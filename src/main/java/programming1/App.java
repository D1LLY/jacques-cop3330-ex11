/*
The formula for currency conversion is derived from

c_to / c_frame = rate
where

c_to is the amount in U.S. dollars.
c_from is the amount in euros.
rate is the per-unit current exchange rate from c_from to c_to.
Example Output
How many euros are you exchanging? 81
What is the exchange rate? 1.3751
81 euros at an exchange rate of 1.3751 is
111.38 U.S. dollars.
Constraints
Ensure that fractions of a cent are rounded up to the next penny.
Use a single output statement.
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

package programming1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        int eur= in.nextInt();
        System.out.print("What is the exchange rate? ");
        double rate= in.nextDouble();

        double dol=eur*rate;

        double rownd=Math.round(dol*100)/100.0;

        //df2.setRoundingMode(RoundingMode.DOWN);
        String out=eur+ " euros at an exchange rate of "+rate + " is" + "\n"+rownd+" U.S. dollars.";

        System.out.println(out);

    }
}
