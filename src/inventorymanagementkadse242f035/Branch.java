/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package inventorymanagementkadse242f035;

import database.DBConnection;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wickr
 */
public class Branch extends javax.swing.JPanel {

    /**
     * Creates new form Branch
     */
    public Branch() {
        initComponents();
    }

    public void loadBranchData() {
        System.out.println("Loading Branch Data");

        DefaultTableModel model = (DefaultTableModel) tableBranch.getModel();
        model.setRowCount(0);

        try {
            Connection con = DBConnection.DBHelper.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM branches");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("Branch_Id"),
                    rs.getString("Branch_Name"),
                    rs.getString("Location")
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void clearForm() {
        txtBranchName.setText("");
        txtLocation.setText("");
    }

    private boolean validateFields() {
        if (!txtBranchName.getText().equals("")
                && !txtLocation.getText().equals("")) {
            return false;
        } else {
            return true;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableBranch = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtBranchName = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        btnBranchSave = new javax.swing.JButton();
        btnBranchReset = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 800));

        tableBranch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Branch Name", "Location"
            }
        ));
        tableBranch.setPreferredSize(new java.awt.Dimension(1000, 300));
        jScrollPane1.setViewportView(tableBranch);

        jPanel1.setBackground(new java.awt.Color(140, 148, 156));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel31.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel31.setText("Branch Registration");

        jLabel32.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        jLabel32.setText("Branch Name");

        jLabel33.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        jLabel33.setText("Location");

        txtBranchName.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        txtBranchName.setPreferredSize(new java.awt.Dimension(200, 28));

        txtLocation.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        txtLocation.setPreferredSize(new java.awt.Dimension(200, 28));

        btnBranchSave.setBackground(new java.awt.Color(4, 61, 142));
        btnBranchSave.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        btnBranchSave.setForeground(new java.awt.Color(255, 255, 255));
        btnBranchSave.setText("Save");
        btnBranchSave.setBorder(null);
        btnBranchSave.setPreferredSize(new java.awt.Dimension(89, 29));
        btnBranchSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchSaveActionPerformed(evt);
            }
        });

        btnBranchReset.setBackground(new java.awt.Color(4, 61, 142));
        btnBranchReset.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        btnBranchReset.setForeground(new java.awt.Color(255, 255, 255));
        btnBranchReset.setText("Reset");
        btnBranchReset.setBorder(null);
        btnBranchReset.setPreferredSize(new java.awt.Dimension(89, 29));
        btnBranchReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jLabel31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBranchSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnBranchReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBranchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(457, 457, 457)))))
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel31)
                .addGap(137, 137, 137)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBranchSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBranchReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBranchSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchSaveActionPerformed
        String branchName = txtBranchName.getText();
        String location = txtLocation.getText();

        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            try {
                Connection con = DBConnection.DBHelper.getConnection();
                PreparedStatement pstmt = con.prepareStatement("insert into branches (Branch_Name, Location) VALUES (?, ?)");
                pstmt.setString(1, branchName);
                pstmt.setString(2, location);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Branch Added Successfully");
                setVisible(true);
                loadBranchData();
                clearForm();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnBranchSaveActionPerformed

    private void btnBranchResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchResetActionPerformed
        setVisible(true);
        clearForm();
        loadBranchData();
    }//GEN-LAST:event_btnBranchResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBranchReset;
    private javax.swing.JButton btnBranchSave;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnReset2;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSave2;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JComboBox<String> comBoxRole;
    private javax.swing.JComboBox<String> comBoxRole1;
    private javax.swing.JComboBox<String> comBoxRole2;
    private javax.swing.JComboBox<String> comBoxStatus;
    private javax.swing.JComboBox<String> comBoxStatus1;
    private javax.swing.JComboBox<String> comBoxStatus2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBranch;
    private javax.swing.JTextField txtBranch;
    private javax.swing.JTextField txtBranch1;
    private javax.swing.JTextField txtBranch2;
    private javax.swing.JTextField txtBranchName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEmail2;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtNIC1;
    private javax.swing.JTextField txtNIC2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPhone1;
    private javax.swing.JTextField txtPhone2;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsername1;
    private javax.swing.JTextField txtUsername2;
    // End of variables declaration//GEN-END:variables
}
