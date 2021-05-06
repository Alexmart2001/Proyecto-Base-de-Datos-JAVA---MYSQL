package co.edu.usbbog.dbd.fiesteroAndante.view.window;

import co.edu.usbbog.dbd.fiesteroAndante.view.frame.ClienteAppJFrame;
import javax.swing.JOptionPane;

public class LoginJpanel extends javax.swing.JPanel {
    private ClienteAppJFrame appJframe;
    /**
     * Creates new form LoginJpanel
     * @param appJframe
     */
    public LoginJpanel(ClienteAppJFrame appJframe ) {
        this.appJframe = appJframe;
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

        fSButtonMD1 = new LIB.FSButtonMD();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        User = new LIB.FSTexFieldMD();
        Password = new LIB.FSPasswordFieldMD();
        fSButtonMD2 = new LIB.FSButtonMD();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        fSButtonMD1.setText("fSButtonMD1");

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 153, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("LOGIN");

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setForeground(new java.awt.Color(0, 0, 0));
        User.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        User.setPlaceholder("Correo Electrónico");

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setForeground(new java.awt.Color(0, 0, 0));
        Password.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        Password.setPlaceholder("Contraseña");

        fSButtonMD2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fSButtonMD2.setForeground(new java.awt.Color(0, 0, 0));
        fSButtonMD2.setText("LOGIN IN");
        fSButtonMD2.setColorNormal(new java.awt.Color(0, 0, 0));
        fSButtonMD2.setColorPressed(new java.awt.Color(255, 255, 255));
        fSButtonMD2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fSButtonMD2MouseClicked(evt);
            }
        });
        fSButtonMD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSButtonMD2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Forgot Password?");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setText("CLOSE [X]");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(fSButtonMD2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(fSButtonMD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fSButtonMD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSButtonMD2ActionPerformed
 
    }//GEN-LAST:event_fSButtonMD2ActionPerformed

    private void fSButtonMD2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fSButtonMD2MouseClicked
         char Clave[] = Password.getPassword();
        String clave = new String(Clave);
        if (User.getText().equals("admin") && clave.equals("123")) {
            JOptionPane.showMessageDialog(this, "Bienvenid@ a Fiestero Andante");
            appJframe.irMenu(this);
        } else if (User.getText().equals("user") && clave.equals("123")) {
            JOptionPane.showMessageDialog(this, "Bienvenid@ a Fiestero Andante");
            appJframe.irMenu(this);
        } else {
            JOptionPane.showMessageDialog(this,"\"Usuario o contraseña erroneos\"","Error",JOptionPane.ERROR_MESSAGE);
            User.setText(null);
            Password.setText(null);
        }
    }//GEN-LAST:event_fSButtonMD2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       JOptionPane.showMessageDialog(null, "USUARIO = admin \nCONTRASEÑA = 123","USUARIO Y CONTRASEÑA",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSPasswordFieldMD Password;
    private LIB.FSTexFieldMD User;
    private LIB.FSButtonMD fSButtonMD1;
    private LIB.FSButtonMD fSButtonMD2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}