import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;

/**
 * Created by ERTE005 on 11.03.2015.
 */
public class GraphicsHelper {

	Bloodwych bloodwych;

	public GraphicsHelper(Bloodwych bloodwych) {

		this.bloodwych = bloodwych;

	}

	// wall direction is  the relative direction to player. )
	public int getWallDirection(int d, int s) {
		// d = player direction
		// s = screen gfx position

		//I should be able to use the below in an array to work out all directions
		//current plus direction = wall face i.e.
		//If a wall is currently North which is a 0 + player direction. Say Player is facing East = 1
		// 0 + 1 = 1 (North Wall becomes East)
		int[] Wall = new int [32];
		Wall[0] = 0;
		Wall[1] = 1;
		Wall[2] = 2;
		Wall[3] = 3;
		Wall[4] = 2;
		Wall[5] = 1;
		Wall[6] = 2;
		Wall[7] = 3;
		Wall[8] = 2;
		Wall[9] = 2;
		Wall[10] = 1;
		Wall[11] = 2;
		Wall[12] = 3;
		Wall[13] = 2;
		Wall[14] = 2;
		Wall[15] = 1;
		Wall[16] = 2;
		Wall[17] = 3;
		Wall[18] = 2;
		Wall[19] = 1;
		Wall[20] = 2;
		Wall[21] = 1;
		Wall[22] = 3;
		Wall[23] = 2;
		Wall[24] = 3;
		Wall[25] = 2;
		Wall[26] = 1;
		Wall[27] = 3;
		Wall[28] = 2;
		Wall[29] = 3; //2
		Wall[30] = 0; //3
		Wall[31] = 1; //0

		Wall[s] = Wall[s] + d;

		if (Wall[s] > 3) {
			Wall[s] = (Wall[s] - 3) -1;
		}


		return Wall[s];


	}



