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
		
		for(int i=0; i<frames.size(); i++){	
			Frame frame = this.frames.get(i);
//			
//			if(bonusFrame){
//				Frame previusFrame = this.frames.get(i-1);
//				
//				if(i>2 && this.frames.get(i-2).isStrike()){
//					score += frame.score();
//				}
//				
//				if(previusFrame.isStrike()){
//					score += frame.score();
//				}else{
//					score += frame.scoreFirstThrow();
//				}
//			}
			
			if(frame.isStrike() || frame.isSpare()){
				this.bonus = frame;
			}else{			
				score += frame.score();
			}
			
//			if(frame.isStrike()){
//				bonusFrame = true;
//			}else if(frame.isSpare()){
//				bonusFrame = true;
//			}else{
//				bonusFrame = false;
//			}
		}
		return score;
	}
	
	public boolean isNextFrameBonus(){
		return false;
	}
}
