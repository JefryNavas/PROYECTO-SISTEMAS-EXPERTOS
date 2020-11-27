
package expertos;


import javax.swing.ImageIcon;
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

        jlabel_licencia = new javax.swing.JLabel();
        jlabel_tipo = new javax.swing.JLabel();
        jcb_tipo = new javax.swing.JComboBox<>();
        jcb_licencia = new javax.swing.JComboBox<>();
        jcb_so = new javax.swing.JComboBox<>();
        jlabel_so = new javax.swing.JLabel();
        jlabel_recomendar = new javax.swing.JButton();
        jlabel_titulo = new javax.swing.JLabel();
        jl_recomendacion = new javax.swing.JLabel();
        jlabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recomendar Software");
        setBackground(new java.awt.Color(51, 51, 255));
        setForeground(new java.awt.Color(51, 51, 255));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlabel_licencia.setBackground(new java.awt.Color(0, 0, 0));
        jlabel_licencia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_licencia.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_licencia.setText("Licencia:");
        getContentPane().add(jlabel_licencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 90, 30));

        jlabel_tipo.setBackground(new java.awt.Color(0, 0, 102));
        jlabel_tipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_tipo.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_tipo.setText("Tipo Software:");
        getContentPane().add(jlabel_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, -1));

        jcb_tipo.setBackground(new java.awt.Color(0, 0, 102));
        jcb_tipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcb_tipo.setForeground(new java.awt.Color(255, 255, 255));
        jcb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software_matematico", "Arquitectura", "Sistema_experto", "Edicion_fotografica", "Edicion_vectorial", "Modelado_3d" }));
        getContentPane().add(jcb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 54, 138, -1));

        jcb_licencia.setBackground(new java.awt.Color(0, 0, 153));
        jcb_licencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcb_licencia.setForeground(new java.awt.Color(255, 255, 255));
        jcb_licencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Privativo", "GNU" }));
        getContentPane().add(jcb_licencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 117, 138, -1));

        jcb_so.setBackground(new java.awt.Color(0, 0, 102));
        jcb_so.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcb_so.setForeground(new java.awt.Color(255, 255, 255));
        jcb_so.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Windows", "Linux" }));
        getContentPane().add(jcb_so, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 171, 138, -1));

        jlabel_so.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_so.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_so.setText("Sistema Operativo:");
        getContentPane().add(jlabel_so, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jlabel_recomendar.setBackground(new java.awt.Color(0, 0, 153));
        jlabel_recomendar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel_recomendar.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_recomendar.setText("RECOMIENDAME");
        jlabel_recomendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlabel_recomendarActionPerformed(evt);
            }
        });
        getContentPane().add(jlabel_recomendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jlabel_titulo.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel_titulo.setForeground(new java.awt.Color(255, 51, 51));
        jlabel_titulo.setText("Recomendacion de Software");
        getContentPane().add(jlabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 260, 40));

        jl_recomendacion.setBackground(new java.awt.Color(51, 51, 255));
        jl_recomendacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_recomendacion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jl_recomendacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 390, 29));

        jlabel_fondo.setBackground(new java.awt.Color(255, 255, 255));
        jlabel_fondo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabel_fondo.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        getContentPane().add(jlabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -20, 530, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void jlabel_recomendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlabel_recomendarActionPerformed
        // TODO add your handling code here:
        String hecho,tipo,licencia,so,licencia2 = "";
        tipo=jcb_tipo.getSelectedItem().toString().toLowerCase();
        licencia=jcb_licencia.getSelectedItem().toString();
        so=jcb_so.getSelectedItem().toString().toLowerCase();
        if (licencia.equals("GNU")) {
            licencia2=licencia;
        }
        if (licencia.equals("Privativo")) {
            licencia2=licencia.toLowerCase();
        }
        hecho = "(assert (lenguaje-programacion(tipo " + tipo + ")(licencia " + licencia2 +")(so " + so + ")))";
        clips.eval(hecho);
        clips.run();        
        String evaluador = "(find-all-facts ((?m recomendacion)) TRUE)";
        
        FactAddressValue fv = (FactAddressValue) ((MultifieldValue) clips.eval(evaluador)).get(0);
        
        try {
            String msj = fv.getFactSlot("mensaje").toString();
            jl_recomendacion.setText(msj);
            clips.reset();
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jlabel_recomendarActionPerformed

    
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
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jcb_licencia;
    private javax.swing.JComboBox<String> jcb_so;
    public javax.swing.JComboBox<String> jcb_tipo;
    private javax.swing.JLabel jl_recomendacion;
    private javax.swing.JLabel jlabel_fondo;
    private javax.swing.JLabel jlabel_licencia;
    private javax.swing.JButton jlabel_recomendar;
    private javax.swing.JLabel jlabel_so;
    private javax.swing.JLabel jlabel_tipo;
    private javax.swing.JLabel jlabel_titulo;
    // End of variables declaration//GEN-END:variables
}
