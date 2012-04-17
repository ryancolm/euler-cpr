/**
 * 
 */
package ie.cpr.euler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Colm.Ryan
 * 
 */
public class TwentyTwo {

	/*
	 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text
	 * file containing over five-thousand first names, begin by sorting it into
	 * alphabetical order. Then working out the alphabetical value for each
	 * name, multiply this value by its alphabetical position in the list to
	 * obtain a name score.
	 * 
	 * For example, when the list is sorted into alphabetical order, COLIN,
	 * which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
	 * So, COLIN would obtain a score of 938*53 = 49714.
	 * 
	 * What is the total of all the name scores in the file?
	 */

	ArrayList<String> names;
	Map<String, Long> alphas;

	/**
	 * 
	 */
	public TwentyTwo() {
		names = new ArrayList<String>();
		createAlphaMap();
	}

	private void createAlphaMap() {
		alphas = new HashMap<String, Long>();
		
		alphas.put("A", 1l);
		alphas.put("B", 2l);
		alphas.put("C", 3l);
		alphas.put("D", 4l);
		alphas.put("E", 5l);
		alphas.put("F", 6l);
		alphas.put("G", 7l);
		alphas.put("H", 8l);
		alphas.put("I", 9l);
		alphas.put("J", 10l);
		alphas.put("K", 11l);
		alphas.put("L", 12l);
		alphas.put("M", 13l);
		alphas.put("N", 14l);
		alphas.put("O", 15l);
		alphas.put("P", 16l);
		alphas.put("Q", 17l);
		alphas.put("R", 18l);
		alphas.put("S", 19l);
		alphas.put("T", 20l);
		alphas.put("U", 21l);
		alphas.put("V", 22l);
		alphas.put("W", 23l);
		alphas.put("X", 24l);
		alphas.put("Y", 25l);
		alphas.put("Z", 26l);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwentyTwo twentyTwo = new TwentyTwo();
		twentyTwo.readFile();

	}

	private void readFile() {
		try {
			BufferedReader in = new BufferedReader(new FileReader("names.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				names.add(str);
				//names.add("COLIN");
				Collections.sort(names);
			}
			in.close();

			process();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private void process() {
		long fullTotal=0l;
		for (int x = 0; x < names.size(); x++) {
			String name = names.get(x);
			Long total = getTotalForName(name, x);
			fullTotal+= total;
			System.out.println(name + " " + total + " " + fullTotal);
		}
		System.out.println("full total " + fullTotal);
	}
	
	private Long getTotalForName(String name, int position){
		char[] nameChars = name.toCharArray();
		
		long total = 0l;
		for(int y=0; y<nameChars.length; y++){
			String nextStr = String.valueOf(nameChars[y]);
			Long nextVal = alphas.get(nextStr);
			
			//System.out.println(nextVal);
			
			total+=nextVal;
		}
		
		total*=Long.valueOf(position+1);
		
		
		
		return total;
	}

	public ArrayList<String> getNames() {
		return names;
	}

	public void setNames(ArrayList<String> names) {
		this.names = names;
	}

}
