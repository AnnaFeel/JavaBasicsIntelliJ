package com.syntax.class21;

public class Replit {
        public static void main(String[] args) {
            int[] a = {1,2,3,4,5};
            mystery(a);
            // should print out 10 1 30 2 50
        }

        static void mystery(int[] array)	{
            for (int arr:array){
                if (arr%2==0){
                    arr=arr/2;
                    System.out.print(arr+" ");
                } else {
                    arr=arr*10;
                    System.out.print(arr+" ");
                }
            }

        }
    }

