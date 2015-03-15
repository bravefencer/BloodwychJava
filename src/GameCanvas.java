import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by ERTE005 on 09.03.2015.
 */
public class GameCanvas extends Canvas {

    private int WIDTH = 800;
    private int HEIGHT = 300;

    private Bloodwych bloodwych;
    private BufferStrategy bs;


    public GameCanvas(Bloodwych bloodwych) {
        this.setIgnoreRepaint(true);
        this.bloodwych = bloodwych;
    }

    public void initBufferStrategy() {
        this.createBufferStrategy(2);
        this.bs = this.getBufferStrategy();
    }

    public void render() {

        do {
            do {
                Graphics g = null;

                try {
                    g = bs.getDrawGraphics();
                    clearCanvas(g);
                    drawBackground(g);
                    drawMap(g);
                } finally {
                    if (g != null) {
                        g.dispose();
                    }
                }
            } while (bs.contentsRestored());

            bs.show();


        } while (bs.contentsLost());
    }


    private void drawMap(Graphics g) {
        bloodwych.graphicsHelper.drawPlayersView(bloodwych.p1, g);
        bloodwych.graphicsHelper.drawPlayersView(bloodwych.p2, g);
    }


    private void drawBackground(Graphics g) {
        int[] background1 = bloodwych.background[bloodwych.p1.pbg];
        int[] background2 = bloodwych.background[bloodwych.p2.pbg];
        bloodwych.graphicsHelper.drawImage(g, bloodwych.img, background1, bloodwych.p1, bloodwych.scale);
        bloodwych.graphicsHelper.drawImage(g, bloodwych.img, background2, bloodwych.p2, bloodwych.scale);

    }


    private void clearCanvas(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);


    }


}
