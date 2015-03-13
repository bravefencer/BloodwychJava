/**
 * Created by sascha on 13.03.2015.
 */
public class Main extends Thread {

    private boolean run = false;

    double timeStep = 1.0 / 60.0;

    private final Renderer renderer;
    private final GameLogic gameLogic;


    Main(Bloodwych bloodwych) {
        renderer = new Renderer(bloodwych);
        gameLogic = new GameLogic(bloodwych);

    }

    @Override
    public void run() {

        run = true;
        double nextTime = (double)System.nanoTime() / 1000000000.0;

        while(run) {
            double currTime = (double)System.nanoTime() / 1000000000.0;
            if(currTime >= nextTime)
            {
                // assign the time for the next update
                nextTime += timeStep;

               gameLogic.handlekeyboard();
                gameLogic.update();
                //rendering
                if(currTime < nextTime) {
                    renderer.draw();
                }

            }
            else
            {
                // calculate the time to sleep
                int sleepTime = (int)(1000.0 * (nextTime - currTime));
                // sanity check
                if(sleepTime > 0)
                {
                    // sleep until the next update
                    try
                    {
                        Thread.sleep(sleepTime);
                    }
                    catch(InterruptedException e)
                    {
                        // do nothing
                    }
                }
            }
        }


        }


    }

