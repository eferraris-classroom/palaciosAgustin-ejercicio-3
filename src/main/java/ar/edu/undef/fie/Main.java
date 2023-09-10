package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        //int [] arreglo = {1,2,3,4};
        //arreglo[1] = 0; //Como piso una posicion

        int [] arreglo = {1, 2, -4, 8, 5, 6};

        var min = arreglo[0];
        var max = arreglo[0];

        for(var numero: arreglo) {
            if(numero > max) {
                max = numero;
            } if(numero < min){
                min = numero;
            }
        }
        System.out.println("Minimo: " + min);
        System.out.println("Maximo: " + max);
    }
}