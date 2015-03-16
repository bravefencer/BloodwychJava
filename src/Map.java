import java.util.ArrayList;
import java.util.List;

/**
 * Created by ERTE005 on 09.03.2015.
 */
public class Map {

	public int width;
	public int height;
	public int yOff;
	public int xOff;
	public String[][] map;

	Map(int width, int height, int xOff, int yOff){
		this.width = width;
		this.height = height;
		this.xOff = xOff;
		this.yOff = yOff;
	}

    public void setHexAtMapPos(int x, int y, String hex) {
        this.map[y][x] = hex;
    }





}
