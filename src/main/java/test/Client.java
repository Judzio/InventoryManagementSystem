package test;

public class Client {
    public static void main(String[] args) {
        LoginHandler loginHandler = new LoginHandler();
        loginHandler.loginScreen();

        MenuHandler menuHandler = new MenuHandler();
        menuHandler.menuScreen();
    }
}
