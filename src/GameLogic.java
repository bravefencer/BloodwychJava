import java.awt.event.KeyEvent;
import java.util.LinkedList;

/**
 * Created by sascha on 13.03.2015.
 */
public class GameLogic {

    Bloodwych bloodwych;
    LinkedList eventQueue = new LinkedList();

    public GameLogic(Bloodwych bloodwych) {
        this.bloodwych = bloodwych;

    }

    public void update() {
        for (int i = 0; i < this.eventQueue.size(); i ++) {

        }


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
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_SPACE)){
            bloodwych.p1.updateAction();
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_Y)){
            bloodwych.p1.moveLevelUp(bloodwych.tower);
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_X)){
            bloodwych.p1.moveLevelDown(bloodwych.tower);
        }

        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_UP)){
            bloodwych.p2.moveForward();
        }
        //p2
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_DOWN)){
            bloodwych.p2.moveBackward();
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_LEFT)){
            bloodwych.p2.moveLeft();
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_RIGHT)){
            bloodwych.p2.moveRight();
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_INSERT)){
            bloodwych.p2.rotatePlayer(-1);
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_DELETE)){
            bloodwych.p2.rotatePlayer(1);
        }
        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_ENTER)){
            bloodwych.p2.updateAction();
        }

        else if(bloodwych.keyboard.keyDownOnce(KeyEvent.VK_T)){
           bloodwych.currentMap = bloodwych.currentMap + 1;
            if (bloodwych.currentMap > bloodwych.Maps.length) {
                bloodwych.currentMap = 0;
            }
            bloodwych.p1.x = 0;bloodwych.p2.x = 0;
            bloodwych.p1.y = 0;bloodwych.p2.y = 0;
            Tower tower = new Tower();
            bloodwych.tower = tower;
            bloodwych.loadMap(bloodwych.Maps[bloodwych.currentMap], tower);
        }

    }
}
