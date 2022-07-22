import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
            System.out.println("Welcome to JAVA Dealership!");
            System.out.println("- Selet option 'a' to buy a car.");
            System.out.println("- Select option'b' to sell a car");
            String option=scan.nextLine();
            switch(option){
            case "a":
                System.out.println("What is your budget $ ?");
                int budget=scan.nextInt();
                if(budget>=10000){
                    System.out.println("Great, We have a Tata Avinya !");
                    System.out.println("\nDo you have insurance ? Write 'yes' or 'no' ");
                    scan.nextLine();
                    String insurance=scan.nextLine();
                    System.out.println("\nDo you have driver license ? Write 'yes' or 'no' ");
                    String driverLicense=scan.nextLine();
                    System.out.println("\n What is your CIBIL score ?");
                    int cibilScore=scan.nextInt();
                    if(insurance.equals("yes") && driverLicense.equals("yes") && cibilScore>=700){
                        System.out.println("\nSold! pleasure doing business with you .");
                    }
                    else{
                        System.out.println("\nWe are sorry you are not elibgable .");
                    }
                } 
                else{
                    System.out.println("\nSorry we don't sell car under 10,000 $");
                }
                break;
            case "b":
                System.out.println("What is your car valued at ?"); 
                int value=scan.nextInt();
                System.out.println("What is your selling price ?");
                int sellingPrice=scan.nextInt();
                if(value>sellingPrice && sellingPrice<30000){
                    System.out.println("We will buy your car . Pleasure doing business with you !");
                }
                else{
                    System.out.println("\nSorry, we are not intrested .");
                }
                break;
            default: System.out.println("\nInvaled option!");
            }
            
            scan.close();
    }
}
