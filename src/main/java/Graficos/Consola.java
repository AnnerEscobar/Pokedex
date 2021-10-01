package Graficos;

import Datos.ModeloPokemon;
import Datos.ModeloUsuarios;
import Metodos.AgFavoritos;
import Metodos.TraerInfo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Consola extends javax.swing.JFrame {

     TraerInfo metodo = new TraerInfo();
     ModeloPokemon m = new ModeloPokemon();
     ModeloUsuarios  mu = new ModeloUsuarios();
     AgFavoritos g = new AgFavoritos();
     
     int contador = 0;
     BufferedImage buffer1 = null;
     Image imagen1 = null;

     public void paint(Graphics g) {
          super.paintComponents(g);
          Graphics2D g2 = (Graphics2D) PokemonImagen.getGraphics();

          g2.drawImage(buffer1, 0, 0, PokemonImagen.getWidth(), PokemonImagen.getHeight(), null);

     }

     public Consola() {
          initComponents();
          Imagen();

     }

     public void Imagen() {
          try {
               //imagen1 = ImageIO.read(getClass().getResource("/imagenes/back-white.png"));
               imagen1 = ImageIO.read(new File("C:\\Users\\anner\\Desktop\\datos\\imagenes\\black-white.png"));
          } catch (IOException ex) {
               ex.printStackTrace(System.out);
          }

          buffer1 = (BufferedImage) PokemonImagen.createImage(
                  PokemonImagen.getWidth(),
                  PokemonImagen.getHeight());

          Graphics2D g2 = buffer1.createGraphics();

          dibujaElPokemonQueEstaEnLaPosicion(30);
     }

     private void dibujaElPokemonQueEstaEnLaPosicion(int posicion) {
          int fila = posicion / 31;
          int columna = posicion % 31;

          Graphics2D g2 = (Graphics2D) buffer1.getGraphics();
          g2.setColor(Color.black);

          g2.fillRect(0, 0, //pinta el fondo del jpanel negro
                  PokemonImagen.getWidth(),
                  PokemonImagen.getHeight());

          g2.drawImage(imagen1,
                  0, //posicion X inicial dentro del jpanel 
                  0, // posicion Y inicial dentro del jpanel
                  PokemonImagen.getWidth(), //ancho del jpanel
                  PokemonImagen.getHeight(), //alto del jpanel
                  columna * 96, //posicion inicial X dentro de la imagen de todos los pokemon
                  fila * 96, //posicion inicial Y dentro de la imagen de todos los pokemon
                  columna * 96 + 96, //posicion final X
                  fila * 96 + 96, //posicion final Y
                  null //si no lo pones no va
          );

          repaint();

     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          Laltura = new javax.swing.JLabel();
          Lnombre = new javax.swing.JLabel();
          Lpeso = new javax.swing.JLabel();
          Lespecie = new javax.swing.JLabel();
          Lcolor = new javax.swing.JLabel();
          Lhabitad = new javax.swing.JLabel();
          Lexperiencia = new javax.swing.JLabel();
          btnInciar = new javax.swing.JButton();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          PokemonImagen = new javax.swing.JPanel();
          Lid = new javax.swing.JLabel();
          btnRetroceder = new javax.swing.JButton();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          jComboBox1 = new javax.swing.JComboBox<>();
          RaFavoritos = new javax.swing.JRadioButton();
          fondo = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          Laltura.setText("***");
          getContentPane().add(Laltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

          Lnombre.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
          Lnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          Lnombre.setText("Nombre");
          getContentPane().add(Lnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 260, 30));

          Lpeso.setText("***");
          getContentPane().add(Lpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

          Lespecie.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
          Lespecie.setText("especie");
          getContentPane().add(Lespecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 70, 20));

          Lcolor.setText("***");
          getContentPane().add(Lcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

          Lhabitad.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
          Lhabitad.setText("habitad");
          getContentPane().add(Lhabitad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 60, 20));

          Lexperiencia.setText("***");
          getContentPane().add(Lexperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

          btnInciar.setText("==>");
          btnInciar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnInciarActionPerformed(evt);
               }
          });
          getContentPane().add(btnInciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

          jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
          jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel1.setText("LIBRAS");
          getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 50, 20));

          jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
          jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel2.setText("COLOR");
          getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 40, 20));

          jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
          jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel3.setText("PIES");
          getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 40));

          jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
          jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel4.setText("XP");
          getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 40, 20));

          PokemonImagen.setBackground(new java.awt.Color(255, 255, 255));

          javax.swing.GroupLayout PokemonImagenLayout = new javax.swing.GroupLayout(PokemonImagen);
          PokemonImagen.setLayout(PokemonImagenLayout);
          PokemonImagenLayout.setHorizontalGroup(
               PokemonImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 230, Short.MAX_VALUE)
          );
          PokemonImagenLayout.setVerticalGroup(
               PokemonImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 110, Short.MAX_VALUE)
          );

          getContentPane().add(PokemonImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 230, 110));

          Lid.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
          Lid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          Lid.setText("*");
          getContentPane().add(Lid, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 30, 20));

          btnRetroceder.setText("<==");
          btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRetrocederActionPerformed(evt);
               }
          });
          getContentPane().add(btnRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

          jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
          jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel5.setText("+");
          jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel5MouseClicked(evt);
               }
          });
          getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 351, 60, 60));

          jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
          jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel6.setText("FAVORITOS");
          getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 340, 90, -1));

          jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Rare", "Mountain", "rough terrain", "sea", "cave", "rough terrain", "grassland", "forest", "urban" }));
          getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 80, 30));

          RaFavoritos.setText("Favoritos");
          getContentPane().add(RaFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

          fondo.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
          fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\anner\\Desktop\\Universidad Mariano Galvez\\Cuarto Semestre\\Programacion II\\Homeworks\\MiniPokedex\\src\\main\\java\\Imagenes\\fondo1.1.png")); // NOI18N
          getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 480));

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void btnInciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInciarActionPerformed
          dibujaElPokemonQueEstaEnLaPosicion(contador);
          metodo.TraerInformacion(contador);
          metodo.asignar(Lnombre, Laltura, Lpeso, Lespecie, Lcolor, Lhabitad, Lexperiencia, Lid);
          contador++;

     }//GEN-LAST:event_btnInciarActionPerformed

     private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
          contador--;
          dibujaElPokemonQueEstaEnLaPosicion(contador);
          metodo.TraerInformacion(contador);
          metodo.asignar(Lnombre, Laltura, Lpeso, Lespecie, Lcolor, Lhabitad, Lexperiencia, Lid);
          //contador--;
     }//GEN-LAST:event_btnRetrocederActionPerformed

     private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
          // TODO add your handling code here:
        
          mu.setCorreo("annner@hotmail.com");
          m.setId(Integer.valueOf(Lid.getText()));
          g.FavoritosAg(m, mu);
     }//GEN-LAST:event_jLabel5MouseClicked

     /**
      * @param args the command line arguments
      */
     public static void main(String args[]) {
          /* Set the Nimbus look and feel */
          //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
          /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
           */
          try {
               for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                         javax.swing.UIManager.setLookAndFeel(info.getClassName());
                         break;
                    }
               }
          } catch (ClassNotFoundException ex) {
               java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new Consola().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JLabel Laltura;
     private javax.swing.JLabel Lcolor;
     private javax.swing.JLabel Lespecie;
     private javax.swing.JLabel Lexperiencia;
     private javax.swing.JLabel Lhabitad;
     private javax.swing.JLabel Lid;
     private javax.swing.JLabel Lnombre;
     private javax.swing.JLabel Lpeso;
     private javax.swing.JPanel PokemonImagen;
     private javax.swing.JRadioButton RaFavoritos;
     private javax.swing.JButton btnInciar;
     private javax.swing.JButton btnRetroceder;
     private javax.swing.JLabel fondo;
     private javax.swing.JComboBox<String> jComboBox1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     // End of variables declaration//GEN-END:variables
}
