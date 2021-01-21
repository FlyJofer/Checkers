package com.company;

import javax.swing.*;
import java.awt.*;

class Board {

    JFrame frame;
    JPanel squares[][] = new JPanel[8][8];

    public Board() {
        frame = new JFrame("Checkers Board");
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(8, 8));

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JPanel();

                if ((i + j) % 2 != 0)
                {
                    squares[i][j].setBackground(Color.black);
                } else
                {
                    squares[i][j].setBackground(Color.white);
                }
                frame.add(squares[i][j]);
            }
        }

  squares[0][0].add(new JLabel(new ImageIcon("BlackChecker.png")));
squares[0][2].add(new JLabel(new ImageIcon("BlackChecker.png")));
squares[0][4].add(new JLabel(new ImageIcon("BlackChecker.png")));
 squares[0][5].add(new JLabel(new ImageIcon("BlackChecker.png")));
squares[0][7].add(new JLabel(new ImageIcon("BlackChecker.png")));

squares[7][0].add(new JLabel(new ImageIcon("BlackChecker.png")));
squares[7][2].add(new JLabel(new ImageIcon("BlackChecker.png")));
squares[7][4].add(new JLabel(new ImageIcon("BlackChecker.png")));
 squares[7][5].add(new JLabel(new ImageIcon("BlackChecker.png")));
 squares[7][7].add(new JLabel(new ImageIcon("BlackChecker.png")));

 for (int i = 0; i < 8; i++) {
 squares[1][i].add(new JLabel(new ImageIcon("WhiteChecker.png")));
 squares[6][i].add(new JLabel(new ImageIcon("BlackChecker.png")));
 }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}