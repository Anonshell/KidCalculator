/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorkid;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class CalculatorKid extends JFrame {

    private Container c;
    private ImageIcon img1, backimg, clearimg, runimg;
    private JTextField tf1, tf2, tf3;
    private JLabel imagelabel, textlabel, textlabel1, textlabel3;
    private Font f;
    private JTextArea ta;
    private JButton clearbutton, run;

    CalculatorKid() {

        initComponent();

    }

    public void initComponent() {

        c = this.getContentPane();

        c.setBackground(Color.white);
        c.setLayout(null);

        backimg = new ImageIcon(getClass().getResource("pic2.png"));

        imagelabel = new JLabel(backimg);

        imagelabel.setSize(400, 500);

        c.add(imagelabel);

        img1 = new ImageIcon(getClass().getResource("Calcu.png"));

        this.setIconImage(img1.getImage());

        f = new Font("Arial", Font.BOLD, 17);

        textlabel = new JLabel("INPUT-1: ");
        textlabel.setBounds(80, 50, 100, 30);
        textlabel.setFont(f);
        c.add(textlabel);

        textlabel1 = new JLabel("INPUT-2: ");
        textlabel1.setBounds(80, 100, 100, 30);
        textlabel1.setFont(f);
        c.add(textlabel1);

        textlabel3 = new JLabel("SIGN: ");
        textlabel3.setBounds(90, 140, 100, 30);
        textlabel3.setFont(f);
        c.add(textlabel3);

        tf1 = new JTextField();
        tf1.setBackground(Color.PINK);
        tf1.setBounds(150, 50, 100, 30);
        tf1.setForeground(Color.BLACK);
        tf1.setFont(f);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBackground(Color.PINK);
        tf2.setBounds(150, 100, 100, 30);
        tf2.setForeground(Color.BLACK);
        tf2.setFont(f);
        c.add(tf2);

        tf3 = new JTextField();
        tf3.setBackground(Color.GREEN);
        tf3.setBounds(150, 140, 100, 30);
        tf3.setForeground(Color.BLACK);
        tf3.setFont(f);

        c.add(tf3);

        clearbutton = new JButton("Clear");

        ta = new JTextArea();
        ta.setBackground(Color.GREEN);
        ta.setBounds(80, 250, 150, 150);
        ta.setFont(f);
        ta.setLineWrap(true);

        c.add(ta);

        clearimg = new ImageIcon(getClass().getResource("clr.jpg"));

        runimg = new ImageIcon(getClass().getResource("run.jpg"));

        run = new JButton(runimg);

        run.setBounds(90, 180, 80, 30);

        c.add(run);

        run.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int number1 = Integer.parseInt(tf1.getText());

                int number2 = Integer.parseInt(tf2.getText());

                int sum = number1 + number2;

                int sub = number1 - number2;
                int mul = number1 * number2;
                int div = number1 / number2;
                double mod = number1 % number2;

                String res1 = String.valueOf(sum);
                String res2 = String.valueOf(sub);
                String res3 = String.valueOf(mul);
                String res4 = String.valueOf(div);
                String res5 = String.valueOf(mod);

                String str = tf3.getText();

                if (str.equals("+")) {

                    ta.append("sum: " + res1);

                } else if (str.equals("-")) {
//                 ta.append("Sub: "+res2);
                    ta.setText("Substraction: "+res2);

                }
                 else if (str.equals("*")) {
//                 ta.append("Sub: "+res2);
                    ta.setText("Multiplication: "+res3);

                }
                 else if (str.equals("/")) {
//                 ta.append("Sub: "+res2);
                    ta.setText("Division: "+res4);

                }
                 else if (str.equals("%")) {
//                 ta.append("Sub: "+res2);
                    ta.setText("Mod: "+res5);

                }

            }

        });

        clearbutton = new JButton(clearimg);
        clearbutton.setBounds(190, 180, 80, 30);
        clearbutton.setIcon(clearimg);
        c.add(clearbutton);

        clearbutton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                ta.setText("");

            }

        });

    }

    public static void main(String[] args) {

        CalculatorKid frame = new CalculatorKid();

        frame.setBounds(700, 250, 300, 500);
        frame.setVisible(true);
        frame.setTitle("KidCalculator");

    }

}
