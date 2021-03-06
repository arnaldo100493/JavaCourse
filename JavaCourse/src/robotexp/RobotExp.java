package robotexp;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class RobotExp {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            // Capture the screen shot of the area of the screen defined by the rectangle
            BufferedImage bi = robot.createScreenCapture(new Rectangle(100, 100));
            ImageIO.write(bi, "jpg", new File("C:/imageTest.jpg"));
        } catch (AWTException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
