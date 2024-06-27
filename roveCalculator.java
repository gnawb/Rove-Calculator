import java.util.*;

public class roveCalculator {
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);
        
        //Declaring varaibles necessary for calculation
        int baseMultiplier; //value is the multiple amount
        int bonusMultiplier; //value is the multiple amount
        boolean isBasedOnReferral; //determines whether the bonus is based on user spend or referral spend
        int lengthOfBonus; //in months
        double costOfUser; //monthly cost of benefits for rove of the intial user
        double costOfBonus; //monthly cost of benefits for rove of the referral bonus
        double costOfReferred; //monthly cost of benefits for rove of the referred user

        //Printing out intital info
        System.out.println("***************************************************************************");
        System.out.println("** ALL CALCULATIONS ARE DONE UNDER THE ASSUMPTION OF SPEND $1000 A MONTH **"); //temporary for now, will add more funcationalities later
        System.out.println("***************** ALL THE COSTS RETURNED ARE TOTAL COSTS ******************");
        System.out.println("***************************************************************************\n");
        
        
        //Asking for input
        System.out.print("Enter the base multiplier: ");
        baseMultiplier = input.nextInt();

        System.out.print("Enter the referral bonus multiplier: ");
        bonusMultiplier = input.nextInt();

        System.out.print("Enter (t/f) for whether or not the referral bonus is tied to the referred person: ");
        input.nextLine();
        String trueOrFalse = input.nextLine();
        if (trueOrFalse.equals("t")) {
            isBasedOnReferral = true;
        } else {
            isBasedOnReferral = false;
        }

        System.out.print("Enter the length of the referral bonus: ");
        lengthOfBonus = input.nextInt();

        //Calculations
        costOfUser = 1000 * 0.01 * baseMultiplier * lengthOfBonus;
        costOfReferred = 1000 * 0.01 * baseMultiplier * lengthOfBonus;
        if (isBasedOnReferral) { //redundant for now but will be updated
            costOfBonus = bonusMultiplier * 1000 * 0.01 * lengthOfBonus;
        } else {
            costOfBonus = bonusMultiplier * 1000 * 0.01 * lengthOfBonus;
        }

        //Output
        System.out.println("\n----------------------------------------");
        System.out.println("Over a period of " + lengthOfBonus + " month(s),");
        System.out.println("" + costOfUser);
        System.out.println("" + costOfReferred);
        System.out.println("" + costOfBonus);
        System.out.println("Total: " + (costOfUser + costOfReferred + costOfBonus));
        System.out.println("----------------------------------------");
    }
}