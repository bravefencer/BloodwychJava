import javax.imageio.ImageIO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by ERTE005 on 09.03.2015.
 */
public class Bloodwych  {
    public BufferedImage img;
    public BufferedImage gfxStone;
    public BufferedImage[] gfxWooden = new BufferedImage[3];
    public BufferedImage[] gfxMisc = new BufferedImage[2];
    public BufferedImage gfxShelf;
    public BufferedImage gfxScriptBanner;
    public BufferedImage gfxSerpBanner;
    public BufferedImage gfxDragonBanner;
    public BufferedImage gfxMoonBanner;
    public BufferedImage gfxChaosBanner;
    public BufferedImage gfxWallSwitch;
    public BufferedImage gfxGemSlot;
    public BufferedImage gfxStairs[] = new BufferedImage[2];
    public BufferedImage gfxDoor[] = new BufferedImage[3];
    public BufferedImage gfxFloor[] = new BufferedImage[3];
    public BufferedImage gfxDragon;
    public BufferedImage gfxChaos;
    public BufferedImage gfxSerp;
    public BufferedImage gfxBrown;

    private Main gameloop;

    public BloodwychFrame frame = null;
    public int currentMap = 0;
    public String[] Maps = {"MOD0", "MOON", "CHAOS", "DRAGON", "ZENDIK", "SERP"};
    FileLoader fileLoader = new FileLoader();
    Tower tower = new Tower();
    int b = 0;
    int scale = 3;
    Player p1 = new Player(12, 22, 3, 0, 0, 0);
    Player p2 = new Player(14, 22, 3, 0, 400, 0);
    int[][] background = new int[][]{{0, 0, 128, 76, 0, 0}, {128, 0, 128, 76, 0, 0}};
    int[][] gfxPos = new int[][]{{15, 0, 98, 76, 15, 0},
            {0, 0, 15, 76, 0, 0},
            {15, 0, 98, 76, 15, 0},//2
            {113, 0, 15, 76, 113, 0},//3
            {128, 0, 16, 76, 0, 0},//4
            {144, 0, 16, 76, 16, 0},//5
            {160, 0, 64, 76, 32, 0},//6
            {224, 0, 17, 76, 96, 0},//7
            {241, 0, 16, 76, 113, 0},//8
            {0, 76, 32, 42, 0, 14},//9
            {32, 76, 8, 42, 32, 14},
            {40, 76, 48, 42, 40, 14},
            {88, 76, 8, 42, 88, 14},
            {96, 76, 32, 42, 96, 14},//13
            {128, 76, 41, 34, 0, 14},
            {169, 76, 5, 34, 41, 14},
            {174, 76, 36, 34, 46, 14},//16
            {210, 76, 5, 34, 82, 14},//17
            {215, 76, 41, 34, 87, 14},//18
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

    public KeybordControl keyboard = new KeybordControl();

    FPS fps;

    public Bloodwych() throws IOException {
        loadImages();
        loadMap(Maps[0], tower);
        frame = new BloodwychFrame(this);
        frame.setVisible(true);
        fps = new FPS();
        fps.initialize();
        gameloop = new Main(this);
        gameloop.start();


    }


    public void loadMap(String map, Tower tower) {
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
        gfxShelf = ImageIO.read(this.getClass().getResource("/images/screen12.png"));
        gfxScriptBanner = ImageIO.read(this.getClass().getResource("/images/screen17.png"));
        gfxSerpBanner = ImageIO.read(this.getClass().getResource("/images/screen13.png"));
        gfxDragonBanner = ImageIO.read(this.getClass().getResource("/images/screen14.png"));
        gfxMoonBanner = ImageIO.read(this.getClass().getResource("/images/screen15.png"));
        gfxChaosBanner = ImageIO.read(this.getClass().getResource("/images/screen16.png"));
        gfxWallSwitch = ImageIO.read(this.getClass().getResource("/images/screen20.png"));
        gfxGemSlot = ImageIO.read(this.getClass().getResource("/images/screen22.png"));
        gfxStairs[0] = ImageIO.read(this.getClass().getResource("/images/screen10.png"));
        gfxStairs[1] = ImageIO.read(this.getClass().getResource("/images/screen9.png"));
        gfxDoor[0] = ImageIO.read(this.getClass().getResource("/images/screen6.png"));
        gfxDoor[1] = ImageIO.read(this.getClass().getResource("/images/screen7.png"));
        gfxDoor[2] = ImageIO.read(this.getClass().getResource("/images/screen8.png"));
        gfxFloor[0] = ImageIO.read(this.getClass().getResource("/images/screen18.png"));
        gfxFloor[1] = ImageIO.read(this.getClass().getResource("/images/screen19.png"));
        gfxFloor[2] = ImageIO.read(this.getClass().getResource("/images/screen21.png"));
        gfxDragon = graphicsHelper.recolorImage(gfxScriptBanner, "Dragon", "Banner", null);
        gfxChaos = graphicsHelper.recolorImage(gfxScriptBanner, "Chaos", "Banner", null);
        gfxSerp = graphicsHelper.recolorImage(gfxScriptBanner, "Serp", "Banner", null);
        gfxBrown = graphicsHelper.recolorImage(gfxScriptBanner, "Brown", "Banner", null);


    }


    public static void main(String args[]) throws IOException {

        new Bloodwych();

    }

    void updateScreen() {

        p1.pView(tower.levels.get(p1.level).map);
        frame.canvas.repaint();
        fps.calculate();
        frame.updateStatusLabel(p1, tower.levels.get(p1.level).map, p1.level, Maps[currentMap],fps.getFrameRate());


    }



//        }
//        if (key == KeyEvent.VK_SPACE) {
//            p1 = new Player(15, 13, 3, 0, 0, 0);
//
//        }
//        if (key == KeyEvent.VK_Y) {
//            p1.moveLevelUp(tower);
//
//
//        }
//        if (key == KeyEvent.VK_X) {
//            p1.moveLevelDown(tower);
//
//
//        }
//        if (key == KeyEvent.VK_T) {
//            currentMap = currentMap + 1;
//            if (currentMap > Maps.length) {
//                currentMap = 0;
//            }
//            tower = new Tower();
//            loadMap(Maps[currentMap], tower);
//
//
//    }


//    }


}
