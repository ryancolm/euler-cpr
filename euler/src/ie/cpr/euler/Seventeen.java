/**
 * 
 */
package ie.cpr.euler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Colm.Ryan
 *
 */
public class Seventeen {
	
	private static String[] ones = new String[]{"one","two","three","four","five","six","seven","eight","nine"}; 
	private static String[] teens = new String[]{"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	private static String[] tens = new String[]{"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	private static String[] huns = new String[]{"hundred"};
	private static String[] tho = new String[]{"thousand"};
	
	HashMap<Integer, String> words;
	
	private static String[][] grid = new String[][]{ones, tens, huns, tho};
	
	private int max = 1000;

	/**
	 * 
	 */
	public Seventeen() {
		// TODO Auto-generated constructor stub
	}

	public void initialise(){
		words = new HashMap<Integer, String>();
		
		words.put(1, "ONE");
		words.put(2, "TWO");
		words.put(3, "THREE");
		words.put(4, "FOUR");
		words.put(5, "FIVE");
		words.put(6, "SIX");
		words.put(7, "SEVEN");
		words.put(8, "EIGHT");
		words.put(9, "NINE");
		words.put(10, "TEN");
		words.put(11, "ELEVEN");
		words.put(12, "TWELVE");
		words.put(13, "THIRTEEN");
		words.put(14, "FOURTEEN");
		words.put(15, "FIFTEEN");
		words.put(16, "SIXTEEN");
		words.put(17, "SEVENTEEN");
		words.put(18, "EIGHTEEN");
		words.put(19, "NINETEEN");
		words.put(20, "TWENTY");
		words.put(30, "THIRTY");
		words.put(40, "FOURTY");
		words.put(50, "FIFTY");
		words.put(60, "SIXTY");
		words.put(70, "SEVENTY");
		words.put(80, "EIGHTY");
		words.put(90, "NINETY");
		words.put(100, "HUNDRED");
		words.put(1000, "THOUSAND");
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Seventeen seventeen = new Seventeen();
		seventeen.solve();
		
		

	}

	private void solve() {
		long total = 0;
		
		for(int x =0; x<max; x++){
			if(x<20){
				total+=words.get(x).length();
			}
		}
		
		
	}

}
