import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class DataBase{
     final ArrayList<Product> arrayListOfProducts;
     double profit = 0;

    public DataBase() {
        this.arrayListOfProducts = new ArrayList<>();
    }
    public void addProduct(Product product){
        arrayListOfProducts.add(product);
    }

    public void deleteProduct(Product product) {
        if (arrayListOfProducts.contains(product)){
            arrayListOfProducts.remove(product);
        }else{
            System.out.println("No such product in database!");
        }
    }
    public void searchForProduct(Product product){
        if(arrayListOfProducts.contains(product)){
           int index = arrayListOfProducts.indexOf(product);
            System.out.println(arrayListOfProducts.get(index));

        }else {
            System.out.println("No such product in database!");
        }
    }
    public void sellProduct(Product product,int quantity){
        if(arrayListOfProducts.contains(product)){
            if(quantity <= product.getQuantity()){
                product.setQuantity(product.getQuantity() - quantity);
                profit = quantity * (product.getSellPrice() - product.getBuyPrice());
                System.out.println("Current profit = " + profit);
        }if(quantity <= product.getQuantity()){
                System.out.println("Not enough products!");
            } else {
            System.out.println("No such product in database!");
        }
    }
    }
    public void buyProduct(Product product,int quantity){
        if(arrayListOfProducts.contains(product)){
            product.setQuantity(quantity + product.getQuantity());
            profit = profit - quantity * product.getBuyPrice();
            System.out.println("Current profit = " + profit);
        }else{
            System.out.println("Such product doesn't exist!");
        }

        }
        /// oblicz podatek
    public void modify(Product product){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can edit buy price, sell price, and name");
        System.out.println("""
                (B)uy price
                (S)ell price
                (N)ame
                """);
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("b")){
            System.out.println("Type in the new buy price");
            product.setBuyPrice(scanner.nextDouble());
            System.out.println("The new buy price for " + product.getName() + " is " + product.getBuyPrice());
        } else if (input.equalsIgnoreCase("s")) {
            System.out.println("Type in the new sell price");
            product.setSellPrice(scanner.nextDouble());
            System.out.println("The new sell price for " + product.getName() + " is " + product.getSellPrice());
        }else{
            product.setName(scanner.nextLine());
            System.out.println("The new name for " + product.getName() + " is " + product.getName());
        }
    }

    @Override
    public String toString() {
       return Arrays.deepToString(arrayListOfProducts.toArray());
    }
}
