/**
 * Created by sascha on 13.03.2015.
 */
public class FPSThread extends Thread {


    long fps = 60;
    long after = System.currentTimeMillis();
    long before= 0;

    private final Bloodwych bloodwych;

    FPSThread(Bloodwych bloodwych) {
        this.bloodwych = bloodwych;
    }

    @Override
    public void run() {

        while (true) {
            before = System.currentTimeMillis();
            bloodwych.updateScreen();
            after = System.currentTimeMillis();
            try {
                sleep(1000l / fps);

            } catch (InterruptedException ex) {


            }


        }

    }
}
