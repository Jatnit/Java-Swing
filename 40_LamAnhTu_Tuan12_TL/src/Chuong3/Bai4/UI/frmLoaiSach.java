/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Bai3_5.View;

import Bai3_5.Controller.DBController;
import Bai3_5.Model.LoaiSach;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kaiser
 */
public class frmLoaiSach extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmLoaiSach
     */
    int index = 0;

    public frmLoaiSach() {
        initComponents();
        fillData();
    }

    public void fillData() {
        DBController ct = new DBController();
        List<LoaiSach> listLS = ct.listLoaiSach();
        if (listLS.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Chưa load được dữ liệu");
        } else {
            JOptionPane.showMessageDialog(null, "Load thành công dữ liệu");

            DefaultTableModel model = (DefaultTableModel) tbLoaiSach.getModel();
            model.setRowCount(0);

            for (LoaiSach ls : listLS) {
                Object[] row = new Object[3];
                row[0] = ls.getLS_ID();
                row[1] = ls.getTen();
                row[2] = ls.getMoTa();
                model.addRow(row);
            }

            tbLoaiSach.setModel(model);
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
        tbLoaiSach = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Quản lý loại sách");
        setVisible(true);

        tbLoaiSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Tên", "Mô Tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLoaiSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLoaiSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLoaiSach);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin loại sách"));

        jLabel1.setText("Tên sách");

        jLabel2.setText("Mô tả");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnThem)
                        .addGap(38, 38, 38)
                        .addComponent(btnSua)
                        .addGap(29, 29, 29)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDong)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDong)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbLoaiSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLoaiSachMouseClicked
        int selectedRow = tbLoaiSach.getSelectedRow();

        if (selectedRow >= 0) {
            String ten = tbLoaiSach.getValueAt(selectedRow, 1).toString();
            String moTa = tbLoaiSach.getValueAt(selectedRow, 2).toString();

            txtTenSach.setText(ten);
            txtMoTa.setText(moTa);

            index = selectedRow;
        }
    }//GEN-LAST:event_tbLoaiSachMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String ten = txtTenSach.getText();
        String moTa = txtMoTa.getText();

        if (!ten.isEmpty() && !moTa.isEmpty()) {
            LoaiSach loaiSach = new LoaiSach();
            loaiSach.setTen(ten);
            loaiSach.setMoTa(moTa);

            DBController ct = new DBController();
            boolean success = ct.insertLoaiSach(loaiSach);

            if (success) {
                JOptionPane.showMessageDialog(null, "Thêm loại sách thành công!");
                fillData();
                txtTenSach.setText("");
                txtMoTa.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm loại sách thất bại!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRow = tbLoaiSach.getSelectedRow();
        if (selectedRow >= 0) {
            int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xoá loại sách này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(tbLoaiSach.getValueAt(selectedRow, 0).toString());
                DBController ct = new DBController();
                boolean success = ct.deleteLoaiSach(id);
                if (success) {
                    JOptionPane.showMessageDialog(null, "Xoá loại sách thành công!");
                    fillData();
                    txtTenSach.setText("");
                    txtMoTa.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Xoá loại sách thất bại!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một loại sách để xoá!");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int selectedRow = tbLoaiSach.getSelectedRow();
        if (selectedRow >= 0) {
            int id = Integer.parseInt(tbLoaiSach.getValueAt(selectedRow, 0).toString());
            String ten = txtTenSach.getText();
            String moTa = txtMoTa.getText();
            if (!ten.isEmpty() && !moTa.isEmpty()) {
                LoaiSach loaiSach = new LoaiSach();
                loaiSach.setLS_ID(id);
                loaiSach.setTen(ten);
                loaiSach.setMoTa(moTa);
                DBController ct = new DBController();
                boolean success = ct.updateLoaiSach(loaiSach);
                if (success) {
                    JOptionPane.showMessageDialog(null, "Cập nhật loại sách thành công!");
                    fillData();
                } else {
                    JOptionPane.showMessageDialog(null, "Cập nhật loại sách thất bại!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một loại sách để cập nhật!");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLoaiSach;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}
