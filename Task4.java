import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Task4 {
    public static void main(String[] args)
    {
       boolean toss = new Random().nextBoolean();
       String [] team1 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
       String [] team2 = {"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "W"};
       int totalOversPlayedTeam1 = new Random().nextInt(10,20);
       int totalOversPlayedTeam2 = new Random().nextInt(10,20);
       int totalWicketsFallenTeam1 = new Random().nextInt(1, 10);
       int totalWicketFallenTeam2 = new Random().nextInt(1,10);
       List<Integer> playersScoreTeam1 = new ArrayList<>();
       List<Integer> playersScoreTeam2 = new ArrayList<>();
       int team1TotalScore = 0;
       int team2TotalScore = 0;
        for (int i = 0; i <totalWicketsFallenTeam1 ; i++) {
            int score = new Random().nextInt(0,40);
            playersScoreTeam1.add(score);
            team1TotalScore += score;
        }
        for (int i = 0; i <totalWicketFallenTeam2; i++) {
            int score = new Random().nextInt(0,40);
            playersScoreTeam1.add(score);
            team2TotalScore += score;
        }
        System.out.println("##################################### WELCOME TO CRICKET DASHBOARD #########################################");
        System.out.println("##################################### Team One Record #########################################");
        System.out.println("##################################### " + (toss ? "Team One has won the toss" : " Team One has lost the toss") + " #########################################");
        System.out.println("##################################### " + (team1TotalScore > team2TotalScore ? "Team One has won this contest" : " Team Two has won this contest") + " #########################################");
        System.out.println("##################################### " + (team1TotalScore) + "/" + (totalWicketsFallenTeam1) + " in " + totalOversPlayedTeam1 + " overs" + " #########################################");
        System.out.println("####" + " PlayerName " + "####" + "####" + " PlayerScore " + "####" + "####" + " FacedBalls " + "####" + "####" + " StrikeRate " + "####");
        for (int i = 0; i <totalWicketsFallenTeam1 ; i++) {
            int totalBalls = (new Random().nextInt(1, (Integer) playersScoreTeam1.toArray()[i]));
            System.out.println("#### " + team1[i] + " ####" + " #### " + playersScoreTeam1.toArray()[i] + " #### " + " #### " + totalBalls + " #### " + " #### " + ((double) ((int) playersScoreTeam1.toArray()[i]/totalBalls * 100)) + " #### ");
        }
        System.out.println("##################################### Team Two Record #########################################");
        System.out.println("##################################### " + (team2TotalScore) + "/" + (totalWicketFallenTeam2) + " in " + totalOversPlayedTeam2 + " overs"  + " #########################################");
        System.out.println("####" + " PlayerName " + "####" + "####" + " PlayerScore " + "####" + "####" + " FacedBalls " + "####" + "####" + " StrikeRate " + "####");
        for (int i = 0; i <totalWicketFallenTeam2 ; i++) {
            int totalBalls = (new Random().nextInt(0, (Integer) (playersScoreTeam2.toArray()[i])));
            System.out.println("#### " + team2[i] + " ####" + " #### " + playersScoreTeam2.toArray()[i] + " #### " + " #### " + totalBalls + " #### " + " #### " + ((double) ((int) playersScoreTeam2.toArray()[i]/totalBalls * 100)) + " #### ");
        }
    }
}
