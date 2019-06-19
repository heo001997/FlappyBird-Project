package flappybird.app.code;

import java.awt.Image;
import java.awt.geom.AffineTransform;

/**
 * Flappy Bird replicate is simple a under developing program.
 * Hope you will enjoy this game.
 *
 * @author  Nguyễn Tiến Tú - HUBT - 15150064
 * @version 1.0
 * @since   6/2019
 */

public class Render {
    public int x;
    public int y;
    public Image image;
    public AffineTransform transform;

    public Render() {
    }

    public Render(int x, int y, String imagePath) {
        this.x = x;
        this.y = y;
        this.image = Util.loadImage(imagePath);
    }
}
