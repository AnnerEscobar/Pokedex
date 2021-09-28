/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author anner
 */
public class ModeloUsuarios {

     private int correlativo;
     private String nombres;
     private String apellidos;
     private String correo;
     private String username;
     private String password;
     private String confirmpass;

     public int getCorrelativo() {
          return correlativo;
     }

     public void setCorrelativo(int correlativo) {
          this.correlativo = correlativo;
     }

     public String getNombres() {
          return nombres;
     }

     public void setNombres(String nombres) {
          this.nombres = nombres;
     }

     public String getApellidos() {
          return apellidos;
     }

     public void setApellidos(String apellidos) {
          this.apellidos = apellidos;
     }

     public String getCorreo() {
          return correo;
     }

     public void setCorreo(String correo) {
          this.correo = correo;
     }

     public String getUsername() {
          return username;
     }

     public void setUsername(String username) {
          this.username = username;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public String getConfirmpass() {
          return confirmpass;
     }

     public void setConfirmpass(String confirmpass) {
          this.confirmpass = confirmpass;
     }
     
}
