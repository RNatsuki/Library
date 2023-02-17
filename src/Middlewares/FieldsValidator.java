
package Middlewares;

import Model.User;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ibarra
 */
public class FieldsValidator {
    
    /*
        Definiciones de objetos de usuarios para la autenticacion
        admin es para el administrador
        user para el usuario normal
        def para un usuario no válido
    */
    
    User admin = new User("admin", "admin", "admin");
    User user = new User("guest", "guest", "user");
    User def = new User("", "");
    
    
    /*
        Método para validar
        los campos en blanco
        ingresado
    */
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
    
    
    /*
        Este metodo retorna el usuario dado por usuario y contraseña
        como no existe una base de datos todo esta siempre en tiempo
        de ejecución
    */
    
    public User getUser(String username,String password){
        if (username.equals("admin") && password.equals("admin")) return admin;
        if (username.equals("guest")&& password.equals("guest")) return user;
    
        return def;
    }
    
    public void onlyNumbers(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')|| (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
        
    }
    
    public void onlyLetters(KeyEvent evt){
        char c = evt.getKeyChar();
        //permitor letra y espacios

        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_SPACE))) {
            evt.consume();
        }
        

    }
    
    
    
}
