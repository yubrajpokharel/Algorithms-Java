package com.yubraj.problems.fizzbuzz;

import java.util.stream.IntStream;

/**
 * Created by yubraj on 1/24/17.
 */
public class Fizzbuzz {
    public static void main(String[] args) {
        int n = 10000;
        long startTime = System.nanoTime();
        solution2(n);
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }

    //3 5 7
    private static void solution(int n) {
        for (int i = 1; i < n; i++) {
          if(i % (3*5*7) == 0)      System.out.println("fizzbuzzwoof");
          else if(i % (5*7) == 0)   System.out.println("buzzwoof");
          else if(i % (3*7) == 0)   System.out.println("fizzwoof");
          else if(i % (5*3) == 0)   System.out.println("fizzbuzz");
          else if(i % 7 == 0)       System.out.println("woof");

          else if(i % 5 == 0)       System.out.println("buzz");
          else if(i % 3 == 0)       System.out.println("fizz");
          else                      System.out.println(i);

        }
    }

    private static void solution2(int N){
        IntStream.range(1, N)
                .mapToObj(n -> {
                    if (n % 105 == 0) return "FizzBuzzWOLF";
                    else if (n % 15 == 0) return "FizzBuzz";
                    else if (n % 21 == 0) return "FiZZWOFL";
                    else if (n % 35 == 0) return "BUZZWOFL";
                    else if (n % 3 == 0) return "FiZZ";
                    else if (n % 5 == 0) return "Buzz";
                    else if (n % 7 == 0) return "WOFL";
                    else return n;
                }).forEach(System.out::println);


    }



}