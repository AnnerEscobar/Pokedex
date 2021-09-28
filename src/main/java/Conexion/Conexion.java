/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author anner
 */
public class Conexion {
     
     private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
     private static final String JDBC_USER = "root";
     private static final String JDBC_PASSWORD = "SoyAgente2341";
     
     
     public static Connection OpenConection() throws SQLException{
          return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
     }
     
     
     public static void CloseConection(ResultSet rs){ 
          try{
               rs.close();
          }catch(SQLException ex){
               ex.printStackTrace(System.out);
          }
          
     }
      public static void CloseConection(PreparedStatement stmt){ 
          try{
               stmt.close();
          }catch(SQLException ex){
               ex.printStackTrace(System.out);
          }
          
     }
       public static void CloseConection(Connection conn){ 
          try{
               conn.close();
          }catch(SQLException ex){
               ex.printStackTrace(System.out);
          }
          
     }
     
     
}