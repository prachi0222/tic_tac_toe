/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoegame3;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
/**
 *
 * @author Prachi
 */
public class UserPanel implements ActionListener 
{
    JFrame jf;
    JLabel jl1,jl2,jl3;
    JTextField jt1,jt2;
    JButton jb;
    JComboBox cb;
    
    UserPanel()
  {
     jf=new JFrame("TicTacToe Game by Prachi");
     jf.setSize(600,500);
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     jf.setLayout(null);
     
     jl1=new JLabel("Enter Player One:(X) ");
     jl1.setBounds(50, 50,120,30);
     jf.add(jl1);
     
     jt1=new JTextField();
     jt1.setBounds(200,50,250,40);
     jf.add(jt1);
     jf.setVisible(true);
     
     jl2=new JLabel("Enter Player two:(0) ");
     jl2.setBounds(50, 150,120,30);
     jf.add(jl2);
     
     jt2=new JTextField();
     jt2.setBounds(200,140,250,40);
     jf.add(jt2);
     
     jl3=new JLabel("Select series");
     jl3.setBounds(50,250,120,30);
     jf.add(jl3);
     String[] series={"3","5","7","9"};
     cb=new JComboBox(series);
     cb.setBounds(200,250,250,40);
     jf.add(cb);
     
     jb=new JButton("Start Game");
     jb.setBounds(200,350,150,50);
     jb.addActionListener(this);
     jf.add(jb);
     jf.setVisible(true);
  }
    @Override
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==jb)
      {
         String player1=jt1.getText();
         String player2=jt2.getText();
         String series=(String)cb.getSelectedItem();
          
         GamePanel gp=new GamePanel(player1,player2,Integer.parseInt(series));
         gp.openGamePanel();
          jf.setVisible(false);
      }
    }
}
