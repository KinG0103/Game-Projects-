package com.david.game;

import com.david.game.screens.StartGamePanel; 
import com.david.levels.Level1;
import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Dimension;


public class Game 
{
    private final int WINDOW_WIDTH  = 600;
    private final int WINDOW_HEIGHT  = 600;
    
    JFrame gameWindow;
    StartGamePanel startScreen; 
    Level1 lvl1;
    
    public Game()
    {
        init(); 
        initScreens();
    }
    
    private void init()
    {
        gameWindow = new JFrame();
        gameWindow.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setLayout(new CardLayout());
        gameWindow.setResizable(false);
        gameWindow.setLocationRelativeTo(null);  
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
    private void initScreens()
    {
        startScreen = new StartGamePanel(this);
        startScreen.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        lvl1 = new Level1(this);
        lvl1.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        // This will add a start Screen to the Main Window
        gameWindow.getContentPane().add(startScreen, "INTRO");
        gameWindow.getContentPane().add(lvl1, "LVL1");
    } 
}
