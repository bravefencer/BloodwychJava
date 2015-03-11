import javax.swing.*;
import java.awt.*;

/**
 * Created by ERTE005 on 09.03.2015.
 */
public class BloodwychFrame extends JFrame {

	public BloodwychCanvas canvas;


	public BloodwychFrame(Bloodwych bloodwych) {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(500, 300));
		canvas = new BloodwychCanvas(bloodwych);
		this.setContentPane(canvas);
		this.pack();
		this.addKeyListener(bloodwych);
		this.setVisible(true);

	}


}
