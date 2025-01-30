import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // to sAY HELLO
        System.out.println("Hello and welcome!");



        //  LOOP
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }


// 	Output “Hello” 5 times, using a loop
        for (int i=0; i<5; i++){
            System.out.println("Hello");
        }



//  pass mark calculator
// 1. Declare an integer variable called “mark” and assign it the value 56.
// Output whether a student has pass or failed (pass mark is 50).
// Is this enough to fully test the program? which other values of “mark” should you try?

// 3.	Amend the mark program so that it asks for a mark to be input.
//      Make sure you run it with sufficient data to fully test the program.

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter student mark: ");
        int mark = obj.nextInt();
        if (mark < 50){
            System.out.println("student has failed");
        } else{
            System.out.println("student has passed");
        }



// convert miles to kilometer (e.g: 5 miles = 8km)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter distance in miles:");

        int distance_in_miles = scan.nextInt();
        double distance_in_km = distance_in_miles * 1.609344;
        System.out.println("Distance in kilometers: " + distance_in_km +"km");



//  The program asks for a price, quantity and product name and outputs the total cost including a VAT of 20%.
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter product name:");
          Scanner sc1 = new Scanner(System.in);
          System.out.println("Enter product price:");
          Scanner sc2 = new Scanner(System.in);
          System.out.println("Enter product quantity:");

          String productName = sc.nextLine();
          double productPrice = sc1.nextDouble();
          int productQuantity = sc2.nextInt();

          double total = productPrice * productQuantity;
          double total_with_VAT = total + (total*0.02);

          System.out.println("The total price for " + productName +" is " + total_with_VAT);



// Amend 3, so that it keeps asking for a mark until the user inputs -1.
            Scanner input = new Scanner(System.in);
            int student_mark;
            while (true){
                System.out.println("Enter student mark: ");
                student_mark = input.nextInt();
                if(student_mark == -1){
                    System.out.println("student has failed");
                    break;
                }
                else{
                    System.out.println("not quite the expected value");
                }
            }

    }
}