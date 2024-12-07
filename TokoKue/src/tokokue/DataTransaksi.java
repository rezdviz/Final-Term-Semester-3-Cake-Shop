package tokokue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DataTransaksi extends javax.swing.JInternalFrame {
    
    DefaultTableModel tabMode;
    
    Connection con;
    Statement stat;
    String sql;
    ResultSet rs;
    

    public DataTransaksi() throws SQLException {
        initComponents();
        Koneksi DB = new Koneksi();
        DB.GetConnection();
        con = DB.koneksi;
        stat = DB.stm;
        
        Object[] row= {"Kode", "Nama", "Tanggal Pembelian", "Pilihan Paket", "Alamat", "No. Telp", "Total Bayar"}; 
        tabMode = new DefaultTableModel (null, row);
        table.setModel(tabMode);
        
        MenampilkanData();
    }
    
    public void datatable() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode");
        tbl.addColumn("Nama");
        tbl.addColumn("Tanggal Pembelian");
        tbl.addColumn("Pilihan Paket");
        tbl.addColumn("Alamat");
        tbl.addColumn("No. Telepon");
        tbl.addColumn("Nominal");
        table.setModel(tbl);
        try {
            com.mysql.jdbc.Statement statement = (com.mysql.jdbc.Statement)Koneksi.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * from tbcustomer");
            while(res.next()){
                tbl.addRow(new Object[] {
                res.getString("Kode"),
                res.getString("Nama"),
                res.getString("TanggalP"),
                res.getString("PilihanPaket"),
                res.getString("Alamat"),
                res.getString("No.Telepon"),
                res.getString("TotalPembayaran"),
                });
            table.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Salah");
        }
}
    
    private void MenampilkanData() {     
        try {

            sql = "SELECT * FROM tbcustomer";
            rs = stat.executeQuery(sql);
            
            while (rs.next()) {
                tabMode.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                    rs.getString(5), rs.getString(6), rs.getString(7)});
            }
        } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        txtkode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        print = new javax.swing.JButton();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel1.setText("DATA TRANSAKSI CUSTOMER");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        cari.setText("Search");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });

        jLabel2.setText("Cari Kode ");

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(cari)
                        .addGap(18, 18, 18)
                        .addComponent(delete)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(print)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(cari))
                .addGap(18, 18, 18)
                .addComponent(print)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(back))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MenuUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int ok =JOptionPane.showConfirmDialog(null,"Apakah Yakin Untuk Menghapus Record ini???","Confirmation",JOptionPane.YES_NO_OPTION);
        String kode = txtkode.getText();
        if(ok==0) {
         try {       
             com.mysql.jdbc.Statement statement = (com.mysql.jdbc.Statement) Koneksi.GetConnection().createStatement();
             statement.executeUpdate("DELETE from tbcustomer WHERE Kode =('" + kode + "');");
             JOptionPane.showMessageDialog(null, "Data berhasil terhapus !");
         }
         catch (Exception t) {
             JOptionPane.showMessageDialog(null, "Data gagal di hapus!");
         }
         datatable();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
             try {
             com.mysql.jdbc.Statement statement = (com.mysql.jdbc.Statement) Koneksi.GetConnection().createStatement();
             ResultSet res = statement.executeQuery("SELECT * FROM tbcustomer WHERE " + "Kode='" + txtkode.getText() + "'");
             DefaultTableModel tbl = new DefaultTableModel();
             tbl.addColumn("Kode");
             tbl.addColumn("Nama");
             tbl.addColumn("Tanggal");
             tbl.addColumn("Pilihat paket");
             tbl.addColumn("Alamat");
             tbl.addColumn("No. Telepon");
             tbl.addColumn("Nominal");
             
             table.setModel(tbl);
             while (res.next()) {
                 tbl.addRow(new Object[] {
                     res.getString("Kode"),
                     res.getString("Nama"),
                     res.getString("TanggalP"),
                     res.getString("PilihanPaket"),
                     res.getString("Alamat"),
                     res.getString("No.Telepon"),
                     res.getString("TotalPembayaran"),
                 });
                 table.setModel(tbl);
             }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, "Salah2");
         }  
    }//GEN-LAST:event_cariActionPerformed

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton cari;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton print;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtkode;
    // End of variables declaration//GEN-END:variables
}
