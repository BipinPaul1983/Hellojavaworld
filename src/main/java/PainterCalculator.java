import java.util.Scanner;

public class PainterCalculator {

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to WallPaintCalculator App");
        System.out.println("Enter the values in meter square only");
        System.out.println("Please enter the details below to find the area of wall to be painted");

       /*
       int NumberOfRooms = Integer.parseInt(input.nextLine());
        System.out.println("How many rooms are there?");
        if(NumberOfRooms>0);
        */

        System.out.println("Height of the wall to paint:");
        double HeightOfWall = Double.parseDouble(input.nextLine());
        System.out.println("Width of the wall to paint:");
        double WidthOfWall = Double.parseDouble(input.nextLine());
        double AreaOfWall= HeightOfWall * WidthOfWall;
        System.out.println("The area of wall to paint is:" + AreaOfWall);

        System.out.println("Please enter the details of windows and doors");

        System.out.println("How many windows are there?");
        double NumberOfWindows = Double.parseDouble(input.nextLine());
        System.out.println("Enter the height of window:");
        double  HeightOfWindows= Double.parseDouble(input.nextLine());
        System.out.println("Enter the width of window:");
        double  WidthOfWindows= Double.parseDouble(input.nextLine());
        double TotalAreaOfWindows= NumberOfWindows*HeightOfWindows*WidthOfWindows;

        System.out.println("How many doors are there?");
        double NumberOfDoors = Double.parseDouble(input.nextLine());
        System.out.println("Enter the height of door:");
        double  HeightOfDoor= Double.parseDouble(input.nextLine());
        System.out.println("Enter the width of door:");
        double  WidthOfDoor= Double.parseDouble(input.nextLine());
        double TotalAreaOfDoors= NumberOfDoors*HeightOfDoor*WidthOfDoor;
        double ActualArea=AreaOfWall-(TotalAreaOfWindows+TotalAreaOfDoors);

        System.out.println("Actual area of wall to paint is:" +ActualArea );

        double TotalAmountOfPaintRequired=ActualArea/12 ;
        System.out.println("Amount of paint required to paint this area is :" + TotalAmountOfPaintRequired + "litres");


    }
}

