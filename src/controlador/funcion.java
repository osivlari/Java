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
public class funcion {

    public double seno(int grados, int repeticiones) {
        operaciones m = new operaciones();
        double seno = 0, suma = 0;

        for (int i = 0; i < repeticiones; i++) {
            seno = ((m.signo(i) / m.Factorial(2 * i + 1)) * m.Potencia(m.GradosRadianes(grados), 2 * i + 1));
            suma += seno;
        }
        return suma;
    }

}
