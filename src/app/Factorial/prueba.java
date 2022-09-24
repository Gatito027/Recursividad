package app.Factorial;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HP
 */
public class prueba {

    public static void main(String[] args) {
        boolean Sentinel = true;
        int n = 0;
        factorial obj;
        obj = new factorial(n);
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor o -1 para terminar:"));
            if (n < 0) {
                Sentinel = false;
            } else {
                obj.setX(n);
                JOptionPane.showMessageDialog(null, "El factorial Iterativo es: " + obj.factIterativo()
                        + "\nEl factorial Recursivo es: " + obj.factRecursivo());
            }
        } while (Sentinel);
        JOptionPane.showMessageDialog(null, "See you, I'll be back <(x.x)<");
    }
}
