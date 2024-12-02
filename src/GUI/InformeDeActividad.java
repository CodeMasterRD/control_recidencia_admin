/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import DAO.BotellonesDAO.LlenarBotellonesDAO;
import Percistencia.DBConexion;
import control_servidor_admin.EstadisticaBotellones;
import java.awt.BorderLayout;
import java.awt.Dimension;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import control_servidor_admin.EstadisticaEstado;
import control_servidor_admin.ConsultasSQL;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import VentanasEmegentes.IngresarBotellonesConfirmar;
import Controlador.EstudianteControlador;
import Controlador.EntradaSalidaControlador;
import Controlador.BotellonesControlador;


/**
 *
 * @author Erick Tejada
 */
public class InformeDeActividad extends javax.swing.JFrame {
    
       
    public InformeDeActividad() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    ConsultasSQL logica = new ConsultasSQL();
    VerEstudiantes verEstudiantes = new VerEstudiantes(); 
    EstudianteControlador estudianteControlador = new EstudianteControlador();
    EntradaSalidaControlador entradaSalidaControlador = new EntradaSalidaControlador();
    BotellonesControlador botellonesControlador = new BotellonesControlador();




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        GraficoInformePastelEstudiante = new javax.swing.JPanel();
        GenerarTablabtn = new javax.swing.JButton();
        GraficoInformePastelBotellones = new javax.swing.JPanel();
        IngresarBotellonesbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        RegistrarEstudianteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VerEstudianteBtn = new javax.swing.JButton();
        HistorialCocinaBnt = new javax.swing.JButton();
        HistorialCocinaBnt1 = new javax.swing.JButton();
        InformeDeActividadBtn = new javax.swing.JButton();
        NotificacionesBotellonesbtn = new javax.swing.JButton();
        HistorialBotellonesbtn = new javax.swing.JButton();
        RetirarEstudiantesbtn = new javax.swing.JButton();
        EditarEstudiantebtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(30, 30, 30));

        GraficoInformePastelEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        GraficoInformePastelEstudiante.setPreferredSize(new java.awt.Dimension(400, 350));

        javax.swing.GroupLayout GraficoInformePastelEstudianteLayout = new javax.swing.GroupLayout(GraficoInformePastelEstudiante);
        GraficoInformePastelEstudiante.setLayout(GraficoInformePastelEstudianteLayout);
        GraficoInformePastelEstudianteLayout.setHorizontalGroup(
            GraficoInformePastelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        GraficoInformePastelEstudianteLayout.setVerticalGroup(
            GraficoInformePastelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        GenerarTablabtn.setBackground(new java.awt.Color(30, 30, 30));
        GenerarTablabtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        GenerarTablabtn.setForeground(new java.awt.Color(255, 255, 255));
        GenerarTablabtn.setText("Generar Grafica");
        GenerarTablabtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 153, 255)));
        GenerarTablabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GenerarTablabtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GenerarTablabtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GenerarTablabtnMousePressed(evt);
            }
        });
        GenerarTablabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarTablabtnActionPerformed(evt);
            }
        });
        GenerarTablabtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GenerarTablabtnKeyPressed(evt);
            }
        });

        GraficoInformePastelBotellones.setForeground(new java.awt.Color(255, 255, 255));
        GraficoInformePastelBotellones.setPreferredSize(new java.awt.Dimension(400, 350));

        javax.swing.GroupLayout GraficoInformePastelBotellonesLayout = new javax.swing.GroupLayout(GraficoInformePastelBotellones);
        GraficoInformePastelBotellones.setLayout(GraficoInformePastelBotellonesLayout);
        GraficoInformePastelBotellonesLayout.setHorizontalGroup(
            GraficoInformePastelBotellonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        GraficoInformePastelBotellonesLayout.setVerticalGroup(
            GraficoInformePastelBotellonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        IngresarBotellonesbtn.setBackground(new java.awt.Color(30, 30, 30));
        IngresarBotellonesbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        IngresarBotellonesbtn.setForeground(new java.awt.Color(255, 255, 255));
        IngresarBotellonesbtn.setText("Ingresar Botellones");
        IngresarBotellonesbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        IngresarBotellonesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarBotellonesbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(GraficoInformePastelEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(GraficoInformePastelBotellones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GenerarTablabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(IngresarBotellonesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GraficoInformePastelBotellones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GraficoInformePastelEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(GenerarTablabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(IngresarBotellonesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        jPanel2.setBackground(new java.awt.Color(0, 55, 133));
        jPanel2.setPreferredSize(new java.awt.Dimension(332, 607));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(RegistrarEstudianteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 332, 55));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ControlAdmin");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 18, -1, 28));

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
        jPanel2.add(VerEstudianteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 332, 55));

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
        jPanel2.add(HistorialCocinaBnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 332, 55));

        HistorialCocinaBnt1.setBackground(new java.awt.Color(20, 101, 187));
        HistorialCocinaBnt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HistorialCocinaBnt1.setForeground(new java.awt.Color(255, 255, 255));
        HistorialCocinaBnt1.setText("Historial Entrada/salida");
        HistorialCocinaBnt1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        HistorialCocinaBnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialCocinaBnt1ActionPerformed(evt);
            }
        });
        jPanel2.add(HistorialCocinaBnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 332, 55));

        InformeDeActividadBtn.setBackground(new java.awt.Color(51, 153, 255));
        InformeDeActividadBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InformeDeActividadBtn.setForeground(new java.awt.Color(255, 255, 255));
        InformeDeActividadBtn.setText("Informe De Actividad");
        InformeDeActividadBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(20, 101, 187)));
        InformeDeActividadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformeDeActividadBtnActionPerformed(evt);
            }
        });
        jPanel2.add(InformeDeActividadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 332, 55));

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
        jPanel2.add(NotificacionesBotellonesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 332, 55));

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
        jPanel2.add(HistorialBotellonesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 345, 332, 55));

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
        jPanel2.add(RetirarEstudiantesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 332, 55));

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
        jPanel2.add(EditarEstudiantebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 455, 332, 55));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 52, 197, 12));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        
        DefaultTableModel modelo = (DefaultTableModel) verEstudiantes.TablaEstudiantes.getModel();
        estudianteControlador.MostrarEstudiante(modelo);
        
        
        VerEstudiantes verEstudiantes = new VerEstudiantes();
        verEstudiantes.setVisible(true);
        this.dispose();
        verEstudiantes.setLocationRelativeTo(null);
    }//GEN-LAST:event_VerEstudianteBtnActionPerformed

    private void HistorialCocinaBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialCocinaBntActionPerformed
        HistorialCocina Cocina = new HistorialCocina();
        DefaultTableModel modelo = (DefaultTableModel) Cocina.HistorialCocinaTable.getModel(); 
        logica.HistorialUsoCocina(modelo);
        
        Cocina.setVisible(true);
        this.dispose();
        Cocina.setLocationRelativeTo(null);
    }//GEN-LAST:event_HistorialCocinaBntActionPerformed

    private void HistorialCocinaBnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialCocinaBnt1ActionPerformed
        HistorialEntradaSalida historialEntradaSalida = new HistorialEntradaSalida();
        
        DefaultTableModel modelo = (DefaultTableModel) historialEntradaSalida.TablaHitorialEntradaSalida.getModel(); 
        entradaSalidaControlador.HistorialEntradaSalida(modelo);
        
        historialEntradaSalida.setVisible(true);
        this.dispose();
        historialEntradaSalida.setLocationRelativeTo(null);
    }//GEN-LAST:event_HistorialCocinaBnt1ActionPerformed

    private void InformeDeActividadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformeDeActividadBtnActionPerformed
     
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
        botellonesControlador.historialBotellones(modelo);
        //DefaultTableModel modelo = (DefaultTableModel) HistorialBotetellonesTabla.getModel();
        //logica.historialBotellones(modelo);
    }//GEN-LAST:event_HistorialBotellonesbtnActionPerformed

    private void RetirarEstudiantesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarEstudiantesbtnActionPerformed
        RetirarEstudiante retirar = new RetirarEstudiante();
    retirar.setVisible(true);
    this.dispose();
    retirar.setLocationRelativeTo(null);
    
    DefaultTableModel modelo = (DefaultTableModel) retirar.TablaEstudiantesRetirar.getModel(); 
    estudianteControlador.VerTodosEstudiantes(modelo);
        // TODO add your handling code here:
    }//GEN-LAST:event_RetirarEstudiantesbtnActionPerformed

    private void GenerarTablabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarTablabtnActionPerformed
        EstadisticaEstado estadisticas = new EstadisticaEstado(0, 0, 0);
    
        // Llamar al método para obtener los conteos
        estadisticas.ConsultarEstadoEstudiante();

        // Crear el dataset para el gráfico de pastel
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Dentro", estadisticas.n1);
        datos.setValue("Fuera", estadisticas.n2);
        datos.setValue("En Cocina", estadisticas.n3);

        // Crear el gráfico de pastel usando el dataset
        JFreeChart grafico_pastel = ChartFactory.createPieChart(
            "Informe de Actividad Estudiantes", // Título del gráfico
            datos,                // Dataset
            true,                   // Incluir leyenda
            true,                   // Incluir tooltips
            false                   // No incluir URLs
        );

        ChartPanel panel = new ChartPanel(grafico_pastel);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400, 350));
        
        

        GraficoInformePastelEstudiante.setLayout(new BorderLayout());
        GraficoInformePastelEstudiante.add(panel,BorderLayout.NORTH);
        
        pack();
        repaint();
        
        
        
        
        EstadisticaBotellones estadisticaBotellones = new EstadisticaBotellones(0,0,0);
        estadisticaBotellones.ConsultarEstadoEstudiante();
        
        DefaultPieDataset botellones = new DefaultPieDataset();
        botellones.setValue("llenos", estadisticaBotellones.n1);
        botellones.setValue("Vacios", estadisticaBotellones.n2);
        botellones.setValue("En uso", estadisticaBotellones.n3);
        
        JFreeChart grafico_pastel_botellones = ChartFactory.createPieChart(
            "Informer de botellones", // Título del gráfico
            botellones,                // Dataset
            true,                   // Incluir leyenda
            true, 
            false
        );
        
        ChartPanel panel_Estudiante = new ChartPanel(grafico_pastel_botellones);
        panel_Estudiante.setMouseWheelEnabled(true);
        panel_Estudiante.setPreferredSize(new Dimension(400, 350));
        
        GraficoInformePastelBotellones.setLayout(new BorderLayout());
        GraficoInformePastelBotellones.add(panel_Estudiante,BorderLayout.NORTH);
        
        pack();
        repaint();
        
    }//GEN-LAST:event_GenerarTablabtnActionPerformed

    private void GenerarTablabtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GenerarTablabtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerarTablabtnKeyPressed

    private void GenerarTablabtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarTablabtnMouseEntered
        GenerarTablabtn.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_GenerarTablabtnMouseEntered

    private void GenerarTablabtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarTablabtnMouseExited
        GenerarTablabtn.setBackground(new Color(30,30,30));
    }//GEN-LAST:event_GenerarTablabtnMouseExited

    private void GenerarTablabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarTablabtnMousePressed
        GenerarTablabtn.setBackground(new Color(30,30,30));
    }//GEN-LAST:event_GenerarTablabtnMousePressed

    private void EditarEstudiantebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarEstudiantebtnMouseEntered
        EditarEstudiantebtn.setBackground(new Color(0,55,133));
    }//GEN-LAST:event_EditarEstudiantebtnMouseEntered

    private void EditarEstudiantebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarEstudiantebtnMouseExited
        EditarEstudiantebtn.setBackground(new Color(20,101,187));
    }//GEN-LAST:event_EditarEstudiantebtnMouseExited

    private void EditarEstudiantebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEstudiantebtnActionPerformed
        EditarEstudiante editarEstudiante = new EditarEstudiante();
        editarEstudiante.setVisible(true);
        this.dispose(); // Cierra la ventana actual.

        editarEstudiante.setLocationRelativeTo(null);
    
        DefaultTableModel modelo = (DefaultTableModel) editarEstudiante.TablaEstudiantesEditar.getModel();
        estudianteControlador.MostrarEstudiante(modelo);
    }//GEN-LAST:event_EditarEstudiantebtnActionPerformed

    private void IngresarBotellonesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarBotellonesbtnActionPerformed
        IngresarBotellonesConfirmar ingresarBotellonesConfirmar = new IngresarBotellonesConfirmar();
        
        
        ingresarBotellonesConfirmar.setVisible(true);
        ingresarBotellonesConfirmar.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_IngresarBotellonesbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarEstudiantebtn;
    private javax.swing.JButton GenerarTablabtn;
    private javax.swing.JPanel GraficoInformePastelBotellones;
    private javax.swing.JPanel GraficoInformePastelEstudiante;
    private javax.swing.JButton HistorialBotellonesbtn;
    private javax.swing.JButton HistorialCocinaBnt;
    private javax.swing.JButton HistorialCocinaBnt1;
    private javax.swing.JButton InformeDeActividadBtn;
    private javax.swing.JButton IngresarBotellonesbtn;
    private javax.swing.JButton NotificacionesBotellonesbtn;
    private javax.swing.JButton RegistrarEstudianteBtn;
    private javax.swing.JButton RetirarEstudiantesbtn;
    private javax.swing.JButton VerEstudianteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
