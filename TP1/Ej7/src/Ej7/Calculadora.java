package Ej7;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    private final int a;

    private final int b;

    private final int c;

    private int nroRaices(){
        if (((Math.pow(b,2))-(4*a*c))==0){
            return 1;
        }else {
            return 2;
        }
    }
    public Calculadora(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el Coeficiente del primer termino: ");
        a = s.nextInt();
        s.nextLine();
        System.out.println("Ingrese el Coeficiente del segundo termino: ");
        b = s.nextInt();
        s.nextLine();
        System.out.println("Ingrese el termino independiente: ");
        c = s.nextInt();
        s.nextLine();
    }

    public ArrayList<Double> raices(){
        ArrayList<Double> rta= new ArrayList<Double>();
        double v = (Math.pow(b, 2)) - (4 * a * c);
        double e = (-b + (Math.sqrt(v))) / (2 * a);
        if (nroRaices()==1){
            rta.add(e);
        }else{
            rta.add(e);
            rta.add((-b-(Math.sqrt(v)))/(2*a));
        }
        return rta;
    }

    public double valorY(int x){
        double aux;
        aux = a*(Math.pow(x,2))+b*x+c;
        return aux;
    }
}
