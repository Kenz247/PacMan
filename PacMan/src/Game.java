import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by wongk8 on 9/13/2016.
 */
public class Game extends JPanel implements ActionListener, KeyListener{
    private int[][] Gamegrid; //Stores locations of all entities
    private boolean keys[]; //Used for key listener
    private Timer timer;
    public Game(){
        setPreferredSize(new Dimension(1200,800));
        Gamegrid = new int[20][20]; //Size of game board
        keys = new boolean[120];
        addKeyListener(this); // Allows keys to be used
        setFocusable(true);
        requestFocus(); //More stuff with key input idk
        timer = new Timer(30,this); //Used for action listener ticks every 30 milliseconds or something like that



        
        timer.start(); //Starts the timer
    }
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g; //Some 2D graphics shit idk
        for(int i = 0; i < Gamegrid.length; i++){
            for(int j = 0; j < Gamegrid[0].length; j++){
                g2.fillRect(i*100,j*100,100,100); //Draws a 100 x 100 pixel square
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
