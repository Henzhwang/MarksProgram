/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shhua8751
 */

import java.util.*;
import java.text.DecimalFormat;
public class FormMarksProgram extends javax.swing.JFrame {
     ArrayList <String> mark = new ArrayList();
     public int [] level = {0,0,0,0,0};
     
    public FormMarksProgram() {
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

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        popupMenu1 = new java.awt.PopupMenu();
        markLabel = new javax.swing.JLabel();
        markInput = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        programLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        markField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoField = new javax.swing.JTextArea();
        sortButton = new javax.swing.JButton();
        analyzeButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        markLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        markLabel.setText("Student Mark: ");

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        programLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        programLabel.setText("Marks Program");

        jScrollPane1.setHorizontalScrollBar(null);

        markField.setColumns(20);
        markField.setRows(5);
        jScrollPane1.setViewportView(markField);

        jScrollPane2.setHorizontalScrollBar(null);

        infoField.setColumns(20);
        infoField.setRows(5);
        jScrollPane2.setViewportView(infoField);

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        analyzeButton.setText("Analyze");
        analyzeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(markLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(markInput, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(programLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(analyzeButton)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(programLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(markLabel)
                    .addComponent(markInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortButton)
                    .addComponent(analyzeButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
            if (Integer.parseInt(markInput.getText()) <= 100 && Integer.parseInt(markField.getText()) >= 0) 
            {
            Collections.addAll(mark, markInput.getText());
            System.out.println(mark);                                              
            markInput.setText(null);        //adding the marks to the array if it's <0 and > 100
            for (int i = 0; i < mark.size(); i++) 
            {
                markField.setText("Marks Added: " + mark.size());
                infoField.setText(null);                              //double for loop so the textarea doesn't repeat marks
                for (int ii = 0; ii < mark.size(); ii++) {
                    mark.toString();
                    infoField.setText(infoField.getText()+ mark.get(ii) + "\n"); //showing each mark on a line
                }
            }
        }
        else {
            markField.setText("Invalid Mark" + " (" + markInput.getText() + ")");
            markField.setText(null);    //show invalid mark if the mark is > 100 < 0
        }



//       mark.add(markInput.getText());
//       //int num = Integer.parseInt(markInput.getText());;
//       //int[] mark = new int[num];
//       markInput.setText(" ");
//       
//       
//       for (int i = 0; i < mark.size() ; i++)
//        {
//           markField.setText(mark.toString());
//        }
//       
//       System.out.println(mark);
    }//GEN-LAST:event_addButtonActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
            Collections.sort(mark);
                for (int x = 0; x < mark.size(); x++) {
                 markField.setText("Marks Added: " + mark.size());
                    infoField.setText(null);
            for (int i = 0; i < mark.size(); i++) {    //using a double for loop again except sorting it
                mark.toString();
                infoField.setText(infoField.getText()+ mark.get(i) + "\n");  
            }
        }

//       Collections.addAll(mark,"\n ");
//       Collections.sort(mark);
    }//GEN-LAST:event_sortButtonActionPerformed

    private void analyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeButtonActionPerformed
        level();
        System.out.println(level[0]);
        DecimalFormat x = new DecimalFormat("###.##");  //decimal formats so the average is only 2 decimals
        DecimalFormat i = new DecimalFormat("###");
        analyzeArea.setText(
              "Class Average: " + x.format(average()) 
            + "%\nHighest Mark: " + i.format(maximum()) 
            + "\nLowest Mark: " + i.format(minimum()) 
            + "\nRange of Marks: " + i.format((maximum()-minimum())) 
            + "\n# of Marks at level R:     " + level[0]            
            + "\n# of Marks at level 1:     " + level[1]         //setting the text area all the methods
            + "\n# of Marks at level 2:     " + level[2]         //split it up because it was too long
            + "\n# of Marks at level 3:     " + level[3]
            + "\n# of Marks at level 4:     " + level[4]
        );
    }//GEN-LAST:event_analyzeButtonActionPerformed
            
    
    
    
     private double average() {
        double sum = 0;
        double denominator = mark.size(); //setting the denominator to the size of the array to find average
        double product;
        
        for(int i = 0; i < mark.size(); i++) {     
            sum +=  (int)mark.get(i);            //adding all the marks together using a for loop        
        }
        product = sum/denominator;
        return (product);
    }
    public double maximum() {
        Collections.sort(mark);    //sorting it to make sure the last element is the highest
        double maximum = 0;
        double marks;
        for(int i = 0; i < mark.size(); i++) {
            marks  = Double.parseDouble(mark);
            maximum = (mark).get(i);              //finding the last index in the arraylist
        } 
        return maximum;
    } 
    public double minimum() {
        Collections.sort(mark);        //sorting it again to make sure the last element is the highest
        double mimimum = mark.get(0);
        return mimimum;                 //finding the first index and setting it as the minimum
    }
    public void level() {
        for (int x = 0; x < mark.size(); x++) {
            level[0] = 0;
            level[1] = 0;
            level[2] = 0;
            level[3] = 0;
            level[4] = 0;
            for (int i = 0; i < mark.size(); i++) {
                if (mark.get(i)>=80) {              //using a double for loop so the marks dont multiply
                    level[4]++;
                }
                else if (mark.get(i)>=70) {
                    level[3]++;
                }
                else if (mark.get(i)>=60) {
                    level[2]++;
                }                               //finding which section the element is in using the if/else  
                else if (mark.get(i)>=50) {    //statements then adding +1 to which level it's in
                    level[1]++;
                }
                else {
                    level[0]++;
                }
            }
        }
    }
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
            java.util.logging.Logger.getLogger(FormMarksProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMarksProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMarksProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMarksProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMarksProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton analyzeButton;
    private javax.swing.JTextArea infoField;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea markField;
    private javax.swing.JTextField markInput;
    private javax.swing.JLabel markLabel;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JLabel programLabel;
    private javax.swing.JButton sortButton;
    // End of variables declaration//GEN-END:variables
}
