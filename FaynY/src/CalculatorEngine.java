import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener{

    Calculator parent;

    CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }
    public void actionPerformed(ActionEvent e){
// Получить источник текущего действия
        JButton clickedButton = (JButton) e.getSource();
// Получить текущий текст из поля вывода (“дисплея”)
// калькулятора
        String dispFieldText = parent.displayField.getText();
        // Получить надпись на кнопке

        String clickedButtonLabel = clickedButton.getText();

        parent.displayField.setText(dispFieldText + clickedButtonLabel);


    }

}
