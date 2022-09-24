
package app.Serie;

import javax.swing.JOptionPane;

public class menuEjercicio2 {
    private int n=0;
    private Series obj;
    public void menu(){
        boolean SENTINEL = true;
        String menu,opcion;
        do {
            menu = "Ejercicio 2: Impirmir n Numeros"
                    + "\n 1) Con metodo Iterativo\n 2) Con metodo Recursivo\n 3) Salir"
                    + "\n Elegir opción:";
            opcion = JOptionPane.showInputDialog(menu);
            switch (opcion) {
                case "1":
                    //Iterativo
                    this.iterativo();
                    break;
                case "2":
                    //Recursivo
                    this.recursivo();
                    break;
                case "3":
                    SENTINEL = false;
                    System.out.println("Adios <(x.x)<");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error: esta opcion no existe <(x.x)<");
            }
        } while (SENTINEL);
    }
    public void iterativo(){
        obj = new Series(n);
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor positivo para continuar:"));
        obj.setN(n);
        JOptionPane.showMessageDialog(null, "El resultado es: \n"+obj.metodosIterativo());
    }
    public void recursivo(){
        obj = new Series(n);
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor positivo para continuar:"));
        obj.setN(n);
        obj.setImprimir();
        obj.metodosRecursivo();
        JOptionPane.showMessageDialog(null, "El resultado es: \n"+obj.getImprimir());
    }
}
