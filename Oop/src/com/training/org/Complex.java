package com.training.org;

public class Complex {
    private int real;
    private int imag;

    public void showValues() {
        System.out.println("REAL " + real + " Imag" + imag);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.showValues();
    }

}

