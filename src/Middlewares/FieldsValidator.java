
package Middlewares;

import Model.User;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ibarra
 */
public class FieldsValidator {
    
    User admin = new User("admin", "admin", "admin");
    User user = new User("guest", "guest", "user");
    User def = new User("", "");
    public boolean validateBlank(Object[] j){
        for (Object j1 : j) {
            if (j1.getClass().getSimpleName().equals("JPasswordField")) {
                JPasswordField pass = (JPasswordField) j1;
                if(pass.getText().equals("********") || pass.getPassword().equals("")) return false;
            }
            if (j1.getClass().getSimpleName().equals("JTextField")) {
                JTextField txt = (JTextField) j1;
                if (txt.getText().equals("Ingrese su nombre de usuario") || txt.getText().equals("")) return false;
            }
        }
        return true;
    }
    
    public boolean validate(String username, String password){
        
        return "admin".equals(username) && "admin".equals(password);
        
    }
    
    
    public User getUser(String username,String password){
        if (username.equals("admin") && password.equals("admin")) return admin;
        if (username.equals("guest")&& password.equals("guest")) return user;
    
        return def;
    }
    
    
}
