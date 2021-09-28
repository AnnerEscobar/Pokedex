package Metodos;

import Conexion.Conexion;
import Datos.ModeloPokemon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TraerInfo {

     ModeloPokemon model = new ModeloPokemon();
     
     
     
     public List<ModeloPokemon> TraerInformacion(int contador) {
         
          List<ModeloPokemon> ListaPokemon = new ArrayList<ModeloPokemon>();
          Connection conn = null;
          PreparedStatement stmt = null;
          ResultSet rs = null;

          try {
               
               String sql = "select *from pokemon where id=" + (contador + 1);
               conn = Conexion.OpenConection();
               stmt = conn.prepareStatement(sql);
               rs = stmt.executeQuery();

               if(rs.next()) {
                    
                    model.setId(rs.getInt(1));
                    model.setName(rs.getString(2));
                    model.setHeight(rs.getString(10));
                    model.setWeight(rs.getString(11));
                    model.setSpecies(rs.getString(12));
                    model.setColor(rs.getString(13));
                    model.setHabitat(rs.getString(15));
                    model.setBase_experience(rs.getString(18));
                   

               }else{
                    
                    model.setId(model.getId());
                    model.setName("NO TENGO INFORAMCION");
                    model.setHeight("***");
                    model.setWeight("***");
                    model.setSpecies("***");
                    model.setColor("***");
                    model.setHabitat("***");
                    model.setBase_experience("***");
                     
               }
                ListaPokemon.add(model);
             
               System.out.println(model.getName());
          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex + "No se pudo desplegar tu informacion");
          } finally {
               Conexion.CloseConection(stmt);
               Conexion.CloseConection(conn);
               Conexion.CloseConection(rs);
          }
          return ListaPokemon;
     }

     
      public void asignar(JLabel Lnombre, JLabel Laltura, JLabel Lpeso, JLabel Lespecie, JLabel Lcolor, JLabel Lhabitad, JLabel Lexperiencia, JLabel Lid) {

          Lnombre.setText(model.getName());
          Laltura.setText(model.getHeight());
          Lpeso.setText(model.getWeight());
          Lespecie.setText(model.getSpecies());
          Lcolor.setText(model.getColor());
          Lhabitad.setText(model.getHabitat());
          Lexperiencia.setText(model.getBase_experience());
          Lid.setText(String.valueOf(model.getId()));

     }
      
      
      
}
