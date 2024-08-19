//import stuff here!
import java.util.Scanner; // import Scanner class

//Your code here
class Program6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // create Scanner object
        System.out.print("Enter the radius: ");
        
        final double pi = 3.14159;
        double radius = scanner.nextDouble(); // read user input
        double diameter = radius * 2;
        double area = Math.round((pi * (radius * radius)) * 1000.0) / 1000.0;
        double circumference = Math.round((2 * pi * radius) * 1000.0) / 1000.0;
        
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumference of the circle = " + circumference);
    }
}


//Paste console output below:
/*
    Enter the radius: 3.712
    The Radius of the circle = 3.712
    The Diameter of the circle = 7.424
    The Area of the circle = 43.288
    The Circumference of the circle = 23.323

*/
