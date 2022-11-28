
import java.text.DecimalFormat;
import java.util.Scanner;


public class StoreSimulatorRunner {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        StoreSimulator official = new StoreSimulator();
        //introductions and rules
        System.out.println("Welcome to The Local Market! Below are our items and prices." );
        System.out.println(official.toString());
        System.out.println("Are you ready to begin? Enter Yes to begin." );
        String answer = s.nextLine();
        boolean random = official.willSimulationRun(answer);
        System.out.println();
        System.out.println("Before you begin, note these rules: \n 1: You can enter -1 to get a random number of items up to 25. \n 2: Any number less than -1 or higher than Java's max integer will automatically be inputted as 0. \n 3: If you do not wish to not buy an item then enter 0.");
        System.out.println();

        //running the method/calculations
        while (random == true) {
            System.out.println("How many pounds of strawberries would you like to buy?");
            int input = s.nextInt();
            input = start.random(input);
            if (start.checkForNegatives(input) == true || input > Integer.MAX_VALUE) {
                input = 0;
            }
            start.numstrawBerry(input);
            System.out.println();

            System.out.println("How many bananas would you like to buy?");
            int b = s.nextInt();
            b = start.random(b);
            if (start.checkForNegatives(b) == true || b > Integer.MAX_VALUE) {
                b = 0;
            }
            start.numBananas(b);
            System.out.println();

            System.out.println("How many watermelons would you like to buy?");
            int w = s.nextInt();
            w = start.random(w);
            if (start.checkForNegatives(w) == true || w > Integer.MAX_VALUE) {
                w = 0;
            }
            start.numWatermelons(w);
            System.out.println();

            System.out.println("How many peaches would you like to buy?" );
            int p = s.nextInt();
            p = start.random(p);
            if (start.checkForNegatives(p) == true || p > Integer.MAX_VALUE) {
                p = 0;
            }
            start.numPeaches(p);
            System.out.println();

            System.out.println("How many oranges would you like to buy?");
            int o = s.nextInt();
            o = start.random(o);
            if (start.checkForNegatives(o) == true || o > Integer.MAX_VALUE) {
                o = 0;
            }
            start.numOranges(o);
            System.out.println();

            System.out.println("How many pomegranates would you like to buy?");
            int po = s.nextInt();
            po = start.random(po);
            if (start.checkForNegatives(po) == true || po > Integer.MAX_VALUE) {
                po = 0;
            }
            start.numPomegranates(po);
            System.out.println();

            System.out.println("How many pears would you like to buy?");
            int pe = s.nextInt();
            pe = start.random(pe);
            if (start.checkForNegatives(pe) == true || pe > Integer.MAX_VALUE) {
                pe = 0;
            }
            start.numPears(pe);
            System.out.println();

            StoreSimulator trip1 = new StoreSimulator(a,b,w,p,o,po,pe);
            //receipt
            System.out.println(GREEN + "<-------------------------------------->");
            System.out.println("The Local Market");
            System.out.println("29 Fort Greene Pl, Brooklyn, NY 11217");
            System.out.println();
            System.out.println(start.apple +" apples - " + "$" + df.format(trip1.costApples(a,0.99)));
            System.out.println(start.banana +" bananas - " + "$" + df.format(trip1.costBananas(b,0.75)));
            System.out.println(start.watermelon +" watermelons - " + "$" + df.format(trip1.costWatermelons(w,3.50)));
            System.out.println(start.peach +" peaches - " + "$" + df.format(trip1.costPeaches(p,1.25)));
            System.out.println(start.orange +" oranges - " + "$" + df.format(trip1.costOranges(o,1.50)));
            System.out.println(start.pomegranate +" pomegranates - " + "$" + df.format(trip1.costPomegranates(o,3.50)));
            System.out.println(start.pear +" pears - " + "$" + df.format(trip1.costPears(o,0.99)));
            System.out.println();
            System.out.println("Net Cost: $" + df.format(trip1.getNetTotal()));
            System.out.println("<-------------------------------------->");

            st = false;
        }


    }
}
