import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * Created by ERTE005 on 09.03.2015.
 */
public class BloodwychCanvas extends JComponent{

	private int WIDTH = 800;
	private int HEIGHT = 300;

	private Bloodwych bloodwych;

	public BloodwychCanvas(Bloodwych bloodwych) {
		this.bloodwych = bloodwych;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		clearCanvas(g);
		drawBackground(g);



	}


	private void drawBackground(Graphics g) {
		int[] background = bloodwych.background[bloodwych.b];
		drawImage(g, background);

	}

	private void drawImage(Graphics g, int[] pos) {
		g.drawImage(bloodwych.img,
				pos[4],
				pos[5]*bloodwych.scale,
				pos[2]*bloodwych.scale,
				pos[3]*bloodwych.scale,
				pos[0],
				pos[1],
				pos[0]+pos[2],
				pos[1]+pos[3],
				Color.black,
				this);
	}

	private void clearCanvas(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);



	}


}
