package test;

import java.util.Objects;
import java.util.Scanner;

public class LoginHandler extends CredentialsDataBase {
    private final Scanner scanner;
    CredentialsDataBase credentialsDataBase;
    public LoginHandler(){
        credentialsDataBase = new CredentialsDataBase();
        scanner = new Scanner(System.in);
    }
    public void loginScreen(){
        while(true){
            System.out.println("Enter the login: ");
            String login = scanner.nextLine();
            System.out.println("Enter the password: ");
            String pass = scanner.nextLine();
            if(credentials.containsKey(login)){
                if(Objects.equals(credentials.get(login), pass)){
                    System.out.println("Login succeed");
                    break;
                }
                else{
                    System.out.println("Wrong password");
                }
            }
            else{
                System.out.println("User doesn't exist");
            }
        }
    }

}
