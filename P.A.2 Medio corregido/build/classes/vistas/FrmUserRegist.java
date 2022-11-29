package vistas;

import iniciosesion.*;
import java.io.FileNotFoundException;
import principal.SoloLetras;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class FrmUserRegist extends javax.swing.JFrame {

    private JPlaceholderTextField textfield;

    public FrmUserRegist() {
        initComponents();
        this.setLocationRelativeTo(null);
        JcbGenero.addItem("Genero");
        JcbGenero.addItem("Masculino");
        JcbGenero.addItem("Femenino");
        JcbAlcaldia.addItem("Alcaldia");
        JcbAlcaldia.addItem("Azcapotzalco");
        JcbAlcaldia.addItem("Alvaro Obregon");
        JcbAlcaldia.addItem("Benito Juarez");
        JcbAlcaldia.addItem("Coyoacan");
        JcbAlcaldia.addItem("Cuajimalpa de Morelos");
        JcbAlcaldia.addItem("Cuauhtemoc");
        JcbAlcaldia.addItem("Gustavo A. Madero");
        JcbAlcaldia.addItem("Iztacalco");
        JcbAlcaldia.addItem("Iztapalapa");
        JcbAlcaldia.addItem("Magdalena Contreras");
        JcbAlcaldia.addItem("Miguel Hidalgo");
        JcbAlcaldia.addItem("Milpa Alta");
        JcbAlcaldia.addItem("Tlalpan");
        JcbAlcaldia.addItem("Tlahuac");
        JcbAlcaldia.addItem("Venustiano Carranza");
        JcbAlcaldia.addItem("Xochimilco");
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButtonNext = new javax.swing.JButton();
        txt_user = new vistas.JPlaceholderTextField("Usuario");
        jLabel17 = new javax.swing.JLabel();
        JcbAlcaldia = new javax.swing.JComboBox<>();
        JcbGenero = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new vistas.JPlaceholderTextField("Nombre");
        txt_pass = new vistas.JPlaceholderTextField("Contraseña");
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Usuario");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(202, 250, 238));
        jPanel3.setMinimumSize(new java.awt.Dimension(1200, 680));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1150, 630));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 630));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel16.setText("Ingresa un nombre de usuario:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jButtonNext.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/btnNext (1).png"))); // NOI18N
        jButtonNext.setBorder(null);
        jButtonNext.setBorderPainted(false);
        jButtonNext.setContentAreaFilled(false);
        jButtonNext.setFocusPainted(false);
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, -1, -1));

        txt_user.setBorder(null);
        txt_user.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_userKeyTyped(evt);
            }
        });
        jPanel2.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 460, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/txtNombre1.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        JcbAlcaldia.setBackground(new java.awt.Color(204, 204, 204));
        JcbAlcaldia.setToolTipText("Alcaldia");
        JcbAlcaldia.setBorder(null);
        JcbAlcaldia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JcbAlcaldiaItemStateChanged(evt);
            }
        });
        JcbAlcaldia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcbAlcaldiaActionPerformed(evt);
            }
        });
        jPanel2.add(JcbAlcaldia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 250, 40));

        JcbGenero.setBackground(new java.awt.Color(204, 204, 204));
        JcbGenero.setToolTipText("Genero");
        JcbGenero.setBorder(null);
        JcbGenero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JcbGeneroItemStateChanged(evt);
            }
        });
        JcbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcbGeneroActionPerformed(evt);
            }
        });
        jPanel2.add(JcbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 250, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/logonova (1).png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/txt_nova (2).png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 176, 240));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 60)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 176, 240));
        jLabel5.setText("Ingresa tus datos");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/rectangulo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/ExitLogo.png"))); // NOI18N
        jButtonRegresar.setBorder(null);
        jButtonRegresar.setContentAreaFilled(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, -1));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 520, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/base_b.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/mc_sup_derecha.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/line_b.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/line_t.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/image (1).png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/mc_derecha.png"))); // NOI18N
        jLabel2.setText(" ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        txt_nombre.setBorder(null);
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 460, 30));

        txt_pass.setBorder(null);
        txt_pass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_pass.setToolTipText("");
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_passKeyTyped(evt);
            }
        });
        jPanel2.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 460, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/txtNombre1.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/txtNombre1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel14.setText("Ingresa una contraseña:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel15.setText("Ingresa tu nombre:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JcbAlcaldiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcbAlcaldiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcbAlcaldiaActionPerformed

    private void JcbAlcaldiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JcbAlcaldiaItemStateChanged
    }//GEN-LAST:event_JcbAlcaldiaItemStateChanged

    private void JcbGeneroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JcbGeneroItemStateChanged
    }//GEN-LAST:event_JcbGeneroItemStateChanged

    private void JcbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcbGeneroActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        FrmIngresar ingresar = new FrmIngresar();
        ingresar.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        if (txt_nombre.getText().equals("Nombre") || txt_user.getText().equals("Usuario") || txt_pass.getText().equals("Contraseña")) {
            JOptionPane.showMessageDialog(this, "Ingrese datos en los campos vacios");
        } else {
            boolean valnumero = false;
            SoloLetras soloLetras = new SoloLetras();
            valnumero = soloLetras.esSoloLetras(txt_nombre.getText());
            if (valnumero) {
                JOptionPane.showMessageDialog(this, "Ingrese solo letras en el nombre");
            } else {
                if (JcbGenero.getSelectedItem().toString().equals("Genero")) {
                    JOptionPane.showMessageDialog(this, "Selecciona tu genero");
                } else {
                    if (JcbAlcaldia.getSelectedItem().toString().equals("Alcaldia")) {
                        JOptionPane.showMessageDialog(this, "Selecciona tu alcaldia");
                    } else {
                        try {
                            Funciones funciones = new Funciones();
                            UsuarioPrincipal usuario = new UsuarioPrincipal(txt_user.getText(), txt_nombre.getText(), txt_pass.getText(), JcbGenero.getSelectedItem().toString(), JcbAlcaldia.getSelectedItem().toString());
                            try {
                                funciones.guardarUsuario(usuario);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(FrmUserRegist.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(FrmUserRegist.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            FrmLogin login = new FrmLogin();
                            login.setVisible(true);
                            this.dispose();
                        } catch (IOException exception) {
                        }
                    }
                }
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
if(txt_nombre.getText().length() >= 10)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyTyped
 if(txt_user.getText().length() >= 10)
    {
        evt.consume();
    }          // TODO add your handling code here:
    }//GEN-LAST:event_txt_userKeyTyped

    private void txt_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyTyped
  
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passKeyTyped

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
            java.util.logging.Logger.getLogger(FrmUserRegist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUserRegist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUserRegist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUserRegist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUserRegist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcbAlcaldia;
    private javax.swing.JComboBox<String> JcbGenero;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private vistas.JPlaceholderTextField txt_nombre;
    private vistas.JPlaceholderTextField txt_pass;
    private vistas.JPlaceholderTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
