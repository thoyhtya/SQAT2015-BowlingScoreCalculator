package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testFrameInit() {
		Frame frame = new Frame(2,4);
	}
	
	@Test
	public void testFrameScore_2_6_is_8() {
		Frame frame = new Frame(2,6);
		assertEquals(8, frame.score());
	}
	
	@Test
	public void testFrameScore_0_9_is_9() {
		Frame frame = new Frame(0,9);
		assertEquals(9, frame.score());
	}

}
