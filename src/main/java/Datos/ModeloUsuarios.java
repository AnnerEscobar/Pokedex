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

     private int id;
     private String nombres;
     private String apellidos;
     private String correo;
     private String password;
     private String confirmpass;

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
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