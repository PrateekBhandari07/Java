package physics_wallah;

//package Dice_Game;
import java.util.Scanner;
import java.util.Random;

class Game
{
    Random num=new Random();
    Scanner sc=new Scanner(System.in);
    int dice ,trials;
    public Game(int dice,int trials)
    {
        this.dice=dice;
        this.trials=trials;
    }
    public int play(String who,int choice)
    {
        int op[]=new int [dice];
        int points=0;
        for(int i=0;i<trials;i++)
        {
            for(int j=0;j<dice;j++)
            {
                op[j]= num.nextInt(6)+1;
            }

            System.out.println("\nPress enter to get set of numbers");
            sc.nextLine();
            for(int j:op)
            {
                System.out.println(j+"");
            }
            System.out.println();

            for(int j=0;j<dice;j++)
            {
                if(op[j]==choice)
                {
                    points ++;
                }
            }
        }
        System.out.println(who+" got "+points+" points"+"\n");
        return points;
    }
}

public class e
{
    public static void main(String[] args)
    {
        int dice=3,trials=3;
        int player_point=0,computer_point=0;
        Scanner sc=new Scanner(System.in);
        Random num=new Random();
        System.out.println("\n\n\n\n\n\n----------------------------------------------------");
        System.out.println("\n\t\t\t\tGAME OF 3 DICES\n");
        System.out.println("\n\t\t\t\t--Game Starts--\n");
        System.out.println("----------------------------------------------------");
        System.out.print("\n\nChoose a number of your choice between 1 to 6 = ");
        int player_choice=sc.nextInt();
        System.out.println("\nYou has choosen number "+player_choice);


        Game player =new Game(dice,trials);
        player_point =player.play("player",player_choice);


        //game of computer
        int computer_choice=num.nextInt(6)+1;
        System.out.println("\n\nComputer has choosen number "+computer_choice);
        Game computer =new Game(dice,trials);
        computer_point = computer.play("\ncomputer",computer_choice);
        System.out.println("-----------------------------------------------------");
        if(player_point>computer_point)
        {
            System.out.println("\n--------Congratulations you have won the Game--------");
        }
        else if (player_point<computer_point)
        {
            System.out.println("\n\t\t\t\toops!! computer wins ");
            System.out.println("\n\t\t\t\tBetter luck next time");

        }
        else
        {
            System.out.println("\n\t\t\t\t\t\tDraw");
        }
        System.out.println("\n-----------------------------------------------------");
    }}
