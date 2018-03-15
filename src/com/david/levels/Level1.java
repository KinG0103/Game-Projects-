/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.levels;

import com.david.game.Game;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public abstract class Level1 extends JPanel implements ActionListener{
    
    private Game game; 
    private Timer timer;
    BufferedImage background; 
    
    public Level1(Game theGame)
    {
    
        game = theGame;
        init();
        
    }
    
    private void init()
    {
        score = 0;
        addKeyListener(new TAdapter());
        setFocusable(true);
        setDoubleBuffered(true);
        try
        {
        
            background = ImageIO.read(getClass().getResource("Image/background.png"));
            
        }catch(Exception ex){
        
            System.err.println("ERROR loading background image ");
            
        }
        timer = new Timer(10, this);
    }
    
    @Override
    protected void paintComponent(Graphics g )
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        
        g.dispose();   
    }
    
    public void collisions()
    {
    
        
    }
    public void start()
    {
        timer.start();
    }
    public void stop()
    {
        timer.stop();
    }
    
    @Override 
    public void actionPerformed(ActionEvent ae)
    {
        repaint();
    }
    
    private class TAdapter extends KeyAdapter
    {
        @Override 
        public void keyPressed(KeyEvent e)
        {
        
        }
        
        @Override 
        public void keyReleased(KeyEvent e)
        {
        
        }
    }
}
