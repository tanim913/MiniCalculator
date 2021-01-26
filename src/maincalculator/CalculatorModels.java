
package maincalculator;

import java.awt.HeadlessException;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculatorModels extends JFrame{
    
    private JButton btn;
    private JTextField textField;
    
    CalculatorModels(JTextField textField, JButton btn){
        this.btn = btn;
        this.textField = textField;   
    }
    
    public void CommonActionsByNumbers(){
        String enterNumber = textField.getText() + btn.getText();
        textField.setText(enterNumber);
    }
}
