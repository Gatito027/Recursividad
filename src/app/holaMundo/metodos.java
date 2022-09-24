/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.holaMundo;
public class metodos {

    private int n;
    private String Impresion;

    public metodos(int n) {
        setN(n);
    }
    public void setImprimir(){
        this.Impresion="";
    }

    public void setN(int n) {
        this.n = n > 0 ? n : 1;
    }
    public String getImprimir(){
        return Impresion;
    }

    public int getN() {
        return n;
    }

    public String metodosIterativo(){
        String cadena="";
        for (int i = 1; i <= n; i++) {
            cadena+=i+") Hola mundo \n";
        }
        return cadena;
    }

    public void metodosRecursivo() {
        metodo(n);
    }

    private void metodo(int n) {
        if (n == 0) {
            //caso base
        } else {
            //caso general
            Impresion+=n+") Hola mundo \n";
            metodo(n-1);
        }
    }
}
