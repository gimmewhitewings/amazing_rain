import javax.swing.*;

public class Rain extends JFrame {

    DrawPanel drawPanel = new DrawPanel();

    public Rain() {
        add(drawPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

