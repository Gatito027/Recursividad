
package app.unoSobreN;

public class metodos {
    private int n;
    private float res;

    public metodos(int n) {
        setN(n);
    }
    public void setRes(){
        res=0;
    }

    public void setN(int n) {
        this.n = n > 0 ? n : 1;
    }

    public int getN() {
        return n;
    }
    public float getRes() {
        return res;
    }

    public float metodosIterativo() {
        int i = 1;
        float resultado=0;
        while (i <= n) {
            resultado+=1.0/i;
            i++;
        }
        return resultado;
    }

    public void metodosRecursivo() {
        metodo(n);
    }

    private void metodo(int n) {
        if (n == 0) {
            //caso base
        } else {
            //caso general
            res+=1.0/n;
            metodo(n-1);
        }
    }
}
