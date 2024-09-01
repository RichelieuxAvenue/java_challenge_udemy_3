public class Main {
    public static void main(String[]args){
        displayHighScorePosition("Rashid", calculateHighScorePosition(800));
        displayHighScorePosition("kadisha", calculateHighScorePosition(300));
        displayHighScorePosition("richelieux", calculateHighScorePosition(1500));
        displayHighScorePosition("avenur", calculateHighScorePosition(1));
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.printf("%s est en position %s dans la liste.\n", name, position);
    }
    public static int calculateHighScorePosition(int score){
        if(score>=1000){
            return 1;
        }
        else if(score<1000 && score>=500){
            return 2;
        }
        else if(score<500 && score>=100){
            return 3;
        }
        else {
            return 4;
        }
    }
}
