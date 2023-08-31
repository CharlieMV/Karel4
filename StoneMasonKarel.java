/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		while(facingEast() && leftIsClear() || facingWest() && rightIsClear()) {
			fillRow();
			if(facingEast()) {
				turnLeft();
				move();
				turnLeft();
			} else {
				turnRight();
				move();
				turnRight();
			}
		}
		fillRow();
	}
	public void fillRow() {
		while(frontIsClear()) {
			placeBeeper();
			move4();
			placeBeeper();
		}
	}
	public void placeBeeper() {
		if(noBeepersPresent()) {
			putBeeper();
		}
	}
	public void move4() {
		move();
		move();
		move();
		move();
	}
}
