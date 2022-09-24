package app.nSobreNFactorial;

public class metodos {
    private int n;
    private double res;
    private factorial obj;

    public metodos(int n) {
        setN(n);
        obj = new factorial(0);
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
    public double getRes() {
        return res;
    }

    public double metodosIterativo() {
        int i = 1;
        double resultado=0;
        while (i <= n) {
            obj.setX(i);
            resultado+=((i*1.0)/obj.factIterativo());
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
            obj.setX(n);
            res+=((n*1.0)/obj.factRecursivo());
            metodo(n-1);
        }
    }
}
