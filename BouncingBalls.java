package BouncingBalls;

import java.util.ArrayList;

import zen.core.Zen;

public class Bouncing_Balls {

	public static void main(String[] args) {
		Zen.create(500,500);
		
		ArrayList<ball> ballList = new ArrayList<ball>();
		
		int count = 0;
		while(count < 30){
			ball b = new ball();
			ballList.add(b);
			count++;
		}
		
		
		
		while (true){
			Zen.setBackground("light green");
			
			for(ball b1 : ballList){
				b1.draw();
				b1.move();
				
				for (ball b2: ballList){
					if (b1.collides(b2)){
						b1.ballDX = -b1.ballDX;
						b2.ballDX = -b2.ballDX;
						b1.ballDY = -b1.ballDY;
						b2.ballDY = -b2.ballDY;
					}
				}
			}
			
			
			
			Zen.buffer(40);
		}

	}

}
