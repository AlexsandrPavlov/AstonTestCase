import java.util.Scanner;

public class Stroki {
    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую фразу");
        String str1 = sc.nextLine();
        System.out.println("Введите Вторую фразу");
        String str2 = sc.nextLine();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

    }
}