/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smartocupation.smartocupation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConexionSQL {

    private static final String URL = "jdbc:mysql://localhost:3306/smartocupation";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "root";

    // Constante para la consulta SQL de alquileres por rango de fechas
    private static final String CONSULTA_ALQUILERES_POR_FECHAS
            = "SELECT A.*, V.* "
            + "FROM Alquileres A "
            + "JOIN Viviendas V ON A.IdVivienda = V.IdVivienda "
            + "WHERE A.FechaEntrada BETWEEN ? AND ?";

    // Constante para la consulta SQL de todos los alquileres
    private static final String CONSULTA_ALQUILERES_COMPLETOS
            = "SELECT A.*, V.* "
            + "FROM Alquileres A "
            + "JOIN Viviendas V ON A.IdVivienda = V.IdVivienda ";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }

    // Método para obtener todos los alquileres desde la base de datos
    public static List<Alquiler> obtenerTodosLosAlquileres() {
        List<Alquiler> alquileres = new ArrayList<>();

        try ( Connection conexion = obtenerConexion()) {
            PreparedStatement preparedStatement = conexion.prepareStatement(CONSULTA_ALQUILERES_COMPLETOS);

            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Alquiler alquiler = new Alquiler(
                            resultSet.getInt("NumeroExpediente"),
                            resultSet.getDate("FechaEntrada"),
                            resultSet.getInt("TiempoEstimadoAlquiler"),
                            resultSet.getString("NombreCliente"),
                            resultSet.getString("DatosPersonalesCliente"),
                            resultSet.getString("DatosFacturacionCliente"),
                            new Vivienda(
                                    resultSet.getString("V.IdVivienda"), // Se usa el alias "V" para la tabla Viviendas
                                    resultSet.getString("V.Ubicacion"),
                                    resultSet.getDouble("V.MetrosCuadrados"),
                                    resultSet.getInt("V.NumHabitaciones"),
                                    resultSet.getInt("V.NumBanos"),
                                    resultSet.getString("V.CodigoReferencia"),
                                    resultSet.getDouble("V.PrecioAlquilerMensual")
                            )
                    );

                    alquileres.add(alquiler);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return alquileres;
    }

    // Método para realizar la consulta de alquileres por rango de fechas
    public static List<Alquiler> consultarAlquileresPorFechas(Date fechaInicio, Date fechaFinal) {
        List<Alquiler> alquileres = new ArrayList<>();

        try ( Connection conexion = obtenerConexion();  PreparedStatement preparedStatement = conexion.prepareStatement(CONSULTA_ALQUILERES_POR_FECHAS)) {

            preparedStatement.setDate(1, new java.sql.Date(fechaInicio.getTime()));
            preparedStatement.setDate(2, new java.sql.Date(fechaFinal.getTime()));

            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Alquiler alquiler = new Alquiler(
                            resultSet.getInt("NumeroExpediente"),
                            resultSet.getDate("FechaEntrada"),
                            resultSet.getInt("TiempoEstimadoAlquiler"),
                            resultSet.getString("NombreCliente"),
                            resultSet.getString("DatosPersonalesCliente"),
                            resultSet.getString("DatosFacturacionCliente"),
                            new Vivienda(
                                    resultSet.getString("V.IdVivienda"), // Se usa el alias "V" para la tabla Viviendas
                                    resultSet.getString("V.Ubicacion"),
                                    resultSet.getDouble("V.MetrosCuadrados"),
                                    resultSet.getInt("V.NumHabitaciones"),
                                    resultSet.getInt("V.NumBanos"),
                                    resultSet.getString("V.CodigoReferencia"),
                                    resultSet.getDouble("V.PrecioAlquilerMensual")
                            )
                    );

                    alquileres.add(alquiler);
                }
            }
        } catch (SQLException e) {
            // Maneja la excepción de manera apropiada, puedes lanzar una excepción personalizada o lograr el mensaje de error.
            e.printStackTrace();
        }

        return alquileres;
    }

    // Método para guardar un histórico de alquileres en la base de datos
    public static void guardarHistoricoAlquiler(Alquiler alquiler) {
        try ( Connection conexion = obtenerConexion()) {
            String insertSQL = "INSERT INTO HistoricoAlquileres (NumeroExpediente, FechaEntrada, TiempoEstimadoAlquiler, NombreCliente, DatosPersonalesCliente, DatosFacturacionCliente, IdVivienda) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try ( PreparedStatement preparedStatement = conexion.prepareStatement(insertSQL)) {
                preparedStatement.setInt(1, alquiler.getNumeroExpediente());
                preparedStatement.setDate(2, new java.sql.Date(alquiler.getFechaEntrada().getTime()));
                preparedStatement.setInt(3, alquiler.getTiempoEstimadoAlquiler());
                preparedStatement.setString(4, alquiler.getNombreCliente());
                preparedStatement.setString(5, alquiler.getDatosPersonalesCliente());
                preparedStatement.setString(6, alquiler.getDatosFacturacionCliente());
                preparedStatement.setString(7, alquiler.getVivienda().getIdVivienda());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
