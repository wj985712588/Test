package cn.mhonor.draw;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author Mr.mhonor
 * @date 2020/8/30 18:23
 */
public class DrawTest {

    public static void main(String[] args) throws IOException {
        File file=new File("f:/123/wang.png");
        BufferedImage bufferedImage=ImageIO.read(file);
        BufferedImage image=new BufferedImage(150,150,BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics=image.createGraphics();
        graphics.drawImage(bufferedImage,0,0,Color.RED,null);
        graphics.dispose();
        ImageIO.write(bufferedImage,"png",new File("f:/123/"+ UUID.randomUUID()+".png"));
    }
}
