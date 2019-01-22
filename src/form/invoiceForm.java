/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Dimension;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.uiManagement;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.design.JRJavacCompiler;


/**
 *
 * @author arty
 */
public class invoiceForm extends javax.swing.JFrame {

    /**
     * Creates new form invoiceForm
     */
    Connection c = util.dbConnection.getDatabase();
    uiManagement ui = new uiManagement();
    private DefaultTableModel model = new DefaultTableModel();
    private DefaultComboBoxModel treatment = new DefaultComboBoxModel();
    
    public invoiceForm() {
        initComponents();
        ui.setUI();
        model = (DefaultTableModel) resultTable.getModel();
        treatment = (DefaultComboBoxModel) treatmentIDComboBox.getModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoiceLabel = new javax.swing.JLabel();
        mainFormButton = new javax.swing.JButton();
        resultIDLabel = new javax.swing.JLabel();
        resultDateLabel = new javax.swing.JLabel();
        treatmentIDLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        resultCommentLabel = new javax.swing.JLabel();
        resultPriceLabel = new javax.swing.JLabel();
        resultCommentField = new javax.swing.JTextField();
        resultPriceField = new javax.swing.JFormattedTextField();
        resultComboBox = new javax.swing.JComboBox<>();
        treatmentIDComboBox = new javax.swing.JComboBox<>();
        resultDateField = new javax.swing.JTextField();
        resultIDField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        selectButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        resultIssueButton = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        tableScrollPane = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ພັບຈີຄລີນິກ - ຜົນກວດສຸຂະພາບ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        invoiceLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 36)); // NOI18N
        invoiceLabel.setText("ຜົນການກວດສຸຂະພາບ");

        mainFormButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        mainFormButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.png"))); // NOI18N
        mainFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainFormButtonActionPerformed(evt);
            }
        });

        resultIDLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        resultIDLabel.setText("ລະຫັດຜົນກວດ");

        resultDateLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        resultDateLabel.setText("ເວລາຜົນກວດ");

        treatmentIDLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        treatmentIDLabel.setText("ລະຫັດການກວດ");

        resultLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        resultLabel.setText("ຜົນການກວດ");

        resultCommentLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        resultCommentLabel.setText("ຄຳເຫັນຈາກທ່ານໝໍ");

        resultPriceLabel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        resultPriceLabel.setText("ລາຄາ");

        resultCommentField.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N

        resultPriceField.setEditable(false);
        resultPriceField.setText("0");

        resultComboBox.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        resultComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ປົກກະຕິ", "ມີບັນຫາເລັກນ້ອຍ", "ມີບັນຫາປານກາງ", "ມີບັນຫາຮ້າຍແຮງ" }));

        treatmentIDComboBox.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        treatmentIDComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                treatmentIDComboBoxItemStateChanged(evt);
            }
        });

        resultDateField.setEditable(false);
        resultDateField.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N

        resultIDField.setEditable(false);
        resultIDField.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N

        addButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        addButton.setText("ເພີ່ມ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        selectButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        selectButton.setText("ເລືອກ");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        editButton.setText("ແກ້ໄຂ");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        deleteButton.setText("ລົບ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        refreshButton.setText("ໂຫຼດໃໝ່");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        reportButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        reportButton.setText("ລາຍງານ");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        resultIssueButton.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        resultIssueButton.setText("ອອກຜົນ");
        resultIssueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultIssueButtonActionPerformed(evt);
            }
        });

        resultTable.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ລະຫັດຜົນກວດ", "ເວລາຜົນກວດ", "ລະຫັດການກວດ", "ຜົນກວດ", "ຄຳເຫັນ", "ລາຄາ"
            }
        ));
        resultTable.getTableHeader().setFont(new java.awt.Font("Phetsarath OT", 0, 14));
        tableScrollPane.setViewportView(resultTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultLabel)
                        .addGap(35, 35, 35)
                        .addComponent(resultComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(treatmentIDLabel)
                        .addGap(20, 20, 20)
                        .addComponent(treatmentIDComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultDateLabel)
                        .addGap(32, 32, 32)
                        .addComponent(resultDateField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultIDLabel)
                        .addGap(26, 26, 26)
                        .addComponent(resultIDField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultCommentLabel)
                            .addComponent(resultPriceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reportButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultIssueButton)
                                .addGap(0, 63, Short.MAX_VALUE))
                            .addComponent(resultPriceField)
                            .addComponent(resultCommentField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainFormButton)
                        .addGap(133, 133, 133)
                        .addComponent(invoiceLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tableScrollPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invoiceLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(mainFormButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultIDLabel)
                    .addComponent(resultIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultDateLabel)
                    .addComponent(resultDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(treatmentIDLabel)
                    .addComponent(treatmentIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultLabel)
                    .addComponent(resultComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultCommentLabel)
                    .addComponent(resultCommentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultPriceLabel)
                    .addComponent(resultPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(selectButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(refreshButton)
                    .addComponent(reportButton)
                    .addComponent(resultIssueButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainFormButtonActionPerformed
        // TODO add your handling code here:
        mainForm form = new mainForm();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mainFormButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            int rowCount = resultTable.getRowCount()-1;
            while (rowCount > -1){
            model.removeRow(rowCount--);
            }
            String sql = "call initResult()";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector row = new Vector();
                row.add(rs.getInt("tbResult.result_id"));
                row.add(rs.getDate("tbResult.result_date"));
                row.add(rs.getInt("tbResult.treatment_id"));
                row.add(rs.getString("tbResult.result"));
                row.add(rs.getString("tbResult.result_comment"));
                row.add(rs.getInt("tbResult.result_price"));
                model.addRow(row);
            }
            rs.close();
            resultTable.setModel(model);
            
            sql = "call getTreatmentID()";
            rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                treatment.addElement(rs.getInt("tbDoctor.treatment_id"));
            }
            rs.close();
            treatmentIDComboBox.setModel(treatment);
            
            getPrice();
        
        } catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        int id =(Integer) treatmentIDComboBox.getSelectedItem();
        String result = (String) resultComboBox.getSelectedItem();
        String comment = (String) resultCommentField.getText();
        int price = Integer.parseInt(resultPriceField.getText());
        int statementNumber = 0;
        try {
            String sql = "call addResult("+id+", '"+result+"', '"+comment+"', "+price+")";
            Statement s = c.createStatement();
            statementNumber = s.executeUpdate(sql);
            if (statementNumber != 0){
                JOptionPane.showMessageDialog(rootPane, "ອອກຜົນກວດຮຽບຮ້ອຍ", "ສຳເລັດຜົນ", JOptionPane.INFORMATION_MESSAGE);
                this.formWindowOpened(null);
            } else {
                JOptionPane.showMessageDialog(rootPane, "ດຳເນີນການບໍ່ສຳເລັດ, ກະລຸນາລອງໃໝ່", "ບໍ່ສຳເລັດຜົນ", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(rootPane, "ຂໍ້ຜິດພາດໄດ້ເກີດຂຶ້ນ: "+ e, "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        // TODO add your handling code here:
        try {
            int index = resultTable.getSelectedRow();
            resultIDField.setText(String.valueOf(resultTable.getValueAt(index, 0)));
            resultDateField.setText(String.valueOf(resultTable.getValueAt(index, 1)));
            treatmentIDComboBox.setSelectedItem(String.valueOf(resultTable.getValueAt(index, 2)));
            resultComboBox.setSelectedItem(String.valueOf(resultTable.getValueAt(index, 3)));
            resultCommentField.setText(String.valueOf(resultTable.getValueAt(index, 4)));
            resultPriceField.setText(String.valueOf(resultTable.getValueAt(index, 5)));
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(rootPane, "ກະລຸນາເລືອກຂໍ້ມູນໃນຕາຕະລາງ", "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_selectButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "ບໍ່ອະນຸຍາດໃຫ້ແກ້ໄຂ", "ຕ້ອງຫ້າມ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "ບໍ່ອະນຸຍາດໃຫ້ລົບ", "ຕ້ອງຫ້າມ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        this.formWindowOpened(null);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "ລາຍງານນີ້ແມ່ນອັນດຽວກັນກັບລາຍງານການກວດ", "ຂໍ້ມູນ", JOptionPane.INFORMATION_MESSAGE);
        try {
            JasperPrint jp = JasperFillManager.fillReport("src/report/doctorReport.jasper", null, c);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            
        } catch (JRException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(rootPane, "ຂໍ້ຜິດພາດໄດ້ເກີດຂຶ້ນ: "+ e, "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
        }

        
    }//GEN-LAST:event_reportButtonActionPerformed

    private void resultIssueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultIssueButtonActionPerformed
        // TODO add your handling code here:
        try {
            
            JasperPrint jp = JasperFillManager.fillReport("src/report/resultReport.jasper", null, c);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
            
            
        } catch (JRException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(rootPane, "ຂໍ້ຜິດພາດໄດ້ເກີດຂຶ້ນ: "+ e, "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
        } catch (NoClassDefFoundError e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(rootPane, "ບໍ່ສາມາດເອີ້ນລາຍງານໄດ້", "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_resultIssueButtonActionPerformed

    private void treatmentIDComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_treatmentIDComboBoxItemStateChanged
        // TODO add your handling code here:
        getPrice();
    }//GEN-LAST:event_treatmentIDComboBoxItemStateChanged

    private void getPrice(){
        try {
            int id = Integer.valueOf(String.valueOf(treatmentIDComboBox.getSelectedItem()));
            int price = 0;
            String sql = "call getTreatmentPriceByID('"+id+"')";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()){
                price = rs.getInt("tbDoctorType.type_price");
                if (price != 0){
                    resultPriceField.setText(String.valueOf(price));
                } else {
                    JOptionPane.showMessageDialog(rootPane, "ບໍ່ສາມາດຄິດໄລ່ລາຄາໄດ້", "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
                }
            }
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(rootPane, "ຂໍ້ຜິດພາດໄດ້ເກີດຂຶ້ນ: "+ e, "ຂໍ້ຜິດພາດ", JOptionPane.WARNING_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(invoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new invoiceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel invoiceLabel;
    private javax.swing.JButton mainFormButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JComboBox<String> resultComboBox;
    private javax.swing.JTextField resultCommentField;
    private javax.swing.JLabel resultCommentLabel;
    private javax.swing.JTextField resultDateField;
    private javax.swing.JLabel resultDateLabel;
    private javax.swing.JTextField resultIDField;
    private javax.swing.JLabel resultIDLabel;
    private javax.swing.JButton resultIssueButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JFormattedTextField resultPriceField;
    private javax.swing.JLabel resultPriceLabel;
    private javax.swing.JTable resultTable;
    private javax.swing.JButton selectButton;
    private javax.swing.JSeparator separator;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JComboBox<String> treatmentIDComboBox;
    private javax.swing.JLabel treatmentIDLabel;
    // End of variables declaration//GEN-END:variables
}