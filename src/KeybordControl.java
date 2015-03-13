import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by sascha on 13.03.2015.
 */
public class KeybordControl extends KeyAdapter {


    private boolean[] keys;


    private int[] polled;

    private boolean pressed;


    public KeybordControl() {

        keys = new boolean[256];
        polled = new int[256];


    }


    public boolean keyDown(int keyCode) {
        return polled[keyCode] > 0;

    }


    public boolean keyDownOnce(int keyCode) {
        return polled[keyCode] == 1;

    }


    public synchronized void poll() {

        for (int i = 0; i < keys.length; ++i) {

            if (keys[i]) {
                polled[i]++;

            } else {
                polled[i] = 0;
            }

        }

    }


    public synchronized void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();


        if (keyCode >= 0 && keyCode < keys.length && !pressed) {
            keys[keyCode] = true;

        }
        pressed = true;


    }


    public synchronized void keyReleased(KeyEvent e) {

        int keyCode = e.getKeyCode();

        if (keyCode >= 0 && keyCode < keys.length) {

            keys[keyCode] = false;
            pressed = false;

        }

    }


}


