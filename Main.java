import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int option = 0;
    double result = 0;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.print("[1] Add\n[2] Subtract\n[3] Multiply\n[4] Divide\n[0] Exit\n> ");
      option = sc.nextInt();

      // Exit
      if (option == 0) {
        System.out.println("Exiting...");

        // Error handling
      } else if (option < 1 && option > 4) {
        System.out.println("Insert a valid option");

      } else {
        // Valid options
        System.out.print("Insert first number:\n> ");
        double firstNumber = sc.nextDouble();
    
        System.out.print("Insert second number:\n> ");
        double secondNumber = sc.nextDouble();

        switch(option) {
          case 1:
            result = Calculator.add(firstNumber, secondNumber);
          break;
    
          case 2:
            result = Calculator.subtract(firstNumber, secondNumber);
            break;
    
          case 3:
            result = Calculator.multiply(firstNumber, secondNumber);
          break;
    
          case 4: 
            result = Calculator.divide(firstNumber, secondNumber);
          break;
        }

        System.out.printf("Result: %.2f\n", result);
      }
    } while (option != 0);
  }
}
