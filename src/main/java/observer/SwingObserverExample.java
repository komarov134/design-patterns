package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by root on 05.09.15.
 */
public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        jFrame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, button);

    }

    class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Angel: don't do it, you might regret it");
        }
    }

    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Devil: Come on, do it!");
        }
    }
}