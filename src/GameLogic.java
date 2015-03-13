import java.awt.event.KeyEvent;

/**
 * Created by sascha on 13.03.2015.
 */
public class GameLogic {

    Bloodwych bloodwych;

    public GameLogic(Bloodwych bloodwych) {
        this.bloodwych = bloodwych;

    }

    public void update() {


    }

    public void handlekeyboard() {
        bloodwych.keyboard.poll();
        if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_W)){
            bloodwych.p1.moveForward();
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_S)){
            bloodwych.p1.moveBackward();
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_A)){
            bloodwych.p1.moveLeft();
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_D)){
            bloodwych.p1.moveRight();
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_E)){
            bloodwych.p1.rotatePlayer(-1);
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_Q)){
            bloodwych.p1.rotatePlayer(1);
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_Y)){
            bloodwych.p1.moveLevelUp(bloodwych.tower);
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_X)){
            bloodwych.p1.moveLevelDown(bloodwych.tower);
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_T)){
           bloodwych.currentMap = bloodwych.currentMap + 1;
            if (bloodwych.currentMap > bloodwych.Maps.length) {
                bloodwych.currentMap = 0;
            }
            Tower tower = new Tower();
            bloodwych.tower = tower;
            bloodwych.loadMap(bloodwych.Maps[bloodwych.currentMap], tower);
        }

    }
}
