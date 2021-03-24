/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer sumar(int valor1, int valor2) {
        return valor1+valor2;
    }

    @Override
    public Integer resta(int valor1, int valor2) {
        return valor1-valor2;
    }

    @Override
    public Integer multiplicacion(int valor1, int valor2) {
        return valor1*valor2;
    }

    @Override
    public Double division(double valor1, double valor2) {
        return  valor1/valor2;
    }

    @Override
    public Integer modulo(int valor1, int valor2) {
        return valor1%valor2;
    }

    @Override
    public Double potencia(double valor1, double valor2) {
        return Math.pow(valor1, valor2);
    }
    
    
    

    
}
