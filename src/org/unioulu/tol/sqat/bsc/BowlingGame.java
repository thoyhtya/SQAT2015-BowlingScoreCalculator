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
		boolean bonusFrame = false;
		
		for(Frame frame : this.frames){	
			if(bonusFrame){
				score += frame.score();
			}
			
			score += frame.score();
			
			if(frame.isStrike()){
				bonusFrame = true;
			}else{
				bonusFrame = false;
			}
		}
		return score;
	}
	
	public boolean isNextFrameBonus(){
		return false;
	}
}
