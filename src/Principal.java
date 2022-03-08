import java.awt.Image;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame/* implements Runnable*/{
    
    
    //Thread H1;
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        PanelShadow.add(PanelPrincipal);
        ImageIcon Aux = new ImageIcon(getClass().getResource("/Fondos/Fondo2.jpg"));
        ImageIcon Fondo = new ImageIcon(Aux.getImage().getScaledInstance(FondoPrincipal.getWidth(), FondoPrincipal.getHeight(),Image.SCALE_AREA_AVERAGING));
        FondoPrincipal.setIcon(Fondo);
        ImageIcon Aux2 = new ImageIcon(getClass().getResource("/Fondos/FondoPerfil.png"));
        ImageIcon Fondo2 = new ImageIcon(Aux2.getImage().getScaledInstance(FondoPerfil.getWidth(), FondoPerfil.getHeight(),Image.SCALE_AREA_AVERAGING));
        FondoPerfil.setIcon(Fondo2);
        //H1 = new Thread(this);
        //H1.start();
    }
    
    public void AnimacionSliderExpandir()
    {
        if(PanelSlider.getWidth() == 65) 
        {
            //H1.suspend();
            PanelSlider.show();
            PanelSlider.setSize(65, 580);
            Thread th = new Thread()
            {
                @Override
                public void run()
                {
                    try
                    {
                        for(int i = 65; i <= 215; i++)
                        {
                            if(i%2==0)
                                Thread.sleep(1);
                            PanelSlider.setSize(i, 580);
                        }
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            }
    }
    
    public void AnimacionSliderContraer()
    {
                if(PanelSlider.getWidth() == 215)
        {
            PanelSlider.setSize(215, 580);
            Thread th = new Thread()
            {
                @Override
                public void run()
                {
                    try
                    {
                        for(int i = 215; i >= 65; i--)
                        {
                            if(i%2==0)
                                Thread.sleep(1);
                            PanelSlider.setSize(i, 580);
                        }
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            //H1.resume();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSlider = new rspanelgradiente.RSPanelGradiente();
        MenuBotonPrincipal = new newscomponents.RSButtonGradientIcon_new();
        MenuBotonItinerario = new newscomponents.RSButtonGradientIcon_new();
        MenuBotonAsignaturas = new newscomponents.RSButtonGradientIcon_new();
        MenuBotonCalificaciones = new newscomponents.RSButtonGradientIcon_new();
        MenuBotonNotas = new newscomponents.RSButtonGradientIcon_new();
        MenuBotonConfiguracion = new newscomponents.RSButtonGradientIcon_new();
        SeparadorMenu = new javax.swing.JSeparator();
        PanelSuperior = new rspanelgradiente.RSPanelGradiente();
        BotonSalir = new javax.swing.JButton();
        BotonMinimizar = new javax.swing.JButton();
        EtiquetaReloj = new javax.swing.JLabel();
        SeparadorSuperior = new javax.swing.JSeparator();
        IconoPerfil = new RSMaterialComponent.RSLabelIcon();
        EtiquetaUsuario = new javax.swing.JLabel();
        EtiquetaEstado = new javax.swing.JLabel();
        FondoPerfil = new javax.swing.JLabel();
        PanelShadow = new rojeru_san.RSPanelShadow();
        FondoPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 630));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSlider.setColorPrimario(new java.awt.Color(216, 28, 50));
        PanelSlider.setColorSecundario(new java.awt.Color(151, 3, 6));
        PanelSlider.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.HORIZONTAL);
        PanelSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelSliderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelSliderMouseExited(evt);
            }
        });
        PanelSlider.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuBotonPrincipal.setText("Principal");
        MenuBotonPrincipal.setBorderPainted(false);
        MenuBotonPrincipal.setColorPrimario(new java.awt.Color(196, 20, 36));
        MenuBotonPrincipal.setColorPrimarioHover(new java.awt.Color(217, 43, 41));
        MenuBotonPrincipal.setColorSecundario(new java.awt.Color(192, 18, 33));
        MenuBotonPrincipal.setColorSecundarioHover(new java.awt.Color(213, 41, 38));
        MenuBotonPrincipal.setFocusPainted(false);
        MenuBotonPrincipal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        MenuBotonPrincipal.setGradiente(newscomponents.RSButtonGradientIcon_new.Gradiente.HORIZONTAL);
        MenuBotonPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuBotonPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuBotonPrincipal.setIconTextGap(20);
        MenuBotonPrincipal.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        MenuBotonPrincipal.setRippleColor(new java.awt.Color(224, 224, 224));
        MenuBotonPrincipal.setSelected(true);
        MenuBotonPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBotonPrincipalActionPerformed(evt);
            }
        });
        PanelSlider.add(MenuBotonPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 165, 215, 40));

        MenuBotonItinerario.setText("Itinerario");
        MenuBotonItinerario.setBorderPainted(false);
        MenuBotonItinerario.setColorPrimario(new java.awt.Color(191, 18, 33));
        MenuBotonItinerario.setColorPrimarioHover(new java.awt.Color(212, 41, 38));
        MenuBotonItinerario.setColorSecundario(new java.awt.Color(187, 16, 30));
        MenuBotonItinerario.setColorSecundarioHover(new java.awt.Color(208, 39, 35));
        MenuBotonItinerario.setFocusPainted(false);
        MenuBotonItinerario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        MenuBotonItinerario.setGradiente(newscomponents.RSButtonGradientIcon_new.Gradiente.HORIZONTAL);
        MenuBotonItinerario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuBotonItinerario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuBotonItinerario.setIconTextGap(20);
        MenuBotonItinerario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.TODAY);
        MenuBotonItinerario.setRippleColor(new java.awt.Color(224, 224, 224));
        MenuBotonItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBotonItinerarioActionPerformed(evt);
            }
        });
        PanelSlider.add(MenuBotonItinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 205, 215, 40));

        MenuBotonAsignaturas.setText("Asignaturas");
        MenuBotonAsignaturas.setBorderPainted(false);
        MenuBotonAsignaturas.setColorPrimario(new java.awt.Color(187, 16, 30));
        MenuBotonAsignaturas.setColorPrimarioHover(new java.awt.Color(208, 39, 35));
        MenuBotonAsignaturas.setColorSecundario(new java.awt.Color(182, 15, 27));
        MenuBotonAsignaturas.setColorSecundarioHover(new java.awt.Color(203, 38, 32));
        MenuBotonAsignaturas.setFocusPainted(false);
        MenuBotonAsignaturas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        MenuBotonAsignaturas.setGradiente(newscomponents.RSButtonGradientIcon_new.Gradiente.HORIZONTAL);
        MenuBotonAsignaturas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuBotonAsignaturas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuBotonAsignaturas.setIconTextGap(20);
        MenuBotonAsignaturas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SCHOOL);
        MenuBotonAsignaturas.setRippleColor(new java.awt.Color(224, 224, 224));
        MenuBotonAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBotonAsignaturasActionPerformed(evt);
            }
        });
        PanelSlider.add(MenuBotonAsignaturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, 215, 40));

        MenuBotonCalificaciones.setText("Calificaciones");
        MenuBotonCalificaciones.setBorderPainted(false);
        MenuBotonCalificaciones.setColorPrimario(new java.awt.Color(182, 15, 27));
        MenuBotonCalificaciones.setColorPrimarioHover(new java.awt.Color(203, 38, 32));
        MenuBotonCalificaciones.setColorSecundario(new java.awt.Color(177, 13, 24));
        MenuBotonCalificaciones.setColorSecundarioHover(new java.awt.Color(198, 36, 29));
        MenuBotonCalificaciones.setFocusPainted(false);
        MenuBotonCalificaciones.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        MenuBotonCalificaciones.setGradiente(newscomponents.RSButtonGradientIcon_new.Gradiente.HORIZONTAL);
        MenuBotonCalificaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuBotonCalificaciones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuBotonCalificaciones.setIconTextGap(20);
        MenuBotonCalificaciones.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.TIMELINE);
        MenuBotonCalificaciones.setRippleColor(new java.awt.Color(224, 224, 224));
        MenuBotonCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBotonCalificacionesActionPerformed(evt);
            }
        });
        PanelSlider.add(MenuBotonCalificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 285, 215, 40));

        MenuBotonNotas.setText("Notas");
        MenuBotonNotas.setBorderPainted(false);
        MenuBotonNotas.setColorPrimario(new java.awt.Color(177, 13, 24));
        MenuBotonNotas.setColorPrimarioHover(new java.awt.Color(198, 36, 29));
        MenuBotonNotas.setColorSecundario(new java.awt.Color(173, 11, 20));
        MenuBotonNotas.setColorSecundarioHover(new java.awt.Color(194, 34, 25));
        MenuBotonNotas.setFocusPainted(false);
        MenuBotonNotas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        MenuBotonNotas.setGradiente(newscomponents.RSButtonGradientIcon_new.Gradiente.HORIZONTAL);
        MenuBotonNotas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuBotonNotas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuBotonNotas.setIconTextGap(20);
        MenuBotonNotas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.BOOK);
        MenuBotonNotas.setRippleColor(new java.awt.Color(224, 224, 224));
        MenuBotonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBotonNotasActionPerformed(evt);
            }
        });
        PanelSlider.add(MenuBotonNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 325, 215, 40));

        MenuBotonConfiguracion.setText("Configuración");
        MenuBotonConfiguracion.setBorderPainted(false);
        MenuBotonConfiguracion.setColorPrimario(new java.awt.Color(173, 11, 20));
        MenuBotonConfiguracion.setColorPrimarioHover(new java.awt.Color(194, 34, 25));
        MenuBotonConfiguracion.setColorSecundario(new java.awt.Color(168, 9, 17));
        MenuBotonConfiguracion.setColorSecundarioHover(new java.awt.Color(189, 32, 22));
        MenuBotonConfiguracion.setFocusPainted(false);
        MenuBotonConfiguracion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        MenuBotonConfiguracion.setGradiente(newscomponents.RSButtonGradientIcon_new.Gradiente.HORIZONTAL);
        MenuBotonConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuBotonConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuBotonConfiguracion.setIconTextGap(20);
        MenuBotonConfiguracion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SETTINGS);
        MenuBotonConfiguracion.setRippleColor(new java.awt.Color(224, 224, 224));
        MenuBotonConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBotonConfiguracionActionPerformed(evt);
            }
        });
        PanelSlider.add(MenuBotonConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 365, 215, 40));

        SeparadorMenu.setForeground(new java.awt.Color(153, 153, 153));
        PanelSlider.add(SeparadorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 215, 1));

        getContentPane().add(PanelSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 65, 550));

        PanelSuperior.setColorPrimario(new java.awt.Color(226, 32, 57));
        PanelSuperior.setColorSecundario(new java.awt.Color(216, 28, 50));
        PanelSuperior.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.HORIZONTAL);
        PanelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/IconSalir.png"))); // NOI18N
        BotonSalir.setBorder(null);
        BotonSalir.setBorderPainted(false);
        BotonSalir.setContentAreaFilled(false);
        BotonSalir.setFocusPainted(false);
        BotonSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/RolloverIconSalir.png"))); // NOI18N
        BotonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/RolloverIconSalir.png"))); // NOI18N
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        PanelSuperior.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1014, 9, -1, -1));

        BotonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/IconMinimizar.png"))); // NOI18N
        BotonMinimizar.setBorder(null);
        BotonMinimizar.setBorderPainted(false);
        BotonMinimizar.setContentAreaFilled(false);
        BotonMinimizar.setFocusPainted(false);
        BotonMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/RolloverIconMinimizar.png"))); // NOI18N
        BotonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMinimizarActionPerformed(evt);
            }
        });
        PanelSuperior.add(BotonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 9, -1, -1));

        EtiquetaReloj.setFont(new java.awt.Font("Tahoma", 1, 24));
        EtiquetaReloj.setForeground(new java.awt.Color(102, 102, 102));
        PanelSuperior.add(EtiquetaReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 170, 40));

        SeparadorSuperior.setForeground(new java.awt.Color(153, 153, 153));
        SeparadorSuperior.setOrientation(javax.swing.SwingConstants.VERTICAL);
        PanelSuperior.add(SeparadorSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 0, 1, 80));

        IconoPerfil.setForeground(new java.awt.Color(255, 255, 255));
        IconoPerfil.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        IconoPerfil.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);
        IconoPerfil.setSizeIcon(55.0F);
        PanelSuperior.add(IconoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        EtiquetaUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        EtiquetaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaUsuario.setText("Usuario Beta");
        EtiquetaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EtiquetaUsuarioKeyPressed(evt);
            }
        });
        PanelSuperior.add(EtiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        EtiquetaEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        EtiquetaEstado.setForeground(new java.awt.Color(51, 255, 51));
        EtiquetaEstado.setText("Libre");
        PanelSuperior.add(EtiquetaEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));
        PanelSuperior.add(FondoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 215, 80));

        getContentPane().add(PanelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 80));

        PanelShadow.setOpaque(false);
        getContentPane().add(PanelShadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 100, 945, 510));

        FondoPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FondoPrincipalMouseEntered(evt);
            }
        });
        getContentPane().add(FondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 80, 985, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        int R = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
        if(R==0)
            System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMinimizarActionPerformed
        this.setState(Principal.ICONIFIED);
    }//GEN-LAST:event_BotonMinimizarActionPerformed

    private void MenuBotonPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBotonPrincipalActionPerformed
        if(PanelSlider.getWidth() == 215)
        {   
            //AnimacionSlider();
        }
        
        MenuBotonPrincipal.setSelected(true);
        MenuBotonItinerario.setSelected(false);
        MenuBotonAsignaturas.setSelected(false);
        MenuBotonCalificaciones.setSelected(false);
        MenuBotonNotas.setSelected(false);
        MenuBotonConfiguracion.setSelected(false);
    }//GEN-LAST:event_MenuBotonPrincipalActionPerformed

    private void MenuBotonItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBotonItinerarioActionPerformed
        if(PanelSlider.getWidth() == 215)
        {
            //AnimacionSlider();
        }
        
        MenuBotonPrincipal.setSelected(false);
        MenuBotonItinerario.setSelected(true);
        MenuBotonAsignaturas.setSelected(false);
        MenuBotonCalificaciones.setSelected(false);
        MenuBotonNotas.setSelected(false);
        MenuBotonConfiguracion.setSelected(false);
    }//GEN-LAST:event_MenuBotonItinerarioActionPerformed

    private void MenuBotonAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBotonAsignaturasActionPerformed
        if(PanelSlider.getWidth() == 215)
        {
            //AnimacionSlider();
        }
        
        MenuBotonPrincipal.setSelected(false);
        MenuBotonItinerario.setSelected(false);
        MenuBotonAsignaturas.setSelected(true);
        MenuBotonCalificaciones.setSelected(false);
        MenuBotonNotas.setSelected(false);
        MenuBotonConfiguracion.setSelected(false);
    }//GEN-LAST:event_MenuBotonAsignaturasActionPerformed

    private void MenuBotonCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBotonCalificacionesActionPerformed
        if(PanelSlider.getWidth() == 215)
        {
            //AnimacionSlider();
        }
        
        MenuBotonPrincipal.setSelected(false);
        MenuBotonItinerario.setSelected(false);
        MenuBotonAsignaturas.setSelected(false);
        MenuBotonCalificaciones.setSelected(true);
        MenuBotonNotas.setSelected(false);
        MenuBotonConfiguracion.setSelected(false);
    }//GEN-LAST:event_MenuBotonCalificacionesActionPerformed

    private void MenuBotonNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBotonNotasActionPerformed
        if(PanelSlider.getWidth() == 215)
        {
            //AnimacionSlider();
        }
        
        MenuBotonPrincipal.setSelected(false);
        MenuBotonItinerario.setSelected(false);
        MenuBotonAsignaturas.setSelected(false);
        MenuBotonCalificaciones.setSelected(false);
        MenuBotonNotas.setSelected(true);
        MenuBotonConfiguracion.setSelected(false);
    }//GEN-LAST:event_MenuBotonNotasActionPerformed

    private void MenuBotonConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBotonConfiguracionActionPerformed
        if(PanelSlider.getWidth() == 215)
        {
            //AnimacionSlider();
        }
        
        MenuBotonPrincipal.setSelected(false);
        MenuBotonItinerario.setSelected(false);
        MenuBotonAsignaturas.setSelected(false);
        MenuBotonCalificaciones.setSelected(false);
        MenuBotonNotas.setSelected(false);
        MenuBotonConfiguracion.setSelected(true);
    }//GEN-LAST:event_MenuBotonConfiguracionActionPerformed

    private void PanelSliderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSliderMouseEntered
        AnimacionSliderExpandir();
    }//GEN-LAST:event_PanelSliderMouseEntered

    private void PanelSliderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSliderMouseExited

    }//GEN-LAST:event_PanelSliderMouseExited

    private void FondoPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoPrincipalMouseEntered
        AnimacionSliderContraer();
    }//GEN-LAST:event_FondoPrincipalMouseEntered

    private void EtiquetaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EtiquetaUsuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_EtiquetaUsuarioKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    /*@SuppressWarnings({"override", "SleepWhileInLoop"})
    public void run() {
        while(true)
        {
            Reloj R = new Reloj();
            EtiquetaReloj.setText("<html><center>" + R.Hora + ":" + R.Minutos + ":" + R.Segundos + " " + R.AmPm + "<center><html>");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
        }
    }*/
    
    private PanelPrincipal PanelPrincipal = new PanelPrincipal();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonMinimizar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel EtiquetaEstado;
    private javax.swing.JLabel EtiquetaReloj;
    private javax.swing.JLabel EtiquetaUsuario;
    private javax.swing.JLabel FondoPerfil;
    private javax.swing.JLabel FondoPrincipal;
    private RSMaterialComponent.RSLabelIcon IconoPerfil;
    private newscomponents.RSButtonGradientIcon_new MenuBotonAsignaturas;
    private newscomponents.RSButtonGradientIcon_new MenuBotonCalificaciones;
    private newscomponents.RSButtonGradientIcon_new MenuBotonConfiguracion;
    private newscomponents.RSButtonGradientIcon_new MenuBotonItinerario;
    private newscomponents.RSButtonGradientIcon_new MenuBotonNotas;
    private newscomponents.RSButtonGradientIcon_new MenuBotonPrincipal;
    private rojeru_san.RSPanelShadow PanelShadow;
    private rspanelgradiente.RSPanelGradiente PanelSlider;
    private rspanelgradiente.RSPanelGradiente PanelSuperior;
    private javax.swing.JSeparator SeparadorMenu;
    private javax.swing.JSeparator SeparadorSuperior;
    // End of variables declaration//GEN-END:variables
}