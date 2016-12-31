package com.company;
import java.util.*;

public class Main {
    public static String a [][] = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        print();
        System.out.println("This is the board you will be using. You will play as X. Each number represents an available position you may take");
        boolean b = false;
        for (int i = 0; i<4;i++){
            System.out.println("What position would you like to take?");
            int p1 = kb.nextInt();
            String player1 = Integer.toString(p1);

            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (a[x][y].equals(player1)) {
                        a[x][y] = "X";
                    }
                }
            }
            print();
            b = verifiction();
            if (b == true){
                break;
            }
            computer();
            print();
            b = verifiction();
            if (b == true){
                break;
            }
            System.out.println("Your move.");
        }
        if (b == false){
            System.out.println("Aww! You Drawed! :_(");
        }
    }
    public static void computer(){
        Random rd = new Random();
        boolean b = true;
        while (b == true) {
            int cP = rd.nextInt(9) + 1;
            String compPos = Integer.toString(cP);
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (a[x][y].equals(compPos)) {
                        a[x][y] = "O";
                        x=2;
                        y=2;
                        b=false;
                    }
                }
            }
        }
    }
    public static boolean verifiction(){
        boolean verify = false;
        if (a[0][0].equals("X") && a[0][1].equals("X") && a[0][2].equals("X")){
            verify = true;
            System.out.println("YOU WON!!!");
        }
        else if (a[1][0].equals("X") && a[1][1].equals("X") && a[1][2].equals("X")){
            verify = true;
            System.out.println("YOU WON!!!");
        }
        else if (a[2][0].equals("X") && a[2][1].equals("X") && a[2][2].equals("X")){
            verify = true;
            System.out.println("YOU WON!!!");
        }
        else if (a[0][0].equals("X") && a[1][0].equals("X") && a[2][0].equals("X")){
            verify = true;
            System.out.println("YOU WON!!!");
        }
        else if (a[0][1].equals("X") && a[1][1].equals("X") && a[2][1].equals("X")){
            verify = true;
            System.out.println("YOU WON!!!");
        }
        else if (a[0][2].equals("X") && a[1][2].equals("X") && a[2][2].equals("X")){
            verify = true;
            System.out.println("YOU WON!!!");
        }
        else if (a[0][0].equals("X") && a[1][1].equals("X") && a[2][2].equals("X")){
            verify = true;
            System.out.println("YOU WON!!!");
        }
        else if (a[0][2].equals("X") && a[1][1].equals("X") && a[2][0].equals("X")){
            verify = true;
            System.out.println("YOU WON!!!");
        }

        if (a[0][0].equals("O") && a[0][1].equals("O") && a[0][2].equals("O")){
            verify = true;
            System.out.println("YOU LOST!!!");
        }
        else if (a[1][0].equals("O") && a[1][1].equals("O") && a[1][2].equals("O")){
            verify = true;
            System.out.println("YOU LOST!!!");
        }
        else if (a[2][0].equals("O") && a[2][1].equals("O") && a[2][2].equals("O")){
            verify = true;
            System.out.println("YOU LOST!!!");
        }
        else if (a[0][0].equals("O") && a[1][0].equals("O") && a[2][1].equals("O")){
            verify = true;
            System.out.println("YOU LOST!!!");
        }
        else if (a[0][1].equals("O") && a[1][1].equals("O") && a[2][1].equals("O")){
            verify = true;
            System.out.println("YOU LOST!!!");
        }
        else if (a[0][2].equals("O") && a[1][2].equals("O") && a[2][2].equals("O")){
            verify = true;
            System.out.println("YOU LOST!!!");
        }
        else if (a[0][0].equals("O") && a[1][1].equals("O") && a[2][2].equals("O")){
            verify = true;
            System.out.println("YOU LOST!!!");
        }
        else if (a[0][2].equals("O") && a[1][1].equals("O") && a[2][0].equals("O")){
            verify = true;
            System.out.println("YOU LOST!!!");
        }
        return verify;
    }
    public static void print(){
        for (int x = 0; x<3; x++) {
            for (int y = 0; y < 3; y++) {
                if (y ==2){
                    if (x==2){
                        System.out.println(a[x][y]);
                    }
                    else {
                        System.out.print(a[x][y] + "\n----------\n");
                    }
                }
                else {
                    System.out.print(a[x][y] + " | ");
                }
            }
        }
        System.out.println(" ");
    }
}
