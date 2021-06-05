package form;

import apartment.MyConnect;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FromApartment extends javax.swing.JInternalFrame {

    Connection conn = MyConnect.connect();
    private DefaultTableModel modelApartment;

    public FromApartment() {
        initComponents();
        modelApartment = (DefaultTableModel)tableApart.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOK = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtbuild = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableApart = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtSeachApart = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("อพาร์ทเมนท์");
        setPreferredSize(new java.awt.Dimension(1000, 582));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOK.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnOK.setText("บันทึก");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        getContentPane().add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 30));

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnEdit.setText("แก้ไข");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 100, 30));

        btnDel.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnDel.setText("ลบ");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        getContentPane().add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("เลขที่อพาร์ทเมนท์");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("ชื่ออพาร์ทเมนท์");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("ที่อยู่");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("เบอร์โทรศัพท์");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("ปีที่สร้าง");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setText("ราคาห้องเริ่มต้น");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtnum.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 270, 30));

        txtname.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 270, 30));

        txtadd.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 270, 30));

        txttel.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 270, 30));

        txtbuild.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txtbuild, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 270, 30));

        txtprice.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 270, 30));

        tableApart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "เลขที่", "ชื่ออพาร์ทเมนท์", "ที่อยู่", "เบอร์โทร", "ปีที่สร้าง", "ราคาเริ่มต้น"
            }
        ));
        tableApart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableApartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableApart);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 960, 230));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ค้นข้อมูล"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSeachApart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSeachApartKeyReleased(evt);
            }
        });
        jPanel1.add(txtSeachApart, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 35, 400, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 410, 210));

        setBounds(0, 0, 1000, 582);
    }// </editor-fold>//GEN-END:initComponents

    public void showdata(){

    try{
        int totalRow = tableApart.getRowCount() -1;
        while (totalRow > -1){
        modelApartment.removeRow(totalRow);
        totalRow--;
        }
        String search = txtSeachApart.getText();
        String sql = "SELECT * FROM `tb_apartment`WHERE apart_name LIKE ('%" + search + "%') "
                + "OR apart_address LIKE ('%" + search + "%') "
                + "OR apart_phone LIKE ('%" + search + "%') "
                + "OR build_year LIKE ('%" + search + "%') "
                + "OR begin_rate LIKE ('%" + search + "%')";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        int row = 0;
        while (rs.next()){
            modelApartment.addRow(new Object[0]);
            modelApartment.setValueAt(rs.getInt("apart_no"),row , 0);
            modelApartment.setValueAt(rs.getString("apart_name"),row , 1);
            modelApartment.setValueAt(rs.getString("apart_address"),row , 2);
            modelApartment.setValueAt(rs.getString("apart_phone"),row , 3);
            modelApartment.setValueAt(rs.getString("build_year"),row , 4);
            modelApartment.setValueAt(rs.getString("begin_rate"),row , 5);
            row++;
        }
        tableApart.setModel(modelApartment);
    }catch (Exception e){
        e.printStackTrace();

    }
 }

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
       try{
        String sql = "INSERT INTO `tb_apartment`(`apart_no`, `apart_name`, `apart_address`, `apart_phone`, `build_year`, `begin_rate`) VALUES (?,?,?,?,?,?)";
        PreparedStatement pre = (PreparedStatement) conn.prepareStatement(sql);
        pre.setString(1,txtnum.getText());
        pre.setString(2,txtname.getText());
        pre.setString(3,txtadd.getText());
        pre.setString(4,txttel.getText());
        pre.setString(5,txtbuild.getText());
        pre.setString(6,txtprice.getText());
        if(pre.executeUpdate() !=-1){
        JOptionPane.showMessageDialog(this, "บันทึกรายการแล้ว","ผลการบันทึกรายการ",JOptionPane.INFORMATION_MESSAGE);
        txtnum.setText("");
        txtname.setText("");
        txtadd.setText("");
        txttel.setText("");
        txtbuild.setText("");
        txtprice.setText("");
        showdata();
        }
       }catch(Exception e){
        e.printStackTrace();
       }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
      int index = tableApart.getSelectedRow();
      if(index !=-1){
      int pk = (Integer) tableApart.getValueAt(index , 0);
      String sql = "UPDATE `tb_apartment` SET `apart_no`= ?,`apart_name`= ?,`apart_address`= ?,`apart_phone`= ?,`build_year`= ?,`begin_rate`= ?  WHERE apart_no" + pk;
      try{
        PreparedStatement pre = (PreparedStatement) conn.prepareStatement(sql);
        pre.setString(1,txtname.getText());
        pre.setString(2,txtadd.getText());
        pre.setString(3,txttel.getText());
        pre.setString(4,txtbuild.getText());
        pre.setString(5,txtprice.getText());
        if(pre.executeUpdate() !=-1){
        JOptionPane.showMessageDialog(this, "แก้ไขรายการแล้ว","ผลการแก้ไขรายการ",JOptionPane.INFORMATION_MESSAGE);
        txtnum.setText("");
        txtname.setText("");
        txtadd.setText("");
        txttel.setText("");
        txtbuild.setText("");
        txtprice.setText("");
        showdata();
        }
      }catch (Exception e){
          e.printStackTrace();
      }
     }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
      int index = tableApart.getSelectedRow();
      if(index !=-1){
      int pk = (Integer) tableApart.getValueAt(index , 0);
      String sql = "DELETE FROM `tb_apartment` WHERE apart_no = "+pk;
      try{
          if(conn.createStatement().executeUpdate(sql) !=1){
        JOptionPane.showMessageDialog(this, "ลบรายการแล้ว","ผลการลบรายการ",JOptionPane.INFORMATION_MESSAGE);
        txtnum.setText("");
        txtname.setText("");
        txtadd.setText("");
        txttel.setText("");
        txtbuild.setText("");
        txtprice.setText("");
        showdata();
          }

      }catch(Exception e){
          e.printStackTrace();
      }
    }
    }//GEN-LAST:event_btnDelActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
    showdata();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tableApartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableApartMouseClicked
        int index = tableApart.getSelectedRow();
        txtnum.setText(tableApart.getValueAt(index, 0).toString());
        txtname.setText(tableApart.getValueAt(index, 1).toString());
        txtadd.setText(tableApart.getValueAt(index, 2).toString());
        txttel.setText(tableApart.getValueAt(index, 3).toString());
        txtbuild.setText(tableApart.getValueAt(index, 4).toString());
        txtprice.setText(tableApart.getValueAt(index, 5).toString());
  
    }//GEN-LAST:event_tableApartMouseClicked

    private void txtSeachApartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeachApartKeyReleased
    String searchText = txtSeachApart.getText();
    try{
        if(!searchText.isEmpty()){
        showdata();
        }
    }catch(Exception e){
          e.printStackTrace();
        }
    }//GEN-LAST:event_txtSeachApartKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableApart;
    private javax.swing.JTextField txtSeachApart;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtbuild;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables

}
