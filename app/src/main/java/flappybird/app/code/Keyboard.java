package flappybird.app.code;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Flappy Bird replicate is simple a under developing program.
 * Hope you will enjoy this game.
 *
 * @author  Nguyễn Tiến Tú - HUBT - 15150064
 * @version 1.0
 * @since   6/2019
 */

public class Keyboard implements KeyListener {

	private static Keyboard instance;

	private boolean[] keys;
	
	private Keyboard() {
		keys = new boolean[256];
	}

	public static Keyboard getInstance() {

		if (instance == null) {
			instance = new Keyboard();
		}
		
		return instance;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() >= 0 && e.getKeyCode() < keys.length) {
			keys[e.getKeyCode()] = true;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() >= 0 && e.getKeyCode() < keys.length) {
			keys[e.getKeyCode()] = false;
		}
	}

	public void keyTyped(KeyEvent e) {}

	public boolean isDown(int key) {

		if (key >= 0 && key < keys.length) {
			return keys[key];
		}
		
		return false;
	}
}
