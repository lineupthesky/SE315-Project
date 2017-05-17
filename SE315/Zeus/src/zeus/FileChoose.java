/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeus;

import java.awt.EventQueue;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Ruhat
 */
public class FileChoose extends JFrame
{
    JFileChooser choose = new JFileChooser();
    
    public FileChoose() {
        initComponents();
    }

   public FileChoose(String test)
   {
      super(test);    
      choose.setCurrentDirectory(new File(System.getProperty("user.home")));
      int result = choose.showOpenDialog(this);
      if (result == choose.APPROVE_OPTION) {
      File selectedFile = choose.getSelectedFile();
      System.out.println("Selected file: " + selectedFile.getAbsolutePath());
      FileFilter zeusFilter = new FileFilter()
                 {
                    public boolean accept(File test){return test.getName().toUpperCase().equals(".ZEUS");}

                    public String getDescription(){return ".zeus files";}
                 };
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      choose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(5, 5));

      JButton button = new JButton("Open File");
      ActionListener listener;
      listener = new ActionListener()
           {
              public void actionPerformed(ActionEvent event)
              {
                 switch (choose.showOpenDialog(FileChoose.this))
                 {
                    case JFileChooser.APPROVE_OPTION:
                       JOptionPane.showMessageDialog(FileChoose.this, "Selected: " + choose.getSelectedFile(), "FileChoose", JOptionPane.OK_OPTION);
                       break;

                    case JFileChooser.CANCEL_OPTION:
                       JOptionPane.showMessageDialog(FileChoose.this, "Cancelled", "FileChoose", JOptionPane.OK_OPTION);
                       break;
                 
                    case JFileChooser.ERROR_OPTION:
                       JOptionPane.showMessageDialog(FileChoose.this, "Error", "FileChoose", JOptionPane.OK_OPTION);
                 }
              }
           };
      button.addActionListener(listener);
      panel.add(button);

      button = new JButton("Save File");
      listener = new ActionListener()
           {
              public void actionPerformed(ActionEvent event)
              {
                 switch (choose.showSaveDialog(FileChoose.this))
                 {
                    case JFileChooser.APPROVE_OPTION:
                       JOptionPane.showMessageDialog(FileChoose.this, "Selected: " + choose.getSelectedFile(), "FileChoose", JOptionPane.OK_OPTION);
                       break;

                    case JFileChooser.CANCEL_OPTION:
                       JOptionPane.showMessageDialog(FileChoose.this, "Cancelled", "FileChoose",  JOptionPane.OK_OPTION);
                       break;
                 
                    case JFileChooser.ERROR_OPTION:
                       JOptionPane.showMessageDialog(FileChoose.this, "Error", "FileChoose", JOptionPane.OK_OPTION);
                 }
              }
           };
      button.addActionListener(listener);
      panel.add(button);

      setContentPane(panel);

      pack();
      setVisible(true);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileChoose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}