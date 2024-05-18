package test;

import java.util.HashMap;

public class CredentialsDataBase {
    private final String loginAdmin = "admin";
    private final String passwordAdmin = "pass";
    HashMap<String, String> credentials;

    public CredentialsDataBase(){
        credentials = new HashMap<>();
        credentials.put(loginAdmin, passwordAdmin);
    }

    public String getLoginAdmin() {
        return loginAdmin;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }
}
