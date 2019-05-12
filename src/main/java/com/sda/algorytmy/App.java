package com.sda.algorytmy;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       int[] a = {5,1,2,3,1,6,1};
       int wynik = 0;
       int x = 1;

    for(int i = 1; i < a.length; i++){
       if (a[i] == 1){
           wynik = wynik +1;
            }
        }
        System.out.println(wynik);
    }

    }





