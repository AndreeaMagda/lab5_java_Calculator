package org.example;

public class Main {
    public static void main(String[] args) {

      Calculator c=new Calculator(4);
      Calculator2 c2=new Calculator2(4);
      c.adunare(2);
      c.inmultire(3);
      c2.negativ();

        //System.out.println(c.getresult());

        System.out.println(c.getresult());
    }
}