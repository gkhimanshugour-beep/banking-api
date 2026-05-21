

import java.awt.*;
import java.awt.event.*;

public class demo {
    public static void main(String[] args) {

        Frame f = new Frame("Simple Event");

        Button b = new Button("Click Me");
        b.setBounds(100, 100, 100, 40);

        // Event Handling
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}








