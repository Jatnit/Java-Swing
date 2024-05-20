/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong3.Bai2.UI;


import Chuong3.Bai2.DAO.DAO;
import Chuong3.Bai2.MODEL.CDDVD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author latu2
 */
public class ViewTong extends javax.swing.JFrame {
    
    private ArrayList<CDDVD> list;
    DefaultTableModel model;
    int index = 0;
    
    public void fillDataToTable(){
        DAO cddao = new DAO();
        list = cddao.getListCDDVD();
        model = (DefaultTableModel) tableCDDVD.getModel();
        model.setRowCount(0);
        
        for(CDDVD cd: list){
            Object[] row = new Object[]{cd.getMa(), cd.getTieuDe(), cd.getLoai(), cd.getNamXB()};
            model.addRow(row);
        }
        tableCDDVD.setModel(model);
    }
    
    public void showFrom(){
        index = tableCDDVD.getSelectedRow();
        if(index<0){
            JOptionPane.showMessageDialog(this, "Chưa chọn 1 dòng trên bảng");
            return;
        }else{
            CDDVD cd = new CDDVD();
            cd = list.get(index);
            txtMa.setText(cd.getMa());
            txtTieuDe.setText(cd.getTieuDe());
            txtLoai.setText(cd.getLoai());
            txtNamXB.setText(cd.getNamXB()+"");
        }
            
    }
    
    public void ClearForm(){
        this.txtMa.setText("");
        this.txtTieuDe.setText("");
        this.txtLoai.setText("");
        this.txtNamXB.setText("");
        this.txtMa.requestFocus();
    }
    
    
    /**
     * Creates new form View
     */
    public ViewTong() {
        initComponents();
        this.setLocationRelativeTo(null);
        fillDataToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTieuDe = new javax.swing.JTextField();
        txtLoai = new javax.swing.JTextField();
        txtNamXB = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCDDVD = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý CD / DVD");

        jLabel1.setText("Mã");

        jLabel2.setText("Tiêu đề");

        jLabel3.setText("Loại đĩa");

        jLabel4.setText("Năm XB");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        tableCDDVD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tiêu đề", "Loại", "Năm XB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCDDVD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCDDVDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCDDVD);

        btnSua.setText("Sua");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMa)
                            .addComponent(txtTieuDe)
                            .addComponent(txtLoai)
                            .addComponent(txtNamXB, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnLuu)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ClearForm();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        DAO cddao =new DAO();
        CDDVD cd = new CDDVD();
        cd.setMa(txtMa.getText());
        cd.setTieuDe(txtTieuDe.getText());
        cd.setLoai(txtLoai.getText());
        cd.setNamXB(Integer.parseInt(txtNamXB.getText()));
        int x =cddao.addDia(cd);

        if (x>0) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            fillDataToTable(); // them vao danh sach SV
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại!");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        DAO cddao =new DAO();
//        CDDVD cd = new CDDVD();
        int x =cddao.removeDia(txtMa.getText());
        if (x>0) {
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
            fillDataToTable();
        }
        else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại!");
        }
//        DefaultTableModel model = (DefaultTableModel) tableCDDVD.getModel();
//        model.setRowCount(0);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        ViewTimKiem frame2 = new ViewTimKiem();
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(frame2.DISPOSE_ON_CLOSE);
        frame2.setVisible(true);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tableCDDVDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCDDVDMouseClicked
        index = tableCDDVD.getSelectedRow();
        CDDVD dia = list.get(index);
        txtMa.setText(dia.getMa());
        txtTieuDe.setText(dia.getTieuDe());
        txtLoai.setText(dia.getLoai());
        txtNamXB.setText(String.valueOf(dia.getNamXB()));
    }//GEN-LAST:event_tableCDDVDMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        DAO cddao =new DAO();
        CDDVD cd = new CDDVD();
        cd.setMa(txtMa.getText());
        cd.setTieuDe(txtTieuDe.getText());
        cd.setLoai(txtLoai.getText());
        cd.setNamXB(Integer.parseInt(txtNamXB.getText()));
        int x =cddao.suaDia(cd);
        if (x>0) {
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
            fillDataToTable(); // them vao danh sach SV
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thất bại!");
        }
    }//GEN-LAST:event_btnSuaActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCDDVD;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNamXB;
    private javax.swing.JTextField txtTieuDe;
    // End of variables declaration//GEN-END:variables
}
