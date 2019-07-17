package com.company;

public class MethodsChallenge {
    public static void main (String[] args){
        String player = "Dhoni";
        int score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(player, position);

         player = "Kholi";
         score = 900;
         position = calculateHighScorePosition(score);
        displayHighScorePosition(player, position);

         player = "Gayle";
         score = 400;
         position = calculateHighScorePosition(score);
        displayHighScorePosition(player, position);

        player = "AB";
        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(player, position);

    }

    public static void displayHighScorePosition(String playername, int position){
        System.out.println(playername + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if(score >1000){
            return 1;
        }else if(score>500 && score<1000){
            return 2;
        }else if(score > 100 && score < 500){
            return 3;
        }else{
            return 4;
        }
    }
}
