
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class GridControlPanelButton extends JButton {
        private Color activeColor;
        private Color inactiveColor;
        private Icon activeIcon;
        private Icon inactiveIcon;
        private boolean isActive;

        public GridControlPanelButton(Color activeColor, Color inactiveColor, Icon activeIcon, Icon inactiveIcon) {
            this.activeColor = activeColor;
            this.inactiveColor = inactiveColor;
            this.activeIcon = activeIcon;
            this.inactiveIcon = inactiveIcon;
            this.isActive = false;
            setContentAreaFilled(false);
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    isActive = !isActive;
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (isActive) {
                setIcon(activeIcon);
                setBackground(activeColor);
            } else {
                setIcon(inactiveIcon);
                setBackground(inactiveColor);
            }
            super.paintComponent(g);
        }
    }

