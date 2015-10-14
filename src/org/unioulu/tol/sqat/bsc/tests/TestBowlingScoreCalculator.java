package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
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
		
	@Test
	public void testGameInit() {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1,5));
		game.addFrame(new Frame(3,6));
		game.addFrame(new Frame(7,2));
		game.addFrame(new Frame(3,6));
		game.addFrame(new Frame(4,4));
		game.addFrame(new Frame(5,3));
		game.addFrame(new Frame(3,3));
		game.addFrame(new Frame(4,5));
		game.addFrame(new Frame(8,1));
		game.addFrame(new Frame(2,6));
	}

}
