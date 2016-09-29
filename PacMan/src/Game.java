import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

/**
 * Created by wongk8 on 9/13/2016.
 */
public class Game extends JPanel implements ActionListener, KeyListener{
    private int[][] Gamegrid; //Stores locations of all entities
    private boolean keys[]; //Used for key listener
    private Timer timer;

    private BufferedImage pacman;

    public Game(){


        try {
            loadImages();
        } catch (IOException ex){
            ex.printStackTrace();
        }

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

        g.drawImage(pacman, 0, 0, 12, 13, null);
        g.dispose();
    }

    public void loadImages() throws IOException {

        //URL urlToBG = this.getClass().getResource("sprites/pacman.png");
        BufferedImage bigImg = ImageIO.read(new File("sprites/pacman.png"));//todo fix this line, wont work.

        final int width = 12;//12pixels wide
        final int height = 13;//13 pixels high
        final int rows = 9;//9 rows of sprites
        final int cols = 8;//8 cols of sprites
        BufferedImage[] sprites = new BufferedImage[rows * cols];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sprites[(i * cols) + j] = bigImg.getSubimage(
                        j * width,
                        i * height,
                        width,
                        height
                );
            }
        }

        pacman = sprites[0];
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
