package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.print("1.");
        for (int i = 1; i < 6; i++)
        {
            if (i != 1)
                System.out.print("  ");
            for (int j = 1; j < 6; j++)
                System.out.print(" " + j);
            System.out.println();
        }


        System.out.println("2. ");
        int initial = 1;

        for (int j = 0; j < 5; j++)
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.print(initial + i + " ");
            }
            System.out.println();

            initial++;
        }
    }
}
