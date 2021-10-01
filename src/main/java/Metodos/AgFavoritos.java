
package Metodos;

import Conexion.Conexion;
import Datos.ModeloPokemon;
import Datos.ModeloUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AgFavoritos {
     
      public boolean FavoritosAg(ModeloPokemon modelo1, ModeloUsuarios modelo2) {
          Connection conn = null;
          PreparedStatement stmt = null;
          boolean correcto = false;

          String Insert = "Insert into favoritos (idPokemon, usuario) values(?,?)";

          try {
               conn = Conexion.OpenConection();
               stmt = conn.prepareStatement(Insert);

               stmt.setInt(1, modelo1.getId());
               stmt.setString(2, modelo2.getCorreo());
               stmt.execute();
               correcto = true;
          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex + "No se agrego a favoritos");
          } finally {
               Conexion.CloseConection(stmt);
               Conexion.CloseConection(conn);

          }
          return correcto;
     }
     
     
}
