package BouncingBalls;

import zen.core.Zen;

public class ball {
	int ballX;
	int ballY;
	
	int ballDX;
	int ballDY;
	
	String color;
	
	//constructor for the Ball object
	public ball(){
		ballX = Zen.getRandomNumber(15,485);
		ballY = Zen.getRandomNumber(15,485);
		
		ballDX = Zen.getRandomNumber(-10, 10);
		ballDY = Zen.getRandomNumber(-10, 10);

		
		int random = Zen.getRandomNumber(1,4);
		
		if (random == 1){
			color = "purple";
		}
		else if (random == 2){
			color = "blue";
		}
		else if (random == 3){
			color = "black";
		}
		else if (random == 4){
			color = "red";
		}
	}
	
	public void draw(){
		Zen.setColor(color);
		Zen.fillOval(ballX - 15, ballY - 15, 20, 20);
	}
	
	public void move(){
		ballX = ballX - ballDX;
		ballY = ballY - ballDY;
		
		if(ballX < 15 || ballX > 485){
			ballDX = -ballDX;
		}
		
		if (ballY < 15 || ballY > 485){
			ballDY = -ballDY;
		}
	}
	
	public boolean collides (ball b){
		if(Math.abs(ballX - b.ballX) < 20 && Math.abs(ballY - b.ballY) < 20){
			return true;
		}
		
		return false;
	}
}
