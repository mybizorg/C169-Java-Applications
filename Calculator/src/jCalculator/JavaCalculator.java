/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jCalculator;



/**
 *
 * @author will
 */
public class JavaCalculator extends javax.swing.JFrame {

    
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    
    private void get_math_operator(String button_text) {
        math_operator = button_text.charAt(0);
        total1 = total1 + Double.parseDouble(text_1.getText());
        text_1.setText("");
    }
    /**
     * Creates new form JavaCalculator
     */
    public JavaCalculator() {
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

        text_1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        button_1 = new javax.swing.JButton();
        button_2 = new javax.swing.JButton();
        button_3 = new javax.swing.JButton();
        button_4 = new javax.swing.JButton();
        button_5 = new javax.swing.JButton();
        button_6 = new javax.swing.JButton();
        button_7 = new javax.swing.JButton();
        button_8 = new javax.swing.JButton();
        button_9 = new javax.swing.JButton();
        button_0 = new javax.swing.JButton();
        button_decimal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        button_clear = new javax.swing.JButton();
        button_divide = new javax.swing.JButton();
        button_multiply = new javax.swing.JButton();
        button_plus = new javax.swing.JButton();
        button_subtract = new javax.swing.JButton();
        button_equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Java Calculator");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 153, 153));

        button_1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_1.setText("1");
        button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_1ActionPerformed(evt);
            }
        });

        button_2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_2.setText("2");
        button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_2ActionPerformed(evt);
            }
        });

        button_3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_3.setText("3");
        button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_3ActionPerformed(evt);
            }
        });

        button_4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_4.setText("4");
        button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_4ActionPerformed(evt);
            }
        });

        button_5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_5.setText("5");
        button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_5ActionPerformed(evt);
            }
        });

        button_6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_6.setText("6");
        button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_6ActionPerformed(evt);
            }
        });

        button_7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_7.setText("7");
        button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_7ActionPerformed(evt);
            }
        });

        button_8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_8.setText("8");
        button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_8ActionPerformed(evt);
            }
        });

        button_9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_9.setText("9");
        button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_9ActionPerformed(evt);
            }
        });

        button_0.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_0.setText("0");
        button_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_0ActionPerformed(evt);
            }
        });

        button_decimal.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_decimal.setText(".");
        button_decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_decimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button_decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        button_clear.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_clear.setText("C");
        button_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_clearActionPerformed(evt);
            }
        });

        button_divide.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_divide.setText("/");
        button_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_divideActionPerformed(evt);
            }
        });

        button_multiply.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_multiply.setText("*");
        button_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_multiplyActionPerformed(evt);
            }
        });

        button_plus.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_plus.setText("+");
        button_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_plusActionPerformed(evt);
            }
        });

        button_subtract.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_subtract.setText("-");
        button_subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_subtractActionPerformed(evt);
            }
        });

        button_equals.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        button_equals.setText("=");
        button_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_equalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(text_1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(text_1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_1ActionPerformed
       String button_one_text = text_1.getText() + button_1.getText();
       text_1.setText(button_one_text);
    }//GEN-LAST:event_button_1ActionPerformed

    private void button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_2ActionPerformed
       String button_two_text = text_1.getText() + button_2.getText();
       text_1.setText(button_two_text);
    }//GEN-LAST:event_button_2ActionPerformed

    private void button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_3ActionPerformed
       String button_three_text = text_1.getText() + button_3.getText();
       text_1.setText(button_three_text);
    }//GEN-LAST:event_button_3ActionPerformed

    private void button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_4ActionPerformed
       String button_four_text = text_1.getText() + button_4.getText();
       text_1.setText(button_four_text);
    }//GEN-LAST:event_button_4ActionPerformed

    private void button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_5ActionPerformed
       String button_five_text = text_1.getText() + button_5.getText();
       text_1.setText(button_five_text);
    }//GEN-LAST:event_button_5ActionPerformed

    private void button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_6ActionPerformed
       String button_six_text = text_1.getText() + button_6.getText();
       text_1.setText(button_six_text);
    }//GEN-LAST:event_button_6ActionPerformed

    private void button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_7ActionPerformed
       String button_seven_text = text_1.getText() + button_7.getText();
       text_1.setText(button_seven_text);
    }//GEN-LAST:event_button_7ActionPerformed

    private void button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_8ActionPerformed
       String button_eight_text = text_1.getText() + button_8.getText();
       text_1.setText(button_eight_text);
    }//GEN-LAST:event_button_8ActionPerformed

    private void button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_9ActionPerformed
       String button_nine_text = text_1.getText() + button_9.getText();
       text_1.setText(button_nine_text);
    }//GEN-LAST:event_button_9ActionPerformed

    private void button_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_0ActionPerformed
       String button_zero_text = text_1.getText() + button_0.getText();
       text_1.setText(button_zero_text);
    }//GEN-LAST:event_button_0ActionPerformed

    private void button_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_plusActionPerformed
        String button_text = button_plus.getText();
        get_math_operator(button_text);
    }//GEN-LAST:event_button_plusActionPerformed

    private void button_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_equalsActionPerformed
        switch (math_operator) {
            case '+':
                total2 = total1 + Double.parseDouble(text_1.getText());
                break;
            case '-':
                total2 = total1 - Double.parseDouble(text_1.getText());
                break;
            case '/':
                total2 = total1 / Double.parseDouble(text_1.getText());
                break;
            case '*':
                total2 = total1 * Double.parseDouble(text_1.getText());
                break;
        }
        text_1.setText( Double.toString( total2) );
        total1 = 0;
    }//GEN-LAST:event_button_equalsActionPerformed

    private void button_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_clearActionPerformed
        total2 = 0;
        text_1.setText("");
    }//GEN-LAST:event_button_clearActionPerformed

    private void button_decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_decimalActionPerformed
        String button_decimal_text = text_1.getText() + button_decimal.getText();
        text_1.setText(button_decimal_text);
    }//GEN-LAST:event_button_decimalActionPerformed

    private void button_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_divideActionPerformed
        String button_text = button_divide.getText();
        get_math_operator(button_text);
    }//GEN-LAST:event_button_divideActionPerformed

    private void button_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_multiplyActionPerformed
        String button_text = button_multiply.getText();
        get_math_operator(button_text);
    }//GEN-LAST:event_button_multiplyActionPerformed

    private void button_subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_subtractActionPerformed
        String button_text = button_subtract.getText();
        get_math_operator(button_text);
    }//GEN-LAST:event_button_subtractActionPerformed

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
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_0;
    private javax.swing.JButton button_1;
    private javax.swing.JButton button_2;
    private javax.swing.JButton button_3;
    private javax.swing.JButton button_4;
    private javax.swing.JButton button_5;
    private javax.swing.JButton button_6;
    private javax.swing.JButton button_7;
    private javax.swing.JButton button_8;
    private javax.swing.JButton button_9;
    private javax.swing.JButton button_clear;
    private javax.swing.JButton button_decimal;
    private javax.swing.JButton button_divide;
    private javax.swing.JButton button_equals;
    private javax.swing.JButton button_multiply;
    private javax.swing.JButton button_plus;
    private javax.swing.JButton button_subtract;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField text_1;
    // End of variables declaration//GEN-END:variables
}
