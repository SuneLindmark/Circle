/* Ett program där man skriver in för och efternamn
Sune Lindmark
2018-09-26
*/
import javax.swing.JOptionPane;

public class HelloWorld {
    public static void main(String[] args) {
        
        String surname;
        String greet;
        String lastname;
        int namelength;
        
        surname = JOptionPane.showInputDialog("What is your sur name?");
        
        lastname = JOptionPane.showInputDialog("What is you last name?");
        
        greet = "Welcome" + " " + surname + " " + lastname;

        namelength = surname.length() + lastname.length();
            
            JOptionPane.showMessageDialog(null, greet);
        JOptionPane.showMessageDialog(null, "Your name has" + " " + namelength + " " + "Letters");
    }
}