
package expertos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;
import net.sf.clipsrules.jni.MultifieldValue;


public class interfaz extends javax.swing.JFrame {
    
    private final Environment clips;

    public interfaz() {
        
       initComponents();
       clips= new Environment ();
       clips.load("reglas.CLP");
       this.setResizable(false);
       this.setLocationRelativeTo(null);
       this.setIconImage (new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel_numero = new javax.swing.JLabel();
        jlabel_lugar = new javax.swing.JLabel();
        jcb_zona = new javax.swing.JComboBox<>();
        jcb_numper = new javax.swing.JComboBox<>();
        jcb_tipor = new javax.swing.JComboBox<>();
        jlabel_tipo = new javax.swing.JLabel();
        jlabel_recomendar = new javax.swing.JButton();
        jlabel_titulo = new javax.swing.JLabel();
        jLabel_casos = new javax.swing.JLabel();
        jcb_casos = new javax.swing.JComboBox<>();
        jlabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Posibilidad de contagio en una reunión");
        setBackground(new java.awt.Color(51, 51, 255));
        setForeground(new java.awt.Color(51, 51, 255));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_numero.setBackground(new java.awt.Color(0, 0, 0));
        jlabel_numero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_numero.setForeground(new java.awt.Color(51, 0, 51));
        jlabel_numero.setText("Número de personas:");
        getContentPane().add(jlabel_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 30));

        jlabel_lugar.setBackground(new java.awt.Color(0, 0, 102));
        jlabel_lugar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_lugar.setForeground(new java.awt.Color(51, 0, 51));
        jlabel_lugar.setText("Tipo de Lugar :");
        getContentPane().add(jlabel_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, -1));

        jcb_zona.setBackground(new java.awt.Color(0, 0, 102));
        jcb_zona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcb_zona.setForeground(new java.awt.Color(255, 255, 255));
        jcb_zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Zona_Abierta", "Zona_Cerrada" }));
        jcb_zona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_zonaActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_zona, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 54, 160, -1));

        jcb_numper.setBackground(new java.awt.Color(0, 0, 153));
        jcb_numper.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcb_numper.setForeground(new java.awt.Color(255, 255, 255));
        jcb_numper.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "1_10_Personas", "11_20_Personas", "Mas_20_Personas" }));
        getContentPane().add(jcb_numper, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 117, 160, -1));

        jcb_tipor.setBackground(new java.awt.Color(0, 0, 102));
        jcb_tipor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcb_tipor.setForeground(new java.awt.Color(255, 255, 255));
        jcb_tipor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Familiar", "Laboral", "Amigos", "De_Desconocidos" }));
        getContentPane().add(jcb_tipor, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 171, 160, -1));

        jlabel_tipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_tipo.setForeground(new java.awt.Color(51, 0, 51));
        jlabel_tipo.setText("Tipo de Reunión:");
        getContentPane().add(jlabel_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jlabel_recomendar.setBackground(new java.awt.Color(0, 204, 255));
        jlabel_recomendar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel_recomendar.setForeground(new java.awt.Color(51, 0, 51));
        jlabel_recomendar.setText("CONSULTAR");
        jlabel_recomendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlabel_recomendarActionPerformed(evt);
            }
        });
        getContentPane().add(jlabel_recomendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        jlabel_titulo.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_titulo.setForeground(new java.awt.Color(255, 51, 51));
        jlabel_titulo.setText("Probabilidad de Contagio en una reunión");
        getContentPane().add(jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 390, 40));

        jLabel_casos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel_casos.setForeground(new java.awt.Color(51, 0, 51));
        jLabel_casos.setText("El anfitrión tuvo casos de COVID recientes en su núcleo familiar: ");
        getContentPane().add(jLabel_casos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 540, 40));

        jcb_casos.setBackground(new java.awt.Color(0, 0, 102));
        jcb_casos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcb_casos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Si", "No" }));
        getContentPane().add(jcb_casos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 160, 30));

        jlabel_fondo.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_fondo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabel_fondo.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/covid2.jpg"))); // NOI18N
        getContentPane().add(jlabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void jlabel_recomendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlabel_recomendarActionPerformed
        // TODO add your handling code here:
        
        
        String zona,numper,tipor,casos,hecho = "";
        
        zona=jcb_zona.getSelectedItem().toString().toLowerCase();
        numper=jcb_numper.getSelectedItem().toString().toLowerCase();
        tipor=jcb_tipor.getSelectedItem().toString().toLowerCase();
        casos=jcb_casos.getSelectedItem().toString().toLowerCase();
        
        if((zona.equalsIgnoreCase("Seleccione una opción"))||(numper.equalsIgnoreCase("Seleccione una opción"))||(tipor.equalsIgnoreCase("Seleccione una opción"))||(casos.equalsIgnoreCase("Seleccione una opción"))){
            
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "Incompleto", JOptionPane.WARNING_MESSAGE);
            clear(zona,numper,tipor,casos);
        
        }else{
         hecho = "(assert (peligro_reunion(zona " + zona + ")(num_personas " + numper +")(tipo_de_reunion " + tipor + ")(familia_cont " + casos + ")))";    
        clips.eval(hecho);
        clips.run();        
        String evaluador = "(find-all-facts ((?m probabilidad)) TRUE)";
        
        FactAddressValue fv = (FactAddressValue) ((MultifieldValue) clips.eval(evaluador)).get(0);
        
        try {
            String msj = fv.getFactSlot("mensaje").toString();
            JOptionPane.showMessageDialog(null, msj);
            jcb_casos.setSelectedIndex(0);
            jcb_tipor.setSelectedIndex(0);
            jcb_zona.setSelectedIndex(0);
            jcb_numper.setSelectedIndex(0);
            clips.reset();
        } catch (Exception e) {
            
        }
            
        }


    }//GEN-LAST:event_jlabel_recomendarActionPerformed

    private void jcb_zonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_zonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_zonaActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new interfaz().setVisible(true);
        });
        
    }
    
    public void clear(String zona, String numper, String tipo, String casos){
            zona = "";
            numper="";
            tipo="";
            casos="";
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_casos;
    private javax.swing.JComboBox<String> jcb_casos;
    private javax.swing.JComboBox<String> jcb_numper;
    private javax.swing.JComboBox<String> jcb_tipor;
    public javax.swing.JComboBox<String> jcb_zona;
    private javax.swing.JLabel jlabel_fondo;
    private javax.swing.JLabel jlabel_lugar;
    private javax.swing.JLabel jlabel_numero;
    private javax.swing.JButton jlabel_recomendar;
    private javax.swing.JLabel jlabel_tipo;
    private javax.swing.JLabel jlabel_titulo;
    // End of variables declaration//GEN-END:variables
}
