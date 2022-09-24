package app.Factorial;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class factorial {

    private int x;

    public factorial(int x) {
        setX(x);
    }

    public void setX(int x) {
        this.x = x < 0 ? 0 : x;
    }
    public int getX(){
        return x;
    }
    //metodo Iterativo del factorial
    public int factIterativo (){
        int fact=1;
        for (int i = 1; i <= x; i++) {
            fact*=i;
        }
        return fact;
    }
    public int factRecursivo(){
        return fact(x);
    }
    private int fact(int n){
        if (n ==1 || n==0){
            //caso base
            return 1;
        }else{
            //caso general
            return n * fact(n-1);
        }
    }
}
