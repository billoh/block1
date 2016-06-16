package com.company;
import java.util.Scanner;
import static java.lang.Math.*;
public class Main {

    public static double result(double x, int k)
    {
        boolean chet = k % 2 == 0;
        if(x > 0)
        {
            if(chet)
                return sin(k * x);
            else
                return 2. / k * log(x);
        }
        else
        {
            if(chet)
            return cos(k * x);
            else
                return 1. / k * exp(x);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x;
        int k;

        try
        {
            System.out.print("Введите число x: ");
            x = in.nextDouble();
            System.out.print("Введите целове число k: ");
            k = in.nextInt();
            while(k == 0)
            {
                System.out.print("Введите целове число k: ");
                k = in.nextInt();
            }
            System.out.print("Результат вычислений равен: " + result(x, k));
        }

        catch (Exception e)
        {
            System.out.println("Недопустимые значения....");

        }
    }
}
