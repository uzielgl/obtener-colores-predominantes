/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colorespredominantes;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class GUIColoresImagen extends javax.swing.JFrame {
    private EscalarImagen escalarImagen;
    private EscalarImagen escalarImagen2;
    public BufferedImage imagen;
    public BufferedImage imagen2;
    /**
     * Creates new form GUIColoresImagen
     */
    public GUIColoresImagen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DireccionImagenTextField = new javax.swing.JTextField();
        ColoresPanel = new javax.swing.JPanel();
        ColorPanel1 = new javax.swing.JPanel();
        ColorPanel2 = new javax.swing.JPanel();
        ColorPanel3 = new javax.swing.JPanel();
        ColorPanel4 = new javax.swing.JPanel();
        ColorPanel5 = new javax.swing.JPanel();
        ObtenerColoresButton = new javax.swing.JButton();
        ImagenPanel = new javax.swing.JPanel();
        CargarImagenButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout ColorPanel1Layout = new javax.swing.GroupLayout(ColorPanel1);
        ColorPanel1.setLayout(ColorPanel1Layout);
        ColorPanel1Layout.setHorizontalGroup(
            ColorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ColorPanel1Layout.setVerticalGroup(
            ColorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ColorPanel2Layout = new javax.swing.GroupLayout(ColorPanel2);
        ColorPanel2.setLayout(ColorPanel2Layout);
        ColorPanel2Layout.setHorizontalGroup(
            ColorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ColorPanel2Layout.setVerticalGroup(
            ColorPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ColorPanel3Layout = new javax.swing.GroupLayout(ColorPanel3);
        ColorPanel3.setLayout(ColorPanel3Layout);
        ColorPanel3Layout.setHorizontalGroup(
            ColorPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ColorPanel3Layout.setVerticalGroup(
            ColorPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ColorPanel4Layout = new javax.swing.GroupLayout(ColorPanel4);
        ColorPanel4.setLayout(ColorPanel4Layout);
        ColorPanel4Layout.setHorizontalGroup(
            ColorPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ColorPanel4Layout.setVerticalGroup(
            ColorPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ColorPanel5Layout = new javax.swing.GroupLayout(ColorPanel5);
        ColorPanel5.setLayout(ColorPanel5Layout);
        ColorPanel5Layout.setHorizontalGroup(
            ColorPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ColorPanel5Layout.setVerticalGroup(
            ColorPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ColoresPanelLayout = new javax.swing.GroupLayout(ColoresPanel);
        ColoresPanel.setLayout(ColoresPanelLayout);
        ColoresPanelLayout.setHorizontalGroup(
            ColoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColoresPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ColoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ColorPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ColorPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ColorPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ColorPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ColorPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ColoresPanelLayout.setVerticalGroup(
            ColoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ColoresPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ColorPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ColorPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ColorPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ColorPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ColorPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        ObtenerColoresButton.setText("Obtener Colores");
        ObtenerColoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObtenerColoresButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ImagenPanelLayout = new javax.swing.GroupLayout(ImagenPanel);
        ImagenPanel.setLayout(ImagenPanelLayout);
        ImagenPanelLayout.setHorizontalGroup(
            ImagenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImagenPanelLayout.setVerticalGroup(
            ImagenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        CargarImagenButton.setText("Cargar Imagen");
        CargarImagenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarImagenButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DireccionImagenTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(CargarImagenButton))
                    .addComponent(ImagenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ColoresPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ObtenerColoresButton)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DireccionImagenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CargarImagenButton)
                    .addComponent(ObtenerColoresButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ColoresPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ImagenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarImagenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarImagenButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de imagen: (.jpg, .JPG, .png, .PNG)", "jpg", "JPG", "png", "PNG"));
        int seleccion = fileChooser.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File fileImagen = fileChooser.getSelectedFile();
            DireccionImagenTextField.setText(fileImagen.toString());
            try {
                imagen = ImageIO.read(fileImagen);
                if (imagen.getHeight() < 2000 || imagen.getWidth() < 2000){
                    if(imagen.getHeight() < 600 && imagen.getWidth() < 600){
                        ImagenPanel.removeAll();
                        ImagenPanel.setBorder(new PintarImagen(imagen));
                    }
                    else{
                        escalarImagen = new EscalarImagen(imagen);
                        ImagenPanel.add(escalarImagen);
                        escalarImagen.escalar(3);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "La imagen supera el tamaño máximo");
                    DireccionImagenTextField.setText("");
                }
            } catch (IOException ex) {
                Logger.getLogger(GUIColoresImagen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CargarImagenButtonActionPerformed

    private void ObtenerColoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObtenerColoresButtonActionPerformed
        // TODO add your handling code here:
//        escalarImagen2 = new EscalarImagen(imagen);
//        imagen2 = escalarImagen2.escalarIm();
//        System.out.println("Width de la imagen original: " + +imagen.getWidth());
//        System.out.println("Width de la imagen renderizada: " + imagen2.getWidth());
//        System.out.println("Height de la imagen original: " + imagen.getHeight());
//        System.out.println("Height de la imagen renderizada: " + imagen2.getWidth());
        List<Punto> puntos = getArrayPixels( imagen );
        List<Punto> centroides = BuscadorKMeans.buscarKCentroides(puntos, 5, .5);
        showColors( centroides );
    }//GEN-LAST:event_ObtenerColoresButtonActionPerformed

    public void showColors( List<Punto> centroides ){
        List<Color> colores = new ArrayList<Color>();
        for( Punto p : centroides){
            Color col = new Color(p.x, p.y, p.z);
            colores.add( col );
        }
        ColorPanel1.setBackground(colores.get(0));
        ColorPanel2.setBackground(colores.get(1));
        ColorPanel3.setBackground(colores.get(2));
        ColorPanel4.setBackground(colores.get(3));
        ColorPanel5.setBackground(colores.get(4));
//        System.out.println( colores.get(0) );
//        System.out.println( colores.get(1) );
//        System.out.println( colores.get(2) );
//        System.out.println( colores.get(3) );
//        System.out.println( colores.get(4) );
    }
    
     public List<Punto> getArrayPixels( BufferedImage image ){
        byte[] pixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        List<Punto> puntos = new ArrayList<Punto>();
        int pixel;
        int red;
        int green;
        int blue;
        
        //System.out.println( pixels.length );
        //System.out.println(     image.getRGB(0,0) );
        
        //int pixel = image.getRGB(0, image.getHeight() );
       //La imagen debemos de redimensionarla a 200 x 200
         
        for(int i = 0; i < image.getWidth(); i++){
           for(int j = 0; j < image.getHeight(); j++){
               pixel = image.getRGB(i, j);
               red = (pixel >> 16) & 0xFF;
               green = (pixel >> 8) & 0xFF;
               blue = pixel & 0xFF;
               puntos.add( new Punto(red, green, blue) );
           }
        }
          
        return puntos;
    }
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
            java.util.logging.Logger.getLogger(GUIColoresImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIColoresImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIColoresImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIColoresImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIColoresImagen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarImagenButton;
    private javax.swing.JPanel ColorPanel1;
    private javax.swing.JPanel ColorPanel2;
    private javax.swing.JPanel ColorPanel3;
    private javax.swing.JPanel ColorPanel4;
    private javax.swing.JPanel ColorPanel5;
    private javax.swing.JPanel ColoresPanel;
    private javax.swing.JTextField DireccionImagenTextField;
    private javax.swing.JPanel ImagenPanel;
    private javax.swing.JButton ObtenerColoresButton;
    // End of variables declaration//GEN-END:variables
}
