import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scan.nextLine();

        System.out.println("Enter your age: ");

        int age = scan.nextInt();

        System.out.println("You are " + age + " years old  and your name is " + name);






    }
}
