/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.Fibonachi;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class prueba {
    public static void main(String[] args) {
        boolean Sentinel = true;
        int n = 0;
        Fibonacci obj;
        obj = new Fibonacci(n);
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor o -1 para terminar:"));
            if (n < 0) {
                Sentinel = false;
            } else {
                obj.setN(n);
                JOptionPane.showMessageDialog(null, "El fibonacci Iterativo es: " + //obj.factIterativo()+
                         "\nEl fibonacci Recursivo es: " + obj.fiboRecursivo());
            }
        } while (Sentinel);
        JOptionPane.showMessageDialog(null, "See you, I'll be back <(x.x)<");
    }
}
