import java.util.*;
public class OE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of a");
        int a;
        while (true) {
            if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            break;
            }
            else {
                System.out.println("The number entered is not an integer. Please enter an integer");
                scanner.next();
            }            
        }
        System.out.println("If you want to check if the entered number is ODD or Even so press Y or press any button to exit");
        String op = scanner.next();
        if (op.equals("Y")) {
            System.out.println("Checikng your number if it is even or odd");
            if (a % 2 == 0) {
                System.out.println("Your number is Even");
            }
            else {
                System.out.println("Your number is ODD");
            }
        }
        else {
            System.out.println("You have exited");
        }
        }

    }        