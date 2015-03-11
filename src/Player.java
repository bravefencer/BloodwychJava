/**
 * Created by ERTE005 on 11.03.2015.
 */
public class Player {

	private int x;
	private int y;
	private int level;
	private int rotation;
	private int portalX;
	private int portalY;
	String[] view;

	public Player(int posX, int posY, int level, int rotation, int portalX, int portalY) {

		this.x = posX;
		this.y = posY;
		this.level = level;
		this.rotation = rotation;
		this.portalX = portalX;
		this.portalY = portalY;

	}

	public void moveForward() {
		int xo = 0;
		int yo = 0;
		switch (this.rotation) {
			case 0:
				xo = 0;
				yo = -1;
				break;
			case 1:
				xo = 1;
				yo = 0;
				break;
			case 2:
				xo = 0;
				yo = 1;
				break;
			case 3:
				xo = -1;
				yo = 0;
				break;
		}
		this.y = this.y + (1 * yo) - (0 * xo);
		this.x = this.x + (1 * xo) + (0 * yo);
	}

	public void moveBackward() {
		int xo = 0;
		int yo = 0;
		switch (this.rotation) {
			case 0:
				xo = 0;
				yo = -1;
				break;
			case 1:
				xo = 1;
				yo = 0;
				break;
			case 2:
				xo = 0;
				yo = 1;
				break;
			case 3:
				xo = -1;
				yo = 0;
				break;
		}
		this.y = this.y - (1 * yo) - (0 * xo);
		this.x = this.x - (1 * xo) + (0 * yo);
	}


}
