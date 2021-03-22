/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class NameHandler {
    
    private String name;
    private String date;
    private int age;
    private String hour;
   
    public NameHandler(){
        name = null;
        date = null;
        age = 0;
        hour = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAge() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fecha = LocalDate.parse(this.date);
        Period periodo = Period.between(fecha, fechaActual);
        this.age = periodo.getYears();
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHour() {
        Format h = new SimpleDateFormat("HH:mm");
        this.hour = h.format(new Date());
        return hour;      
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
     
}
