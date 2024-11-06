/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoegame3;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
/**
 *
 * @author Prachi
 */
public class WhoWinSeries {
    WhoWinSeries(String message)
    {
      JFrame jf=new JFrame();
      jf.setSize(600,400);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setLayout(null);
      
      JLabel jl=new JLabel(message);
      jl.setBounds(100,100,600,50);
      jl.setFont(new Font("Arial" ,1,30));
      jl.setForeground(Color.red);
      jf.add(jl);
      
      jf.setVisible(true);
              
    }
}
