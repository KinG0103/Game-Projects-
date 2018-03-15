package com.david.game;

import com.david.game.screens.StartGamePanel; 
import javax.swing.JFrame;
import java.awt.CardLayout;


public class Game 
{
    private final int WINDOW_WIDTH  = 600;
    private final int WINDOW_HEIGHT  = 600;
    
    JFrame gameWindow;// Main Game Window - we add the game components here
    
    StartGamePanel startScreen; 
    
    public Game()
    {
        initWindow(); 
        initScreens();
    }
    
    private void initWindow()
    {
        gameWindow = new JFrame();
        gameWindow.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setLayout(new CardLayout());
        gameWindow.setResizable(false);
        gameWindow.setLocationRelativeTo(null); // This centres the game on screen 
        gameWindow.setTitle("my game: v0.5");
        gameWindow.setFocusable(true);
    }
    
    public static void main(String[] args) 
    {
        Game gameWindow = new Game(); 
    }
    public void startGame()
    {
    
    }
}
