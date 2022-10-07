
package Ventas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class FrmLogin extends javax.swing.JFrame {
    private ImageIcon imagen;
    private Icon icono;

    frmMenu menu;
    public FrmLogin() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.AjustarImagen(this.lblImagen1, "src/Iconos/Login.jpg");
        this.AjustarImagen(this.lblImagen2, "src/Iconos/Bus.png");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        pnlPrincipal = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        lblImagen1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        pswContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnEntrar = new javax.swing.JButton();
        pnlEmpresa = new javax.swing.JPanel();
        lblImagen2 = new javax.swing.JLabel();
        lblRapido = new javax.swing.JLabel();
        lblSac = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(700, 400));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setPreferredSize(new java.awt.Dimension(400, 700));

        lblImagen1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblUsuario.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblUsuario.setText("USUARIO");

        txtUsuario.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblContraseña.setText("CONTRASEÑA");

        pswContraseña.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        pswContraseña.setForeground(new java.awt.Color(204, 204, 204));
        pswContraseña.setText("********");
        pswContraseña.setBorder(null);
        pswContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pswContraseñaMousePressed(evt);
            }
        });

        btnEntrar.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblContraseña)
                        .addComponent(txtUsuario)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pswContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblContraseña)
                .addGap(18, 18, 18)
                .addComponent(pswContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(84, 84, 84))
        );

        pnlPrincipal.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 540));

        pnlEmpresa.setBackground(new java.awt.Color(102, 255, 255));

        lblImagen2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRapido.setBackground(new java.awt.Color(102, 255, 255));
        lblRapido.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lblRapido.setForeground(new java.awt.Color(255, 51, 51));
        lblRapido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRapido.setText("EL RAPIDO");

        lblSac.setBackground(new java.awt.Color(102, 255, 255));
        lblSac.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lblSac.setForeground(new java.awt.Color(255, 51, 51));
        lblSac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSac.setText("S.A.C");
        lblSac.setPreferredSize(new java.awt.Dimension(197, 43));

        javax.swing.GroupLayout pnlEmpresaLayout = new javax.swing.GroupLayout(pnlEmpresa);
        pnlEmpresa.setLayout(pnlEmpresaLayout);
        pnlEmpresaLayout.setHorizontalGroup(
            pnlEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmpresaLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(pnlEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblSac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRapido, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(lblImagen2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        pnlEmpresaLayout.setVerticalGroup(
            pnlEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpresaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblRapido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 300, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if(txtUsuario.getText().equals("Admin") && String.valueOf(pswContraseña.getPassword()).equals("12345678")){
             menu = new frmMenu();
             JOptionPane.showMessageDialog(null, "Bienvenido al la empresa de buses EL RAPIDO S.A.C");
             menu.setVisible(true);
             
        }else{
            JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos");
        }     
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        
        if(txtUsuario.getText().equals("Ingrese su nombre de usuario")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        
        }
        if(String.valueOf(pswContraseña.getPassword()).isEmpty()){
            pswContraseña.setText("********");
            pswContraseña.setForeground(Color.gray);
            
        }        
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void pswContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswContraseñaMousePressed
        
        if(String.valueOf(pswContraseña.getPassword()).equals("********")){
            pswContraseña.setText("");
            pswContraseña.setForeground(Color.black);
        }
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
            
        }
    }//GEN-LAST:event_pswContraseñaMousePressed

    
    public static void main(String args[]) {
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }
    
    private void AjustarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        
        lbl.setIcon(this.icono);
        this.repaint();
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblRapido;
    private javax.swing.JLabel lblSac;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlEmpresa;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
