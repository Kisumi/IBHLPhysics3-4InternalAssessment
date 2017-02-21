import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

class Temperature {
	static double O = 25000, B = 11000, A = 7500, F = 6000, G = 5000, K = 3500, M = 0; //there are no O stars in my data, fortunately
	static double rangeO = 20000, rangeB = 14000, rangeA = 3500, rangeF = 1500, rangeG = 1000, rangeK = 1500, rangeM = 3500; //range O is just a large value

	public static void main(String[] args) {
		String romNum = "";
		String specNumString = "";
		double specNum = 0.0;
		double currentRange = 0.0;

		try{
			Scanner listOfTemps = new Scanner(new File(args[0]));
			PrintWriter writer = new PrintWriter("FinalTemperatures.txt", "UTF-8");

			for(int i = 0; i < 106; i++) {
				double valueOfTemp = 0.0;
				int finalTemp = 0;
				romNum = listOfTemps.nextLine();
				specNumString = romNum;
				romNum = romNum.substring(0, 1);
				switch(romNum) {
					case "O": valueOfTemp = O;
						currentRange = rangeO;
						break;
					case "B": valueOfTemp = B;
						currentRange = rangeB;
						break;
					case "A": valueOfTemp = A;
						currentRange = rangeA;
						break;
					case "F": valueOfTemp = F;
						currentRange = rangeF;
						break;
					case "G": valueOfTemp = G;
						currentRange = rangeG;
						break;
					case "K": valueOfTemp = K;
						currentRange = rangeK;
						break;
					case "M": valueOfTemp = M;
						currentRange = rangeM;
						break;
				}
				specNum = 9.0 - Double.parseDouble(specNumString.substring (1, specNumString.length()));
				valueOfTemp = valueOfTemp + (currentRange * (specNum / 10));
				finalTemp = (int) valueOfTemp;
				writer.println(finalTemp);
			}

			listOfTemps.close();
			writer.close();

		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
