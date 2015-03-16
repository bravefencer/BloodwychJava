import java.util.Stack;

/**
 * Created by ERTE005 on 09.03.2015.
 */
public class Tower {


	public Stack<Map> levels;

	public Tower() {
		levels = new Stack<Map>();
	}
	public void pushMap(Map map) {
		this.levels.push(map);
	}

    public void setHexAtMapPos(int level, int mapX, int mapY, String hex) {
        levels.get(level).setHexAtMapPos(mapX,mapY,hex);
    }
}
