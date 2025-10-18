import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); // Opens the scanner


    // This question starts off the program 
    System.out.print("Do you have an iPhone or Android? "); 
    String model = input.nextLine();

    // The next 3 questions are asked to the user, no matter their input. 
    System.out.print("What year was it made? ");
    int year = input.nextInt();
    input.nextLine();  

    System.out.print("What is the price? ");
    double price = input.nextDouble();
    input.nextLine(); 

    System.out.print("How many cameras? ");
    int numCams = input.nextInt();
    input.nextLine(); 

    /* These two questions are asked to the user if 
    they answered with iPhone for the first question */
    if (model.equals("iPhone")) {
      System.out.print("Do you use a lightning cable? (true/false)"); 
      boolean usesLightningcable = input.nextBoolean();
      
      System.out.print("What iOS Update do you have installed? ");
      double iOSUpdateNum = input.nextDouble();
      input.nextLine();
      
      iPhone iphone = new iPhone(model, price, year, numCams, iOSUpdateNum, usesLightningcable);
      System.out.println(iphone);
    }

    /* If the user answered with Android for the first question, 
    this question will be asked to them. A question on their charger 
    isn't necessary since Androids have always had a USB C charger,
    unlike Apple's products that used lightning cable until September 2023. */

    
    if (model.equals("Android")) {
      System.out.print("What update are you on? ");
      String updateVersion = input.nextLine();  

      Android android = new Android(model, price, year, numCams, updateVersion);
      System.out.println(android);

      
    }

    input.close();   // Closes the scanner
  }
}