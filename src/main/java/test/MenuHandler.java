package test;

import java.util.Scanner;

public class MenuHandler {
    private final Scanner scanner;

    public MenuHandler() {
        scanner = new Scanner(System.in);
    }

    public void menuScreen() {
        String menuTextBlock = """
                    Enter the number:
                    (1) Display product list
                    (2) Search product
                    (3) Add product
                    (4) Edit product
                    (5) Remove product
                    (6) EXIT""";
        while (true) {
            System.out.println(menuTextBlock);
            int inputNumber = scanner.nextInt();
            if(inputNumber == 6){
                break;
            }
            switch (inputNumber) {
                case 1:
                    System.out.println("PRODUCTS HAVE BEEN DISPLAYED");
                    break;
                case 2:
                    System.out.println("PRODUCT HAS BEEN DISPLAYED");
                    break;
                case 3:
                    System.out.println("PRODUCT HAS BEEN ADDED");
                    break;
                case 4:
                    System.out.println("PRODUCT HAS BEEN EDITED");
                    break;
                case 5:
                    System.out.println("PRODUCT HAS BEEN REMOVED");
                    break;
                default:
                    System.out.println("WRONG INPUT");
                    break;
            }
        }
    }
}