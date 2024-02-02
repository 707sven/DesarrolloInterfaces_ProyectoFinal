/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.smartocupation.smartocupation;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author marta
 */
public class ConexionSQLTest {

    public ConexionSQLTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of obtenerConexion method, of class ConexionSQL.
     */
    @Test
    public void testObtenerConexion() throws Exception {
        System.out.println("obtenerConexion");
        Connection expResult = null;
        Connection result = ConexionSQL.obtenerConexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTodosLosAlquileres method, of class ConexionSQL.
     */
    @Test
    public void testObtenerTodosLosAlquileres() {
        System.out.println("obtenerTodosLosAlquileres");

        // Creamos una instancia de ConexionSQL
        ConexionSQL conexionSQL = new ConexionSQL();

        // Llamamos al método que queremos probar
        List<Alquiler> alquileres = conexionSQL.obtenerTodosLosAlquileres();

        // Verificamos que la lista no sea nula y tenga al menos un elemento
        assertNotNull(alquileres);
        assertFalse(alquileres.isEmpty());
    }

    /**
     * Test of consultarAlquileresPorFechas method, of class ConexionSQL.
     */
    @Test
    public void testConsultarAlquileresPorFechas() {
        System.out.println("consultarAlquileresPorFechas");

        // Creamos una instancia de ConexionSQL
        ConexionSQL conexionSQL = new ConexionSQL();

        // Definimos fechas de inicio y fin para la búsqueda
        Date fechaInicio = new Date(2023-01-01);
        Date fechaFin = new Date(2023-12-31);
        
        // Llamamos al método que queremos probar
        List<Alquiler> alquileres = conexionSQL.consultarAlquileresPorFechas(fechaInicio, fechaFin);

        // Verificamos que la lista no sea nula
        assertNotNull(alquileres);

    }

    /**
     * Test of guardarHistoricoAlquiler method, of class ConexionSQL.
     */
    @Test
    public void testGuardarHistoricoAlquiler() {
        System.out.println("guardarHistoricoAlquiler");
        Alquiler alquiler = null;
        ConexionSQL.guardarHistoricoAlquiler(alquiler);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
