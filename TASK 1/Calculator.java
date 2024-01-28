import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator 
{
    public static void main(String[] args) 
    {
        CalculatorFrame cf = new CalculatorFrame();
        cf.Component();
        cf.CreateLayout();
        cf.AddComponent();
    }
}

class CalculatorFrame implements ActionListener 
{
    static double val1 = 0, val2 = 0, result = 0;
    static char op;
    Container c;
    Font font, font1;
    JTextField txtans;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnplus, btnmin, btnmul, btndiv, btnper, btndot, btnequal, btncl, btndel;
    JToggleButton btnOnOff; 

    CalculatorFrame() 
    {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300, 200, 550, 650);
        f.setTitle("Simple Calculator");
        f.setResizable(false);
        c = f.getContentPane();
        c.setLayout(null);
        font = new Font("arial", Font.BOLD, 30);
    }

    void Component() 
    {
        txtans = new JTextField();
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnplus = new JButton("+");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btnmin = new JButton("-");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btnmul = new JButton("*");
        btn0 = new JButton("0");
        btndiv = new JButton("/");
        btnper = new JButton("%");
        btndot = new JButton(".");
        btnequal = new JButton("=");
        btncl = new JButton("Clear");
        btndel = new JButton("Del");
        btnOnOff = new JToggleButton("On/Off");
    }

    void CreateLayout()
    {

        txtans.setBounds(90,50,350,60);
        txtans.setFont(font);
        btn7.setBounds(90,120,80,60);
        btn7.setFont(font);
        btn8.setBounds(180,120,80,60);
        btn8.setFont(font);
        btn9.setBounds(270,120,80,60);
        btn9.setFont(font);
        btnplus.setBounds(360,120,80,60);
        btnplus.setFont(font);
        btn4.setBounds(90,190,80,60);
        btn4.setFont(font);
        btn5.setBounds(180,190,80,60);
        btn5.setFont(font);
        btn6.setBounds(270,190,80,60);
        btn6.setFont(font);
        btnmin.setBounds(360,190,80,60);
        btnmin.setFont(font);
        btn1.setBounds(90,260,80,60);
        btn1.setFont(font);
        btn2.setBounds(180,260,80,60);
        btn2.setFont(font);
        btn3.setBounds(270,260,80,60);
        btn3.setFont(font);
        btnmul.setBounds(360,260,80,60);
        btnmul.setFont(font);
        btn0.setBounds(180,330,80,60);
        btn0.setFont(font);
        btndiv.setBounds(360,330,80,60);
        btndiv.setFont(font);
        btnper.setBounds(90,330,80,60);
        btnper.setFont(font);
        btndot.setBounds(270,330,80,60);
        btndot.setFont(font);
        btnequal.setBounds(360,400,80,60);
        btnequal.setFont(font);
        btncl.setBounds(200,400,150,60);
        btncl.setFont(font);
        btndel.setBounds(90,400,105,60);
        btndel.setFont(font);
        btnOnOff.setBounds(170, 480, 170, 60);
        btnOnOff.setFont(font);
        btnOnOff.setBackground(Color.yellow);
        btnOnOff.setForeground(Color.red);
    }

    void AddComponent() 
    {
        c.add(txtans);
        c.add(btn7);
        c.add(btn8);
        c.add(btn9);
        c.add(btnplus);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btnmin); 
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btnmul); 
        c.add(btn0);
        c.add(btndiv);
        c.add(btnper);
        c.add(btndot);
        c.add(btnequal);
        c.add(btncl);
        c.add(btndel);
        c.add(btnOnOff);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnplus.addActionListener(this);
        btnmin.addActionListener(this);
        btnmul.addActionListener(this);
        btndiv.addActionListener(this);
        btnper.addActionListener(this);
        btndot.addActionListener(this);
        btnequal.addActionListener(this);
        btncl.addActionListener(this);
        btndel.addActionListener(this);
        btnOnOff.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btn1)
        {
            txtans.setText(txtans.getText().concat("1"));
        }
        if(e.getSource()==btn2)
        {
            txtans.setText(txtans.getText().concat("2"));
        }
        if(e.getSource()==btn3)
        {
            txtans.setText(txtans.getText().concat("3"));
        }
        if(e.getSource()==btn4)
        {
            txtans.setText(txtans.getText().concat("4"));
        }
        if(e.getSource()==btn5)
        {
            txtans.setText(txtans.getText().concat("5"));
        }
        if(e.getSource()==btn6)
        {
            txtans.setText(txtans.getText().concat("6"));
        }
        if(e.getSource()==btn7)
        {
            txtans.setText(txtans.getText().concat("7"));
        }
        if(e.getSource()==btn8)
        {
            txtans.setText(txtans.getText().concat("8"));
        }
        if(e.getSource()==btn9)
        {
            txtans.setText(txtans.getText().concat("9"));
        }
        if(e.getSource()==btn0)
        {
            txtans.setText(txtans.getText().concat("0"));
        }
        if(e.getSource()==btndot)
        {
            txtans.setText(txtans.getText().concat("."));
        }
        if(e.getSource()==btncl)
        {
            txtans.setText("");
        }
        if(e.getSource()==btndel)
        {
            String temp = txtans.getText();
            txtans.setText("");
            for(int i=0;i<temp.length()-1;i++)
            {
                txtans.setText(txtans.getText()+temp.charAt(i));
            }
        }
        if(e.getSource()==btnplus)
        {
            val1 = Double.parseDouble(txtans.getText());
            op = '+';
            txtans.setText("");
        }
        if(e.getSource()==btnmin)
        {
            val1 = Double.parseDouble(txtans.getText());
            op = '-';
            txtans.setText("");
        }
        if(e.getSource()==btnmul)
        {
            val1 = Double.parseDouble(txtans.getText());
            op = '*';
            txtans.setText("");
        }
        if(e.getSource()==btndiv)
        {
            val1 = Double.parseDouble(txtans.getText());
            op = '/';
            txtans.setText("");
        }
        if (e.getSource() == btnper) {
            val1 = Double.parseDouble(txtans.getText());
            op = '%';
            txtans.setText("");
        }
        if(e.getSource() == btnequal)
        {
            val2 = Double.parseDouble(txtans.getText());
            switch (op) 
            {
                case '+':
                    result =val1 + val2;
                    break;
                case '-':
                    result =val1 - val2;
                    break;
                case '*':
                    result =val1 * val2;
                    break;
                case '/':
                    result =val1 / val2;
                    break;
                case '%':
                    val2 = Double.parseDouble(txtans.getText());
                    result = (val1 * val2) / 100;
                    txtans.setText(Double.toString(result));
                    break;
            }
            txtans.setText(""+result);

        }

        if (e.getSource() == btnOnOff) 
        {
            if (btnOnOff.isSelected()) 
            {
                enableButtons(true);
            } 
            else 
            {
                enableButtons(false);
                txtans.setText(" ");
            }
        }
    }

    private void enableButtons(boolean enable) 
    {
        btn0.setEnabled(enable);
        btn1.setEnabled(enable);
        btn2.setEnabled(enable);
        btn3.setEnabled(enable);
        btn4.setEnabled(enable);
        btn5.setEnabled(enable);
        btn6.setEnabled(enable);
        btn7.setEnabled(enable);
        btn8.setEnabled(enable);
        btn9.setEnabled(enable);
        btnplus.setEnabled(enable);
        btnmin.setEnabled(enable);
        btnmul.setEnabled(enable);
        btndiv.setEnabled(enable);
        btnper.setEnabled(enable);
        btndot.setEnabled(enable);
        btnequal.setEnabled(enable);
        btncl.setEnabled(enable);
        btndel.setEnabled(enable);
    }
}
