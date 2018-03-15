
package com.david.game.screens;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import com.david.game.Game;
import java.awt.image.BufferedImage;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StartGamePanel extends JPanel{
    private Game gameWindow; 
    private BufferedImage backgroundImage;
 
    public StartGamePanel(Game theGame)
    {
        gameWindow = theGame;
        init();
    }
    
    private void init()
    {
        addKeyListener(new TAdapter()); 
        try
        {
            backgroundImage = ImageIO.read(getClass().getResource("/images/background.png"));
        } catch(Exception ex) {
            System.err.println("Error Loading image");
            setFocusable(true);
        }
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.drawImage(backgroundImage, 0, 0, null);
    }
    
    private class TAdapter extends KeyAdapter
    {
        @Override
        public void KeyReleased(KeyEvent e)
        {
            if(e.getKeyCode() == KeyEvent.VK_P)
            gameWindow.startGame();
        }
        
        @Override
        public void keypressed(KeyEvent e) 
        {
        }
    }
}

