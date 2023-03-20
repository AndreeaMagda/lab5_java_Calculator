package org.example;

public class Calculator {
    float nr;
    public Calculator(float nr){
        this.nr=nr;
    }

    public void inmultire(float other){
      this.nr*=other;
    }

    public void adunare(float other){
        this.nr+=other;
    }

    public float getresult(){
        return nr;
    }

}