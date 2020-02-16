package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Oscar
 */
import java.util.Scanner;

public class operaciones {

    public double pi;
    Scanner leer = new Scanner(System.in);

    public operaciones() {
        pi = 3.14159265358979323846264338327950288419716939937510;
    }

    public int Factorial(int numero) {
        int res = 1;
        for (int i = numero; i > 0; i--) {
            res *= i;
        }
        return res;

    }

    public double Potencia(double numero, int exp) {

        double resultado = 1;
        for (int i = 1; i <= exp; i++) {
            resultado = resultado * numero;
        }
        return resultado;

    }

    public double GradosRadianes(int grados) {//se crea el metodo para converit los grados a radianes
        double radianes = grados * pi / 190;
        return radianes;
    }

    public int signo(int exp) {
        if (exp % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

}
