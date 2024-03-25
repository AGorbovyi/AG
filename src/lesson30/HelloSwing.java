import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class HelloSwing extends JFrame {

    private Random random;

    private final Color[] COLORS = {Color.red, Color.green, Color.blue, Color.yellow, Color.magenta};

    private int CIRCLE_COUNT = 100;

    public static void main(String[] args){
        new HelloSwing();
    }

    public HelloSwing() {
        setTitle("Hello, Swing!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);

        random = new Random();

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);

        JButton btnDraw = new JButton("First");
        JButton btnExit = new JButton("Second");

        btnDraw.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.repaint();
            }
        });

        btnExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        Panel btnPanel = new Panel();
        btnPanel.setLayout(new GridLayout());
        btnPanel.add(btnDraw);
        btnPanel.add(btnExit);

        add(btnPanel, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
    }

    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int i = 0; i < CIRCLE_COUNT; i++) {
                int d = random.nextInt(20) + 60;
                int x = random.nextInt(getWidth() - d);
                int y = random.nextInt(getHeight() - d);
                Color color = COLORS[random.nextInt(COLORS.length)];
                g.setColor(color);
                g.fillOval(x, y, d, d);
                g.setColor(Color.black);
                g.drawOval(x, y, d, d);
            }
        }

    }


}
