/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeus;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFileChooser;
import javax.swing.filechooser.*;

/**
 *
 * @author ROOT
 */
public class MainTest extends javax.swing.JFrame {

    /**
     * Creates new form MainTest
     */
    public MainTest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditToolbar = new javax.swing.JPanel();
        RoadDrawerButton = new javax.swing.JToggleButton();
        LightAdjuster = new javax.swing.JToggleButton();
        ZebraCrossings = new javax.swing.JToggleButton();
        ScenePanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ExportScene = new javax.swing.JMenuItem();
        ImportScene = new javax.swing.JMenuItem();
        About = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ShowEditingToolbar = new javax.swing.JCheckBoxMenuItem();
        GlobalSettingsMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EditToolbar.setBackground(java.awt.SystemColor.activeCaption);
        EditToolbar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RoadDrawerButton.setText("Road Drawer");
        RoadDrawerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RoadDrawerButtonMousePressed(evt);
            }
        });

        LightAdjuster.setText("LightAdjuster");
        LightAdjuster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LightAdjusterMousePressed(evt);
            }
        });

        ZebraCrossings.setText("ZebraCrossings");
        ZebraCrossings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ZebraCrossingsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout EditToolbarLayout = new javax.swing.GroupLayout(EditToolbar);
        EditToolbar.setLayout(EditToolbarLayout);
        EditToolbarLayout.setHorizontalGroup(
            EditToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RoadDrawerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LightAdjuster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ZebraCrossings)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EditToolbarLayout.setVerticalGroup(
            EditToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RoadDrawerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(LightAdjuster, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addComponent(ZebraCrossings, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        ScenePanel.setBackground(new java.awt.Color(204, 204, 204));
        ScenePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.SystemColor.activeCaption, java.awt.Color.darkGray));

        javax.swing.GroupLayout ScenePanelLayout = new javax.swing.GroupLayout(ScenePanel);
        ScenePanel.setLayout(ScenePanelLayout);
        ScenePanelLayout.setHorizontalGroup(
            ScenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );
        ScenePanelLayout.setVerticalGroup(
            ScenePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        ExportScene.setText("Export Scene");
        ExportScene.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExportSceneMouseClicked(evt);
            }
        });
        ExportScene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportSceneActionPerformed(evt);
            }
        });
        jMenu1.add(ExportScene);

        ImportScene.setText("Import Scene");
        ImportScene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportSceneActionPerformed(evt);
            }
        });
        jMenu1.add(ImportScene);

        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jMenu1.add(About);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        ShowEditingToolbar.setSelected(true);
        ShowEditingToolbar.setText("Show Editing Toolbar");
        ShowEditingToolbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowEditingToolbarActionPerformed(evt);
            }
        });
        jMenu2.add(ShowEditingToolbar);

        GlobalSettingsMenuItem.setText("Global Settings");
        jMenu2.add(GlobalSettingsMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EditToolbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScenePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(EditToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScenePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExportSceneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportSceneActionPerformed
        final JFileChooser exportChooser = new JFileChooser();
                
        
        
        ExportFile expFile = new ExportFile();
        expFile.WriteFile("sa");
    }//GEN-LAST:event_ExportSceneActionPerformed

    private void ImportSceneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportSceneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImportSceneActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AboutActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private boolean b_ShowToolbarToggle = true;
    private void ShowEditingToolbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowEditingToolbarActionPerformed
        b_ShowToolbarToggle = !b_ShowToolbarToggle;
        EditToolbar.setVisible(b_ShowToolbarToggle);
    }//GEN-LAST:event_ShowEditingToolbarActionPerformed


    private void RoadDrawerButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoadDrawerButtonMousePressed
        if (LightAdjuster.isSelected()) {
            LightAdjuster.doClick();
        }
        if (ZebraCrossings.isSelected()) {
            ZebraCrossings.doClick();
        }
    }//GEN-LAST:event_RoadDrawerButtonMousePressed

    private void LightAdjusterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LightAdjusterMousePressed
        if (RoadDrawerButton.isSelected()) {
            RoadDrawerButton.doClick();
        }
        if (ZebraCrossings.isSelected()) {
            ZebraCrossings.doClick();
        }
    }//GEN-LAST:event_LightAdjusterMousePressed

    private void ZebraCrossingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZebraCrossingsMousePressed
        if (LightAdjuster.isSelected()) 
            LightAdjuster.doClick();   
        if (RoadDrawerButton.isSelected()) 
            RoadDrawerButton.doClick(); 
    }//GEN-LAST:event_ZebraCrossingsMousePressed

    private void ExportSceneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportSceneMouseClicked
        // TODO add your handling code here:
        //Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        //ExportMenu.show(this, dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);

    }//GEN-LAST:event_ExportSceneMouseClicked

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
            java.util.logging.Logger.getLogger(MainTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainTest().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JPanel EditToolbar;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem ExportScene;
    private javax.swing.JMenuItem GlobalSettingsMenuItem;
    private javax.swing.JMenuItem ImportScene;
    private javax.swing.JToggleButton LightAdjuster;
    private javax.swing.JToggleButton RoadDrawerButton;
    private javax.swing.JPanel ScenePanel;
    private javax.swing.JCheckBoxMenuItem ShowEditingToolbar;
    private javax.swing.JToggleButton ZebraCrossings;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}