import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        System.out.println("Hello Java World");
    }

    {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = in.nextLine();
            System.out.println("Name is: " + name);
            in.close();
        }
    }


