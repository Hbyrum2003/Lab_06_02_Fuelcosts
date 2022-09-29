import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        //defining variables and scanner
        Scanner in = new Scanner(System.in);
        double numberOfGallons;
        double priceOfGas;
        double fuelEfficiency;
        String trash = "";
        double costPerMiles;
        double range;
        double ppt;
        double oneHundredMileCost;
        //receiving the inputs
        System.out.println("Enter the number of gallons of gas that your car has, and the fuel efficiency and the price of gas");
        if (in.hasNextDouble()){
            numberOfGallons = in.nextDouble();
            priceOfGas = in.nextDouble();
            fuelEfficiency=in.nextDouble();
            range = numberOfGallons * fuelEfficiency;

            ppt = priceOfGas * numberOfGallons;
            oneHundredMileCost = range/ppt * 100;
            System.out.println("Your price per one hundred miles is: " + oneHundredMileCost);
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid input");
            System.out.println("please run the program again and only enter valid inputs");
            System.exit(0);
        }

    }
}
