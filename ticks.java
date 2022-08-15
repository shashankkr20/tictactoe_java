package com.tricky;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ticks implements ActionListener{
    JButton a1,a2,a3,a4,a5,a6,a7,a8,a9,reset,ok;
    JButton button[]=new JButton[9];
    JFrame frame;
    int a=1,b=0;
    int score=0;
    JTextField pl1name,pl1_score,pl2_score,pl2name,curr;
    JLabel win;
    JDialog p;
    ticks()
    {
        frame=new JFrame("TIC TAC TOE");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(530,800);
        pl1name=new JTextField("Player1 score");
        frame.add(pl1name);
        pl1name.setBounds(100,20,90,30);
        pl2name=new JTextField("Player2 score");
        frame.add(pl2name);
        pl2name.setBounds(360,20,90,30);
        pl1_score=new JTextField("0");
        frame.add(pl1_score);
        pl1_score.setBounds(120,55,30,30);
        pl2_score=new JTextField("0");
        frame.add(pl2_score);
        pl2_score.setBounds(380,55,30,30);
        curr=new JTextField("Player1 turn");
        frame.add(curr);
        curr.setBounds(100,105,330,40);
        Font l=new Font("Arial",Font.BOLD,30);
        curr.setFont(l);
        a1=new JButton("");
        frame.add(a1);
        a1.setBounds(100,180,100,100);
        a2=new JButton("");
        frame.add(a2);
        a2.setBounds(210,180,100,100);
        a3=new JButton("");
        frame.add(a3);
        a3.setBounds(320,180,100,100);
        a4=new JButton("");
        frame.add(a4);
        a4.setBounds(100,290,100,100);
        a5=new JButton("");
        frame.add(a5);
        a5.setBounds(210,290,100,100);
        a6=new JButton("");
        frame.add(a6);
        a6.setBounds(320,290,100,100);
        a7=new JButton("");
        frame.add(a7);
        a7.setBounds(100,400,100,100);
        a8=new JButton("");
        frame.add(a8);
        a8.setBounds(210,400,100,100);
        a9=new JButton("");
        frame.add(a9);
        a9.setBounds(320,400,100,100);
        reset=new JButton("RESET");
        frame.add(reset);
        reset.setBounds(160,520,200,50);
        p=new JDialog(frame,"Winner declaration");
        win=new JLabel("");
        p.add(win);
        Font k=new Font("Arial",Font.BOLD,30);
        win.setFont(k);
        p.setBounds(65,200,400,400);
        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        a4.addActionListener(this);
        a5.addActionListener(this);
        a6.addActionListener(this);
        a7.addActionListener(this);
        a8.addActionListener(this);
        a9.addActionListener(this);
        reset.addActionListener(this);
        curr.setText("Player1 turn");
        button[0]=a1;
        button[1]=a2;
        button[2]=a3;
        button[3]=a4;
        button[4]=a5;
        button[5]=a6;
        button[6]=a7;
        button[7]=a8;
        button[8]=a9;
        a=1;
        score=0;
        curr.setText("Player1 turn");
        pl1_score.setText("0");
        pl2_score.setText("0");
        for(int i=0;i<9;i++) {
            button[i].setText("");
        }
    }
    public static void main(String[] args) {
        new ticks();
    }
    void reset()
    {
        a=1;
        score=0;
        curr.setText("Player1 turn");
        for(int i=0;i<9;i++) {
            button[i].setText("");
            button[i].setEnabled(true);
        }
    }
    void check()
    {
        for(int i=0;i<9;i++)
        {
            if(button[i].getText()==button[i+1].getText() && button[i+1].getText()==button[i+2].getText() && button[i].getText()!="")
            {
                if(a==1)
                {
                    score= Integer.parseInt(pl2_score.getText());
                    score++;
                    pl2_score.setText(String.valueOf(score));
                    win.setText("Player2 is the winner");
                    p.setVisible(true);

                }
                else
                {
                    score= Integer.parseInt(pl1_score.getText());
                    score++;
                    pl1_score.setText(String.valueOf(score));
                    win.setText("Player1 is the winner");
                    p.setVisible(true);
                }
                reset();
            }
            i=i+2;
        }
        for(int i=0;i<3;i++)
        {
            if(button[i].getText()==button[i+3].getText() && button[i+3].getText()==button[i+6].getText() && button[i].getText()!="")
            {
                if(a==1)
                {
                    score= Integer.parseInt(pl2_score.getText());
                    score++;
                    pl2_score.setText(String.valueOf(score));
                    win.setText("Player2 is the winner");
                    p.setVisible(true);
                }
                else
                {
                    score= Integer.parseInt(pl1_score.getText());
                    score++;
                    pl1_score.setText(String.valueOf(score));
                    win.setText("Player1 is the winner");
                    p.setVisible(true);
                }
                reset();
            }
        }
        if(button[0].getText()==button[4].getText() && button[4].getText()==button[8].getText() && button[0].getText()!="")
        {
            if(a==1)
            {
                score= Integer.parseInt(pl2_score.getText());
                score++;
                pl2_score.setText(String.valueOf(score));
                win.setText("Player2 is the winner");
                p.setVisible(true);
            }
            else
            {
                score= Integer.parseInt(pl1_score.getText());
                score++;
                pl1_score.setText(String.valueOf(score));
                win.setText("Player1 is the winner");
                p.setVisible(true);
            }
            reset();
        }
        if(button[2].getText()==button[4].getText() && button[4].getText()==button[6].getText() && button[2].getText()!="")
        {
            if(a==1)
            {
                score= Integer.parseInt(pl2_score.getText());
                score++;
                pl2_score.setText(String.valueOf(score));
                win.setText("Player2 is the winner");
                p.setVisible(true);
            }
            else
            {
                score= Integer.parseInt(pl1_score.getText());
                score++;
                pl1_score.setText(String.valueOf(score));
                win.setText("Player1 is the winner");
                p.setVisible(true);
            }
            reset();
        }
        for(int i=0,b=0;i<9;i++)
        {
            if(button[i].getText()!="")
            {
                b++;
            }
            if(b==9)
            {
                score= Integer.parseInt(pl2_score.getText());
                score++;
                pl2_score.setText(String.valueOf(score));
                score= Integer.parseInt(pl1_score.getText());
                score++;
                pl1_score.setText(String.valueOf(score));
                reset();
                win.setText("Game Draw");
                p.setVisible(true);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<9;i++) {
            if (e.getSource() == button[i]) {
                if(a==1)
                {
                    button[i].setText("X");
                    a=0;
                }
                else
                {
                    button[i].setText("0");
                    a=1;
                }
                if(a==1)
                {
                    curr.setText("Player1 turn");
                }
                else
                {
                    curr.setText("Player2 turn");
                }
                button[i].setEnabled(false);
                check();
            }
        }
        if(e.getSource()==reset)
        {
            a=1;
            score=0;
            curr.setText("Player1 turn");
            pl1_score.setText("0");
            pl2_score.setText("0");
            for(int i=0;i<9;i++) {
                button[i].setText("");
                button[i].setEnabled(true);
            }
        }

    }
}
