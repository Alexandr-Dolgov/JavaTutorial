import javax.swing.*;
import java.awt.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class Calculator2 {

        JPanel windowContent;
    JPanel p1;


    Calculator2(){
        windowContent = new JPanel();

        GridBagLayout gb = new GridBagLayout();
        windowContent.setLayout(gb);

        GridBagConstraints constr = new GridBagConstraints();

        //constr.x = 0;



        JPanel p1 = new JPanel();
        BoxLayout b1 = new BoxLayout(p1, BoxLayout.Y_AXIS);
        p1.setLayout(b1);

    }
}
