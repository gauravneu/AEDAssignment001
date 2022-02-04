/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

import com.mycompany.aedassignment001.Car;

/**
 *
 * @author gaurav
 */
public class CarjFrame extends javax.swing.JFrame {

    /**
     * Creates new form CarjFrame
     */
    Car car;
    
    
    public CarjFrame() {
        initComponents();
        car = new Car();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainjFrame = new javax.swing.JSplitPane();
        LeftjPanel = new javax.swing.JPanel();
        carCreateButton = new javax.swing.JButton();
        carViewButton = new javax.swing.JButton();
        RightjPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        carCreateButton.setText("Car Create");
        carCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carCreateButtonActionPerformed(evt);
            }
        });

        carViewButton.setText("Car View");
        carViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftjPanelLayout = new javax.swing.GroupLayout(LeftjPanel);
        LeftjPanel.setLayout(LeftjPanelLayout);
        LeftjPanelLayout.setHorizontalGroup(
            LeftjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftjPanelLayout.createSequentialGroup()
                .addGroup(LeftjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(carCreateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(carViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        LeftjPanelLayout.setVerticalGroup(
            LeftjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftjPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(carCreateButton)
                .addGap(67, 67, 67)
                .addComponent(carViewButton)
                .addContainerGap(485, Short.MAX_VALUE))
        );

        MainjFrame.setLeftComponent(LeftjPanel);

        javax.swing.GroupLayout RightjPanelLayout = new javax.swing.GroupLayout(RightjPanel);
        RightjPanel.setLayout(RightjPanelLayout);
        RightjPanelLayout.setHorizontalGroup(
            RightjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        RightjPanelLayout.setVerticalGroup(
            RightjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );

        MainjFrame.setRightComponent(RightjPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainjFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainjFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carCreateButtonActionPerformed
        // TODO add your handling code here:
        
        CreateJpanel createPanel = new CreateJpanel(car);
        MainjFrame.setRightComponent(createPanel);
    }//GEN-LAST:event_carCreateButtonActionPerformed

    private void carViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carViewButtonActionPerformed
        // TODO add your handling code here:
        ViewPanel viewPanel = new ViewPanel(car);
        MainjFrame.setRightComponent(viewPanel);
    }//GEN-LAST:event_carViewButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CarjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarjFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarjFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftjPanel;
    private javax.swing.JSplitPane MainjFrame;
    private javax.swing.JPanel RightjPanel;
    private javax.swing.JButton carCreateButton;
    private javax.swing.JButton carViewButton;
    // End of variables declaration//GEN-END:variables
}