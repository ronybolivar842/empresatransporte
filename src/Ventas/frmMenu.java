
package Ventas;

import Detalles.PanelVentaBoleto;
import desplazable.Desface;


public class frmMenu extends javax.swing.JFrame {
    panelRegistroBuses bus;
    panelRegistroTerminal terminal;
    panelRegistroChofer chofer;
    panelRegistroTerramosa terra;
    panelProgramacionViajes viajes;
    panelRegistroCliente cliente;
    panelVentas ventas;
    panelEncomiendas encomiendas;
    panelGiros giros;
    
    PanelVentaBoleto boleto;

    Desface menuDesplegable;
    public frmMenu() {
        initComponents();
        menuDesplegable = new Desface();
        
        bus = new panelRegistroBuses();
        terminal = new panelRegistroTerminal();
        chofer = new  panelRegistroChofer();
        terra = new  panelRegistroTerramosa(); 
        viajes = new panelProgramacionViajes();
        cliente = new  panelRegistroCliente();
        ventas = new panelVentas();
        encomiendas = new panelEncomiendas();
        giros = new panelGiros();
        boleto = new PanelVentaBoleto();
        
        
        terminal.setVisible(false);
        bus.setVisible(false);
        chofer.setVisible(false);
        terra.setVisible(false);
        viajes.setVisible(false);
        cliente.setVisible(false); 
        ventas.setVisible(false);
        encomiendas.setVisible(false);
        giros.setVisible(false);
        boleto.setVisible(false);
        
        bus.setBounds(220, 0, 1180, 710);
        terminal.setBounds(220, 0, 1180, 710);
        chofer.setBounds(220, 0, 1180, 710);
        terra.setBounds(220, 0, 1180, 710);
        viajes.setBounds(220, 0, 1180, 710);
        cliente.setBounds(220, 0, 1180, 710);
        ventas.setBounds(220, 0, 1180, 710);
        boleto.setBounds(220, 0, 1180, 710);
        encomiendas.setBounds(220, 0, 1180, 710);
        giros.setBounds(220, 0, 1180, 710);
        
        add(bus);
        add(terminal);
        add(chofer);
        add(terra);
        add(viajes);
        add(cliente);
        add(boleto);
        add(ventas);
        add(encomiendas);
        add(giros);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        lblRegistroTerminal = new javax.swing.JLabel();
        lblMenuDesplegable = new javax.swing.JLabel();
        lblRegistrosBuses = new javax.swing.JLabel();
        lblRegistroChofer = new javax.swing.JLabel();
        lblRegistroTerramoso = new javax.swing.JLabel();
        lblDetalleBoleto = new javax.swing.JLabel();
        lblEncomiendas = new javax.swing.JLabel();
        lblGiros = new javax.swing.JLabel();
        lblRegistros = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblRegistroClientes = new javax.swing.JLabel();
        lblRegistroViajes = new javax.swing.JLabel();
        lblProcesos1 = new javax.swing.JLabel();
        lblVentaBoletos1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OPERACIONES");
        setExtendedState(6);
        setSize(new java.awt.Dimension(800, 500));

        panelMenu.setBackground(new java.awt.Color(102, 255, 255));
        panelMenu.setPreferredSize(new java.awt.Dimension(220, 500));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistroTerminal.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblRegistroTerminal.setText("> Registro De Terminal");
        lblRegistroTerminal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroTerminalMouseClicked(evt);
            }
        });
        panelMenu.add(lblRegistroTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 30));

        lblMenuDesplegable.setForeground(new java.awt.Color(102, 51, 255));
        lblMenuDesplegable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMenuDesplegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu2.png"))); // NOI18N
        lblMenuDesplegable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        lblMenuDesplegable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuDesplegableMouseClicked(evt);
            }
        });
        panelMenu.add(lblMenuDesplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 0, 58, 50));

        lblRegistrosBuses.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblRegistrosBuses.setText(">  Registro De Buses");
        lblRegistrosBuses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrosBusesMouseClicked(evt);
            }
        });
        panelMenu.add(lblRegistrosBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 30));

        lblRegistroChofer.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblRegistroChofer.setText("> Registro de Chofer");
        lblRegistroChofer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroChoferMouseClicked(evt);
            }
        });
        panelMenu.add(lblRegistroChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, 30));

        lblRegistroTerramoso.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblRegistroTerramoso.setText("> Registro De Terramoso(a)");
        lblRegistroTerramoso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroTerramosoMouseClicked(evt);
            }
        });
        panelMenu.add(lblRegistroTerramoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 30));

        lblDetalleBoleto.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblDetalleBoleto.setText("> Detalle De Boleto");
        lblDetalleBoleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDetalleBoletoMouseClicked(evt);
            }
        });
        panelMenu.add(lblDetalleBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 50));

        lblEncomiendas.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblEncomiendas.setText("> Encomiendas");
        lblEncomiendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEncomiendasMouseClicked(evt);
            }
        });
        panelMenu.add(lblEncomiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 220, 50));

        lblGiros.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblGiros.setText("> Giros");
        lblGiros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGirosMouseClicked(evt);
            }
        });
        panelMenu.add(lblGiros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 220, 50));

        lblRegistros.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        lblRegistros.setText(" REGISTROS ");
        panelMenu.add(lblRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 50));

        lblMenu.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(153, 51, 255));
        lblMenu.setText("MENU DE OPCION");
        panelMenu.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        lblRegistroClientes.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblRegistroClientes.setText("> Registro De Clientes");
        lblRegistroClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroClientesMouseClicked(evt);
            }
        });
        panelMenu.add(lblRegistroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, 30));

        lblRegistroViajes.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblRegistroViajes.setText("> Registro De Viajes");
        lblRegistroViajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroViajesMouseClicked(evt);
            }
        });
        panelMenu.add(lblRegistroViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, 30));

        lblProcesos1.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        lblProcesos1.setText(" PROCESOS");
        panelMenu.add(lblProcesos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, 70));

        lblVentaBoletos1.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lblVentaBoletos1.setText("> Venta De Boletos");
        lblVentaBoletos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVentaBoletos1MouseClicked(evt);
            }
        });
        panelMenu.add(lblVentaBoletos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 220, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuDesplegableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuDesplegableMouseClicked
        
        if(panelMenu.getX()== 0)
        menuDesplegable.desplazarIzquierda(panelMenu, panelMenu.getX(), -170, 10, 10);
        else if(panelMenu.getX() == -170)
            menuDesplegable.desplazarDerecha(panelMenu, panelMenu.getX(), 0, 10, 10);
            
    }//GEN-LAST:event_lblMenuDesplegableMouseClicked

    private void lblDetalleBoletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDetalleBoletoMouseClicked
        
        
        bus.setVisible(false);
        terminal.setVisible(false);
        chofer.setVisible(false);
        terra.setVisible(false);
        viajes.setVisible(false);
        cliente.setVisible(false);
        ventas.setVisible(false);
        boleto.setVisible(true);
        encomiendas.setVisible(false);
        giros.setVisible(false);
        revalidate();
        repaint();    
    }//GEN-LAST:event_lblDetalleBoletoMouseClicked

    private void lblRegistrosBusesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrosBusesMouseClicked
        
        bus.setVisible(true);
        terminal.setVisible(false);
        chofer.setVisible(false);
        terra.setVisible(false);
        viajes.setVisible(false);
        cliente.setVisible(false);
        boleto.setVisible(false);
        ventas.setVisible(false);
        encomiendas.setVisible(false);
        giros.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_lblRegistrosBusesMouseClicked

    private void lblRegistroTerminalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroTerminalMouseClicked

        terminal.setVisible(true);
        bus.setVisible(false);
        chofer.setVisible(false);
        terra.setVisible(false);
        viajes.setVisible(false);
        cliente.setVisible(false);
        boleto.setVisible(false);
        ventas.setVisible(false);
        encomiendas.setVisible(false);
        giros.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_lblRegistroTerminalMouseClicked

    private void lblRegistroChoferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroChoferMouseClicked
        
        chofer.setVisible(true);
        bus.setVisible(false);
        terminal.setVisible(false);
        terra.setVisible(false);
        cliente.setVisible(false);
        viajes.setVisible(false);
        boleto.setVisible(false);
        ventas.setVisible(false);
        encomiendas.setVisible(false);
        giros.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_lblRegistroChoferMouseClicked

    private void lblRegistroTerramosoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroTerramosoMouseClicked
        
        terra.setVisible(true);
        bus.setVisible(false);
        terminal.setVisible(false);
        chofer.setVisible(false);
        ventas.setVisible(false);
         cliente.setVisible(false);
        ventas.setVisible(false);
        boleto.setVisible(false);
        encomiendas.setVisible(false);
        giros.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_lblRegistroTerramosoMouseClicked

    private void lblEncomiendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEncomiendasMouseClicked
        
        encomiendas.setVisible(true);
        bus.setVisible(false);
        terminal.setVisible(false);
        chofer.setVisible(false);
        terra.setVisible(false);
        cliente.setVisible(false);
        viajes.setVisible(false);
        boleto.setVisible(false);
        ventas.setVisible(false);
        giros.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_lblEncomiendasMouseClicked

    private void lblGirosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGirosMouseClicked
        giros.setVisible(true);
        bus.setVisible(false);
        terminal.setVisible(false);
        chofer.setVisible(false);
        terra.setVisible(false);
        cliente.setVisible(false);
        viajes.setVisible(false);
        boleto.setVisible(false);
        ventas.setVisible(false);
        encomiendas.setVisible(false);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_lblGirosMouseClicked

    private void lblRegistroClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroClientesMouseClicked
       
        giros.setVisible(false);
        bus.setVisible(false);
        terminal.setVisible(false);
        chofer.setVisible(false);
        terra.setVisible(false);
        cliente.setVisible(true);
        viajes.setVisible(false);
        boleto.setVisible(false);
        ventas.setVisible(false);
        encomiendas.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_lblRegistroClientesMouseClicked

    private void lblRegistroViajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroViajesMouseClicked
       giros.setVisible(false);
        bus.setVisible(false);
        terminal.setVisible(false);
        chofer.setVisible(false);
        terra.setVisible(false);
        viajes.setVisible(true);
        cliente.setVisible(false);
        ventas.setVisible(false);
        boleto.setVisible(false);
        encomiendas.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_lblRegistroViajesMouseClicked

    private void lblVentaBoletos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVentaBoletos1MouseClicked
        giros.setVisible(false);
        bus.setVisible(false);
        terminal.setVisible(false);
        chofer.setVisible(false);
        terra.setVisible(false);
        viajes.setVisible(false);
        cliente.setVisible(false);
        ventas.setVisible(true);
        boleto.setVisible(false);
        encomiendas.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_lblVentaBoletos1MouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDetalleBoleto;
    private javax.swing.JLabel lblEncomiendas;
    private javax.swing.JLabel lblGiros;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenuDesplegable;
    private javax.swing.JLabel lblProcesos1;
    private javax.swing.JLabel lblRegistroChofer;
    private javax.swing.JLabel lblRegistroClientes;
    private javax.swing.JLabel lblRegistroTerminal;
    private javax.swing.JLabel lblRegistroTerramoso;
    private javax.swing.JLabel lblRegistroViajes;
    private javax.swing.JLabel lblRegistros;
    private javax.swing.JLabel lblRegistrosBuses;
    private javax.swing.JLabel lblVentaBoletos1;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
