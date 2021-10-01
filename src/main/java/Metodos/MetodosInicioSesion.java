package Metodos;

import Conexion.Conexion;
import Datos.ModeloUsuarios;
import Graficos.Consola;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class MetodosInicioSesion {

     public boolean ValidarCorreo(String email) {
          boolean verific = false;

          Pattern pattern = Pattern
                  .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                          + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

          Matcher mather = pattern.matcher(email);
          if (mather.find() == true) {
               verific = true;

          } else {
               JOptionPane.showMessageDialog(null, "El correo no es valido");
          }
          return verific;
     }

     
     
     public boolean CompararPass(String pass1, String pass2) {
          boolean verific = false;

          if (pass1.equals(pass2) == true) {
               verific = true;
          } else {
               JOptionPane.showMessageDialog(null, "Las contraenias no son iguales");
          }

          return verific;
     }
     
     

     public String Encriptador(String palabra, int Llave) {

          String Ascci = "";
          int codificador = 0;

          for (int x = 0; x < palabra.length(); x++) {

               codificador = (int) palabra.charAt(x);
               codificador = codificador + Llave;

               char caracter = (char) codificador;
               Ascci = Ascci + caracter;
          }
          return Ascci;
     }

     public boolean registrar(ModeloUsuarios modelo) {
          Connection conn = null;
          PreparedStatement stmt = null;
          boolean correcto = false;

          String Insert = "Insert into tb_usuarios (nombres, apellidos, correo, username, password, confirmpass, telefono) values (?,?,?,?,?,?,?)";

          try {
               conn = Conexion.OpenConection();
               stmt = conn.prepareStatement(Insert);

               stmt.setString(1, modelo.getNombres());
               stmt.setString(2, modelo.getApellidos());
               stmt.setString(3, modelo.getCorreo());
               stmt.setString(5, modelo.getPassword());
               stmt.setString(6, modelo.getConfirmpass());
               stmt.execute();

               correcto = true;
          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, " No puedes dejar campos vacios ");
          } finally {
               Conexion.CloseConection(stmt);
               Conexion.CloseConection(conn);

          }
          return correcto;
     }

     public boolean Verificar(String usuario, String pass) {
          Connection conn = null;
          PreparedStatement stmt = null;
          ResultSet rs = null;
          boolean correcto = false;
          String sql = "select *from tb_usuarios where username = '" + usuario + "'and password = '" + pass + "' ";

          try {
               conn = Conexion.OpenConection();
               stmt = conn.prepareStatement(sql);
               rs = stmt.executeQuery();

               if (rs.next()) {
                    correcto = true;
                    if (correcto = true) {
                         Consola form = new Consola();
                         form.setVisible(true);
                    }
               } else {
                    JOptionPane.showMessageDialog(null, "Error, el usuario no existe o escribiste mal");

               }

          } catch (SQLException ex) {
               ex.printStackTrace(System.out);
          } finally {
               Conexion.CloseConection(stmt);
               Conexion.CloseConection(rs);
               Conexion.CloseConection(conn);
          }
          return correcto;

     }
}
