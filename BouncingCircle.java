import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class BouncingCircle extends JPanel {
    private double x = 100;
    private double y = 100;
    private double velocityX = 3;
    private double velocityY = 2;
    private final int diameter = 60;

    public BouncingCircle() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);

        Timer timer = new Timer(16, e -> {
            updatePosition();
            repaint();
        });
        timer.start();
    }

    private void updatePosition() {
        x += velocityX;
        y += velocityY;

        if (x <= 0 || x + diameter >= getWidth()) {
            velocityX *= -1;
        }
        if (y <= 0 || y + diameter >= getHeight()) {
            velocityY *= -1;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw circle with gradient
        GradientPaint gradient = new GradientPaint(
                (float) x, (float) y, new Color(64, 224, 208),
                (float) (x + diameter), (float) (y + diameter), new Color(138, 43, 226)
        );
        g2d.setPaint(gradient);
        g2d.fill(new Ellipse2D.Double(x, y, diameter, diameter));

        // Add glow effect
        g2d.setColor(new Color(64, 224, 208, 50));
        g2d.setStroke(new BasicStroke(3));
        g2d.draw(new Ellipse2D.Double(x - 5, y - 5, diameter + 10, diameter + 10));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bouncing Circle");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new BouncingCircle());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}