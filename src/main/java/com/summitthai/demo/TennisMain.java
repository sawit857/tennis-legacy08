package com.summitthai.demo;

public class TennisMain {
	
	private static int scorePlayerA = 0;
	private static int scorePlayerB = 0;
	
	
	
	public static void main(String[] args) {
		
		TennisMain main = new TennisMain();
		
		main.countScore("A");
		System.out.println(String.format("scorePlayerA: %s, scorePlayerB: %s", main.showScore(scorePlayerA), main.showScore(scorePlayerB)));
		main.countScore("B");
		System.out.println(String.format("scorePlayerA: %s, scorePlayerB: %s", main.showScore(scorePlayerA), main.showScore(scorePlayerB)));
		main.countScore("B");
		System.out.println(String.format("scorePlayerA: %s, scorePlayerB: %s", main.showScore(scorePlayerA), main.showScore(scorePlayerB)));
		main.countScore("B");
		System.out.println(String.format("scorePlayerA: %s, scorePlayerB: %s", main.showScore(scorePlayerA), main.showScore(scorePlayerB)));
	}
	
	private void countScore(String playerWin) {
		
		if (playerWin.contentEquals("A")) {			 
			if (scorePlayerA >= 30) {
				scorePlayerA += 10;
			} else {
				scorePlayerA += 15;	
			}
		} else if (playerWin.contentEquals("B")) {
			if (scorePlayerB >= 30) {
				scorePlayerB += 10;
			} else {
				scorePlayerB += 15;	
			}
		} 
	}
	
	private String showScore(int cntScore) {
		String scoreStr = "";
		
		if (cntScore == 0) {
			scoreStr = "love";
		} else if (cntScore == 15) {
			scoreStr = "fifteen";
		} else if (cntScore == 30) {
			scoreStr = "thirty";
		} else if (cntScore == 40) {
			scoreStr = "forty";
		}
		return scoreStr;
	}
}
