package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class WaterJug {
    public int jug_one;
    public int jug_two;
    public int waterLevel;

    public WaterJug(int jug_one, int jug_two, int waterLevel) {
        this.jug_one = jug_one;
        this.jug_two = jug_two;
        this.waterLevel = waterLevel;
    }

    public static int gcd(int a, int b)
    {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static int minSteps(int m, int n, int d)
    {


        // For d > n we cant measure the water
        // using the jugs
        if (d > n)
            return -1;

        // If gcd of n and m does not divide d
        // then solution is not possible
        if ((d % gcd(n, m)) != 0)
            return -1;

        // Return minimum two cases:
        // a) Water of n liter jug is poured into
        //    m liter jug
        // b) Vice versa of "a"
        return 1; // m to n
    }



    public void problemSolver(WaterJug waterJug) {

        int count=15;

        int jug1[] = new int[count];
        int jug2[] = new int[count];
        int jug3[] = new int[count];
        int jug4[] = new int[count];
         String solution="one";
        int i = 1;
        int j = 1;

       int x =minSteps(waterJug.jug_one, waterJug.jug_two,waterLevel);

       if (x==-1){
           System.out.println("Invalid input Try again!!!!!");
           return;
       } else if (x == 1){
           System.out.println("Inputs are valid..... starting the process.....");
       }

        if (solution=="one") {
            jug1[i] = waterJug.jug_one;
            jug2[i] = 0;
            i++;


            while (jug1[i - 1] != waterJug.waterLevel && jug2[i - 1] != waterJug.waterLevel) {

                int temp = Math.min(jug1[i - 1], (waterJug.jug_two - jug2[i - 1]));

                jug2[i] = jug2[i - 1] + temp;
                jug1[i] = jug1[i - 1] - temp;
                i++;

                // If first jug becomes empty, fill it
                if (jug1[i - 1] == 0 || jug2[i - 1] == waterJug.jug_two) {
                    if (jug2[i - 1] == waterJug.jug_two) {
                        jug2[i] = 0;
                        jug1[i] = jug1[i - 1];
                    }
                    if (jug1[i - 1] == 0) {
                        jug1[i] = waterJug.jug_one;
                        jug2[i] = jug2[i - 1];
                    }
                    i++;
                }


            }
        }

        solution="two";

        if (solution=="two") {

    jug3[j] = 0;
    jug4[j] = waterJug.jug_two;
    j++;


    while (jug3[j - 1] != waterJug.waterLevel && jug4[j - 1] != waterJug.waterLevel) {
        int temp = Math.min(jug4[j - 1], waterJug.jug_one - jug3[j - 1]);
        jug3[j] = jug3[j - 1] + temp;
        jug4[j] = jug4[j - 1] - temp;
        j++;


        if (jug4[j - 1] == 0 || jug3[j - 1] == waterJug.jug_one) {
            if (jug3[j - 1] == waterJug.jug_one) {
                jug3[j] = 0;
                jug4[j] = jug4[j - 1];

            }
            if (jug4[j - 1] == 0) {
                jug4[j] = waterJug.jug_two;
                jug3[j] = jug3[j - 1];
            }

            j++;
        }



    }


    System.out.print("........... finding the Optimal Way to measure " + waterJug.waterLevel + "l...........");


}


         if (j< i){

        for (int a = 1; a < j; a++) {
                System.out.print("\n "+waterJug.jug_one+ "l Jug  contains : " + jug3[a] + "\t" +waterJug.jug_two+"l Jug two contains: " + jug4[a]);
            }
             System.out.println();
         } else
         {
             for (int b = 1; b < i; b++) {
                 System.out.print("\n "+waterJug.jug_one+ " l Jug  contains : " + jug1[b] + "\t" +waterJug.jug_two+"l Jug two contains: " + jug2[b]);
             }
         }
        System.out.println();

    }








}















