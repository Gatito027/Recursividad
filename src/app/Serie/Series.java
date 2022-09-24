
package app.Serie;

public class Series {
    private int n;
    private String Impresion;

    public Series(int n) {
        setN(n);
    }

    public void setN(int n) {
        this.n = n > 0 ? n : 1;
    }
    public void setImprimir(){
        this.Impresion="";
    }

    public int getN() {
        return n;
    }
    public String getImprimir(){
        return Impresion;
    }

    public String metodosIterativo() {
        int i = 1;
        String cadena="";
        while (i <= n) {
            cadena+=i+", ";
            i++;
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
            Impresion+=n+", ";
            metodo(n-1);
        }
    }
    /*public String Imprimir(){
        String cadena="";
        for (int i = 1; i <= n; i++) {
            cadena+=i+") Hola mundo \n";
        }
        return cadena;
    }*/
}
