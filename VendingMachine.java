//import statement
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class VendingMachine{

    public static void main(String [] args){

        //Scanner Object
        Scanner scan = new Scanner(System.in);

        String itemsInMachine = "1.Assorted Chips - $ 0.75\n2.Chewing Gum $ 0.10\n3.Hard Mints $0.15"+
        "\n4.Bottled Soda $1.25\n5.Canned Soda $0.50\n6.Honey Bun $0.50\n7.Cupcakes $0.50\n8.Bottled Water $1.00"+
        "\n9.Gummy Candy $1.00\n10.Hard Candy $1.00";

        ArrayList<String> boughtItems = new ArrayList<String>();
        double EnteredAmount=0;
        int selection;
        char choice;

        System.out.println("-- VENDING MACHINE --");
        System.out.println(itemsInMachine);

        System.out.println("\nPlease take a look at the options in the vending machine and then make a selection.\nEnter your money below: ");
        EnteredAmount = scan.nextDouble();
        double deduction = 0;

        System.out.println("You have entered: $"+ EnteredAmount);

        
        do{

            System.out.println("\nEnter the corresponding number to the item from the vending machine:");
            selection = scan.nextInt();


            switch(selection){

                case 1:
                    if(EnteredAmount <0.75){
                        System.out.println("\nUnsufficent Funds\nChoose another item.");
                        
                    }else{

                        EnteredAmount = EnteredAmount - 0.75;
                        deduction+=0.75;
                        EnteredAmount = Math.round(EnteredAmount * Math.pow(10,2))/Math.pow(10,2);
                        System.out.println("You have $" + EnteredAmount + " left.");
                        boughtItems.add("Assorted Chips");
                        
                    }
                    break;

                case 2:
                    
                    if(EnteredAmount < 0.10){
                        System.out.println("\nUnsufficent Funds\nChoose another item.");
                    }else{

                        EnteredAmount = EnteredAmount - 0.10;
                        deduction+=0.10;
                        EnteredAmount = Math.round(EnteredAmount * Math.pow(10,2))/Math.pow(10,2);
                        System.out.println("You have $" + EnteredAmount + " left.");
                        boughtItems.add("Chewing Gum");
                    }
                    break;

                case 3:
                    if(EnteredAmount < 0.15){
                        System.out.println("\nUnsufficent Funds\nChoose another item.");
                    }else{

                        EnteredAmount = EnteredAmount - 0.15;
                        deduction+=0.15;
                        EnteredAmount = Math.round(EnteredAmount * Math.pow(10,2))/Math.pow(10,2);
                        System.out.println("You have $" + EnteredAmount + " left.");
                        boughtItems.add("Hard Mints");
                    }
                    break;

                case 4:
                    if(EnteredAmount < 1.25){
                        System.out.println("\nUnsufficent Funds\nChoose another item.");
                    }else{

                        EnteredAmount = EnteredAmount - 1.25;
                        deduction+=1.25;
                        EnteredAmount = Math.round(EnteredAmount * Math.pow(10,2))/Math.pow(10,2);
                        System.out.println("You have $" + EnteredAmount + " left.");
                        boughtItems.add("Bottled Soda");
                    }
                    break;
                
                case 5:
                    if(EnteredAmount < 0.50){
                        System.out.println("\nUnsufficent Funds\nChoose another item.");
                    }else{

                        EnteredAmount = EnteredAmount - 0.50;
                        deduction+=0.50;
                        EnteredAmount = Math.round(EnteredAmount * Math.pow(10,2))/Math.pow(10,2);
                        System.out.println("You have $" + EnteredAmount + " left.");
                        boughtItems.add("Canned Soda");
                    }
                    break;

                case 6:
                    if(EnteredAmount < 0.50){
                        System.out.println("\nUnsufficent Funds\nChoose another item.");
                    }else{

                        EnteredAmount = EnteredAmount - 0.50;
                        deduction+=0.50;
                        EnteredAmount = Math.round(EnteredAmount * Math.pow(10,2))/Math.pow(10,2);
                        System.out.println("You have $" + EnteredAmount + " left.");
                        boughtItems.add("Honey Bun");
                    }
                    break;
                
                case 7:
                    if(EnteredAmount < 0.50){
                        System.out.println("\nUnsufficent Funds\nChoose another item.");
                    }else{

                        EnteredAmount = EnteredAmount - 0.50;
                        deduction+=0.50;
                        EnteredAmount = Math.round(EnteredAmount * Math.pow(10,2))/Math.pow(10,2);
                        System.out.println("You have $" + EnteredAmount + " left.");
                        boughtItems.add("Cupcakes");
                    }
                    break;

                case 8:
                    if(EnteredAmount < 1.00){
                        System.out.println("\nUnsufficent Funds\nChoose another item.");
                    }else{

                        EnteredAmount = EnteredAmount - 1.00;
                        deduction+=1.00;
                        EnteredAmount = Math.round(EnteredAmount * Math.pow(10,2))/Math.pow(10,2);
                        System.out.println("You have $" + EnteredAmount + " left.");
                        boughtItems.add("Bottled Water");
                    }
                    break;

                case 9:
                    if(EnteredAmount < 1.00){
                        System.out.println("\nUnsufficent Funds\nChoose another item.");
                    }else{

                        EnteredAmount = EnteredAmount - 1.00;
                        deduction+=1.00;
                        EnteredAmount = Math.round(EnteredAmount * Math.pow(10,2))/Math.pow(10,2);
                        System.out.println("You have $" + EnteredAmount + " left.");
                        boughtItems.add("Gummy Candy");
                    }
                    break;
                
                case 10:
                    if(EnteredAmount < 1.00){
                        System.out.println("\nUnsufficent Funds\nChoose another item.");
                    }else{

                        EnteredAmount = EnteredAmount - 1.00;
                        deduction+=1.00;
                        EnteredAmount = Math.round(EnteredAmount * Math.pow(10,2))/Math.pow(10,2);
                        System.out.println("You have $" + EnteredAmount + " left.");
                        boughtItems.add("Hard Candy");
                    }
                    break;

                default:
                    System.out.println("ERROR - Invalid input");


            }

            System.out.println("\nWould you like to select something different or something else?\nEnter 'Y' to continue or 'N' to end:");
            choice = scan.next().toUpperCase().charAt(0);



        }while(choice == 'Y');

        System.out.println("//////////////////////////////");
        System.out.println("Items Bought in Total: " + boughtItems);
        System.out.println("Money Spent: $" + deduction);
        System.out.println("Money left over: $"+ EnteredAmount);

        //close scanner
        scan.close();


    }
}