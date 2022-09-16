import java.awt.*;
import java.util.Random;

public class Drop {
    private final Random random = new Random();
    private final int x;
    private int y;
    private final int speed;
    private final int height;
    private final int len;

    public Drop(int width, int height) {
        this.height = height;
        this.x = random.nextInt(width);
        this.len = random.nextInt(20, 40);
        this.y = -1 * random.nextInt(len, height);
        this.speed = len / 3;
    }

    public void fall() {
        if (this.y > height) {
            this.y = -1 * random.nextInt(len, height);
        } else {
            this.y += speed;
        }
    }

    public void show(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setStroke(new BasicStroke(2));
        graphics2D.setPaint(new Color(219, 233, 238, len * 1000 / 255));
        graphics2D.drawLine(x, y, x, y + len);
    }
}
