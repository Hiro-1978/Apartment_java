package apartment;
import form.FromApartment;
import form.FormRoom;
import form.FormTenant;
import form.FormTenantRoom;
import formManagement.FormMainApartment;
import formManagement.FormRentApartment;
import javax.swing.JOptionPane;
import report.ReportNetIncome;
import report.ReportRentCondition;
import report.ReportRoom;
public class JFrameApartment extends javax.swing.JFrame {

    public JFrameApartment() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuApartment = new javax.swing.JMenuItem();
        menuRoom = new javax.swing.JMenuItem();
        menuTenant = new javax.swing.JMenuItem();
        menuTenantRoom = new javax.swing.JMenuItem();
        menuExit1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuRentApartment = new javax.swing.JMenuItem();
        menuMainApartment = new javax.swing.JMenuItem();
        menuExit2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuReportIncome = new javax.swing.JMenuItem();
        menuReportRoom = new javax.swing.JMenuItem();
        menuRentCondition = new javax.swing.JMenuItem();
        menuExit3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("โปรแกรมจัดการอพาร์ทเมนท์");
        setName("myDesktop"); // NOI18N

        jMenu2.setText("ระบบจัดการข้อมูลพื้นฐาน");

        menuApartment.setText("ข้อมูลอพาร์ทเมนท์");
        menuApartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuApartmentActionPerformed(evt);
            }
        });
        jMenu2.add(menuApartment);

        menuRoom.setText("ข้อมูลห้องพัก");
        menuRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRoomActionPerformed(evt);
            }
        });
        jMenu2.add(menuRoom);

        menuTenant.setText("ข้อมูลผู้เช่า");
        menuTenant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTenantActionPerformed(evt);
            }
        });
        jMenu2.add(menuTenant);

        menuTenantRoom.setText("ข้อมูลผู้เช่าห้องพัก");
        menuTenantRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTenantRoomActionPerformed(evt);
            }
        });
        jMenu2.add(menuTenantRoom);

        menuExit1.setText("ออกจากโปรแกรม");
        menuExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExit1ActionPerformed(evt);
            }
        });
        jMenu2.add(menuExit1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("ระบบการจัดการอพาร์ทเมนท์");

        menuRentApartment.setText("การเช่าอพาร์ทเมนท์");
        menuRentApartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRentApartmentActionPerformed(evt);
            }
        });
        jMenu3.add(menuRentApartment);

        menuMainApartment.setText("การบำรุงรักษาอพาร์ทเมนท์");
        menuMainApartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMainApartmentActionPerformed(evt);
            }
        });
        jMenu3.add(menuMainApartment);

        menuExit2.setText("ออกจากโปรแกรม");
        menuExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExit2ActionPerformed(evt);
            }
        });
        jMenu3.add(menuExit2);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("ระบบการแสดงรายงาน");

        menuReportIncome.setText("รายงานรายได้สุทธิ");
        menuReportIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportIncomeActionPerformed(evt);
            }
        });
        jMenu1.add(menuReportIncome);

        menuReportRoom.setText("รายงานข้อมูลห้องว่าง");
        menuReportRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportRoomActionPerformed(evt);
            }
        });
        jMenu1.add(menuReportRoom);

        menuRentCondition.setText("รายงานข้อมูลผู้เช่าตามเงื่อนไข");
        menuRentCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRentConditionActionPerformed(evt);
            }
        });
        jMenu1.add(menuRentCondition);

        menuExit3.setText("ออกจากโปรแกรม");
        menuExit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExit3ActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myDesktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1018)/2, (screenSize.height-647)/2, 1018, 647);
    }// </editor-fold>//GEN-END:initComponents

    private void menuExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExit1ActionPerformed
    if(JOptionPane.showConfirmDialog(this ,"ยืนยันการปิดโปรแกรม","ยืนยัน",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_OPTION)
    {System.exit(0);}
    }//GEN-LAST:event_menuExit1ActionPerformed

    private void menuExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExit2ActionPerformed
    if(JOptionPane.showConfirmDialog(this ,"ยืนยันการปิดโปรแกรม","ยืนยัน",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_OPTION)
    {System.exit(0);}
    }//GEN-LAST:event_menuExit2ActionPerformed

    private void menuExit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExit3ActionPerformed
    if(JOptionPane.showConfirmDialog(this ,"ยืนยันการปิดโปรแกรม","ยืนยัน",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_OPTION)
    {System.exit(0);}       
    }//GEN-LAST:event_menuExit3ActionPerformed

    private void menuApartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuApartmentActionPerformed
    FromApartment fam = new FromApartment();
    fam.setVisible(true);
    myDesktop.add(fam);
    }//GEN-LAST:event_menuApartmentActionPerformed

    private void menuRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRoomActionPerformed
    FormRoom fr = new FormRoom();
    fr.setVisible(true);
    myDesktop.add(fr);
    }//GEN-LAST:event_menuRoomActionPerformed

    private void menuTenantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTenantActionPerformed
    FormTenant ftn = new FormTenant();
    ftn.setVisible(true);
    myDesktop.add(ftn);
    }//GEN-LAST:event_menuTenantActionPerformed

    private void menuTenantRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTenantRoomActionPerformed
    FormTenantRoom ftr = new FormTenantRoom();
    ftr.setVisible(true);
    myDesktop.add(ftr);
    }//GEN-LAST:event_menuTenantRoomActionPerformed

    private void menuRentApartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRentApartmentActionPerformed
    FormRentApartment fra = new FormRentApartment();
    fra.setVisible(true);
    myDesktop.add(fra);
    }//GEN-LAST:event_menuRentApartmentActionPerformed

    private void menuMainApartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMainApartmentActionPerformed
    FormMainApartment fma = new FormMainApartment();
    fma.setVisible(true);
    myDesktop.add(fma);
    }//GEN-LAST:event_menuMainApartmentActionPerformed

    private void menuReportIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportIncomeActionPerformed
    ReportNetIncome rpnic = new ReportNetIncome();
    rpnic.setVisible(true);
    myDesktop.add(rpnic);
    }//GEN-LAST:event_menuReportIncomeActionPerformed

    private void menuReportRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportRoomActionPerformed
    ReportRoom rpr = new ReportRoom();
    rpr.setVisible(true);
    myDesktop.add(rpr);
    }//GEN-LAST:event_menuReportRoomActionPerformed

    private void menuRentConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRentConditionActionPerformed
    ReportRentCondition rpr = new ReportRentCondition();
    rpr.setVisible(true);
    myDesktop.add(rpr);
    }//GEN-LAST:event_menuRentConditionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameApartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuApartment;
    private javax.swing.JMenuItem menuExit1;
    private javax.swing.JMenuItem menuExit2;
    private javax.swing.JMenuItem menuExit3;
    private javax.swing.JMenuItem menuMainApartment;
    private javax.swing.JMenuItem menuRentApartment;
    private javax.swing.JMenuItem menuRentCondition;
    private javax.swing.JMenuItem menuReportIncome;
    private javax.swing.JMenuItem menuReportRoom;
    private javax.swing.JMenuItem menuRoom;
    private javax.swing.JMenuItem menuTenant;
    private javax.swing.JMenuItem menuTenantRoom;
    private javax.swing.JDesktopPane myDesktop;
    // End of variables declaration//GEN-END:variables

}
