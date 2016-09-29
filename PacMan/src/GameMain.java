/**
 * Created by wongk8 on 9/13/2016.
 */
import javax.swing.*;

public class GameMain {
    public static void main(String[] args){
        JPanel j = new Game();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(j);
        f.pack();
        f.setVisible(true);
    }
}

