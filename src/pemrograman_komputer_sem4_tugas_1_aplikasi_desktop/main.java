/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemrograman_komputer_sem4_tugas_1_aplikasi_desktop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author fadil
 */
public class main extends javax.swing.JFrame {

    private static final double PI = 3.14159; // Value of PI
    private static final int MAX_HISTORY_SIZE = 10; // Maximum history limit
    private static final String ERROR_DIVISION_BY_ZERO = "Tidak bisa dibagi dengan nol";
    private static final String ERROR_INPUT_SECOND = "Masukkan angka kedua terlebih dahulu!";
    private static final String ERROR_INPUT_FIRST = "Masukkan angka pertama dan pilih operasi terlebih dahulu!";

    // Primitive data types for calculation
    private double result = 0.0;
    private boolean isNewInput = true;

    // String variables for storing inputs and operation
    private String firstNumber = "";
    private String operation = "";

    // Array for storing calculation history
    private final String[] historyArray = new String[MAX_HISTORY_SIZE];
    private int historyIndex = 0; // Index to fill the array

    // Collection for storing calculation history (more flexible)
    private final List<String> historyList = new ArrayList<>();

    // Number formatter for better display
    private final DecimalFormat formatter = new DecimalFormat("#.########");

    public main() {
        initComponents();
        resetCalculator(); // Initialize calculator state

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
        btn_satu = new javax.swing.JButton();
        btn_dua = new javax.swing.JButton();
        btn_tiga = new javax.swing.JButton();
        btn_menjadikan_plus_atau_minus = new javax.swing.JButton();
        btn_persen = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_enam = new javax.swing.JButton();
        btn_lima = new javax.swing.JButton();
        btn_empat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_delapan = new javax.swing.JButton();
        btn_sembilan = new javax.swing.JButton();
        btn_tujuh = new javax.swing.JButton();
        btn_kali = new javax.swing.JButton();
        btn_tambah = new javax.swing.JButton();
        btn_bagi = new javax.swing.JButton();
        btn_kurang = new javax.swing.JButton();
        btn_koma = new javax.swing.JButton();
        btn_samadengan = new javax.swing.JButton();
        btn_nol = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRiwayat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Simple Calculator.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        btn_satu.setText("1");
        btn_satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_satuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_satu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 55, 55));

        btn_dua.setText("2");
        btn_dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_duaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dua, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 55, 55));

        btn_tiga.setText("3");
        btn_tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tigaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 55, 55));

        btn_menjadikan_plus_atau_minus.setText("+/-");
        btn_menjadikan_plus_atau_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menjadikan_plus_atau_minusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menjadikan_plus_atau_minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 55, 55));

        btn_persen.setText("%");
        btn_persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_persenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_persen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 55, 55));

        btn_reset.setText("AC");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 55, 55));

        btn_enam.setText("6");
        btn_enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enamActionPerformed(evt);
            }
        });
        getContentPane().add(btn_enam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 55, 55));

        btn_lima.setText("5");
        btn_lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lima, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 55, 55));

        btn_empat.setText("4");
        btn_empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empatActionPerformed(evt);
            }
        });
        getContentPane().add(btn_empat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 55, 55));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel2.setText("0");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        btn_delapan.setText("8");
        btn_delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delapanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 55, 55));

        btn_sembilan.setText("9");
        btn_sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sembilanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sembilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 55, 55));

        btn_tujuh.setText("7");
        btn_tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tujuhActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tujuh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 55, 55));

        btn_kali.setText("x");
        btn_kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kali, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 55, 55));

        btn_tambah.setText("+");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 55, 55));

        btn_bagi.setText(":");
        btn_bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bagiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_bagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 55, 55));

        btn_kurang.setText("-");
        btn_kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kurangActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 55, 55));

        btn_koma.setText("1");
        btn_koma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_komaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_koma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 55, 55));

        btn_samadengan.setText("=");
        btn_samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_samadenganActionPerformed(evt);
            }
        });
        getContentPane().add(btn_samadengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 55, 55));

        btn_nol.setText("0");
        btn_nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nolActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 128, 55));

        jLabel3.setText("History");

        txtRiwayat.setColumns(20);
        txtRiwayat.setRows(5);
        jScrollPane1.setViewportView(txtRiwayat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_satuActionPerformed
        // TODO add your handling code here:
        addDigit("1");
    }//GEN-LAST:event_btn_satuActionPerformed

    private void btn_duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duaActionPerformed
        // TODO add your handling code here:
        addDigit("2");
    }//GEN-LAST:event_btn_duaActionPerformed

    private void btn_tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tigaActionPerformed
        // TODO add your handling code here:
        addDigit("3");

    }//GEN-LAST:event_btn_tigaActionPerformed

    private void btn_menjadikan_plus_atau_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menjadikan_plus_atau_minusActionPerformed
        toggleSign();


    }//GEN-LAST:event_btn_menjadikan_plus_atau_minusActionPerformed

    private void btn_persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_persenActionPerformed
        convertToPercentage();

    }//GEN-LAST:event_btn_persenActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        resetCalculator();

    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enamActionPerformed
        // TODO add your handling code here:addDigit
        addDigit("6");


    }//GEN-LAST:event_btn_enamActionPerformed

    private void btn_limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limaActionPerformed
        // TODO add your handling code here:
        addDigit("5");
    }//GEN-LAST:event_btn_limaActionPerformed

    private void btn_empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empatActionPerformed
        // TODO add your handling code here:
        addDigit("4");
    }//GEN-LAST:event_btn_empatActionPerformed

    private void btn_delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delapanActionPerformed
        // TODO add your handling code here:
        addDigit("8");

    }//GEN-LAST:event_btn_delapanActionPerformed

    private void btn_sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sembilanActionPerformed
        // TODO add your handling code here:
        addDigit("9");
    }//GEN-LAST:event_btn_sembilanActionPerformed

    private void btn_tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tujuhActionPerformed
        // TODO add your handling code here:
        addDigit("7");
    }//GEN-LAST:event_btn_tujuhActionPerformed

    private void btn_kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaliActionPerformed
        // TODO add your handling code here:
        setOperation("*");

    }//GEN-LAST:event_btn_kaliActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        setOperation("+");

    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bagiActionPerformed
        // TODO add your handling code here:
        setOperation("/");

    }//GEN-LAST:event_btn_bagiActionPerformed

    private void btn_kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kurangActionPerformed
        // TODO add your handling code here:
        addDigit("-");

    }//GEN-LAST:event_btn_kurangActionPerformed

    private void btn_komaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_komaActionPerformed
        // TODO add your handling code here:
        String teks = jLabel2.getText();
        if (!teks.contains(".")) {
            jLabel2.setText(teks + ".");
        }
    }//GEN-LAST:event_btn_komaActionPerformed

    private void btn_samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_samadenganActionPerformed
        performEquals();

    }//GEN-LAST:event_btn_samadenganActionPerformed

    private void btn_nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nolActionPerformed
        // TODO add your handling code here:
        addDigit("0");
    }//GEN-LAST:event_btn_nolActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bagi;
    private javax.swing.JButton btn_delapan;
    private javax.swing.JButton btn_dua;
    private javax.swing.JButton btn_empat;
    private javax.swing.JButton btn_enam;
    private javax.swing.JButton btn_kali;
    private javax.swing.JButton btn_koma;
    private javax.swing.JButton btn_kurang;
    private javax.swing.JButton btn_lima;
    private javax.swing.JButton btn_menjadikan_plus_atau_minus;
    private javax.swing.JButton btn_nol;
    private javax.swing.JButton btn_persen;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_samadengan;
    private javax.swing.JButton btn_satu;
    private javax.swing.JButton btn_sembilan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_tiga;
    private javax.swing.JButton btn_tujuh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtRiwayat;
    // End of variables declaration//GEN-END:variables

    private void resetCalculator() {
        jLabel2.setText("0");
        result = 0.0;
        operation = "";
        firstNumber = "";
        isNewInput = true;
    }

    private void setOperation(String op) {
        String displayText = jLabel2.getText();

        // Validate display is not empty
        if (!displayText.isEmpty()) {
            try {
                double number = Double.parseDouble(displayText);

                // Check if we need to perform calculation first
                if (!operation.isEmpty()) {
                    calculate(number);
                } else {
                    result = number;
                }

                // Store first number for history
                firstNumber = formatter.format(result);

                // Set new operation and prepare for next input
                operation = op;
                isNewInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Format angka tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void calculate(double number) {
        switch (operation) {
            case "+":
                result += number; // Addition operator
                break;
            case "-":
                result -= number; // Subtraction operator
                break;
            case "*":
                result *= number; // Multiplication operator
                break;
            case "/":
                // Division operator with zero check
                if (number != 0) {
                    result /= number;
                } else {
                    JOptionPane.showMessageDialog(this, ERROR_DIVISION_BY_ZERO, "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
            default:
                // No operation selected
                result = number;
                break;
        }

        // Format and display result
        jLabel2.setText(formatter.format(result));
    }

    private void displayHistory() {
        StringBuilder historyText = new StringBuilder();

        // Display array history (limited to MAX_HISTORY_SIZE)
        historyText.append("===== Array History =====\n");
        for (int i = 0; i < historyIndex; i++) {
            historyText.append(historyArray[i]).append("\n");
        }

        // Display ArrayList history (unlimited)
        historyText.append("\n===== Collection History =====\n");
        for (String entry : historyList) {
            historyText.append(entry).append("\n");
        }

        // Update text area
        txtRiwayat.setText(historyText.toString());
    }

    private void addToHistory(String calculation) {
        // Add to array (with bounds check)
        if (historyIndex < MAX_HISTORY_SIZE) {
            historyArray[historyIndex] = calculation;
            historyIndex++;
        } else {
            // Shift array elements to make room
            for (int i = 0; i < MAX_HISTORY_SIZE - 1; i++) {
                historyArray[i] = historyArray[i + 1];
            }
            historyArray[MAX_HISTORY_SIZE - 1] = calculation;
        }

        // Add to ArrayList (no size limit)
        historyList.add(calculation);

        // Update history display
        displayHistory();
    }

    private void performEquals() {
        String secondNumber = jLabel2.getText();

        // Validate inputs
        if (secondNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, ERROR_INPUT_SECOND, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (firstNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, ERROR_INPUT_FIRST, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Convert input to double
            double secondNum = Double.parseDouble(secondNumber);

            // Perform calculation
            calculate(secondNum);

            // Format history entry: firstNumber operation secondNumber = result
            String historyEntry = firstNumber + " " + operation + " " + secondNumber + " = " + formatter.format(result);

            // Add to history
            addToHistory(historyEntry);

            // Reset for next calculation
            firstNumber = formatter.format(result);
            operation = "";
            isNewInput = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format angka tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void toggleSign() {
        String text = jLabel2.getText();
        if (!text.isEmpty() && !text.equals("0")) {
            try {
                double number = Double.parseDouble(text);
                jLabel2.setText(formatter.format(-number));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Format angka tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

        private void convertToPercentage() {
        String text = jLabel2.getText();
        if (!text.isEmpty()) {
            try {
                double number = Double.parseDouble(text);
                jLabel2.setText(formatter.format(number / 100));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Format angka tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void addDecimalPoint() {
        String text = jLabel2.getText();

        // If starting new input, set to "0."
        if (isNewInput) {
            jLabel2.setText("0.");
            isNewInput = false;
            return;
        }

        // Only add decimal point if not already present
        if (!text.contains(".")) {
            jLabel2.setText(text + ".");
        }
    }

    private void addDigit(String digit) {
        if (isNewInput) {
            jLabel2.setText("");
            isNewInput = false;
        }

        // Prevent multiple zeros at beginning
        if (jLabel2.getText().equals("0") && digit.equals("0")) {
            return;
        }

        // Replace single zero with digit
        if (jLabel2.getText().equals("0") && !digit.equals("0")) {
            jLabel2.setText(digit);
            return;
        }

        jLabel2.setText(jLabel2.getText() + digit);
    }

}
