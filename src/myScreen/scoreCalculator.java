package myScreen;
import java.util.Scanner;
public class scoreCalculator {

    private int pointsFirstTeam;
    private int pointsSecondTeam;
    private String firstTeam;
    private String secondTeam;
    private Scanner sc = new Scanner(System.in);

    public scoreCalculator(String firstTeam, String secondTeam){
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        pointsFirstTeam = 0;
        pointsSecondTeam = 0;
    }

   public void Welcome(){
       System.out.println("Welcome to the game  " +   firstTeam + " vs " + secondTeam);
   }

    String team = "";
    int points = 0;
    String wasThereFoul = "";
    int foulsFirstTeam = 0;
    int foulsSecondTeam = 0;

   public void letsPlay(){

        while(pointsFirstTeam < 21 && pointsSecondTeam < 21 && foulsFirstTeam < 5 && foulsSecondTeam < 5){

            while(!(team.equals("United States") || team.equals("France"))) {
                System.out.println("What team just scored?, please be careful and type (United States) or (France) ");
                team = sc.nextLine();
            }

            while(points > 3 || points == 0){
                System.out.println("How many points did they score?, 1, 2 or 3 points?");
                points = Integer.parseInt(sc.nextLine());
            }

            if(team.equals("United States")){
                pointsFirstTeam = pointsFirstTeam + points;

            }
            else{
                pointsSecondTeam = pointsSecondTeam + points;
            }

            while(!(wasThereFoul.equals("yes") || wasThereFoul.equals("no"))){
                System.out.println("Was there a foul?, please answer yes or no");
                wasThereFoul = sc.nextLine();
            }

            if(wasThereFoul.equals("yes")){
                controlFouls(team);
            }

            System.out.println(firstTeam + "( " + pointsFirstTeam + " )" + " (fouls: " + foulsFirstTeam + " )" +" " +secondTeam + "( " + pointsSecondTeam + " )"  + " (fouls: " + foulsSecondTeam + " )");

            if(pointsFirstTeam >=21 || foulsFirstTeam == 5){
                System.out.println(firstTeam + " has won the game");
            }
            else if(pointsSecondTeam >=21 || foulsSecondTeam == 5){
                System.out.println(secondTeam + " has won the game");
            }

            team = "";
            points = 0;
            wasThereFoul = "";
        }
    }

    public void controlFouls(String team){

       if(team.equals(firstTeam)){
           foulsSecondTeam++;
       }
       else if(team.equals(secondTeam)){
           foulsFirstTeam++;
       }
    }
}
