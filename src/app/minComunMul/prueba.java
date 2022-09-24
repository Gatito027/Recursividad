/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.minComunMul;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class prueba {
    public static void main(String[] args) {
        boolean Sentinel = true;
        int a = 0,b=0;
        metodos obj;
        obj = new metodos(a,b);
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor o -1 para terminar:"));
            if (a < 0) {
                Sentinel = false;
            } else {
                b = Integer.parseInt(JOptionPane.showInputDialog("Introduce un segundo valor:"));
                obj.setA(a);
                obj.setB(b);
                obj.setR();
                obj.metodosRecursivo();
                JOptionPane.showMessageDialog(null, "Con metodo Iterativo: "+obj.metodosIterativo()
                +"\nCon metodo Recursivo: "+obj.getR());
            }
        } while (Sentinel);
        JOptionPane.showMessageDialog(null, "See you, I'll be back <(x.x)<");
    }
}
