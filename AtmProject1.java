import java.util.Scanner;

public class AtmProject1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Card Number");
        int cardType = scan.nextInt();
        switch(cardType){
            case 1111:
                System.out.println(" Your card is Rupay Card");
                break;
            case 2222:
                System.out.println(" Your card is Visa Card");
                break;
            case 3333:
                System.out.println(" Your card is Master Card");
                break;
            
            }
            System.out.println("Enter Your Pin Number");
            int cardCat = scan.nextInt();
            switch(cardCat){
                case 1234:
                    System.out.println(" Your card is normal card");
                    break;
                case 5678:
                    System.out.println(" Your card is Silver card");
                    break;
                case 9101:
                    System.out.println(" Your card is Gold card");
                    break;
                default:
                    System.out.println(" Your card is Platinum card");
            }
            System.out.println("Enter Your Pin Number");
            int pin = scan.nextInt();
            if(pin==1234){
                System.out.println("Your Pin is correct");
            }else{
                System.out.println("Your Pin is incorrect");
                System.out.println("Please enter your pin again");
                pin = scan.nextInt();
              
            
                    System.out.println("Your Pin is incorrect");
        }
            System.out.println("\nSelect an Option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Amount");
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your balance is 10000");
                    break;
                case 2:
                   
                    break;
                default:
                    System.out.println("Invalid choice");
            }
       
        System.out.println("Enter withdraw amount");
        int withdrawAmount = scan.nextInt();
        if(withdrawAmount>10000){
            System.out.println("Your withdraw amount is more than your balance");
        }else{
            System.out.println("Your withdraw amount is successful");
        }

    }
}
