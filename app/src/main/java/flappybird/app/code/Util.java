package flappybird.app.code;

import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * Flappy Bird replicate is simple a under developing program.
 * Hope you will enjoy this game.
 *
 * @author  Nguyễn Tiến Tú - HUBT - 15150064
 * @version 1.0
 * @since   6/2019
 */

public class Util {

    private static HashMap<String, Image> cache = new HashMap<String, Image>();

    public static Image loadImage(String path) {
        Image image = null;

		if (cache.containsKey(path)) {
			return cache.get(path);
		}

		try {
			image = ImageIO.read(new File(path));

			if (!cache.containsKey(path)) {
				cache.put(path, image);
			}
		} 
		catch (IOException e) {
		    e.printStackTrace();
        }

		return image;
	}
}
