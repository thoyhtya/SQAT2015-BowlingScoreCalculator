package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	int BONUSTYPE_NONE = 0;
	int BONUSTYPE_SPARE = 1;
	int BONUSTYPE_STRIKE = 2;
	
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
		int bonustype = BONUSTYPE_NONE;
		
		for(Frame frame : this.frames){	
			if(bonusFrame){
				if(bonustype == BONUSTYPE_STRIKE){
					score += frame.score();
				}else{
					score += frame.scoreFirstThrow();
				}
			}
			
			score += frame.score();
			
			if(frame.isStrike()){
				bonusFrame = true;
				bonustype = BONUSTYPE_STRIKE;
			}else if(frame.isSpare()){
				bonusFrame = true;
				bonustype = BONUSTYPE_SPARE;
			}else{
				bonusFrame = false;
				bonustype = BONUSTYPE_NONE;
			}
		}
		return score;
	}
	
	public boolean isNextFrameBonus(){
		return false;
	}
}
