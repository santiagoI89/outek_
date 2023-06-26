/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author APRENDIZ
 */
public class ConexionBd {
    
    //1. Declarar variables y/o objetos
    private String driver, user, password, urlBd, port, nameDB;
    private Connection conexion;
    public static Statement st=null;
    public static ResultSet rt=null;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrlBd() {
        return urlBd;
    }

    public void setUrlBd(String urlBd) {
        this.urlBd = urlBd;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getNameDB() {
        return nameDB;
    }

    public void setNameDB(String nameDB) {
        this.nameDB = nameDB;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public static Statement getSt() {
        return st;
    }

    public static void setSt(Statement st) {
        ConexionBd.st = st;
    }

    public static ResultSet getRt() {
        return rt;
    }

    public static void setRt(ResultSet rt) {
        ConexionBd.rt = rt;
    }

    
    public ConexionBd(){
        driver="com.mysql.jdbc.Driver";
        user="root";
        password="";
        nameDB="outek";
        port="3306";
        urlBd="jdbc:mysql://localhost:" + port+ "/" +nameDB;
      
       
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(urlBd, user, password);
            System.out.println("¡Conexion OK!");
        } catch (Exception e) {
            System.out.println("Error al conectarse " + e.toString());
        }      
    }
    public Connection obtenerConexion(){
        
        return conexion;
    }
    public Connection cerrarConexion() throws SQLException{
        
        conexion.close();
        conexion = null;
        return conexion;
    }
    public static void main(String[] args) {
        new ConexionBd();
    }
    
    //2.
    
}
