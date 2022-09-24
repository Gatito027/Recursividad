/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.unoSobreN;


import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class prueba {
    public static void main(String[] args) {
        boolean Sentinel = true;
        int n = 0;
        metodos obj;
        obj = new metodos(n);
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor o -1 para terminar:"));
            if (n < 0) {
                Sentinel = false;
            } else {
                obj.setN(n);
                obj.setRes();
                obj.metodosRecursivo();
                
                JOptionPane.showMessageDialog(null, "Con metodo Iterativo: "+obj.metodosIterativo()
                +"\nCon metodo Recursivo: "+obj.getRes());
            }
        } while (Sentinel);
        JOptionPane.showMessageDialog(null, "See you, I'll be back <(x.x)<");
    }
}
