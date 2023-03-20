package org.example;

public class Calculator2 extends Calculator{
    public  Calculator2(float nr){
        super(nr);
    }

    public float negativ(){
        this.nr=-this.nr;
        return nr;
    }


}
