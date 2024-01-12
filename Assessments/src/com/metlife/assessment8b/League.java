package com.metlife.assessment8b;

import com.metlife.assessment8b.utility.GameUtils;

public class League
{
    public static void main(String[] args)
    {
        //08-Methods_Practice1:

        Team[] theTeams=createTeams();
        Game[] theGames=createGames(theTeams);

        Game currGame=theGames[0];
        int numberOfGoals=(int)(Math.random()*7);
        System.out.println(numberOfGoals);

        Goal[] theGoals =new Goal[numberOfGoals];
        System.out.println(theGoals.length);


        Goal goal1=new Goal();
        goal1.thePlayer=currGame.awayTeam.playerArray[2];
        goal1.theTeam=currGame.awayTeam;
        goal1.theTime=55;

      //  Goal[] theGoals={goal1};
        currGame.goals=theGoals;
        GameUtils.addGameGoals(currGame);

        for(Goal currGoal: currGame.goals)
        {
            System.out.println("Goal scored after " + currGoal.theTime + " mins by " + currGoal.thePlayer.playerName + " of "+ currGoal.theTeam.teamName);

        }
        //System.out.println("Goal scored after " + currGame.goals[0].theTime + " mins by " + currGame.goals[0].thePlayer.playerName + " of "+ currGame.goals[0].theTeam.teamName);
    }
    public static Team[] createTeams()
    {
        Player player1=new Player();
        player1.playerName="George Eliot";

        Player player2=new Player();
        player2.playerName="Graham Greene";

        Player player3=new Player();
        player3.playerName="Geoffrey Chaucer";

        Player[] thePlayers={player1,player2,player3};

        Team team1=new Team();
        team1.teamName="The Greens";

        team1.playerArray=thePlayers;

        Team team2=new Team();
        team2.teamName="The Reds";

        team2.playerArray=new Player[3];
        team2.playerArray[0]=new Player();
        team2.playerArray[0].playerName="Robert Service";

        team2.playerArray[1]=new Player();
        team2.playerArray[1].playerName="Robbie Burns";

        team2.playerArray[2]=new Player();
        team2.playerArray[2].playerName="Rafael Sabatini";
        Team[] theTeams={team1,team2};
        return theTeams;
    }
    public static Game[] createGames(Team[] theTeams)
    {
        Game theGame=new Game();
        theGame.homeTeam=theTeams[0];
        theGame.awayTeam=theTeams[1];
        Game[] theGames={theGame};
        return theGames;
    }
}
