import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the item: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per unit: ");
        double unitPrice = scanner.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.println("\n--- Purchase Summary ---");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Cost: $" + totalCost);

        scanner.close();
    }
}