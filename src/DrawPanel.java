import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int D_W = (int) screenSize.getWidth();
    int D_H = (int) screenSize.getHeight();
    ArrayList<Drop> drops = new ArrayList<>();

    public DrawPanel() {
        for (int i = 0; i < D_W / 3; i++) {
            drops.add(new Drop(D_W, D_H));
        }

        ActionListener listener = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                for (Drop drop :
                        drops) {
                    drop.fall();
                }
                repaint();
            }
        };

        Timer timer = new Timer(10, listener);
        timer.start();
    }

    protected void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        super.paintComponent(graphics2D);
        setBackground(new Color(79, 109, 122));
        for (Drop drop :
                drops) {
            drop.show(graphics2D);
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(D_W, D_H);
    }
}
