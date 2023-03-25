
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList();
    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                	 System.out.print("Please enter the grocery item: ");
                	groceryList.addGroceryItem(sc.nextLine());
                    break;
                case 3:
                	 System.out.print("Current item name: ");
                     String  itemNo=sc.nextLine();
                     System.out.print("Enter new item: ");
                     String newItem=sc.nextLine();
                     groceryList.modifyGroceryItem(itemNo,newItem);
                 //  modifyItem();
                    break;
                case 4:
                	 System.out.print("Enter item name: ");
                     String  itemNo1=sc.nextLine();
                     //scanner.nextLine();
                     groceryList.removeGroceryItem(itemNo1);
                    break;
                case 5:
                	 System.out.print("Item to search for: ");
                     String searchItem=sc.nextLine();
                     if(groceryList.onFile(searchItem)){
                         System.out.println("Found "+searchItem+" in our grocery list");
                     }else
                         System.out.println(searchItem+" is not in the shopping list");
                   // searchForItem();
                    break;
                case 6:
                	 ArrayList<String > newArray=new ArrayList<String >();
                     newArray.addAll(groceryList.getGroceryList());

                     ArrayList<String > nextArray=new ArrayList< String >(groceryList.getGroceryList());

                     String[] myArray=new String[groceryList.getGroceryList().size()];
                     myArray=groceryList.getGroceryList().toArray(myArray);
                    //processArrayList();
                    break;
                case 7:
                    quit=true;
                    break;
            }
        }

    }
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println(" 0 - To print choice options.");
        System.out.println(" 1 - To print the list of grocery items.");
        System.out.println(" 2 - To add an item to the list.");
        System.out.println(" 3 - To modify an item in the list.");
        System.out.println(" 4 - To remove an item in the list.");
        System.out.println(" 5 - To search for an item in the list.");
        System.out.println(" 6 - To quit the application.");
    }

//    public static void removeItem(){
//        System.out.print("Enter item name: ");
//        String  itemNo=scanner.nextLine();
//        //scanner.nextLine();
//        groceryList.removeGroceryItem(itemNo);
//    }
//
//    public static void searchForItem(){
//        System.out.print("Item to search for: ");
//        String searchItem=scanner.nextLine();
//        if(groceryList.onFile(searchItem)){
//            System.out.println("Found "+searchItem+" in our grocery list");
//        }else
//            System.out.println(searchItem+" is not in the shopping list");
//    }
//
//    public static void processArrayList(){
//        ArrayList<String > newArray=new ArrayList<String >();
//        newArray.addAll(groceryList.getGroceryList());
//
//        ArrayList<String > nextArray=new ArrayList< String >(groceryList.getGroceryList());
//
//        String[] myArray=new String[groceryList.getGroceryList().size()];
//        myArray=groceryList.getGroceryList().toArray(myArray);
//    }


}
