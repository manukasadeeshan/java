
package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.UIManager;


public class loading_2 extends javax.swing.JFrame {

    Timer timer;
    int count;
    public loading_2() {
        this.count = 1;
        initComponents();
        setLocationRelativeTo(null);
        timer= new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( count== 100){
                    
                    timer.stop();
                    
                    dispose();
                    
                }
                lbl_loading2.setText("system loading"+count+"%");
                count++;
            }
        });
        timer.start();
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_loading2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_loading2.setBackground(new java.awt.Color(255, 204, 0));
        lbl_loading2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_loading2.setText("loading system");
        jPanel1.add(lbl_loading2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/loading.png.gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 70, 60));

        jLabel2.setBackground(new java.awt.Color(153, 51, 0));
        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("student management system");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 340, 30));

        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/girl.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loading_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_loading2;
    // End of variables declaration//GEN-END:variables
}
