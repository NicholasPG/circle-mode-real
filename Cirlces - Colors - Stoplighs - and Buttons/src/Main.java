import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Circle> circles = new ArrayList<Circle>();

        for (int i = 0; i < 30; i++)
            circles.add(Circle.circleMaker(5, 70, 250,
                    255, 0, 5, 0, 5));

        Collections.sort(circles, Comparator.comparingDouble(Circle::getDiameter));

        circles.forEach(System.out::println);

        StoplightPanel stoplightPanel = new StoplightPanel();
        CirclePanel circlePanel = new CirclePanel(circles);

        JFrame frame = new JFrame("Stoplight");
        frame.getContentPane().add(stoplightPanel);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        JFrame frame2 = new JFrame("Circles");

        frame2.getContentPane().add(circlePanel);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.pack();
        frame2.setVisible(true);


        JFrame frame3 = new JFrame("Color Demo");

        frame3.getContentPane().add(new ColorDemoPanel());
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.pack();
        frame3.setVisible(true);
    }
}