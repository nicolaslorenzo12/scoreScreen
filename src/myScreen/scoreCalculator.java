package myScreen;
import java.util.Scanner;
public class scoreCalculator {

    private int pointsFirstTeam;
    private int pointsSecondTeam;
    private int foulsFirstTeam;
    private int foulsSecondTeam;
    private String firstTeam;
    private String secondTeam;
    private int numberFirstTeam;
    private int numberSecondTeam;
    Scanner sc = new Scanner(System.in);

    public scoreCalculator(String firstTeam, String secondTeam){
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        pointsFirstTeam = 0;
        pointsSecondTeam = 0;
        numberFirstTeam = 1;
        numberSecondTeam = 2;
    }

   public void Welcome(){
       System.out.println("Welcome to the game " +  " #" +  numberFirstTeam + " " +  firstTeam + " vs " +  " # " + numberSecondTeam + secondTeam);
   }

   public void letsPlay(){

        int number = 0;
        int points = 0;

        while(pointsFirstTeam < 21 && pointsSecondTeam < 21){

            while(number > 2 || number == 0) {
                System.out.println("What team just scored?, please be careful and type a valid number of the team ( 1 or 2) ");
                number = Integer.parseInt(sc.nextLine());
            }

            while(points > 3 || points == 0){
                System.out.println("How many points did they score?, 1, 2 or 3 points?");
                points = Integer.parseInt(sc.nextLine());
            }

            if(number == numberFirstTeam){
                pointsFirstTeam = pointsFirstTeam + points;
            }
            else if(number == numberSecondTeam){
                pointsSecondTeam = pointsSecondTeam + points;
            }

            System.out.println(firstTeam + "( " + pointsFirstTeam + " )" + secondTeam + "( " + pointsSecondTeam + " )");

            if(pointsFirstTeam >=21){
                System.out.println(firstTeam + " has won the game");
            }
            else if(pointsSecondTeam >=21){
                System.out.println(secondTeam + " has won the game");
            }

            number = 0;
            points = 0;
        }
    }
}
