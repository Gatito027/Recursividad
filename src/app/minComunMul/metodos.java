
package app.minComunMul;

public class metodos {

    private int a, b;
    private double r;

    public metodos(int a, int b) {
        setA(a);
        setB(b);
    }

    public void setR() {
        r = 0;
    }

    public void setA(int a) {
        this.a = a > 0 ? a : 1;
    }

    public void setB(int b) {
        this.b = b > 0 ? b : 1;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double getR() {
        return r;
    }

    public double metodosIterativo() {
        double a = this.a, b = this.b;
        double res=0;

        do {
            res=a%b;
            a=b;
            b=res;
        }while ( b != 0);
        return a;
    }

    public void metodosRecursivo() {
        metodo(a,b);
    }

    private void metodo(double a, double b) {
        double res=0;
        if (b == 0) {
            //caso base
        } else {
            //caso general
            res=(a*1)%b;
            a=b;
            b=res;
            r=a;
            metodo(a,b);
        }
    }
}
