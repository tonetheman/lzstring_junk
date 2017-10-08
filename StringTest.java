
import java.util.Base64;
import java.util.Base64.Decoder;

public class StringTest {
	

	public static void main(String[] args) {

		String compressed_b64 = "47SE7oGW7ICs4KCt4KKg5pSD5aCL5IGSyZDjprTQr8WF6oCT5Lyd6oCE5aCA6aCH55eC77+95o2A5oSs2bDhqZXuopjZneicgO+IlOuEsMKg5ICn65CA5qiEeNKQ5Iyg44a66ICSLe2Vp+6AkuykouiCsuq0oHfugpbogK/mhYjPmNql452lcXLtjajFs+iAg+GAgeOXgOyEtuGAheWAgeubsOSUswXmgITjmKPpkrPomKDikrDsiorkiIA=";
		Base64.Decoder decoder = Base64.getDecoder();

		byte[] b = decoder.decode(compressed_b64);
		for (int i=0;i<b.length/2;i++) {
			byte b1 = b[i];
			byte b2 = b[i+1];
			int f = ((0xff&b1)<<8) | ((0xff&b2));

			System.out.println(Integer.toHexString(b1) + " " +
				Integer.toHexString(b2) + " " +
				Integer.toHexString(f));
			//System.out.println(f);
		}


		int junk = 0xe3b4;
		System.out.println(Integer.toHexString(junk));
		
	}
}