/**
 * Created by sascha on 13.03.2015.
 */
public class Renderer {

    Bloodwych  bloodwych;

    Renderer(Bloodwych bloodwych) {
        this.bloodwych = bloodwych;
    }

    public void draw() {
        bloodwych.updatePlayerViewScreen();
    }
}