	public void drawPlayersView(Player p, Graphics g) {

		for (int x = 0; x < 19; x++) {

			int BlockType = Integer.parseInt(p.view[x].substring(3, 4));

			if (BlockType == 2) {
				drawWoodenObject(g, p, x);
			} else {

				switch (x) {
					case 0: {
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 28), 28, p), bloodwych.gfxPos[28], p, bloodwych.scale);
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 27), 27, p), bloodwych.gfxPos[27], p, bloodwych.scale);
						break;
					}
					case 1: {
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 26), 26, p), bloodwych.gfxPos[26], p, bloodwych.scale);
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 25), 25, p), bloodwych.gfxPos[25], p, bloodwych.scale);
						break;
					}
					case 2: {
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 27), 27, p), bloodwych.gfxPos[27], p, bloodwych.scale);
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 23), 23, p), bloodwych.gfxPos[23], p, bloodwych.scale);
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 22), 22, p), bloodwych.gfxPos[22], p, bloodwych.scale);

						break;
					}
					case 3: {

						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 26), 26, p), bloodwych.gfxPos[26], p, bloodwych.scale);
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 21), 21, p), bloodwych.gfxPos[21], p, bloodwych.scale);
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 20), 20, p), bloodwych.gfxPos[20], p, bloodwych.scale);

						break;

					}
					case 4: {

						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 22), 22, p), bloodwych.gfxPos[22], p, bloodwych.scale);
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 21), 21, p), bloodwych.gfxPos[21], p, bloodwych.scale);
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 16), 16, p), bloodwych.gfxPos[16], p, bloodwych.scale);

						break;
					}
					case 5: {
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 24), 24, p), bloodwych.gfxPos[24], p, bloodwych.scale);
						break;
					}
					case 6: {
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 19), 19, p), bloodwych.gfxPos[19], p, bloodwych.scale);
						break;

					}
					case 7: {
						if (BlockType == 1 || BlockType == 2) {

							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 23), 23, p), bloodwych.gfxPos[23], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 23), 24, p), bloodwych.gfxPos[24], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 27), 17, p), bloodwych.gfxPos[17], p, bloodwych.scale);


						}
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 18), 18, p), bloodwych.gfxPos[18], p, bloodwych.scale);
						break;

					}
					case 8: {
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 20), 20, p), bloodwych.gfxPos[20], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 19), 19, p), bloodwych.gfxPos[19], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 15), 15, p), bloodwych.gfxPos[15], p, bloodwych.scale);

						}
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 14), 14, p), bloodwych.gfxPos[14], p, bloodwych.scale);
						break;
					}
					case 9: {
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 17), 17, p), bloodwych.gfxPos[17], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 16), 16, p), bloodwych.gfxPos[16], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 15), 15, p), bloodwych.gfxPos[15], p, bloodwych.scale);

						}
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 11), 11, p), bloodwych.gfxPos[11], p, bloodwych.scale);
						break;
					}
					case 10: {
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 18), 18, p), bloodwych.gfxPos[18], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 12), 12, p), bloodwych.gfxPos[12], p, bloodwych.scale);

						}
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 13), 13, p), bloodwych.gfxPos[13], p, bloodwych.scale);
						break;
					}
					case 11: {
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 14), 14, p), bloodwych.gfxPos[14], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 10), 10, p), bloodwych.gfxPos[10], p, bloodwych.scale);
						}
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 9), 9, p), bloodwych.gfxPos[9], p, bloodwych.scale);
						break;
					}
					case 12: {
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 12), 12, p), bloodwych.gfxPos[12], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 11), 11, p), bloodwych.gfxPos[11], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 10), 10, p), bloodwych.gfxPos[10], p, bloodwych.scale);


						}
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 6), 6, p), bloodwych.gfxPos[6], p, bloodwych.scale);
						break;
					}
					case 13: {
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 13), 13, p), bloodwych.gfxPos[13], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 7), 7, p), bloodwych.gfxPos[7], p, bloodwych.scale);

						}
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 8), 8, p), bloodwych.gfxPos[8], p, bloodwych.scale);
						break;

					}
					case 14: {
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 9), 9, p), bloodwych.gfxPos[9], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 5), 5, p), bloodwych.gfxPos[5], p, bloodwych.scale);

						}
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 4), 4, p), bloodwych.gfxPos[4], p, bloodwych.scale);
						break;
					}
					case 15: {
						if (BlockType == 1 || BlockType == 2) {
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 6), 6, p), bloodwych.gfxPos[6], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 7), 7, p), bloodwych.gfxPos[7], p, bloodwych.scale);
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 5), 5, p), bloodwych.gfxPos[5], p, bloodwych.scale);

						}
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 2), 2, p), bloodwych.gfxPos[2], p, bloodwych.scale);
						break;
					}
					case 16: {
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 3), 3, p), bloodwych.gfxPos[3], p, bloodwych.scale);
						break;
					}
					case 17: {
						drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 1), 1, p), bloodwych.gfxPos[1], p, bloodwych.scale);
						break;
					}
					case 18: {
						if (BlockType == 5) {
							//drawDoorFrame(p);
						} else {
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 31), 31, p), bloodwych.gfxPos[31], p, bloodwych.scale);//EAST
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 29), 29, p), bloodwych.gfxPos[29], p, bloodwych.scale);//NORTH
							drawImage(g, getImage(g, p.view[x], getWallDirection(p.rotation, 30), 30, p), bloodwych.gfxPos[30], p, bloodwych.scale);//SOUTH

							break;

						}
						;
					}


				}


			}

		}

	}

	private void drawWoodenObject(Graphics g,  Player p, int x) {
		// x = Current Block being drawn

		//We create an array of all the sides for each 18 blocks
		//because wooden walls have 4 sides me need to loop though them all
		//and return the correct wall depending on the players rotation


		//blocksides = Jeder Eintrag ist verweis auf SPritesheet position für jede seite des blocks pro view field des Spielers(Nordwand,Ostwand,Südwand,Westwand)
		// es werden nur die Seiten des Block gerendert, welche relevant für die aktuelle position sind.
		int[][] BlockSides = new int[19][];

		BlockSides[0] = new int[] {-1,-1,28,27};
		BlockSides[1] = new int[] {-1,26,25,-1};
		BlockSides[2] = new int[] {-1,27,23,22};
		BlockSides[3] = new int[] {-1,21,20,26};
		BlockSides[4] = new int[] {-1,22,16,21};
		BlockSides[5] = new int[] {28,-1,-1,24};
		BlockSides[6] = new int[] {25,19,-1,-1};
		BlockSides[7] = new int[] {23,24,18,17};
		BlockSides[8] = new int[] {20,15,14,19};
		BlockSides[9] = new int[] {16,17,11,15};
		BlockSides[10] = new int[] {18,-1,13,12};
		BlockSides[11] = new int[] {14,10,9,-1};
		BlockSides[12] = new int[] {11,12,6,10};
		BlockSides[13] = new int[] {13,-1,8,7};
		BlockSides[14] = new int[] {9,5,4,-1};
		BlockSides[15] = new int[] {6,7,2,5};
		BlockSides[16] = new int[] {8,-1,-1,3};
		BlockSides[17] = new int[] {4,1,-1,-1};
		BlockSides[18] = new int[] {2,3,-1,1};

		//die ersten beiden Stellen(8bit)  beschreiben den typ der Wand für jede seite des blocks (4bit = 1 HEX)
		String b = hexToBinary(p.view[x].substring(0,2));

		//bsp: 11 00 01 11 (north=11, east=00 (keine Wand),South = 01, west = 11
		String[] s = new String[4];
		s[0] = b.substring(6,8); //North Face
		s[1] = b.substring(4,6); //East Face
		s[2] = b.substring(2,4); //South Face
		s[3] = b.substring(0,2); //West Face

		switch (p.rotation){
			case 0:{
				if (BlockSides[x][0] > -1){drawImage(g, bin2type(s[0]),bloodwych.gfxPos[BlockSides[x][0]],p,bloodwych.scale); } //North (back)
				if (BlockSides[x][1] > -1){drawImage(g, bin2type(s[1]), bloodwych.gfxPos[BlockSides[x][1]], p, bloodwych.scale);} //West
				if (BlockSides[x][3] > -1){drawImage(g, bin2type(s[3]), bloodwych.gfxPos[BlockSides[x][3]], p, bloodwych.scale);} //East
				if (BlockSides[x][2] > -1){drawImage(g, bin2type(s[2]), bloodwych.gfxPos[BlockSides[x][2]], p, bloodwych.scale);} //South (front)
			};break;
			case 1:{
				if (BlockSides[x][0] > -1){drawImage(g, bin2type(s[1]), bloodwych.gfxPos[BlockSides[x][0]], p, bloodwych.scale);}
				if (BlockSides[x][1] > -1){drawImage(g, bin2type(s[2]), bloodwych.gfxPos[BlockSides[x][1]], p, bloodwych.scale);}
				if (BlockSides[x][3] > -1){drawImage(g, bin2type(s[0]), bloodwych.gfxPos[BlockSides[x][3]], p, bloodwych.scale);}
				if (BlockSides[x][2] > -1){drawImage(g, bin2type(s[3]), bloodwych.gfxPos[BlockSides[x][2]], p, bloodwych.scale);}
			};break;
			case 2:{ //draw at north wall position as south wall, east wall position as west wall (exchange sides of block respect to view direction)
				if (BlockSides[x][0] > -1){drawImage(g, bin2type(s[2]), bloodwych.gfxPos[BlockSides[x][0]], p, bloodwych.scale);} //south
				if (BlockSides[x][1] > -1){drawImage(g, bin2type(s[3]), bloodwych.gfxPos[BlockSides[x][1]], p, bloodwych.scale);} //east
				if (BlockSides[x][3] > -1){drawImage(g, bin2type(s[1]), bloodwych.gfxPos[BlockSides[x][3]], p, bloodwych.scale);} //west
				if (BlockSides[x][2] > -1){drawImage(g, bin2type(s[0]), bloodwych.gfxPos[BlockSides[x][2]], p, bloodwych.scale);} //north
			};break;
			case 3:{
				if (BlockSides[x][0] > -1){drawImage(g, bin2type(s[3]), bloodwych.gfxPos[BlockSides[x][0]], p, bloodwych.scale);}
				if (BlockSides[x][1] > -1){drawImage(g, bin2type(s[0]), bloodwych.gfxPos[BlockSides[x][1]], p, bloodwych.scale);}
				if (BlockSides[x][3] > -1){drawImage(g, bin2type(s[2]), bloodwych.gfxPos[BlockSides[x][3]], p, bloodwych.scale);}
				if (BlockSides[x][2] > -1){drawImage(g, bin2type(s[1]), bloodwych.gfxPos[BlockSides[x][2]], p, bloodwych.scale);}
			};break;
		}

	}

	private BufferedImage bin2type(String b) {

		switch (b) {

			case "00" :return null;
			case "01": return bloodwych.gfxWooden[0];
			case "10": return bloodwych.gfxWooden[2];
			case "11": return bloodwych.gfxWooden[1];
			default:return null;
		}
	}

	private String hexToBinary(String hex) {

		String ret="";

		// lookup table for easier conversion. '0' characters are padded for '1' to '7'

		HashMap<Character, String> lookupTable = new HashMap<>();
		lookupTable.put('0', "0000");
		lookupTable.put('1', "0001");
		lookupTable.put('2', "0010");
		lookupTable.put('3', "0011");
		lookupTable.put('4', "0100");
		lookupTable.put('5', "0101");
		lookupTable.put('6', "0110");
		lookupTable.put('7', "0111");
		lookupTable.put('8', "1000");
		lookupTable.put('9', "1001");
		lookupTable.put('a', "1010");
		lookupTable.put('A', "1010");
		lookupTable.put('B', "1011");
		lookupTable.put('b', "1011");
		lookupTable.put('C', "1100");
		lookupTable.put('c', "1100");
		lookupTable.put('d', "1101");
		lookupTable.put('D', "1101");
		lookupTable.put('e', "1110");
		lookupTable.put('E', "1110");
		lookupTable.put('f', "1111");
		lookupTable.put('F', "1111");

		char[] hexArray = hex.toCharArray();

		for (int i = 0; i < hexArray.length; i++) {
			if (lookupTable.containsKey(hexArray[i])) {
				ret += lookupTable.get(hexArray[i]);
			} else {
				return null;
			}
		}
		return ret;
	}


	public void drawImage(Graphics g, BufferedImage image, int[] pos, Player p, int scale) {

		Graphics2D g2d = (Graphics2D) g;


		if(image == null){
			return;
		}

		g2d.drawImage(image,
				pos[4] * scale,
				pos[5] * scale,
                (pos[4]+pos[2]) * scale,
                (pos[5]+pos[3]) * scale,
				pos[0],
				pos[1],
				pos[0] + pos[2],
				pos[1] + pos[3],
				null,
				null);
	}


	private BufferedImage getImage(Graphics g, String hex, int d, int pos, Player p){

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
			case 1:return getStoneWall(g, hex,d,pos,p);
			case 2:return null;
			case 3: return getMiscObj(BB);
			case 4: {
				if (hex.substring(1, 2) == "1") {
					return bloodwych.gfxStairs[0];
				} else {
					return bloodwych.gfxStairs[1];
				}

			}

//
//			case 5:{if (BB%4 === 2 || BB%4 === 3) {return gfxDoor[1];}else{return gfxDoor[0];}}break;
//			case 6:{if (Hex === "0706"){return gfxFloor[1];} //Roof Pit
//				if (BB % 4 === 0) {return null;}
//				else if (BB % 4 === 1) {return gfxFloor[0];} //Floor Pit
//				else if (BB % 4 === 2) {return gfxFloor[2];} //Green Pad
//				else if (BB % 4 === 3) {return null;} //Blank space
//				else {return null;}} //Default blank space
			case 7:return null;
			default:return null;
		}


	}

	private BufferedImage getMiscObj(int BB) {

		switch (BB) {
			case 0: //Return a Bed
				return bloodwych.gfxMisc[1];
			case 1: //Return a Piller
				return bloodwych.gfxMisc[0];
			default: return bloodwych.gfxMisc[0];
		}

	}

	private BufferedImage getStoneWall(Graphics g, String hex, int d, int pos, Player p) {

		int AA = Integer.parseInt(hex.substring(0, 1), 16);
		int BB = Integer.parseInt(hex.substring(1, 2), 16);
		int CC = Integer.parseInt(hex.substring(2, 3), 16);
		if (CC == 0) {
			return bloodwych.gfxStone;
		}

		drawImage(g, bloodwych.gfxStone, bloodwych.gfxPos[pos],p, bloodwych.scale);

		switch (CC) {

			case 8: {
				if (d == 0) {
					return getWallDeco(g,AA,CC,BB,bloodwych.gfxPos[pos],p);
				} break;
			} //North Wall has Deco
			case 9: {
				if (d == 1) {
					return getWallDeco(g,AA,CC,BB,bloodwych.gfxPos[pos],p);
				} break;
			} //East Wall has Deco
			case 10: {
				if (d == 2) {
					return getWallDeco(g,AA,CC, BB,bloodwych.gfxPos[pos],p);
				} break;
			} //South Wall has Deco
			case 11: {
				if (d == 3) {
					return getWallDeco(g,AA,CC,BB,bloodwych.gfxPos[pos],p);
				} break;
			} //West Wall has Deco
			default: {

				return bloodwych.gfxStone;
			}


		}


		return bloodwych.gfxStone;
	}

	public BufferedImage getWallDeco(Graphics g, int AA, int CC, int BB, int[] pos, Player p) {
		try {
			if (CC >= 8) { //Wall has something on it
				if (BB % 4 == 0) { //Shelf
					return bloodwych.gfxShelf;
				} else if (BB % 4 == 1) { //Sign
					if (BB == 1) { //Random Color
						drawImage(g, bloodwych.gfxScriptBanner, pos, p, bloodwych.scale);
						return bloodwych.gfxScriptBanner;
					} else if (AA == 0 && BB == 5) { //Serpent Flag
						drawImage(g, bloodwych.gfxScriptBanner, pos, p, bloodwych.scale);
						return bloodwych.gfxSerpBanner;
					} else if (AA == 0 && BB == 9) { //Dragon Flag
						drawImage(g, bloodwych.gfxScriptBanner, pos, p, bloodwych.scale);
						return bloodwych.gfxDragonBanner;
					} else if (AA == 0 && BB == 13) { //Moon Flag
						drawImage(g, bloodwych.gfxScriptBanner, pos, p, bloodwych.scale);
						return bloodwych.gfxMoonBanner;
					} else if (AA == 1 && BB == 1) { //Choas Flag
						drawImage(g, bloodwych.gfxScriptBanner, pos, p, bloodwych.scale);
						return bloodwych.gfxChaosBanner;
					} else if (BB % 4 == 1) {
						//i = bwMergeImage(GraphicsData[1][0][x],GraphicsData[1][1][x]);
					} else {
						// i = GraphicsData[1][0][x];
					}
				} else if (BB % 4 ==  2) { //Switch
					return bloodwych.gfxWallSwitch;
				} else if (BB % 4 == 3) { //Crystal Switch
					return bloodwych.gfxGemSlot;
				} else {
					return bloodwych.gfxStone;
				}
			} else {
				return bloodwych.gfxStone;
			}
		} catch (Exception e) {
		}

		return bloodwych.gfxStone;
	}




}