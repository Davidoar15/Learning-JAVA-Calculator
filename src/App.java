import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float Num1 = 0;
        float Num2 = 0;
        int option = 0;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Write first Number:");
            Num1 = sc.nextFloat();
            System.out.println("Write second Number:");
            Num2 = sc.nextFloat();

            System.out.println("Write the Operation Number to Do:\n- 1: Addition\n- 2: Subtraction\n- 3: Multiplication\n- 4: Division\n- 5: Exponentiation");
            option = sc.nextInt();
        }

        operations operation = new operations(Num1, Num2);
        float result = 0;

        switch(option) {
            case 1: result = operation.add(); break;
            case 2: result = operation.subtract(); break;
            case 3: result = operation.multp(); break;
            case 4: result = operation.split(); break;
            case 5: result = operation.power(); break;
        }

        System.out.println("Result: "+result);
    }
}
