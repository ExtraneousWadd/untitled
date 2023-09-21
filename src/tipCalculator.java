import java.util.Scanner;
public class tipCalculator {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people do you have in your group?: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What is your tip percent? (0-100): ");
        int tipPercent = scan.nextInt();
        scan.nextLine();


        double total = 1;
        double food = 0;
        while (food != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g, 12.50 (-1 to end): ");
            food = scan.nextDouble();
            total += food;
        }


        double tipAmount = total * (tipPercent * 0.01);
        double totalFinal = tipAmount + total;
        double perCost = total / people;
        double tipPer = tipAmount / people;
        double totalPer = totalFinal / people;
        System.out.println("-------------------------");
        System.out.println("Total bill before tip: " + total);
        System.out.println("Tip percentage: " + tipPercent + "%");
        System.out.println("Total Tip: " + tipAmount);
        System.out.println("Total bill with tip: " + totalFinal);
        System.out.println("Per person cost before tip: " + perCost);
        System.out.println("Tip per person: " + tipPer);
        System.out.println("Total cost per person: " + totalPer);
    }
}

