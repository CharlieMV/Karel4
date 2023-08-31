/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment Karel4.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		while(facingEast() && leftIsClear() || facingWest() && rightIsClear()) {
			fillRow();
			if(facingEast()) {
				if(noBeepersPresent()) {
					turnLeft();
					move();
					turnLeft();
					placeBeeper();
				} else {
					turnLeft();
					move();
					turnLeft();
					if(frontIsClear()) {
						move();
						placeBeeper();
					}
				}
			} else {
				if(noBeepersPresent()) {
					turnRight();
					move();
					turnRight();
					placeBeeper();
				} else {
					turnRight();
					move();
					turnRight();
					if(frontIsClear()) {
						move();
						placeBeeper();
					}
				}
			}
		}
		fillRow();
	}
	public void fillRow() {
		while(frontIsClear()) {
			placeBeeper();
			move();
			if(frontIsClear()) {
				move();
				placeBeeper();
			}
		}
	}
	public void placeBeeper() {
		if(noBeepersPresent()) {
			putBeeper();
		}
	}
}
