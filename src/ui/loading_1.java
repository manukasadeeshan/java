
package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class loading_1 extends javax.swing.JFrame {

   Timer timer;
   int count = 1;
    public loading_1() {
        initComponents();
        setLocationRelativeTo(null);
       
       timer =new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                pbr.setValue(count++);
                
               lbl_loading.setText(count+"%");
               if( count== 100){
                   System.out.println("100 reach");
                   timer.stop();
               }
                
                   }
        });
       
       timer.start();
        
       
              
    }
    
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        pbr = new javax.swing.JProgressBar();
        lbl_loading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("student management system");

        javax.swing.GroupLayout lbl_1Layout = new javax.swing.GroupLayout(lbl_1);
        lbl_1.setLayout(lbl_1Layout);
        lbl_1Layout.setHorizontalGroup(
            lbl_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lbl_1Layout.setVerticalGroup(
            lbl_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lbl_2.setText("ADD ANY CONTENT");

        lbl_loading.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        lbl_loading.setText("loading status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pbr, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_loading)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(pbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_loading)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
       try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           java.awt.EventQueue.invokeLater(() -> {
               new loading_1().setVisible(true);
           });
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(loading_1.class.getName()).log(Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           Logger.getLogger(loading_1.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(loading_1.class.getName()).log(Level.SEVERE, null, ex);
       } catch (UnsupportedLookAndFeelException ex) {
           Logger.getLogger(loading_1.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_loading;
    private javax.swing.JProgressBar pbr;
    // End of variables declaration//GEN-END:variables

    private static class timer {

        public timer() {
        }
    }

    private static class tim {

        public tim() {
        }
    }
}
