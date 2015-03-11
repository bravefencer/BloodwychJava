/**
 * Created by ERTE005 on 11.03.2015.
 */
public class Player {

	public int x;
	public int y;
	public int level;
	public int rotation;
	public int portalX;
	public int portalY;
	public String[] view;

	public Player(int posX, int posY, int level, int rotation, int portalX, int portalY) {

		this.x = posX;
		this.y = posY;
		this.level = level;
		this.rotation = rotation;
		this.portalX = portalX;
		this.portalY = portalY;
		this.view = new String[19];

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


	/**
	 * calculates the fields in map which are seen by the player for
	 * current direction and position.
	 * @param map
	 */
	public void pView(String[][] map) {

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

		for(int x = 0; x < 19; x++) {

			switch (x) {
				case 0:
					this.view[0] = map[this.y + (4 * yo) + (2 * xo)][this.x + (4 * xo) - (2 * yo)];
					break;//-4 +2
				case 1:
					this.view[1] = map[this.y + (4 * yo) - (2 * xo)][this.x + (4 * xo) + (2 * yo)];
					break; //-4 -2
				case 2:
					this.view[2] = map[this.y + (4 * yo) + (1 * xo)][this.x + (4 * xo) - (1 * yo)];
					break; //-4 +1
				case 3:
					this.view[3] = map[this.y + (4 * yo) - (1 * xo)][this.x + (4 * xo) + (1 * yo)];
					break; //-4 -1
				case 4:
					this.view[4] = map[this.y + (4 * yo) - (0 * xo)][this.x + (4 * xo) + (0 * yo)];
					break; //-4 0
				case 5:
					this.view[5] = map[this.y + (3 * yo) + (2 * xo)][this.x + (3 * xo) - (2 * yo)];
					break; //-3 +2
				case 6:
					this.view[6] = map[this.y + (3 * yo) - (2 * xo)][this.x + (3 * xo) + (2 * yo)];
					break; //-3 -2
				case 7:
					this.view[7] = map[this.y + (3 * yo) + (1 * xo)][this.x + (3 * xo) - (1 * yo)];
					break; //-3 +1
				case 8:
					this.view[8] = map[this.y + (3 * yo) - (1 * xo)][this.x + (3 * xo) + (1 * yo)];
					break; //-3 -1
				case 9:
					this.view[9] = map[this.y + (3 * yo) - (0 * xo)][this.x + (3 * xo) - (0 * yo)];
					break; //-3 0
				case 10:
					this.view[10] = map[this.y + (2 * yo) + (1 * xo)][this.x + (2 * xo) - (1 * yo)];
					break; //-2 +1
				case 11:
					this.view[11] = map[this.y + (2 * yo) - (1 * xo)][this.x + (2 * xo) + (1 * yo)];
					break; //-2 -1
				case 12:
					this.view[12] = map[this.y + (2 * yo) - (0 * xo)][this.x + (2 * xo) + (0 * yo)];
					break; //-2 0
				case 13:
					this.view[13] = map[this.y + (1 * yo) + (1 * xo)][this.x + (1 * xo) - (1 * yo)];
					break; //-1 +1
				case 14:
					this.view[14] = map[this.y + (1 * yo) - (1 * xo)][this.x + (1 * xo) + (1 * yo)];
					break; //-1 -1
				case 15:
					this.view[15] = map[this.y + (1 * yo) - (0 * xo)][this.x + (1 * xo) + (0 * yo)];
					break; //-1 0
				case 16:
					this.view[16] = map[this.y + (0 * yo) + (1 * xo)][this.x + (0 * xo) - (1 * yo)];
					break; //0 +1
				case 17:
					this.view[17] = map[this.y + (0 * yo) - (1 * xo)][this.x + (0 * xo) + (1 * yo)];
					break; //0 -1
				case 18:
					this.view[18] = map[this.y][this.x];
					break; //0 0
				default:
					this.view[x] = "0001";
					;
					break;


			}

		}

	}


}
