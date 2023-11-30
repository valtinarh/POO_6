/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package actividad6.friends;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
import java.io.FileNotFoundException;
import java.util.Objects;
import javax.swing.JOptionPane;
/**
 *
 * @author varoh
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        Name = new javax.swing.JLabel();
        Number = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Name.setText("Name:");

        Number.setText("Number:");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelate.setText("Delate");
        btnDelate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelateActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Number)
                            .addComponent(Name))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRead)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelate))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnRead)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        try {

            // Get the name of the contact to be updated
            // from the Command line argument
            String newName = txtName.getText();

            // Get the number to be updated
            // from the Command line argument
            long newNumber = Long.parseLong(txtNumber.getText());

            String nameNumberString;
            String name;
            long number;
            int index;

            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");

            if (!file.exists()) {

                // Create a new file if not exists.
                file.createNewFile();
            }

            // Opening file in reading and write mode.

            RandomAccessFile raf
                    = new RandomAccessFile(file, "rw");
            boolean found = false;

            // Checking whether the name
            // of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {

                // reading line from the file.
                nameNumberString = raf.readLine();

                // splitting the string to get name and
                // number
                String[] lineSplit = nameNumberString.split("!");

                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                // if condition to find existence of record.
                if (name == newName || number == newNumber) {
                    found = true;
                    break;
                }
            }

            if (found == false) {

                // Enter the if block when a record
                // is not already present in the file.
                nameNumberString = newName + "!" + String.valueOf(newNumber);

                // writeBytes function to write a string
                // as a sequence of bytes.
                raf.writeBytes(nameNumberString);

                // To insert the next record in new line.
                raf.writeBytes(System.lineSeparator());

                // Print the message
                JOptionPane.showMessageDialog(null, " Friend added. ");
                

                // Closing the resources.
                raf.close();
            }
            // The contact to be updated
            // could not be found
            else {

                // Closing the resources.
                raf.close();

                // Print the message
                //System.out.println(" Input name" + " does not exists. ");
            }
        }

        catch (IOException ioe) {

            System.out.println(ioe);
        }
        catch (NumberFormatException nef) {

            System.out.println(nef);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        try {

            String nameNumberString;
            String name;
            String newName = txtName.getText();
            long number;
            int index;

            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");

            if (!file.exists()) {

                // Create a new file if not exists.
                file.createNewFile();
            }

            // Opening file in reading and write mode.

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            // Traversing the file
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {

                // reading line from the file.
                nameNumberString = raf.readLine();

                // splitting the string to get name and
                // number
                String[] lineSplit = nameNumberString.split("!");

                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                // Print the contact data
                if (name.equals(newName)) {
                    
                    JOptionPane.showMessageDialog(null, "the contact name is " + name + " & the contact number is " + number);
                   
                    found = true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "there is not exist a record with the name " + newName);
                    
                    break;
                }

            }

             /*catch(IOException ioe)
            {

                System.out.println(ioe);
            }
            catch(NumberFormatException nef)
            {

                System.out.println(nef);
            }*/

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {

            // Get the name of the contact to be updated
            // from the Command line argument
            String newName = txtName.getText();

            // Get the number to be updated
            // from the Command line argument
            long newNumber = Long.parseLong(txtNumber.getText());

            String nameNumberString;
            String name;
            long number;
            int index;

            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");

            if (!file.exists()) {

                // Create a new file if not exists.
                file.createNewFile();
            }

            // Opening file in reading and write mode.
            RandomAccessFile raf= new RandomAccessFile(file, "rw");
            boolean found = false;

            // Checking whether the name
            // of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {

                // reading line from the file.
                nameNumberString = raf.readLine();

                // splitting the string to get name and
                // number
                String[] lineSplit= nameNumberString.split("!");

                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                // if condition to find existence of record.
                if (name.equals(newName) || number == newNumber) {
                    found = true;
                    break;
                }
            }

            // Update the contact if record exists.
            if (found == true) {

                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("temp.txt");

                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

                // Set file pointer to start
                raf.seek(0);

                // Traversing the friendsContact.txt file
                while (raf.getFilePointer()< raf.length()) {

                    // Reading the contact from the file
                    nameNumberString = raf.readLine();

                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(0, index);

                    // Check if the fetched contact
                    // is the one to be updated
                    if (name.equals(newName)) {

                        // Update the number of this contact
                        nameNumberString = name + "!" + String.valueOf(newNumber);
                    }

                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);

                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes( System.lineSeparator());
                }

                // The contact has been updated now
                // So copy the updated content from
                // the temporary file to original file.

                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);

                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());

                // Closing the resources.
                tmpraf.close();
                raf.close();

                // Deleting the temporary file
                tmpFile.delete();
                
                JOptionPane.showMessageDialog(null, " Friend updated. ");
            }

            // The contact to be updated
            // could not be found
            else {

                // Closing the resources.
                raf.close();

                // Print the message
                JOptionPane.showMessageDialog(null, " Input name" + " does not exists. ");
            }
        }

        catch (IOException ioe) {
            System.out.println(ioe);
        }

        catch (NumberFormatException nef) {
            System.out.println(nef);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDelateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelateActionPerformed
        // TODO add your handling code here:
        try {

            // Get the name of the contact to be updated
            // from the Command line argument
            String newName = txtName.getText();

            String nameNumberString;
            String name;
            long number;
            int index;

            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");

            if (!file.exists()) {

                // Create a new file if not exists.
                file.createNewFile();
            }

            // Opening file in reading and write mode.
            RandomAccessFile raf= new RandomAccessFile(file, "rw");
            boolean found = false;

            // Checking whether the name of contact exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {

                // reading line from the file.
                nameNumberString = raf.readLine();

                // splitting the string to get name and
                // number
                String[] lineSplit= nameNumberString.split("!");

                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                // if condition to find existence of record.
                if (Objects.equals(name, newName)) {
                    found = true;
                    break;
                }
            }

            // Delete the contact if record exists.
            if (found == true) {

                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("temp.txt");

                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

                // Set file pointer to start
                raf.seek(0);

                // Traversing the friendsContact.txt file
                while (raf.getFilePointer() < raf.length()) {

                    // Reading the contact from the file
                    nameNumberString = raf.readLine();

                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(0, index);

                    // Check if the fetched contact
                    // is the one to be deleted
                    if (name.equals(newName)) {

                        // Skip inserting this contact
                        // into the temporary file
                        continue;
                    }

                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);

                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes(System.lineSeparator());
                }

                // The contact has been deleted now
                // So copy the updated content from
                // the temporary file to original file.

                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);

                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer()< tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());

                // Closing the resources.
                tmpraf.close();
                raf.close();

                // Deleting the temporary file
                tmpFile.delete();

                JOptionPane.showMessageDialog(null, " Friend deleted. ");
            }

            // The contact to be deleted
            // could not be found
            else {

                // Closing the resources.
                raf.close();

                // Print the message
                JOptionPane.showMessageDialog(null, " Input name"+ " does not exists. ");
            }
        }

        catch (IOException ioe) {
            System.out.println(ioe);
        }
    }//GEN-LAST:event_btnDelateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtNumber.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Number;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
