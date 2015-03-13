import javax.swing.*;
import java.awt.*;

/**
 * Created by ERTE005 on 09.03.2015.
 */
public class BloodwychCanvas extends JComponent{

	private int WIDTH = 800;
	private int HEIGHT = 300;

	private Bloodwych bloodwych;


	BloodwychCanvas() {
	}



	public BloodwychCanvas(Bloodwych bloodwych) {
		this.bloodwych = bloodwych;
	}

	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            clearCanvas(g);
            drawBackground(g);
            drawMap(g);

        } catch (Exception ex) {

        }


    }

	private void drawMap(Graphics g) {
		bloodwych.graphicsHelper.drawPlayersView(bloodwych.p1, g);
	}


	private void drawBackground(Graphics g) {
		int[] background = bloodwych.background[bloodwych.b];
		bloodwych.graphicsHelper.drawImage(g, bloodwych.img,background,bloodwych.p1,bloodwych.scale);

	}



	private void clearCanvas(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);



	}


}
