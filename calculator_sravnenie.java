import java.util.Scanner;
public class calculator_sravnenie {

    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите действие сравнение");
        String action = sc.nextLine();
        action = sc.nextLine();
        if (action.equals("+")) {
            int sum = a + b;
            System.out.println("Результат: " + sum);
        }  else if (action.equals("-")) {
            int min = a - b;
            System.out.println("Результат: " + min);
        }  else if (action.equals("*")) {
            int mul = a * b;
            System.out.println("Результат: " + mul);
        }   else if (action.equals("/")) {
            int div = a / b;
            System.out.println("Результат: " + div);
        }   else if (action.equals("=")) {
            boolean ravn = a == b;
            System.out.println("a == b " + ravn);
            boolean ravn1 = a != b;
            System.out.println("a != b " + ravn1);
            boolean ravn2 = a < b;
            System.out.println("a < b " + ravn2);
            boolean ravn3 = a > b;
            System.out.println("a > b " + ravn3);
            boolean ravn4 = a >= b;
            System.out.println("a >= b " + ravn4);
            boolean ravn5 = a <= b;
            System.out.println("a <= b " + ravn5);
        }

    }
}