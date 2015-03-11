import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by ERTE005 on 11.03.2015.
 */
public class GraphicsHelper {

	Bloodwych bloodwych;

	public GraphicsHelper(Bloodwych bloodwych) {

		this.bloodwych = bloodwych;

	}



	public void drawPlayersView(Player p, Graphics g) {

		for (int x = 0; x < 19; x++) {

			int BlockType = Integer.parseInt(p.view[x].substring(3, 4));

			if (BlockType == 2) {
				//drawWoodenObject(p,x);
			} else {

				switch (x) {
					case 0: {
						drawImage(g, getImage(p.view[x], 0, 28, p), bloodwych.gfxPos[28], p , bloodwych.scale);
						drawImage(g, getImage(p.view[x], 0, 27, p), bloodwych.gfxPos[27], p , bloodwych.scale);
						break;
					}
					case 1:{
						drawImage(g, getImage(p.view[x], 0, 26, p), bloodwych.gfxPos[26], p , bloodwych.scale);
						drawImage(g, getImage(p.view[x], 0, 25, p), bloodwych.gfxPos[25], p , bloodwych.scale);
						break;
					}
					case 2:{
						drawImage(g, getImage(p.view[x], 0, 27, p), bloodwych.gfxPos[27], p , bloodwych.scale);
						drawImage(g, getImage(p.view[x], 0, 23, p), bloodwych.gfxPos[23], p , bloodwych.scale);
						drawImage(g, getImage(p.view[x], 0, 22, p), bloodwych.gfxPos[22], p , bloodwych.scale);

						break;
					}
					case 3:{

						drawImage(g, getImage(p.view[x], 0, 26, p), bloodwych.gfxPos[26], p , bloodwych.scale);
						drawImage(g, getImage(p.view[x], 0, 21, p), bloodwych.gfxPos[21], p , bloodwych.scale);
						drawImage(g, getImage(p.view[x], 0, 20, p), bloodwych.gfxPos[20], p , bloodwych.scale);

						break;

					}
					case 4:{

						drawImage(g, getImage(p.view[x], 0, 22, p), bloodwych.gfxPos[22], p , bloodwych.scale);
						drawImage(g, getImage(p.view[x], 0, 21, p), bloodwych.gfxPos[21], p , bloodwych.scale);
						drawImage(g, getImage(p.view[x], 0, 16, p), bloodwych.gfxPos[16], p , bloodwych.scale);

						break;
					}
					case 5:{
						drawImage(g, getImage(p.view[x], 0, 24, p), bloodwych.gfxPos[24], p , bloodwych.scale);
						break;
					}
					case 6:{
						drawImage(g, getImage(p.view[x], 0, 19, p), bloodwych.gfxPos[19], p , bloodwych.scale);
						break;

					}
					case 7:{
						if (BlockType == 1 || BlockType == 2) {

							drawImage(g, getImage(p.view[x], 0, 23, p), bloodwych.gfxPos[23], p , bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 24, p), bloodwych.gfxPos[24], p , bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 17, p), bloodwych.gfxPos[17], p , bloodwych.scale);


						}
						drawImage(g, getImage(p.view[x], 0, 18, p), bloodwych.gfxPos[18], p , bloodwych.scale);
						break;

					}
					case 8:{
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(p.view[x], 0, 20, p), bloodwych.gfxPos[20], p , bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 19, p), bloodwych.gfxPos[19], p , bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 15, p), bloodwych.gfxPos[15], p , bloodwych.scale);

						}
						drawImage(g, getImage(p.view[x], 0, 14, p), bloodwych.gfxPos[14], p , bloodwych.scale);
						break;
					}
					case 9:{
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(p.view[x], 0, 17, p), bloodwych.gfxPos[17], p , bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 16, p), bloodwych.gfxPos[16], p , bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 15, p), bloodwych.gfxPos[15], p , bloodwych.scale);

						}
						drawImage(g, getImage(p.view[x], 0, 11, p), bloodwych.gfxPos[11], p , bloodwych.scale);
						break;
					}
					case 10:{
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(p.view[x], 0, 18, p), bloodwych.gfxPos[18], p , bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 12, p), bloodwych.gfxPos[12], p , bloodwych.scale);

						}
						drawImage(g, getImage(p.view[x], 0, 13, p), bloodwych.gfxPos[13], p, bloodwych.scale);
						break;
					}
					case 11:{
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(p.view[x], 0, 14, p), bloodwych.gfxPos[14], p, bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 10, p), bloodwych.gfxPos[10], p, bloodwych.scale);
						}
						drawImage(g, getImage(p.view[x], 0, 9, p), bloodwych.gfxPos[9], p , bloodwych.scale);
						break;
					}
					case 12:{
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(p.view[x], 0, 12, p), bloodwych.gfxPos[12], p, bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 11, p), bloodwych.gfxPos[11], p, bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 10, p), bloodwych.gfxPos[10], p, bloodwych.scale);



						}
						drawImage(g, getImage(p.view[x], 0, 6, p), bloodwych.gfxPos[6], p, bloodwych.scale);
						break;
					}
					case 13:{
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(p.view[x], 0, 13, p), bloodwych.gfxPos[13], p, bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 7, p), bloodwych.gfxPos[7], p, bloodwych.scale);

						}
						drawImage(g, getImage(p.view[x], 0, 8, p), bloodwych.gfxPos[8], p, bloodwych.scale);
						break;

					}
					case 14:{
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(p.view[x], 0, 9, p), bloodwych.gfxPos[9], p, bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 5, p), bloodwych.gfxPos[5], p, bloodwych.scale);

						}
						drawImage(g, getImage(p.view[x], 0, 4, p), bloodwych.gfxPos[4], p, bloodwych.scale);
						break;
					}
					case 15:{
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(p.view[x], 0, 6, p), bloodwych.gfxPos[6], p, bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 7, p), bloodwych.gfxPos[7], p, bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 5, p), bloodwych.gfxPos[5], p, bloodwych.scale);

						}
						drawImage(g, getImage(p.view[x], 0, 2, p), bloodwych.gfxPos[2], p, bloodwych.scale);
						break;
					}
					case 16:{
						drawImage(g, getImage(p.view[x], 0, 3, p), bloodwych.gfxPos[3], p, bloodwych.scale);
						break;
					}
					case 17:{
						drawImage(g, getImage(p.view[x], 0, 1, p), bloodwych.gfxPos[1], p, bloodwych.scale);
						break;
					}
					case 18:{
						if (BlockType == 5) {
							//drawDoorFrame(p);
						}
						else {
							drawImage(g, getImage(p.view[x], 0, 31, p), bloodwych.gfxPos[31], p, bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 29, p), bloodwych.gfxPos[29], p, bloodwych.scale);
							drawImage(g, getImage(p.view[x], 0, 30, p), bloodwych.gfxPos[30], p, bloodwych.scale);

							break;

						};
					}


				}


			}

		}

	}

	private void drawImage(Graphics g, BufferedImage image, int scale) {

	}

	public void drawImage(Graphics g, BufferedImage image, int[] pos, Player p, int scale) {

		Graphics2D g2d = (Graphics2D) g.create();


		if(image == null){
			return;
		}

		g2d.drawImage(image,
				pos[4],
				pos[5] * scale,
				pos[2] * scale,
				pos[3] * scale,
				pos[0],
				pos[1],
				pos[0] + pos[2],
				pos[1] + pos[3],
				null,
				null);
	}


	private BufferedImage getImage(String hex, int d, int pos, Player p){

		// Hex = Bloodwych Hex Code
		// d = direction of required wall (North,East,South,West)
		// pos = Position on the screen we are drawing
		//
		// This function will return the correct graphic to be draw for the Hex Code passed
		// I may need to pass the Graphics Position to be drawn so I can work out which graphic
		// to be return for each wall side.

		int CC = Integer.parseInt(hex.substring(3), 16);
		int BB = Integer.parseInt(hex.substring(1, 2), 16);

		switch (CC){
			case 0:return null;
			case 1:return getStoneWall(hex,d,pos,p);
			default:return null;
		}




	}

	private BufferedImage getStoneWall(String hex, int d, int pos, Player p) {
		return bloodwych.gfxStone;
	}

	;


}