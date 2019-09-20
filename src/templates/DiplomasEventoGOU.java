package templates;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.*;
import static java.lang.System.exit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.net.MalformedURLException;
import org.apache.batik.transcoder.image.PNGTranscoder;
import java.nio.file.Paths;
import java.util.Scanner;
import org.apache.batik.ext.awt.image.codec.png.PNGRegistryEntry;
import org.apache.batik.ext.awt.image.spi.ImageTagRegistry;
import org.apache.batik.transcoder.Transcoder;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.image.JPEGTranscoder;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.TIFFTranscoder;
import org.apache.fop.svg.PDFTranscoder;

public class DiplomasEventoGOU extends javax.swing.JFrame {

    public DiplomasEventoGOU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre Completo:");

        jLabel2.setText("Cargo:");

        jLabel3.setText("Celular:");

        jLabel4.setText("Email GOU:");

        jLabel5.setText("Email Personal:");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.setDefaultCapable(false);
        jButton2.setSelected(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                                .addComponent(jTextField5))))
                        .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2))
                        .addGap(52, 52, 52))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{jTextField1, jTextField2, jTextField3, jTextField4, jTextField5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Freemarker configuration object
        SimpleDateFormat sdf;
        Calendar c;
        Template template = null;
        Configuration cfg = new Configuration();

        final ImageTagRegistry registry = ImageTagRegistry.getRegistry();
        registry.register(new PNGRegistryEntry());

        try {
            // Build the data-model
            // pasar datos del formulario al template
            Map<String, Object> data = new HashMap<>();
            String nombre = jTextField1.getText();
            String cargo = jTextField2.getText();
            String celular = jTextField3.getText();
            String emailgou = jTextField4.getText();
            String emailpersonal = jTextField5.getText();

          //  template = cfg.getTemplate("src/tarjetasGOU.svg");
            template = cfg.getTemplate("src/diplomaEvento.svg");
            //template = cfg.getTemplate("src/tarjeta1.svg");

            Scanner scan = new Scanner(new File("src/tarjetasGOU.csv"));
            Integer i = 0;
            while (scan.hasNextLine()) {
                i++;
                String line = scan.nextLine();
                String[] lineArray = line.split(",");

                nombre = lineArray[0];
                cargo = lineArray[1];
                celular = lineArray[2];
                emailgou = lineArray[3];
                emailpersonal = lineArray[4];

                data.put("nombre", nombre);
//                data.put("cargo", cargo);
//                data.put("celular", celular);
//                data.put("emailgou", emailgou);
//                data.put("emailpersonal", emailpersonal);

                // Console output
                Writer out = new OutputStreamWriter(System.out);

                template.process(data, out);
                out.flush();
                String archivoSVG = "src/Diploma_" + i.toString() + "(" + nombre + ").svg";
                String archivoPNG = "src/Diploma_" + i.toString() + "(" + nombre + ").png";
                String archivoPDF = "src/Diploma_" + i.toString() + "(" + nombre + ").pdf";

                try (Writer file = new FileWriter(new File(archivoSVG))) {
                    template.process(data, file);
                    file.flush();
//*****************************************************************************************************
                    // set up the svg input
                    File svgFile = new File(archivoSVG);
                    String svgURI = svgFile.toURI().toString();
                    TranscoderInput svgInputFile = new TranscoderInput(svgURI);

//                    OutputStream outstream = new FileOutputStream(archivoPNG);
//                    BufferedOutputStream bos = new BufferedOutputStream(outstream);
//                    TranscoderOutput output = new TranscoderOutput(bos);
//
//                    String imageType = "XXXXX";
//                    if ("PNG".equals(imageType)) {
//                        // write as png
//                        Transcoder pngTranscoder = new PNGTranscoder();
//                        pngTranscoder.addTranscodingHint(PNGTranscoder.KEY_PIXEL_UNIT_TO_MILLIMETER, new Float(0.084666f));
//                        try {
//                            pngTranscoder.transcode(svgInputFile, output);
//                        } catch (TranscoderException ex) {
//                            Logger.getLogger(DiplomasEventoGOU.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    } else if ("JPEG".equals(imageType)) {
//                        // write as jpeg
//                        Transcoder jpegTranscoder = new JPEGTranscoder();
//                        jpegTranscoder.addTranscodingHint(JPEGTranscoder.KEY_QUALITY, new Float(1.0));
//                        try {
//                            jpegTranscoder.transcode(svgInputFile, output);
//                        } catch (TranscoderException ex) {
//                            Logger.getLogger(DiplomasEventoGOU.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    } else if ("TIFF".equals(imageType)) {
//                        // write as tiff
//                        Transcoder tiffTranscoder = new TIFFTranscoder();
//                        tiffTranscoder.addTranscodingHint(TIFFTranscoder.KEY_PIXEL_UNIT_TO_MILLIMETER, new Float(25F / 300f));
//                        tiffTranscoder.addTranscodingHint(TIFFTranscoder.KEY_FORCE_TRANSPARENT_WHITE, true);
//                        try {
//                            tiffTranscoder.transcode(svgInputFile, output);
//                        } catch (TranscoderException ex) {
//                            Logger.getLogger(DiplomasEventoGOU.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    } else if ("PDF".equals(imageType)) {
//                        // write as pdf
//                        Transcoder pdfTranscoder = new PDFTranscoder();
//                        pdfTranscoder.addTranscodingHint(PDFTranscoder.KEY_PIXEL_UNIT_TO_MILLIMETER, new Float(0.084666f));
//                        try {
//                            pdfTranscoder.transcode(svgInputFile, output);
//                        } catch (TranscoderException ex) {
//                            Logger.getLogger(DiplomasEventoGOU.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    } else {
//                        System.out.println("imageType mal definido el tipo de imagen");
//                        System.exit(1);
//                    }
                    //close the stream
//                    outstream.flush();
//                    outstream.close();
//                    bos.close();
//*****************************************************************************************************                    

                    //PNGTranscoder t = new PNGTranscoder() ;
                    //t.createImage(3155, 1973);
/*                    JPEGTranscoder trans = new JPEGTranscoder();
                    trans.addTranscodingHint(JPEGTranscoder.KEY_QUALITY, (float) .95);
                    String svgURI = new File(archivoSVG).toURL().toString();
                    TranscoderInput input = new TranscoderInput(svgURI);

                    OutputStream ostream = new FileOutputStream(archivoPNG);
                    TranscoderOutput output = new TranscoderOutput(ostream);

                    /*
                     JPEGTranscoder t = new JPEGTranscoder();
                     // Set the transcoding hints.
                     t.addTranscodingHint(JPEGTranscoder.KEY_QUALITY, new Float(.95));

                     TranscoderInput input = new TranscoderInput(new FileInputStream(archivoSVG));
                     OutputStream ostream = new FileOutputStream(archivoPNG);
                     TranscoderOutput output = new TranscoderOutput(ostream);
                     //t.addTranscodingHint(PNGTranscoder.KEY_WIDTH, (float) scaledSize.getX());
                     //t.addTranscodingHint(PNGTranscoder.KEY_HEIGHT, (float) scaledSize.getY());
                     //t.addTranscodingHint(PNGTranscoder.KEY_PIXEL_UNIT_TO_MILLIMETER, 25.4f / 200.0f);

                     // Create a JPEG transcoder
                     // Create the transcoder input.
                     //         FileOutputStream filePNG = new FileOutputStream(new File(archivoPNG));
                     //         TranscoderInput input = new TranscoderInput(new File(archivoSVG).toURI().toString());
                     // FileWriter ostream = new FileWriter(new File(archivoPNG));
                     //         TranscoderOutput output = new TranscoderOutput(filePNG);
                     // Create the transcoder output.
                     //OutputStream ostream = new FileOutputStream(archivoJPEG);
                     //TranscoderOutput output = new TranscoderOutput(ostream);
                   
                    try {
                        // Save the image.
                        trans.transcode(input, output);

                    } catch (TranscoderException ex) {
                        Logger.getLogger(TarjetasGOU.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     */
                    // Flush and close the stream.
                    //        filePNG.flush();
                    //        filePNG.close();
                    /*                   ostream.flush();
                    ostream.close();
                     */
                }
            }
            //svg_URI_input = Paths.get(archivoSVG).toUri().toURL().toString();
//svg2png(archivoSVG);
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
      System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public String svg2png(String archivoSVG) {
        String svg_URI_input = null;
        try {
            try {
                svg_URI_input = Paths.get(archivoSVG).toUri().toURL().toString();

            } catch (MalformedURLException ex) {
                Logger.getLogger(DiplomasEventoGOU.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            TranscoderInput input_svg_image = new TranscoderInput(svg_URI_input);
            OutputStream png_ostream = new FileOutputStream(archivoSVG + ".png");
            TranscoderOutput output_png_image = new TranscoderOutput(png_ostream);

            try {
                PNGTranscoder my_converter = new PNGTranscoder();
                // Step-4: Convert and Write output
                my_converter.transcode(input_svg_image, output_png_image);

            } catch (TranscoderException ex) {
                Logger.getLogger(DiplomasEventoGOU.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
            try {
                // Step 5- close / flush Output Stream
                png_ostream.flush();

            } catch (IOException ex) {
                Logger.getLogger(DiplomasEventoGOU.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DiplomasEventoGOU.class
                    .getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

    public String readFile(String archivo) {

        File file = new File(archivo);
        FileInputStream fis;
        try {
            byte[] byteArray = new byte[102400];
            fis = new FileInputStream(file);
            int bytesRead;
            while ((bytesRead = fis.read(byteArray)) != -1) {
                String str = new String(byteArray, 0, bytesRead);
                String base64String = Base64.encode(byteArray);

                System.out.println(base64String);
                //writeFile(base64String);
                return (base64String);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ("");
    }

    private String elegirArchivo() {

        //Crear un objeto FileChooser
        JFileChooser fc = new JFileChooser();
        //Creamos el filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagen jpeg ", "jpg", "jpeg", "JPG", "JPEG");
        //FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.JPG","jpg", "*.JPEG", "*.jpeg");
        //Le indicamos el filtro
        fc.setFileFilter(filtro);
        //Mostrar la ventana para abrir archivo y recoger la respuesta
        //En el parámetro del showOpenDialog se indica la ventana
        //  al que estará asociado. Con el valor this se asocia a la
        //  ventana que la abre.
        int respuesta = fc.showOpenDialog(this);
        //Comprobar si se ha pulsado Aceptar
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            try {
                //Crear un objeto File con el archivo elegido
                File archivoElegido = fc.getSelectedFile();
                //Mostrar el nombre del archvivo en un campo de texto
                return (archivoElegido.getCanonicalPath());
            } catch (IOException ex) {
            }
        }
        return "";
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DiplomasEventoGOU.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiplomasEventoGOU.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiplomasEventoGOU.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiplomasEventoGOU.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DiplomasEventoGOU().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
