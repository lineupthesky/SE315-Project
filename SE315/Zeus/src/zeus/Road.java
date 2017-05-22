/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeus;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

/**
 *
 * @author InanEvin-ROOT
 */
public class Road extends JComponent {

    private Node _Node1;
    private Node _Node2;
    private JPanel _ParentPanel;

    public Road(Node n1, Node n2, JPanel parentPanel) {
        _Node1 = n1;
        _Node2 = n2;
        _Node1.SetRoad(this);
        _Node2.SetRoad(this);
        _ParentPanel = parentPanel;
        n1.main._Roads.add(this);
        //JFrame testFrame = (JFrame) SwingUtilities.getRoot(_Node1);
        // testFrame.getContentPane().setBackground(Color.RED);
        //testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //final LinesComponent comp = new LinesComponent();
        //comp.setPreferredSize(new Dimension(320, 200));
        // testFrame.getContentPane().add(comp, BorderLayout.CENTER);
        // testFrame.pack();
        // testFrame.setVisible(true);

    }
    
  
    public Node GetNode1() {
        return _Node1;
    }

    public Node GetNode2() {
        return _Node2;
    }

}
