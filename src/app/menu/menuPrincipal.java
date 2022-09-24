/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.menu;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class menuPrincipal {
    public static void main(String[] args) {
        String menu,opcion;
        boolean SENTINEL = true;
        app.holaMundo.menuEjercicio1 eje1;
        eje1 = new app.holaMundo.menuEjercicio1();
        app.Serie.menuEjercicio2 eje2;
        eje2 = new app.Serie.menuEjercicio2();
        app.unoSobreN.menuEjercicio3 eje3;
        eje3 = new app.unoSobreN.menuEjercicio3();
        app.minComunMul.menuEjercicio4 eje4;
        eje4 = new app.minComunMul.menuEjercicio4();
        app.nSobreNFactorial.menuEjercicio5 eje5;
        eje5 = new app.nSobreNFactorial.menuEjercicio5();
        do {
            menu = "Menu principal:\n 1) Actividad 1: Imprecion hola mundo\n"
                    + " 2) Actividad 2: Imprecion series\n 3) Actividad 3: 1/1 + 1/n \n"
                    + " 4) Actividad 4: Minimo comun multiplo de dos numeros\n 5) Actividad 5: Resolver 1/1! + n/n!"
                    + "\n 6) Salir"
                    + "\n Elegir opción:";
            opcion = JOptionPane.showInputDialog(menu);
            switch (opcion) {
                case "1":
                    eje1.menu();
                    break;
                case "2":
                    eje2.menu();
                    break;
                case "3":
                    eje3.menu();
                    break;
                case "4":
                    eje4.menu();
                    break;
                case "5":
                    eje5.menu();
                    break;
                case "6":
                    SENTINEL = false;
                    JOptionPane.showMessageDialog(null, "Hasta pronto... <(x.x)<");
                    System.out.println("Adios <(x.x)<");
                    break;
                default:
                    System.out.println("Error: esta opcion no existe <(x.x)<");
            }
        } while (SENTINEL);
    }
}
