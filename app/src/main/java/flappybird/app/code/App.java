package flappybird.app.code;

import javax.swing.*;

/**
 * Flappy Bird replicate is simple a under developing program.
 * Hope you will enjoy this game.
 *
 * @author  Nguyễn Tiến Tú - HUBT - 15150064
 * @version 1.0
 * @since   6/2019
 */

public class App {

    public static int WIDTH = 500;
    public static int HEIGHT = 510;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);

        Keyboard keyboard = Keyboard.getInstance();
        frame.addKeyListener(keyboard);

        GamePanel panel = new GamePanel();
        frame.add(panel);
    }
}
