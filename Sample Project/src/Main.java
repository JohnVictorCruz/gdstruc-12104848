import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //Short cut (psvm)
        //prints out Hello World
        //System.out.println("Hello World"); //Short cut (sout)


        //get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

    }
}