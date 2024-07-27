import action_classes.AddClass;
import action_classes.DivideClass;
import action_classes.MultiplyClass;
import action_classes.SubtractClass;
import java.util.Scanner;

public class Main {
    static int a, b;

    public static void main(String[] args) {

        int choice, result;
        Scanner scanner = new Scanner(System.in);
        showMenu();
        choice = scanner.nextInt();
        Calculater claculator = new Calculater();

        while (choice != 5) {
            switch (choice) {
                case 1:
                    getInput();
                    result = claculator.calculate(new AddClass(), a, b);
                    System.out.println("Result : " + result);
                    break;
                case 2:
                    getInput();
                    result = claculator.calculate(new SubtractClass(), a, b);
                    System.out.println("Result : " + result);
                    break;
                case 3:
                    getInput();
                    result = claculator.calculate(new MultiplyClass(), a, b);
                    System.out.println("Result : " + result);
                    break;
                case 4:
                    getInput();
                    result = claculator.calculate(new DivideClass(), a, b);
                    System.out.println("Result : " + result);
                    break;
            }
            showMenu();
            choice = scanner.nextInt();
        }
    }

    public static void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number: ");
        a = scanner.nextInt();
        System.out.println("enter second number: ");
        b = scanner.nextInt();
    }

    public static void showMenu() {
        System.out.println("*********************************************************************");
        System.out.print("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Quit\n");
        System.out.println("enter your choice: ");
        System.out.println("***********************************************************************");
    }
}