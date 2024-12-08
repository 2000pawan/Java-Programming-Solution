/*
Swing provides a richer set of GUI components than AWT. Swing is lightweight and provides platform-independent look and feel.

Difference:- 

AWT components are heavyweight, while Swing components are lightweight. 
AWT components are platform-dependent, while Swing components are platform-independent.
Swing provides advanced features like icons and tooltips, whereas AWT does not.

*/

import javax.swing.*;

public class awt {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JButton button = new JButton("Click Me");
        button.setBounds(50, 100, 95, 30);
        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
