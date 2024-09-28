import javax.swing.*;
import java.awt.*;

public class DataTypesUI {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Unicode Characters Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame

        // Create a panel with a grid layout
        JPanel panel = new JPanel(new GridLayout(0, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add a label for the title
        JLabel titleLabel = new JLabel("This is bekar code", JLabel.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setForeground(Color.BLUE);
        panel.add(titleLabel);

        // Add Unicode character labels
        JLabel unicodeLabel1 = new JLabel("Unicode \\u1065: " + '\u1065', JLabel.CENTER);
        JLabel unicodeLabel2 = new JLabel("Unicode \\u0067: " + '\u0067', JLabel.CENTER);
        JLabel unicodeLabel3 = new JLabel("Unicode \\u0068: " + '\u0068', JLabel.CENTER);
        JLabel unicodeLabel4 = new JLabel("Unicode \\u0069: " + '\u0069', JLabel.CENTER);
        JLabel unicodeLabel5 = new JLabel("Unicode \\u0070: " + '\u0070', JLabel.CENTER);
        JLabel unicodeLabel6 = new JLabel("Unicode \\u0071: " + '\u0071', JLabel.CENTER);
        JLabel unicodeLabel7 = new JLabel("Unicode \\u0072: " + '\u0072', JLabel.CENTER);

        // Set font and color for Unicode labels
        Font unicodeFont = new Font("Monospaced", Font.PLAIN, 18);
        Color unicodeColor = Color.MAGENTA;

        unicodeLabel1.setFont(unicodeFont);
        unicodeLabel2.setFont(unicodeFont);
        unicodeLabel3.setFont(unicodeFont);
        unicodeLabel4.setFont(unicodeFont);
        unicodeLabel5.setFont(unicodeFont);
        unicodeLabel6.setFont(unicodeFont);
        unicodeLabel7.setFont(unicodeFont);

        unicodeLabel1.setForeground(unicodeColor);
        unicodeLabel2.setForeground(unicodeColor);
        unicodeLabel3.setForeground(unicodeColor);
        unicodeLabel4.setForeground(unicodeColor);
        unicodeLabel5.setForeground(unicodeColor);
        unicodeLabel6.setForeground(unicodeColor);
        unicodeLabel7.setForeground(unicodeColor);

        // Add labels to the panel
        panel.add(unicodeLabel1);
        panel.add(unicodeLabel2);
        panel.add(unicodeLabel3);
        panel.add(unicodeLabel4);
        panel.add(unicodeLabel5);
        panel.add(unicodeLabel6);
        panel.add(unicodeLabel7);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
