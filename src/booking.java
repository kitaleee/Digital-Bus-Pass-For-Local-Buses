
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author souvi
 */
public class booking extends javax.swing.JFrame implements MouseListener{

    /**
     * Creates new form booking
     */
    public booking() {
        initComponents();
        lbl1.addMouseListener(this);
        lbl2.addMouseListener(this);
        lbl3.addMouseListener(this);
        lbl4.addMouseListener(this);
        lbl5.addMouseListener(this);
        lbl6.addMouseListener(this);
        lbl7.addMouseListener(this);
        lbl8.addMouseListener(this);
        lbl9.addMouseListener(this);
        lbl10.addMouseListener(this);
        lbl11.addMouseListener(this);
        lbl12.addMouseListener(this);
        connect();
    }
    int seatno=0;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/buss","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void Bill()
    {
        String customer=txtcust.getText();
        int seats1=seatno;
        String price=txtprice.getText();
        SimpleDateFormat date_form=new SimpleDateFormat("yyyy-MM-dd");
        String date=date_form.format(txtdate.getDate());
        txtbill.setText(txtbill.getText()+"************************************************\n");
        txtbill.setText(txtbill.getText()+"*********...........BILL..............**********\n");
        txtbill.setText(txtbill.getText()+"************************************************\n");
        txtbill.setText(txtbill.getText()+"Customer : "+"\t"+customer+"\n");
        txtbill.setText(txtbill.getText()+"SeatNo : "+"\t"+seats1+"\n");
        txtbill.setText(txtbill.getText()+"Prce : "+"\t"+price+"\n");
        txtbill.setText(txtbill.getText()+"Date : "+"\t"+date+"\n");
        txtbill.setText(txtbill.getText()+ "\n");
        txtbill.setText(txtbill.getText()+"*********************^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
        txtbill.setText(txtbill.getText()+"******THANK YOU FOR BOOKING WITH US***********\n");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcust = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtdate = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        txtprice = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Bus Booking System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer");

        txtcust.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl1.setText("1");

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl2.setText("2");

        lbl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl3.setText("3");

        lbl4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl4.setText("4");

        lbl5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl5.setText("5");

        lbl6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl6.setText("6");

        lbl7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl7.setText("7");

        lbl8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl8.setText("8");

        lbl9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl9.setText("9");

        lbl10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl10.setText("10");

        lbl11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl11.setText("11");

        lbl12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl12.setText("12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl7)
                        .addGap(18, 18, 18)
                        .addComponent(lbl8)
                        .addGap(18, 18, 18)
                        .addComponent(lbl9)
                        .addGap(18, 18, 18)
                        .addComponent(lbl10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addGap(18, 18, 18)
                        .addComponent(lbl2)
                        .addGap(18, 18, 18)
                        .addComponent(lbl3)
                        .addGap(27, 27, 27)
                        .addComponent(lbl4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl11)
                    .addComponent(lbl5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl12)
                    .addComponent(lbl6))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lbl2)
                    .addComponent(lbl3)
                    .addComponent(lbl4)
                    .addComponent(lbl5)
                    .addComponent(lbl6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl7)
                    .addComponent(lbl8)
                    .addComponent(lbl9)
                    .addComponent(lbl10)
                    .addComponent(lbl11)
                    .addComponent(lbl12))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Seats");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Price");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtbill.setColumns(20);
        txtbill.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        txtbill.setRows(5);
        jScrollPane1.setViewportView(txtbill);

        txtprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(94, 94, 94)
                                    .addComponent(txtprice))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel15))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(59, 59, 59)
                                    .addComponent(txtcust))))
                        .addGap(18, 18, 18)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtcust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel15)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(122, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String customer=txtcust.getText();
        int seats1=seatno;
        String price=txtprice.getText();
        SimpleDateFormat date_form=new SimpleDateFormat("yyyy-MM-dd");
        String date=date_form.format(txtdate.getDate());
        try {
            pst=con.prepareStatement("select * from book where date= ? and seatno = ?");
            
            pst.setString(1, date);
            pst.setInt(2, seats1);
            rs=pst.executeQuery();
            
            if(rs.next()==true)
            {
                JOptionPane.showMessageDialog(this, "This seat number is already booked");
            }
            else
            {
                pst=con.prepareStatement("insert into book(cname, seatno,price,date)values(?,?,?,?)");
                pst.setString(1, customer);
                pst.setInt(2, seats1);
                pst.setString(3, price);
                pst.setString(4, date);
                int k=pst.executeUpdate();
                
                if(k==1)
                {
                    JOptionPane.showMessageDialog(this, "Seat Booked");
                    Bill();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Something wrong");
                }
            }
        } 
        
        
        catch (SQLException ex) {
            Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Check c=new Check();
       c.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtcust;
    private com.toedter.calendar.JCalendar txtdate;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource()==lbl1)
        {
            seatno=1;
        }
        else if(e.getSource()==lbl2)
        {
            seatno=2;
        }
        else if(e.getSource()==lbl3)
        {
            seatno=3;
        }
        else if(e.getSource()==lbl4)
        {
            seatno=4;
        }
        else if(e.getSource()==lbl5)
        {
            seatno=5;
        }
        else if(e.getSource()==lbl6)
        {
            seatno=6;
        }
        else if(e.getSource()==lbl7)
        {
            seatno=7;
        }
        else if(e.getSource()==lbl8)
        {
            seatno=8;
        }
        else if(e.getSource()==lbl9)
        {
            seatno=9;
        }
        else if(e.getSource()==lbl10)
        {
            seatno=10;
        }
        else if(e.getSource()==lbl11)
        {
            seatno=11;
        }
        else if(e.getSource()==lbl12)
        {
            seatno=12;
        }
        JOptionPane.showMessageDialog(this, seatno);
    }
    

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}