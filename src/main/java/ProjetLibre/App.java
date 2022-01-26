package ProjetLibre;

import java.util.ResourceBundle;

public class App {

    // small piece of code for login to an app
    public int userLogin(String uname, String upass) {
        ResourceBundle rb = ResourceBundle.getBundle("config");
        String userName = rb.getString("username");
        String passWord = rb.getString("password");

        if (uname.equals(userName) && upass.equals(passWord))
            return 1;
        return 0;
    }

    // Now we should test this code -> write some unit test cases

}

