
package app.minComunMul;

import javax.swing.JOptionPane;

public class menuEjercicio4 {
    private int a=0,b=0;
    private metodos obj;
    
    public void menu(){
        boolean SENTINEL = true;
        String menu,opcion;
        do {
            menu = "Ejercicio 4: Minimo comun multiplo de dos numeros"
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
        obj = new metodos(a,b);
        a = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor positivo para continuar:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Introduce un segundo valor:"));
        obj.setA(a);
        obj.setB(b);
        JOptionPane.showMessageDialog(null, "El resultado es: \n"+obj.metodosIterativo());
    }
    public void recursivo(){
        obj = new metodos(a,b);
        a = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor positivo para continuar:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Introduce un segundo valor:"));
        obj.setA(a);
        obj.setB(b);
        obj.setR();
        obj.metodosRecursivo();
        JOptionPane.showMessageDialog(null, "El resultado es: \n"+obj.getR());
    }
}
