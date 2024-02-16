import javax.swing.*;
import java.awt.*;

class GridControlPanelApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridControlPanelApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        GridLayout gridLayout = new GridLayout(4, 4);
        JPanel panel = new JPanel(gridLayout);

        for (int i = 0; i < 16; i++) {
            panel.add(new GridControlPanelButton(Color.GREEN, Color.RED, new ImageIcon("activeIcon.png"), new ImageIcon("inactiveIcon.png")));
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}