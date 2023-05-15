package org.example;

public class Calculator {
    protected double nr;

    public Calculator(float nr) {
        this.nr = nr;
    }

    public Calculator inmultire(float other) {
        this.nr *= other;
        return this;
    }

    public Calculator adunare(float other) {
        this.nr += other;
        return this;
    }

    public Calculator negativ() {
        nr = -nr;
        return this;
    }

    public Calculator impartire(float other) {
        if (other == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        this.nr /= other;
        return this;
    }

    public Calculator modulo(float other) {
        if (other == 0) {
            throw new ArithmeticException("Cannot perform modulo with zero");
        }
        this.nr %= other;
        return this;
    }

    public Calculator radical() {

        if (nr < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number");
        }
        nr = Math.sqrt(nr);
        return this;
    }

    public double getresult() {
        return nr;
    }

}