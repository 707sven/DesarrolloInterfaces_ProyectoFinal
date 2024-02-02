/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartocupation.smartocupation;

import java.util.Objects;

/**
 *
 * @author marta
 */
public class Vivienda {
    
    // Atributos
    private String idVivienda;
    private String ubicacion;
    private double metrosCuadrados;
    private int numHabitaciones;
    private int numBanos;
    private String codigoReferencia;
    private double precioAlquilerMensual;
    
    // Constructor

    public Vivienda(String idVivienda, String ubicacion, double metrosCuadrados, int numHabitaciones, int numBanos, String codigoReferencia, double precioAlquilerMensual) {
        this.idVivienda = idVivienda;
        this.ubicacion = ubicacion;
        this.metrosCuadrados = metrosCuadrados;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.codigoReferencia = codigoReferencia;
        this.precioAlquilerMensual = precioAlquilerMensual;
    }
    
    
    public String getIdVivienda() {
        return idVivienda;
    }

    // Métodos
    public void setIdVivienda(String idVivienda) {
        this.idVivienda = idVivienda;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    public String getCodigoReferencia() {
        return codigoReferencia;
    }

    public void setCodigoReferencia(String codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }

    public double getPrecioAlquilerMensual() {
        return precioAlquilerMensual;
    }

    public void setPrecioAlquilerMensual(double precioAlquilerMensual) {
        this.precioAlquilerMensual = precioAlquilerMensual;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "idVivienda=" + idVivienda + ", ubicacion=" + ubicacion + ", metrosCuadrados=" + metrosCuadrados + ", numHabitaciones=" + numHabitaciones + ", numBanos=" + numBanos + ", codigoReferencia=" + codigoReferencia + ", precioAlquilerMensual=" + precioAlquilerMensual + '}';
    }

    
}
