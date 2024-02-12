import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoplightPanel  extends JPanel {

    private JButton redButton, yellowButton, greenButton;
    ColorPanel topPanel, bottomPanel, middlePanel;

    public StoplightPanel() {
        this.setPreferredSize(new Dimension(300, 900));
        this.setBackground(Color.BLACK);

        topPanel = new ColorPanel(Color.GRAY);
        middlePanel = new ColorPanel(Color.GRAY);
        bottomPanel = new ColorPanel(Color.GRAY);

        this.add(topPanel);
        this.add(middlePanel);
        this.add(bottomPanel);

        redButton = new JButton("Turn on red");
        redButton.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                topPanel.setBackground(Color.RED);
                middlePanel.setBackground(Color.GRAY);
                bottomPanel.setBackground(Color.GRAY);
            }
        });

        yellowButton = new JButton("Turn on yellow");
        yellowButton.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                topPanel.setBackground(Color.GRAY);
                middlePanel.setBackground(Color.YELLOW);
                bottomPanel.setBackground(Color.GRAY);
            }
        });

        greenButton = new JButton("Turn on green");
        greenButton.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                topPanel.setBackground(Color.GRAY);
                middlePanel.setBackground(Color.GRAY);
                bottomPanel.setBackground(Color.GREEN);
            }
        });

        this.add(redButton);
        this.add(yellowButton);
        this.add(greenButton);

    }


}