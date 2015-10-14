package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		this.frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		int score = 0;
		for(Frame frame : this.frames){
			if(isNextFrameBonus(frame)){
				score += frame.score() * 2;
			}else{				
				score += frame.score();
			}
			
		}
		return score;
	}
	
	public boolean isNextFrameBonus(Frame frame){
		if(frame.isStrike()){
			
		}
		return false;
	}
}
