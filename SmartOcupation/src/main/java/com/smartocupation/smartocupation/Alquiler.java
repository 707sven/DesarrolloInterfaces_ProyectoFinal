/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartocupation.smartocupation;

import java.util.Date;

/**
 *
 * @author marta
 */
public class Alquiler {

    // Atributos
    private int numeroExpediente;
    private Date fechaEntrada;
    private int tiempoEstimadoAlquiler;
    private String nombreCliente;
    private String datosPersonalesCliente;
    private String datosFacturacionCliente;
    private Vivienda vivienda;

    // Constructor
    public Alquiler(int numeroExpediente, Date fechaEntrada, int tiempoEstimadoAlquiler, String nombreCliente, String datosPersonalesCliente, String datosFacturacionCliente, Vivienda vivienda) {
        this.numeroExpediente = numeroExpediente;
        this.fechaEntrada = fechaEntrada;
        this.tiempoEstimadoAlquiler = tiempoEstimadoAlquiler;
        this.nombreCliente = nombreCliente;
        this.datosPersonalesCliente = datosPersonalesCliente;
        this.datosFacturacionCliente = datosFacturacionCliente;
        this.vivienda = vivienda;
    }

    // Métodos
    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getTiempoEstimadoAlquiler() {
        return tiempoEstimadoAlquiler;
    }

    public void setTiempoEstimadoAlquiler(int tiempoEstimadoAlquiler) {
        this.tiempoEstimadoAlquiler = tiempoEstimadoAlquiler;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDatosPersonalesCliente() {
        return datosPersonalesCliente;
    }

    public void setDatosPersonalesCliente(String datosPersonalesCliente) {
        this.datosPersonalesCliente = datosPersonalesCliente;
    }

    public String getDatosFacturacionCliente() {
        return datosFacturacionCliente;
    }

    public void setDatosFacturacionCliente(String datosFacturacionCliente) {
        this.datosFacturacionCliente = datosFacturacionCliente;

    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "numeroExpediente=" + numeroExpediente + ", fechaEntrada=" + fechaEntrada + ", tiempoEstimadoAlquiler=" + tiempoEstimadoAlquiler + ", nombreCliente=" + nombreCliente + ", datosPersonalesCliente=" + datosPersonalesCliente + ", datosFacturacionCliente=" + datosFacturacionCliente + ", vivienda=" + vivienda + '}';
    }

    

}
