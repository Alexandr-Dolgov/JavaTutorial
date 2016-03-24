package listener;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MyFocusListener implements FocusListener {

    public void focusGained(FocusEvent e) {
        System.out.println("фокус пришел");
    }

    public void focusLost(FocusEvent e) {
        System.out.println("фокус ушел");
    }
}
