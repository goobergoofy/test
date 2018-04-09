package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JRadioButton simple = new JRadioButton("Simple");
    private JRadioButton moderate = new JRadioButton("Moderate");
    private JRadioButton complex = new JRadioButton("Complex");
    private ButtonGroup buttonGroup = new ButtonGroup();
    private int difficulty;

    public Main() {
        buttonGroup.add(simple);
        buttonGroup.add(moderate);
        buttonGroup.add(complex);

        simple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                difficulty = 1;
            }
        });
        moderate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                difficulty = 2;
                simple.setSelected(false);
                complex.setSelected(false);
            }
        });
        complex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                difficulty = 3;
                simple.setSelected(false);
                moderate.setSelected(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Random Password Generator");
        frame.setLayout(new FlowLayout());
        frame.add(new Main().simple);
        frame.add(new Main().moderate);
        frame.add(new Main().complex);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
