package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MyListener implements ActionListener, FocusListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("hello");
    }

    public void focusGained(FocusEvent e) {
        System.out.println("фокус пришел");
    }

    public void focusLost(FocusEvent e) {
        System.out.println("фокус ушел");
    }

}
