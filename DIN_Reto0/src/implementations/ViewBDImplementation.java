/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.View;
import javax.swing.JLabel;

/**
 *
 * @author 2dam
 */
public class ViewBDImplementation extends javax.swing.JFrame implements View{

   private JLabel jlabel1;
   private ViewBDImplementation vbdi;
   
   public ViewBDImplementation(){
        initComponents();
   }
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


    @Override
    public void showGreeting(String greet) {
        
        vbdi = new ViewBDImplementation();
        vbdi.setBounds(0, 0, 700, 500);
        vbdi.setVisible(true);
        jlabel1 = new JLabel(greet);
        jlabel1.setBounds(150, 200, 400, 30);
        jlabel1.setVisible(true);
        vbdi.getContentPane().add(jlabel1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
