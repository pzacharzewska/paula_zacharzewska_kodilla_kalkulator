package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;


public class Kalkulator {

    int a;
    int b;

    public Kalkulator (int a, int b){
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int sum() {
        return a + b;
    }

    public int subtraction() {
        return a - b;
    }

    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator(5, 6);
        System.out.println(kalkulator.sum());
    }

}
