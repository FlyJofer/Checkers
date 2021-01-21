package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Rules");
    private JButton button1 = new JButton("Classic checkers");
    private JButton button2 = new JButton("Russian checkers");
// private JTextField input = new JTextField("Input");
//private JLabel label = new JLabel("Input");
//private JRadioButton radio1 = new JRadioButton("Select This");
//private JRadioButton radio2 = new JRadioButton("Select that");
//private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGUI() {
        super("Checkers");
        this.setBounds(100, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3 , 1, 10, 10));
        container.setBackground(Color.DARK_GRAY);

//container.add(label);
// container.add(input);

        ButtonGroup group = new ButtonGroup();
//group.add(radio1);
//group.add(radio2);
//container.add(radio1);
//container.add(radio2);
//radio1.setSelected(true);

//container.add(check);
        button.addActionListener(new ButtonEventListener2());
        container.add(button);
        button2.addActionListener(new ButtonEventListener());
        container.add(button2);
        button1.addActionListener(new ButtonEventListener1());
        container.add(button1);

    }

    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";

            message += "Правила игры в классические шашки\n" +
                    "\n" +
                    "Чаще всего в шашки играют на стандартном поле с количеством клеток 8х8. Количество игровых фишек на одного участника – 12 штук. Общее количество фигур в игре – 24. Для расстановки шашек в классическом варианте используются только темные поля.\n" +
                    "\n" +
                    "расстановка фигур в шашках\n" +
                    "\n" +
                    "Общие правила шашек:\n" +
                    "\n" +
                    "Первый ход всегда принадлежит игроку с белыми фишками.\n" +
                    "Ходы делаются по диагонали (только на черные клетки поля). Движение фишек осуществляется вперед.\n" +
                    "первый ход в шашках\n" +
                    "В классической игре бить фишки противника можно только движением вперед по диагонали. Есть более сложные виды шашек, где сбить фигуру можно как ходом вперед, так и назад.\n" +
                    "сбитие фигуры в шашках\n" +
                    "Если шашка бьет фигуру соперника, то она становится на клетку за ней. Сбитая фишка снимается с поля и выходит из игры. Выставлять обратно шашки на поле не разрешается.\n" +
                    "Если фишка находится под боем, бить ее нужно обязательно. Когда присутствует несколько вариантов боя, игрок выбирает ход по своему усмотрению.\n" +
                    "Побеждает игрок, который сбил все фишки противника или смог заблокировать все доступные ему ходы.\n" +
                    "Как ходит дамка в шашках\n" +
                    "\n" +
                    "Фигура, которая дошла до противоположного края шашечной доски, называется «дамка». Иногда в шашках её также называют «королевой». Ее переворачивают обратной стороной (или отмечают другим образом): такая фишка может перемещаться вперед и назад на любое количество ходов.\n" +
                    "\n" +
                    "пример хода дамки в шашках\n" +
                    "\n" +
                    "Дамка может совершать ходы в различных направлениях: по диагонали, прямо или назад. Количество таких фишек не ограничивается, может достигать 12 штук (все шашки игрока) в случае, если игроку удалось сохранить их все и довести до противоположной части поля.\n" +
                    "Правила игры в русские шашки\n" +
                    "\n" +
                    "В России наиболее популярен именно этот вид шашек. Игра ведется на шашечной доске на 64 клетки. У каждого игрока по 12 фишек, которые выставляются на темные клетки первых трех рядов доски. Первым ходит игрок с белыми фишками.\n" +
                    "\n" +
                    "Особенности игры:\n" +
                    "\n" +
                    "Ход осуществляется по диагонали по темным клеткам на незанятые поля. Игроки ходят поочередно.\n" +
                    "Если на пути находится фишка противника, по правилам ее необходимо сбить. В этом случае шашка «перепрыгивает» через клетку по диагонали, а сбитая фигура соперника выходит из игры (этот процесс называется «взятие»).\n" +
                    "Дамка может ходить прямо и по диагонали, а также вперед и назад на любое количество клеток.\n";
// message += "Text is " + input.getText() + "\n";
//message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + "is selected\n";
//message += "Checkbox is" + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Rules", JOptionPane.PLAIN_MESSAGE);

        }
    }
    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Board board= new Board();

        }
    }
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Board board= new Board();
        }
    }
}