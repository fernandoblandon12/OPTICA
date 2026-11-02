package com.mycompany.optica.Vista;
import com.mycompany.optica.dao.AroDAO;
import com.mycompany.optica.Modelo.Aro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrmCatalogoAros extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCatalogoAros.class.getName());

    private int idCliente;

    public FrmCatalogoAros(int idCliente) {
        initComponents();
        this.idCliente = idCliente;
        this.setLocationRelativeTo(null);
        this.setTitle("-.-.-.-.Catalogo de Aros.-.-.-.-");
        buscarAros();
    }

    private void buscarAros(){
        try{
            double precioMax = 999999;
            if(!txtPrecioMax.getText().equals("")){
                precioMax = Double.parseDouble(txtPrecioMax.getText());
            }
            AroDAO dao = new AroDAO();
            ArrayList<Aro> lista = dao.listarAros(txtMarca.getText(), txtMaterial.getText(), txtForma.getText(), precioMax);
            jcbSeleccionAro.removeAllItems();
            for(Aro aro : lista){
                jcbSeleccionAro.addItem(aro);
            }
            if(lista.size() == 0){
                JOptionPane.showMessageDialog(this, "-.-no se encontraron aros-.-");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "-.-error al cargar aros.-." + e.getMessage());
        }
    }

    private void mostrarDatosEnCampos(Aro aro){
        if(aro != null){
            txtMarcaAro.setText(aro.getMarca());
            txtMaterialAro.setText(aro.getMaterial());
            txtFormaAro.setText(aro.getForma());
            txtPrecioAro.setText(String.valueOf(aro.getPrecio()));
        }else{
            txtMarcaAro.setText("");
            txtMaterialAro.setText("");
            txtFormaAro.setText("");
            txtPrecioAro.setText("");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtMarca = new javax.swing.JTextField();
        txtMaterial = new javax.swing.JTextField();
        txtForma = new javax.swing.JTextField();
        txtPrecioMax = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblMarca = new javax.swing.JLabel();
        lblMaterial = new javax.swing.JLabel();
        lblForma = new javax.swing.JLabel();
        lblPrecioMax = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jcbSeleccionAro = new javax.swing.JComboBox<>();
        txtMarcaAro = new javax.swing.JTextField();
        txtMaterialAro = new javax.swing.JTextField();
        txtFormaAro = new javax.swing.JTextField();
        txtPrecioAro = new javax.swing.JTextField();
        btnApartar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblMarcaAro = new javax.swing.JLabel();
        lblMaterialAro = new javax.swing.JLabel();
        lblFormaAro = new javax.swing.JLabel();
        lblPrecioAro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Buscar Aro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(204, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 102, 102));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        lblMarca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(0, 153, 153));
        lblMarca.setText("Marca:");

        lblMaterial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaterial.setForeground(new java.awt.Color(0, 153, 153));
        lblMaterial.setText("Material:");

        lblForma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblForma.setForeground(new java.awt.Color(0, 153, 153));
        lblForma.setText("Forma:");

        lblPrecioMax.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPrecioMax.setForeground(new java.awt.Color(0, 153, 153));
        lblPrecioMax.setText("Precio maximo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblForma)
                    .addComponent(lblPrecioMax)
                    .addComponent(lblMaterial)
                    .addComponent(lblMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtForma, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaterial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblForma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPrecioMax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Apartar Aro:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jcbSeleccionAro.addActionListener(this::jcbSeleccionAroActionPerformed);

        txtMarcaAro.setEditable(false);

        txtMaterialAro.setEditable(false);

        txtFormaAro.setEditable(false);

        txtPrecioAro.setEditable(false);

        btnApartar.setBackground(new java.awt.Color(204, 255, 255));
        btnApartar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnApartar.setForeground(new java.awt.Color(0, 102, 102));
        btnApartar.setText("Apartar aro");
        btnApartar.addActionListener(this::btnApartarActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Aro:");

        lblMarcaAro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMarcaAro.setForeground(new java.awt.Color(0, 153, 153));
        lblMarcaAro.setText("Marca:");

        lblMaterialAro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaterialAro.setForeground(new java.awt.Color(0, 153, 153));
        lblMaterialAro.setText("Material:");

        lblFormaAro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFormaAro.setForeground(new java.awt.Color(0, 153, 153));
        lblFormaAro.setText("Forma:");

        lblPrecioAro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPrecioAro.setForeground(new java.awt.Color(0, 153, 153));
        lblPrecioAro.setText("Precio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jcbSeleccionAro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(lblMarcaAro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMarcaAro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblPrecioAro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPrecioAro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblFormaAro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFormaAro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblMaterialAro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMaterialAro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnApartar)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbSeleccionAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarcaAro))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaterialAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaterialAro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFormaAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFormaAro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecioAro)
                    .addComponent(txtPrecioAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnApartar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("CATALOGO DE AROS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarAros();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jcbSeleccionAroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSeleccionAroActionPerformed
        if(jcbSeleccionAro.getSelectedItem() != null){
            Aro aroSeleccionado = (Aro) jcbSeleccionAro.getSelectedItem();
            mostrarDatosEnCampos(aroSeleccionado);
        }else{
            mostrarDatosEnCampos(null);
        }
    }//GEN-LAST:event_jcbSeleccionAroActionPerformed

    private void btnApartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApartarActionPerformed
        if(jcbSeleccionAro.getSelectedItem() == null){
            JOptionPane.showMessageDialog(this, ".-.-.-.Seleccione un aro.-.-.-");
            return;
        }

        try{
            Aro aroSeleccionado = (Aro) jcbSeleccionAro.getSelectedItem();
            AroDAO dao = new AroDAO();
            boolean apartado = dao.apartarAro(idCliente, aroSeleccionado.getIdAro());
            if(apartado){
                JOptionPane.showMessageDialog(this, ".-.-.aro apartado correctamente-.-.-.");
            }else{
                JOptionPane.showMessageDialog(this, "-.-.-.no se pudo apartar el aro.-.-.-.");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "-.-.-.error al apartar aro--.-.-. " + e.getMessage());
        }
    }//GEN-LAST:event_btnApartarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmCatalogoAros(1).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApartar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<com.mycompany.optica.Modelo.Aro> jcbSeleccionAro;
    private javax.swing.JLabel lblForma;
    private javax.swing.JLabel lblFormaAro;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMarcaAro;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblMaterialAro;
    private javax.swing.JLabel lblPrecioAro;
    private javax.swing.JLabel lblPrecioMax;
    private javax.swing.JTextField txtForma;
    private javax.swing.JTextField txtFormaAro;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarcaAro;
    private javax.swing.JTextField txtMaterial;
    private javax.swing.JTextField txtMaterialAro;
    private javax.swing.JTextField txtPrecioAro;
    private javax.swing.JTextField txtPrecioMax;
    // End of variables declaration//GEN-END:variables
}
