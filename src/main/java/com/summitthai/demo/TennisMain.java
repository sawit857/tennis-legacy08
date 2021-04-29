package com.summitthai.demo;

public class TennisMain {
	
	private static int scorePlayerA = 0;
	private static int scorePlayerB = 0;
	
	
	
	public static void main(String[] args) {
		
		TennisMain main = new TennisMain();
		
		main.playAAddScore();
		main.playBAddScore();
		
		System.out.println(main.score());
				
	}
	
	public String score() {
        if (scorePlayerA == 0 && scorePlayerB == 0) {
            return "love all";
        }
        if (scorePlayerA == 1 && scorePlayerB == 0) {
            return "fifteen love";
        }
        if (scorePlayerA == 2 && scorePlayerB == 0) {
            return "thirty love";
        }
        if (scorePlayerA == 3 && scorePlayerB == 0) {
            return "forty love";
        }
        if (scorePlayerA == 0 && scorePlayerB == 1) {
            return "love fifteen";
        }
        if (scorePlayerA == 0 && scorePlayerB == 2) {
            return "love thirty";
        }
        if (scorePlayerA == 0 && scorePlayerB == 3) {
            return "love forty";
        }
        if (scorePlayerA == 1 && scorePlayerB == 1) {
            return "fifteen all";
        }
        if (scorePlayerA == 2 && scorePlayerB == 2) {
            return "thirty all";
        }
        if (scorePlayerA == 3 && scorePlayerB == 3) {
            return "deuce";
        }
        if (scorePlayerA == 4 && scorePlayerB == 4) {
            return "deuce";
        }
        if (scorePlayerA == 4 && scorePlayerB == 3) {
            return "A adv";
        }
        if (scorePlayerA == 3 && scorePlayerB == 4) {
            return "B adv";
        }
        if (scorePlayerA == 5 && scorePlayerB == 3) {
            return "A win";
        }
        if (scorePlayerA == 3 && scorePlayerB == 5) {
            return "B win";
        }
        return null;
    }
	
	public void playAAddScore() {
        this.scorePlayerA++;
    }

    public void playBAddScore() {
        this.scorePlayerB++;
    }
}
