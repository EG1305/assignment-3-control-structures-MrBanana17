import javax.swing.JOptionPane;

class SpeedDetector {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter your speed:");
        int speed = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, "Your speed is: " + speed);
        if (speed > 60) {
            JOptionPane.showMessageDialog(null, "Slow down! You are speeding.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}