
package GUI;

import control_servidor_admin.ConsultasSQL;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import control_servidor_admin.ConsultasSQL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;



public class RetirarEstudiante extends javax.swing.JFrame {

    
    ConsultasSQL logica = new ConsultasSQL();
    ConsultasSQL modelo = new ConsultasSQL();
    
    VerEstudiantes verEstudiantes = new VerEstudiantes();
    private Timer timer;
    private String lastQuery = ""; 
    
    //Modelo modelo = new Modelo();

    
    public RetirarEstudiante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEstudiantesRetirar = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        RegistrarEstudianteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VerEstudianteBtn = new javax.swing.JButton();
        HistorialCocinaBnt = new javax.swing.JButton();
        HistorialEntradaSalida = new javax.swing.JButton();
        InformeDeActividadBtn = new javax.swing.JButton();
        NotificacionesBotellonesbtn = new javax.swing.JButton();
        HistorialBotellonesbtn = new javax.swing.JButton();
        RetirarEstudiantesbtn = new javax.swing.JButton();
        EditarEstudiantebtn = new javax.swing.JButton();
        Retirarbtn = new javax.swing.JButton();
        BuscarMatriculaRetirar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        TablaEstudiantesRetirar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TablaEstudiantesRetirar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre", "Apellido", "Numero", "Estado", "Title 6", "Title 7"
            }
        ));
        TablaEstudiantesRetirar.setToolTipText("Listado de contactos");
        jScrollPane1.setViewportView(TablaEstudiantesRetirar);
        if (TablaEstudiantesRetirar.getColumnModel().getColumnCount() > 0) {
            TablaEstudiantesRetirar.getColumnModel().getColumn(0).setResizable(false);
            TablaEstudiantesRetirar.getColumnModel().getColumn(1).setResizable(false);
            TablaEstudiantesRetirar.getColumnModel().getColumn(2).setResizable(false);
            TablaEstudiantesRetirar.getColumnModel().getColumn(3).setResizable(false);
            TablaEstudiantesRetirar.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(0, 55, 133));

        RegistrarEstudianteBtn.setBackground(new java.awt.Color(20, 101, 187));
        RegistrarEstudianteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegistrarEstudianteBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarEstudianteBtn.setText("Registrar Estudiante");
        RegistrarEstudianteBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        RegistrarEstudianteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEstudianteBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ControlAdmin");

        VerEstudianteBtn.setBackground(new java.awt.Color(20, 101, 187));
        VerEstudianteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VerEstudianteBtn.setForeground(new java.awt.Color(255, 255, 255));
        VerEstudianteBtn.setText("Ver Estudiante");
        VerEstudianteBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        VerEstudianteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEstudianteBtnActionPerformed(evt);
            }
        });

        HistorialCocinaBnt.setBackground(new java.awt.Color(20, 101, 187));
        HistorialCocinaBnt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HistorialCocinaBnt.setForeground(new java.awt.Color(255, 255, 255));
        HistorialCocinaBnt.setText("Historial Cocina");
        HistorialCocinaBnt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        HistorialCocinaBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialCocinaBntActionPerformed(evt);
            }
        });

        HistorialEntradaSalida.setBackground(new java.awt.Color(20, 101, 187));
        HistorialEntradaSalida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HistorialEntradaSalida.setForeground(new java.awt.Color(255, 255, 255));
        HistorialEntradaSalida.setText("Historial Entrada/salida");
        HistorialEntradaSalida.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        HistorialEntradaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialEntradaSalidaActionPerformed(evt);
            }
        });

        InformeDeActividadBtn.setBackground(new java.awt.Color(20, 101, 187));
        InformeDeActividadBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InformeDeActividadBtn.setForeground(new java.awt.Color(255, 255, 255));
        InformeDeActividadBtn.setText("Informe De Actividad");
        InformeDeActividadBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        InformeDeActividadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformeDeActividadBtnActionPerformed(evt);
            }
        });

        NotificacionesBotellonesbtn.setBackground(new java.awt.Color(20, 101, 187));
        NotificacionesBotellonesbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NotificacionesBotellonesbtn.setForeground(new java.awt.Color(255, 255, 255));
        NotificacionesBotellonesbtn.setText("Notificaciones Botellones");
        NotificacionesBotellonesbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        NotificacionesBotellonesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificacionesBotellonesbtnActionPerformed(evt);
            }
        });

        HistorialBotellonesbtn.setBackground(new java.awt.Color(20, 101, 187));
        HistorialBotellonesbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HistorialBotellonesbtn.setForeground(new java.awt.Color(255, 255, 255));
        HistorialBotellonesbtn.setText("Historial Botellones");
        HistorialBotellonesbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        HistorialBotellonesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialBotellonesbtnActionPerformed(evt);
            }
        });

        RetirarEstudiantesbtn.setBackground(new java.awt.Color(20, 101, 187));
        RetirarEstudiantesbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RetirarEstudiantesbtn.setForeground(new java.awt.Color(255, 255, 255));
        RetirarEstudiantesbtn.setText("Retirar Estudiantes");
        RetirarEstudiantesbtn.setBorder(null);
        RetirarEstudiantesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarEstudiantesbtnActionPerformed(evt);
            }
        });

        EditarEstudiantebtn.setBackground(new java.awt.Color(20, 101, 187));
        EditarEstudiantebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EditarEstudiantebtn.setForeground(new java.awt.Color(255, 255, 255));
        EditarEstudiantebtn.setText("Editar Estudiante");
        EditarEstudiantebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        EditarEstudiantebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditarEstudiantebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditarEstudiantebtnMouseExited(evt);
            }
        });
        EditarEstudiantebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEstudiantebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistrarEstudianteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(VerEstudianteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistorialCocinaBnt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistorialEntradaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(InformeDeActividadBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistorialBotellonesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NotificacionesBotellonesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
            .addComponent(RetirarEstudiantesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EditarEstudiantebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(VerEstudianteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(RegistrarEstudianteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HistorialCocinaBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HistorialEntradaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(InformeDeActividadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(HistorialBotellonesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NotificacionesBotellonesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(EditarEstudiantebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(RetirarEstudiantesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Retirarbtn.setBackground(new java.awt.Color(30, 30, 30));
        Retirarbtn.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        Retirarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Retirarbtn.setText("Retirar");
        Retirarbtn.setBorder(null);
        Retirarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarbtnActionPerformed(evt);
            }
        });

        BuscarMatriculaRetirar.setBackground(new java.awt.Color(30, 30, 30));
        BuscarMatriculaRetirar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BuscarMatriculaRetirar.setForeground(new java.awt.Color(255, 255, 255));
        BuscarMatriculaRetirar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(30, 30, 30)));
        BuscarMatriculaRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarMatriculaRetirarActionPerformed(evt);
            }
        });
        BuscarMatriculaRetirar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarMatriculaRetirarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarMatriculaRetirarKeyTyped(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BuscarMatricula(Completa)");

        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(BuscarMatriculaRetirar, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Retirarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(344, 344, 344))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(377, 377, 377))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarMatriculaRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Retirarbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarEstudianteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEstudianteBtnActionPerformed
        RegistrarEstudiante registrarEstudiante = new RegistrarEstudiante();
        registrarEstudiante.setVisible(true);
        this.dispose();
        registrarEstudiante.setLocationRelativeTo(null);
    }//GEN-LAST:event_RegistrarEstudianteBtnActionPerformed

    private void VerEstudianteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEstudianteBtnActionPerformed

        VerEstudiantes verEstudiantes = new VerEstudiantes();
        verEstudiantes.setVisible(true);
        this.dispose();
        verEstudiantes.setLocationRelativeTo(null);

        DefaultTableModel modelo = (DefaultTableModel) verEstudiantes.TablaEstudiantes.getModel();
        logica.MostrarEstudiante(modelo);
    }//GEN-LAST:event_VerEstudianteBtnActionPerformed

    private void HistorialCocinaBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialCocinaBntActionPerformed
        HistorialCocina Cocina = new HistorialCocina();
        
        DefaultTableModel modelo = (DefaultTableModel) Cocina.HistorialCocinaTable.getModel(); 
        logica.HistorialUsoCocina(modelo);
        
        Cocina.setVisible(true);
        this.dispose();
        Cocina.setLocationRelativeTo(null);
    }//GEN-LAST:event_HistorialCocinaBntActionPerformed

    private void HistorialEntradaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialEntradaSalidaActionPerformed
        HistorialEntradaSalida historialEntradaSalida = new HistorialEntradaSalida();
        
        DefaultTableModel modelo = (DefaultTableModel) historialEntradaSalida.TablaHitorialEntradaSalida.getModel(); 
        logica.HistorialEntradaSalida(modelo);
        
        historialEntradaSalida.setVisible(true);
        this.dispose();
        historialEntradaSalida.setLocationRelativeTo(null);
    }//GEN-LAST:event_HistorialEntradaSalidaActionPerformed

    private void InformeDeActividadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformeDeActividadBtnActionPerformed
        InformeDeActividad informe = new InformeDeActividad();
        informe.setVisible(true);
        this.dispose();
        informe.setLocationRelativeTo(null);
    }//GEN-LAST:event_InformeDeActividadBtnActionPerformed

    private void NotificacionesBotellonesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificacionesBotellonesbtnActionPerformed
        NotificacionesBotellones notificacionesBotellones = new NotificacionesBotellones();

        DefaultTableModel modelo = (DefaultTableModel) notificacionesBotellones.NotificacionesBotetellonesTabla.getModel(); 
        logica.NotificaionesBotellones(modelo);
        
        notificacionesBotellones.setVisible(true);
        this.dispose();
        notificacionesBotellones.setLocationRelativeTo(null);
    }//GEN-LAST:event_NotificacionesBotellonesbtnActionPerformed

    private void HistorialBotellonesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialBotellonesbtnActionPerformed
        HistorialBotellones notificacionesBotellones = new HistorialBotellones();
        notificacionesBotellones.setVisible(true);
        this.dispose();        
        notificacionesBotellones.setLocationRelativeTo(null);
        
        DefaultTableModel modelo = (DefaultTableModel) notificacionesBotellones.HistorialBotetellonesTabla.getModel(); 
        logica.historialBotellones(modelo);
        //DefaultTableModel modelo = (DefaultTableModel) HistorialBotetellonesTabla.getModel();
        //logica.historialBotellones(modelo);
    }//GEN-LAST:event_HistorialBotellonesbtnActionPerformed

    private void RetirarEstudiantesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarEstudiantesbtnActionPerformed
        RetirarEstudiante retirar = new RetirarEstudiante();
        

        DefaultTableModel modelo = (DefaultTableModel) TablaEstudiantesRetirar.getModel();
        logica.MostrarEstudiante(modelo);
    }//GEN-LAST:event_RetirarEstudiantesbtnActionPerformed

    private void BuscarMatriculaRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarMatriculaRetirarActionPerformed
        String texto = getBuscarMatriculaText();
        System.out.println("Texto ingresado en BuscarMatriculaField: " + texto);

    }//GEN-LAST:event_BuscarMatriculaRetirarActionPerformed
    
    public String getBuscarMatriculaText() {
          return BuscarMatriculaRetirar.getText();
      }


    private void BuscarMatriculaRetirarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarMatriculaRetirarKeyReleased

    String matricula = BuscarMatriculaRetirar.getText().trim();  // Obtener la matrícula
    // Cancelar cualquier temporizador anterior
    if (timer != null) {
        timer.stop();
    }
    // Si la búsqueda es significativa (no vacía)
    if (!matricula.isEmpty()) {
        // Crear un nuevo temporizador que espera 500 ms antes de ejecutar la búsqueda
        timer = new Timer(400, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solo ejecutamos la búsqueda si la consulta es diferente de la última
                if (!matricula.equals(lastQuery)) {
                    DefaultTableModel modelo = (DefaultTableModel) TablaEstudiantesRetirar.getModel();
                    try {
                        ConsultasSQL.BuscarEstudiante(modelo, matricula); 
                        lastQuery = matricula;
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(VerEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        timer.setRepeats(false);
        timer.start();
    } else {
        // Si el campo está vacío, mostrar todos los estudiantes
        DefaultTableModel modelo = (DefaultTableModel) TablaEstudiantesRetirar.getModel();
        try {
            ConsultasSQL.BuscarEstudiante(modelo, matricula); // Método para mostrar todos los datos
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VerEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    }//GEN-LAST:event_BuscarMatriculaRetirarKeyReleased

    private void BuscarMatriculaRetirarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarMatriculaRetirarKeyTyped
        if(BuscarMatriculaRetirar.getText().length() >=8){
            evt.consume();
        }

        char key = evt.getKeyChar();
        if(!Character.isDigit(key)) {
            evt.consume();

        }

    }//GEN-LAST:event_BuscarMatriculaRetirarKeyTyped
        
      public String getBuscarMatriculaTextRetirar() {
        return BuscarMatriculaRetirar.getText();
    }
      
      
    private void RetirarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarbtnActionPerformed
     String matriculaStr = getBuscarMatriculaText(); 

    if (!matriculaStr.isEmpty()) {
        try {
            int matricula = Integer.parseInt(matriculaStr);

            modelo.RetirarMatricula(matricula);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una matrícula válida.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (FileNotFoundException ex) {
             Logger.getLogger(RetirarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
         }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese una matrícula.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_RetirarbtnActionPerformed

    private void EditarEstudiantebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarEstudiantebtnMouseEntered
        EditarEstudiantebtn.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_EditarEstudiantebtnMouseEntered

    private void EditarEstudiantebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarEstudiantebtnMouseExited
        EditarEstudiantebtn.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_EditarEstudiantebtnMouseExited

    private void EditarEstudiantebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEstudiantebtnActionPerformed
        EditarEstudiante editarEstudiante = new EditarEstudiante();
        editarEstudiante.setVisible(true);
        this.dispose();

        editarEstudiante.setLocationRelativeTo(null);

        DefaultTableModel modelo = (DefaultTableModel) editarEstudiante.TablaEstudiantesEditar.getModel();
        logica.MostrarEstudianteEditar(modelo);
    }//GEN-LAST:event_EditarEstudiantebtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField BuscarMatriculaRetirar;
    private javax.swing.JButton EditarEstudiantebtn;
    private javax.swing.JButton HistorialBotellonesbtn;
    private javax.swing.JButton HistorialCocinaBnt;
    private javax.swing.JButton HistorialEntradaSalida;
    private javax.swing.JButton InformeDeActividadBtn;
    private javax.swing.JButton NotificacionesBotellonesbtn;
    private javax.swing.JButton RegistrarEstudianteBtn;
    private javax.swing.JButton RetirarEstudiantesbtn;
    private javax.swing.JButton Retirarbtn;
    public javax.swing.JTable TablaEstudiantesRetirar;
    private javax.swing.JButton VerEstudianteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
