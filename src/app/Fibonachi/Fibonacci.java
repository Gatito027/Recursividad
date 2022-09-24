/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.Fibonachi;

/**
 *
 * @author HP
 */
public class Fibonacci {

    private int n;

    public Fibonacci(int n) {
        setN(n);
    }

    public void setN(int n) {
        this.n = n >= 0 ? n : 0;
    }

    public int getN() {
        return n;
    }
    public int fiboRecursivo(){
        return fibo(n);
    }

    private int fibo(int n) {
        if (n == 0) {
            //caso base
            return 0;
        } else if (n == 1) {
            //caso base
            return 1;
        } else {
            //caso general
            return fibo(n-1)+fibo(n-2);
        }
    }
}
