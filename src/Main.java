import javax.swing.*;
import java.awt.*;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 20/04/2022, mercoledì
 **/
public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("TEST LAYOUTS");
        mainFrame.setSize(400,500);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);

        JPanel panel1 = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel1.setLayout(gridBagLayout);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel1.add(new JButton("BTN 1"),gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel1.add(new JButton("BTN 2"),gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel1.add(new JButton("BTN 3"),gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel1.add(new JButton("BTN 4"),gbc);

        JTabbedPane pane = new JTabbedPane();
        pane.addTab("tab 1",new JTextArea("textarea"));
        pane.addTab("tab 2",new JTextArea("textarea"));
        pane.addTab("tab 3",new JTextArea("textarea"));

        JTabbedPane pane2 = new JTabbedPane();
        pane2.addTab("tab 1",new JTextArea("textarea"));
        pane2.addTab("tab 2",new JTextArea("textarea"));
        pane2.addTab("tab 3",new JTextArea("textarea"));

        JTabbedPane pane3 = new JTabbedPane();
        pane3.addTab("tab 1",new JTextArea("textarea"));
        pane3.addTab("tab 2",new JTextArea("textarea"));
        pane3.addTab("tab 3",new JTextArea("textarea"));

        JTabbedPane pane4 = new JTabbedPane();
        pane4.addTab("tab 1",new JTextArea("textarea"));
        pane4.addTab("tab 2",new JTextArea("textarea"));
        pane4.addTab("tab 3",new JTextArea("textarea"));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
        panel2.add(pane);
        panel2.add(pane2);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
        panel3.add(pane3);
        panel3.add(pane4);

        mainFrame.getContentPane().add(BorderLayout.CENTER,panel1);
        mainFrame.getContentPane().add(BorderLayout.SOUTH,panel2);
        mainFrame.getContentPane().add(BorderLayout.NORTH,panel3);
    }
}
