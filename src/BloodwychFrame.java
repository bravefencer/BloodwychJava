import javax.swing.*;
import java.awt.*;

/**
 * Created by ERTE005 on 09.03.2015.
 */
public class BloodwychFrame extends JFrame {

	public BloodwychCanvas canvas;
	private JLabel status = new JLabel("label");


	public BloodwychFrame(Bloodwych bloodwych) {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(800, 300));
		canvas = new BloodwychCanvas(bloodwych);
		this.setBackground(Color.black);

		this.setLayout(new GridLayout(1,2));
		this.getContentPane().add(canvas);
		this.getContentPane().add(status);
		this.pack();
		this.addKeyListener(bloodwych);


	}

	public void updateStatusLabel(Player p1, String hex, int level) {
		status.setText("Y:"+p1.y+" X:"+p1.x+" r:"+p1.rotation+" hex:"+hex+" level:"+level);
	}



}
