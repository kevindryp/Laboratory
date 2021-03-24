/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface CalcBeanLocal {

    Integer sumar(int valor1, int valor2);

    Integer resta(int valor1, int valor2);

    Integer multiplicacion(int valor1, int valor2);

    Double division(double valor1, double valor2);

    Integer modulo(int valor1, int valor2);

    Double potencia(double valor1, double valor2);
   
}
