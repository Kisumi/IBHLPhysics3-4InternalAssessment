import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

class Luminosity {
	static int I = 868151, II = 125819, III = 18235, IV = 2642, V = 383, VI = 55, VII = 8; //pre-calculated values that correspond to the luminosity class

	public static void main(String[] args) {
		int valueOfLum = 0;
		String lums = "";

		try{
			Scanner luminosities = new Scanner(new File(args[0]));
			PrintWriter writer = new PrintWriter("FinalLuminosities.txt", "UTF-8");

			for(int i = 0; i < 106; i++) {
				lums = luminosities.nextLine();
				switch(lums) {
					case "I": valueOfLum = I;
						break;
					case "II": valueOfLum = II;
						break;
					case "III": valueOfLum = III;
						break;
					case "IV": valueOfLum = IV;
						break;
					case "V": valueOfLum = V;
						break;
					case "VI": valueOfLum = VI;
						break;
					case "VII": valueOfLum = VII;
						break;
				}
				writer.println(valueOfLum);
			}

			luminosities.close();
			writer.close();

		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
