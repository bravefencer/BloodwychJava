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
	public BufferedImage gfxStone;
	public BufferedImage[] gfxWooden = new BufferedImage[3];
	public BufferedImage[] gfxMisc = new BufferedImage[2];

	public BloodwychFrame frame = null;
	private int currentMap = 0;
	private String[] Maps = {"MOD0","MOON","CHAOS","DRAGON","ZENDIK","SERP"};
	FileLoader fileLoader = new FileLoader();
	Tower tower = new Tower();
	int b = 0;
	int scale = 3;
	Player p1 = new Player(12, 22, 3,0,0,0);
	Player p2 = new Player(14,22,3,0,0,350);
	int[][] background = new int[][] {{0, 0, 128, 76, 0, 0},{128, 0, 128, 76, 0, 0}};
	int[][] gfxPos = new int[][]{{15, 0, 98, 76, 15, 0},
			{0, 0, 15, 76, 0, 0},
			{15, 0, 98, 76, 15, 0},//2
			{113, 0, 15, 76, 113, 0},
			{128, 0, 15, 76, 0, 0},
			{143, 0, 17, 76, 15, 0},//5
			{160, 0, 64, 76, 32, 0},//6
			{224, 0, 17, 76, 96, 0},//7
			{241, 0, 16, 76, 113, 0},//8
			{0, 76, 32, 42, 0, 14},//9
			{32, 76, 8, 42, 32, 14},
			{40, 76, 48, 42, 40, 14},
			{88, 76, 8, 42, 88, 14},
			{96, 76, 32, 42, 96, 14},//13
			{128, 76, 41, 36, 0, 14},
			{168, 76, 6, 36, 40, 14},
			{174, 76, 36, 36, 46, 14},
			{210, 76, 6, 36, 82, 14},
			{215, 76, 41, 36, 87, 14},
			{0, 118, 12, 28, 0, 18},
			{12, 118, 34, 28, 12, 18},//20
			{46, 118, 4, 28, 46, 18},//21
			{50, 118, 4, 28, 78, 18},//22
			{54, 118, 34, 28, 82, 18},//23
			{88, 118, 12, 28, 116, 18},//24
			{100, 118, 13, 28, 0, 18}, //25
			{113, 118, 10, 28, 13, 18},//26
			{123, 118, 10, 28, 104, 18},//27
			{133, 118, 14, 28, 114, 18},//28
			{146, 111, 16, 76, 0, 0},
			{162, 111, 96, 76, 16, 0},
			{258, 111, 16, 76, 112, 0}};

	public GraphicsHelper graphicsHelper = new GraphicsHelper(this);


		public Bloodwych() throws IOException {
		loadImages();
		loadMap(Maps[0]);
            frame = new BloodwychFrame(this);
            frame.setVisible(true);

		}

	private void loadMap(String map) throws IOException {
		fileLoader.load(map, tower);

	}



	private void loadImages() throws IOException {
		img = ImageIO.read(this.getClass().getResource("/images/back.png"));
		gfxStone = ImageIO.read(this.getClass().getResource("/images/screen1.png"));
		gfxWooden[0] = ImageIO.read(this.getClass().getResource("/images/screen2.png"));
		gfxWooden[1] = ImageIO.read(this.getClass().getResource("/images/screen3.png"));
		gfxWooden[2] = ImageIO.read(this.getClass().getResource("/images/screen4.png"));
		gfxMisc[0] = ImageIO.read(this.getClass().getResource("/images/screen5.png"));
		gfxMisc[1] = ImageIO.read(this.getClass().getResource("/images/screen11.png"));



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

        if (key == KeyEvent.VK_SPACE) {
             p1 = new Player(12, 22, 3,0,0,0);
            p1.pView(tower.levels.get(p1.level).map);
            frame.canvas.repaint();
        }

        if(key == KeyEvent.VK_Q) {
            p1.rotatePlayer(1);
            p1.pView(tower.levels.get(p1.level).map);
            frame.canvas.repaint();

        }
        if(key == KeyEvent.VK_E) {
            p1.rotatePlayer(-1);
            p1.pView(tower.levels.get(p1.level).map);
            frame.canvas.repaint();

        }



	}


}
