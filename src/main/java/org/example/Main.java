package org.example;

public class Main {
    public static void main(String[] args) {

      Calculator c=new Calculator(4);
      c.adunare(2);
      c.inmultire(3);
        System.out.println(c.getresult());
    }
}