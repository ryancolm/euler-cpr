/**
 * 
 */
package ie.cpr.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Colm.Ryan
 * 
 */
public class Fourteen {

	/*
	 * The following iterative sequence is defined for the set of positive
	 * integers:
	 * 
	 * n -> n/2 (n is even) n -> 3n + 1 (n is odd)
	 * 
	 * Using the rule above and starting with 13, we generate the following
	 * sequence:
	 * 
	 * 13 40 20 10 5 16 8 4 2 1It can be seen that this sequence (starting at 13
	 * and finishing at 1) contains 10 terms. Although it has not been proved
	 * yet (Collatz Problem), it is thought that all starting numbers finish at
	 * 1.
	 * 
	 * Which starting number, under one million, produces the longest chain?
	 */
	
	/**
	 * random comment
	 */
	
	static final Logger LOG = LoggerFactory.getLogger(Fourteen.class);

	long startTime = 0;
	long endTime = 0;

	/**
	 * 
	 */
	public Fourteen() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		Fourteen fourteen = new Fourteen();
		fourteen.solve();

		long endTime = System.currentTimeMillis();

		if(LOG.isDebugEnabled()){
			LOG.debug("took " + (endTime - startTime) / 100 + " secs");
		}
	}

	public void solve() {
		long currentNum;
		long currentSeq;
		long longestSeq = 1;
		long temp;
		long solution = 1;

		for (currentNum = 1; currentNum <= 1000000; currentNum++) {
			temp = currentNum;
			currentSeq = 1;

			while (currentNum != 1) {
				if (currentNum % 2 == 0) {
					currentNum /= 2;
					++currentSeq;
				} else {
					currentNum = (3 * currentNum) + 1;
					++currentSeq;
				}
			}

			if (currentSeq > longestSeq) {
				longestSeq = currentSeq;
				solution = temp;
			}

			currentNum = temp;
		}

		if(LOG.isDebugEnabled()){
			LOG.debug("solution : " + solution);
			LOG.debug("seq length : " + longestSeq);
		}
	}

}
