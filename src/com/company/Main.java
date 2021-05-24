package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String solution;

          while(true) {
              // get small jug capacity
              System.out.print("\nEnter the capacity of small Jug: ");
              int jug_one = sc.nextInt();

              // get big jug capacity
              System.out.print("\nEnter  capacity of large Jug: ");
              int jug_two = sc.nextInt();

              System.out.print("\nEnter  water level that you want: ");
              int waterLevel = sc.nextInt();


              WaterJug waterJug = new WaterJug(jug_one, jug_two, waterLevel);


              waterJug.problemSolver(waterJug);



              System.out.print("\n ...........If You Want to Exit the program press 0 else press any key ......... ");
              int exit = sc.nextInt();
              if (exit == 0){
                 break;
              }else{
                  continue;
              }


          }

    }
}
