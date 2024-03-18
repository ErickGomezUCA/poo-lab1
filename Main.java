import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int option = 0;
    double result = 0;
    double firstNumber;
    double secondNumber;
    Scanner sc = new Scanner(System.in);

    // Bucle para volver a entrar al menu
    do {
      System.out.print("[1] Add\n[2] Subtract\n[3] Multiply\n[4] Divide\n[0] Exit\n> ");
      option = sc.nextInt();

      // Exit
      if (option == 0) {
        System.out.println("Exiting...");

        // Manejando errores de menu
      } else if (option < 1 || option > 4) {
        System.out.println("\nInsert a valid option...\n");

        // Opciones válidas
      } else {
        // Entrada de valores
        System.out.print("\nInsert first number:\n> ");
        firstNumber = sc.nextDouble();
    
        System.out.print("Insert second number:\n> ");
        secondNumber = sc.nextDouble();

        // Considerando la opcion ingresada
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

        // Imprimir resultado
        System.out.printf("Result: %.2f\n", result);
      }
    } while (option != 0);
  }
}
