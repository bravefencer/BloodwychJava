import javax.swing.*;
import java.awt.*;

/**
 * Created by ERTE005 on 09.03.2015.
 */
public class BloodwychFrame extends JFrame {

	public GameCanvas canvas;
	private JLabel status = new JLabel("label");


	public BloodwychFrame(Bloodwych bloodwych) {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(800, 800));
		this.setBackground(Color.black);
        canvas = new GameCanvas(bloodwych);
		this.setLayout(new GridLayout(2,1));
		this.getContentPane().add(canvas);
		this.getContentPane().add(status);
		this.pack();
        canvas.requestFocusInWindow();
        this.canvas.addKeyListener(bloodwych.keyboard);
        canvas.initBufferStrategy();


	}

	public void updateStatusLabel(Player p1, String[][] map, int level, String currentTower, String fps) {

            //todo show hex
            status.setText("Y:"+p1.y+" X:"+p1.x+" r:"+p1.rotation+" Tower:"+currentTower+" level:"+level+ " FPS:"+fps);


	}



}
