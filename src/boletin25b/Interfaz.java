/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25b;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Jorge
 */
public class Interfaz extends JFrame implements ActionListener{
    
    private JTextField n;
    private JButton dibuxa,limpa;
    private JPanel panel;
    
    
    public Interfaz(){
        dibuxa=new JButton("Debuxar");
        panel=new JPanel();
        limpa=new JButton("Limpar");
        n=new JTextField("0");
        n.setPreferredSize(new Dimension(200,200));
        n.setFont(new Font("Tahoma",0,50));
        panel.add(n);
        panel.add(dibuxa);
        panel.add(limpa);
        this.add(panel);
        this.setBounds(400,100,300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        int n = Integer.parseInt(this.n.getText());
        if(ae.getSource()==dibuxa){
            for(int i=0;i<n;i++){
                pintar(this.getGraphics());
            }
        }
    }
    
    private void pintar(Graphics g){
        g.drawLine(0, 50, 30, 30);
    }
}
