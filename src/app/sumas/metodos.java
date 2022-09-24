/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.sumas;

/**
 *
 * @author HP
 */
public class metodos {
    private int n;

    public metodos(int n) {
        setN(n);
    }

    public void setN(int n) {
        this.n = n > 0 ? n : 1;
    }

    public int getN() {
        return n;
    }

    public int metodosIterativo() {
        int i = 1, suma = 0;
        while (i <= n) {
            suma += i;
            i++;
        }
        return suma;
    }

    public int metodosRecursivo() {
        return metodo(n);
    }

    private int metodo(int n) {
        if (n == 0) {
            //caso base
            return 0;
        } else {
            //caso general
            return n + metodo(n - 1);
        }
    }
}
