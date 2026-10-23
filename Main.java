import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int subtotal = 0;
        int items = 0;
        int choice = 0;

        while (choice != 5) {
            System.out.println("===== SIMPLE STORE =====");
            System.out.println();
            System.out.println("1. Mouse        - $20");
            System.out.println("2. Keyboard     - $40");
            System.out.println("3. Headphones   - $50");
            System.out.println("4. Laptop Stand - $30");
            System.out.println("5. Checkout");
            System.out.println();
            System.out.print("Choose a product: ");
            choice = scanner.nextInt();
            System.out.println();

            if (choice == 5) {
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid option.");
                System.out.println("Please choose a number from 1 to 5.");
                System.out.println();
                continue;
            }

            String name = "";
            int price = 0;
            if (choice == 1) {
                name = "Mouse";
                price = 20;
            } else if (choice == 2) {
                name = "Keyboard";
                price = 40;
            } else if (choice == 3) {
                name = "Headphones";
                price = 50;
            } else if (choice == 4) {
                name = "Laptop Stand";
                price = 30;
            }

            System.out.println("You selected: " + name);
            System.out.println("Price: $" + price);
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            System.out.println();

            if (quantity <= 0) {
                System.out.println("Invalid quantity.");
                System.out.println("Quantity must be greater than 0.");
                System.out.println();
                continue;
            }

            int cost = quantity * price;
            subtotal = subtotal + cost;
            items = items + quantity;

            System.out.println(quantity + " x $" + price + " = $" + cost);
            System.out.println("Added to cart!");
            System.out.println("Current total: $" + subtotal);
            System.out.println();
        }

        System.out.println("===== CHECKOUT =====");
        System.out.println();
        System.out.println("Items purchased: " + items);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println();

        int discount = 0;
        if (subtotal >= 100) {
            discount = subtotal / 10;
            System.out.println("You received a 10% discount!");
        }
        int finalTotal = subtotal - discount;

        System.out.println("Discount: $" + discount);
        System.out.println("Final total: $" + finalTotal);
        System.out.println();

        System.out.print("Enter payment amount: $");
        int payment = scanner.nextInt();
        System.out.println();

        while (payment < finalTotal) {
            System.out.println("Insufficient payment.");
            System.out.println("You still need to pay: $" + (finalTotal - payment));
            System.out.println();
            System.out.print("Enter payment amount: $");
            payment = scanner.nextInt();
            System.out.println();
        }

        int change = payment - finalTotal;
        System.out.println("Payment successful!");
        System.out.println();

        System.out.println("========================");
        System.out.println("       SIMPLE STORE");
        System.out.println("========================");
        System.out.println();
        System.out.println("Items purchased: " + items);
        System.out.println("Subtotal:     $" + subtotal);
        System.out.println("Discount:     $" + discount);
        System.out.println("Final total:  $" + finalTotal);
        System.out.println("Payment:      $" + payment);
        System.out.println("Change:       $" + change);
        System.out.println();
        System.out.println("========================");
        System.out.println("Thank you for shopping!");
        System.out.println("========================");
    }
}

