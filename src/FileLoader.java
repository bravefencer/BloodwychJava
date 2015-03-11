import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ERTE005 on 09.03.2015.
 */
public class FileLoader {
	public void load(String map, Tower tower) throws IOException {


		Path path = new File(this.getClass().getResource("/maps/" + map + ".MAP").getFile()).toPath();
		byte[] uInt8Array = Files.readAllBytes(path);

		for(int x = 0; x < 8; x++) {
			Map level = new Map(uInt8Array[x+8] & 0xFF, uInt8Array[x] & 0xFF, uInt8Array[x+32] & 0xFF, uInt8Array[x+40] & 0xFF);
			tower.pushMap(level);
		}

		int x = 56;

		for(int i = 0; i < tower.levels.size(); i++) {
			int t1 = tower.levels.get(i).width;
			int t2 = tower.levels.get(i).height;

			List<List<String>> mdata = new ArrayList<List<String>>();
			for(int myY = 0; myY < t1; myY++) {

				List<String> r = new ArrayList<String>();
				for(int myX = 0; myX < t2; myX++) {
					r.add(toHexString(uInt8Array[x]) + toHexString(uInt8Array[x+1]));
					x = x + 2;
				}
				mdata.add(r);
			}

			String [][] newMap = new String[mdata.size()][];
			for(int ys = 0; ys < mdata.size(); ys++) {
				newMap[ys] = new String[mdata.get(ys).size()];
				for(int xs = 0; xs < mdata.get(ys).size();xs++){
					newMap[ys][xs] = mdata.get(ys).get(xs);

					}
				}
			tower.levels.get(i).map = newMap;


			if(i==3)  {
				for(int xs = 0; xs < newMap.length; xs++) {
					String[]values = newMap[xs];
					String line = "";
					for(int y = 0; y < values.length;y++) {
						line = line + values[y] +" ";

					}
					System.out.println(line);

				}
			}

			}




	}

	private String toHexString(byte b) {
		String hex = Integer.toHexString(b & 0xFF);
		hex = hex.toUpperCase();
		if(hex.length()==1) {
			hex = "0"+hex;
		}
		return hex;
	}


//	function decimalToHex(d) {
//		var hex = Number(d).toString(16);
//		hex = "".substr(0, 2 - hex.length) + hex;
//		hex = hex.toUpperCase();
//		if (hex.length === 1) {
//			hex = "0" + hex;
//		}
//		return hex;
//	}
}


