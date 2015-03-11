import javax.imageio.ImageIO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by ERTE005 on 09.03.2015.
 */
public class Bloodwych extends KeyAdapter {
	public BufferedImage img;

	private BufferedImage gfxStone;
	private BloodwychFrame frame = new BloodwychFrame(this);
	private int currentMap = 0;
	private String[] Maps = {"MOD0","MOON","CHAOS","DRAGON","ZENDIK","SERP"};
	FileLoader fileLoader = new FileLoader();
	Tower tower = new Tower();
	int b = 0;
	int scale = 3;
	Player p1 = new Player(12, 22, 3,0,0,0);
	Player p2 = new Player(14,22,3,0,0,350);
	int[][] background = new int[][] {{0, 0, 128, 76, 0, 0},{128, 0, 128, 76, 0, 0}};
	int[][] spriteSheetArray = new int[][]{{15, 0, 98, 76, 15, 0}, {0, 0, 15, 76, 0, 0}, {15, 0, 98, 76, 15, 0},
			{113, 0, 15, 76, 113, 0}, {128, 0, 15, 76, 0, 0}, {143, 0, 17, 76, 15, 0}, {160, 0, 64, 76, 32, 0}, {224, 0, 17, 76, 96, 0}, {241, 0, 16, 76, 113, 0},
			{0, 76, 32, 42, 0, 14}, {32, 76, 8, 42, 32, 14}, {40, 76, 48, 42, 40, 14}, {88, 76, 8, 42, 88, 14}, {96, 76, 32, 42, 96, 14}, {128, 76, 41, 36, 0, 14},
			{168, 76, 6, 36, 40, 14}, {174, 76, 36, 36, 46, 14}, {210, 76, 6, 36, 82, 14}, {215, 76, 41, 36, 87, 14}, {0, 118, 12, 28, 0, 18},
			{12, 118, 34, 28, 12, 18}, {46, 118, 4, 28, 46, 18}, {50, 118, 4, 28, 78, 18}, {54, 118, 34, 28, 82, 18}, {88, 118, 12, 28, 116, 18},
			{100, 118, 13, 28, 0, 18}, {113, 118, 10, 28, 13, 18}, {123, 118, 10, 28, 104, 18}, {133, 118, 14, 28, 114, 18},
			{146, 111, 16, 76, 0, 0}, {162, 111, 96, 76, 16, 0}, {258, 111, 16, 76, 112, 0}};


		public Bloodwych() throws IOException {
		loadImages();
		loadMap(Maps[0]);
		frame.canvas.repaint();


	}

	private void loadMap(String map) throws IOException {
		fileLoader.load(map, tower);

	}



	private void loadImages() throws IOException {
		img = ImageIO.read(this.getClass().getResource("/images/back.png"));
		gfxStone = ImageIO.read(this.getClass().getResource("/images/screen1.png"));



	}


	public static void main(String args[]) throws IOException {

		new Bloodwych();

	}


	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_W) {
			p1.moveForward();
			p1.pView(tower.levels.get(p1.level).map);
			frame.canvas.repaint();
		}

		if (key == KeyEvent.VK_S) {
			p1.moveBackward();
			p1.pView(tower.levels.get(p1.level).map);
			frame.canvas.repaint();
		}



	}


}
