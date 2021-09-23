/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author shashwatshrey
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Person person;
    
    
            
    public ViewJPanel(Person person) {
        initComponents();
        this.person = person;
        
        displayPerson();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidNumber = new javax.swing.JTextField();
        txttelPhone = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtssn = new javax.swing.JTextField();
        txtmedRecord = new javax.swing.JTextField();
        txthealthPlan = new javax.swing.JTextField();
        lblbankAcc = new javax.swing.JLabel();
        lblcertificate = new javax.swing.JLabel();
        lblvehichleNo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lbldeviceIdentifier = new javax.swing.JLabel();
        lblipAddress = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbllinkedIn = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblidNumber = new javax.swing.JLabel();
        lbltelPhone = new javax.swing.JLabel();
        txtbankAcc = new javax.swing.JTextField();
        lblgeoData = new javax.swing.JLabel();
        txtCertificate = new javax.swing.JTextField();
        lblhealthPlan = new javax.swing.JLabel();
        txtvehichleNo = new javax.swing.JTextField();
        lblmedRecord = new javax.swing.JLabel();
        lblssn = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtdeviceIdentifier = new javax.swing.JTextField();
        lblFax = new javax.swing.JLabel();
        txtlinkedIn = new javax.swing.JTextField();
        txtgeoData = new javax.swing.JTextField();
        txtipAddress = new javax.swing.JTextField();
        lblpicture = new javax.swing.JLabel();
        lblBiometric = new javax.swing.JLabel();
        datechooserDOB = new com.toedter.calendar.JDateChooser();

        txtidNumber.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtssnActionPerformed(evt);
            }
        });

        txthealthPlan.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblbankAcc.setText("BankAcc :");

        lblcertificate.setText("Certificate No:");

        lblvehichleNo.setText("Vehichle No :");

        lblName.setText("Name :");

        lbldeviceIdentifier.setText("Device Identifier :");

        lblipAddress.setText("IPAddress : ");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lbllinkedIn.setText("LinkedIn : ");

        lblDOB.setText("DOB : ");

        lblidNumber.setText("ID Number :");

        lbltelPhone.setText("Tel Ph :");

        txtbankAcc.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblgeoData.setText("Geo Data :");

        txtCertificate.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblhealthPlan.setText("HealthPlanNo:");

        txtvehichleNo.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblmedRecord.setText("MedicalRecord : ");

        lblssn.setText("SSN:");

        lblEmail.setText("Email :");

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("VIEW PERSON");

        txtdeviceIdentifier.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblFax.setText("FAX No :");

        txtlinkedIn.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtipAddress.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblpicture.setText("Picture");

        lblBiometric.setText("Biometric");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblmedRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtmedRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblgeoData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDOB))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtgeoData, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(datechooserDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblpicture, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFax)
                            .addComponent(lbltelPhone)
                            .addComponent(lblEmail)
                            .addComponent(lblssn))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblhealthPlan)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbllinkedIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblidNumber)
                                .addComponent(lblipAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblbankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcertificate)
                            .addComponent(lblvehichleNo)
                            .addComponent(lbldeviceIdentifier))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txthealthPlan)
                                .addComponent(txtbankAcc)
                                .addComponent(txtCertificate)
                                .addComponent(txtvehichleNo, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtipAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtlinkedIn))
                                    .addGap(2, 2, 2))
                                .addComponent(txtidNumber))))
                    .addComponent(lblBiometric))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblgeoData)
                                        .addComponent(txtgeoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtlinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDOB)
                                        .addComponent(lblipAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtipAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datechooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbllinkedIn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltelPhone)
                            .addComponent(txttelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblidNumber)
                            .addComponent(txtidNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbldeviceIdentifier)
                        .addComponent(txtdeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFax)
                            .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblssn)
                            .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmedRecord)
                            .addComponent(txtmedRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblvehichleNo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txthealthPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblhealthPlan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblbankAcc)
                            .addComponent(txtbankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txtvehichleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblcertificate)
                                    .addComponent(txtCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpicture, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBiometric))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtssnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtssnActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datechooserDOB;
    private javax.swing.JLabel lblBiometric;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblbankAcc;
    private javax.swing.JLabel lblcertificate;
    private javax.swing.JLabel lbldeviceIdentifier;
    private javax.swing.JLabel lblgeoData;
    private javax.swing.JLabel lblhealthPlan;
    private javax.swing.JLabel lblidNumber;
    private javax.swing.JLabel lblipAddress;
    private javax.swing.JLabel lbllinkedIn;
    private javax.swing.JLabel lblmedRecord;
    private javax.swing.JLabel lblpicture;
    private javax.swing.JLabel lblssn;
    private javax.swing.JLabel lbltelPhone;
    private javax.swing.JLabel lblvehichleNo;
    private javax.swing.JTextField txtCertificate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtbankAcc;
    private javax.swing.JTextField txtdeviceIdentifier;
    private javax.swing.JTextField txtgeoData;
    private javax.swing.JTextField txthealthPlan;
    private javax.swing.JTextField txtidNumber;
    private javax.swing.JTextField txtipAddress;
    private javax.swing.JTextField txtlinkedIn;
    private javax.swing.JTextField txtmedRecord;
    private javax.swing.JTextField txtssn;
    private javax.swing.JTextField txttelPhone;
    private javax.swing.JTextField txtvehichleNo;
    // End of variables declaration//GEN-END:variables

    private void displayPerson() {
        
        lblBiometric.setIcon(new ImageIcon(person.getBiometric()));
        lblpicture.setIcon(new ImageIcon(person.getPicture()));
        txtName.setText(person.getName());
        txtgeoData.setText(person.getGeographicData());
        datechooserDOB.setDate(person.getDOB());
        txttelPhone.setText(Integer.toString(person.getTelephoneNumber()));
        txtFax.setText(Integer.toString(person.getFaxNumber()));
        txtEmail.setText(person.getEmailAddress());
        txtssn.setText(person.getSSN());
        txtmedRecord.setText(Integer.toString(person.getMedicalRecordNumber()));
        txthealthPlan.setText(Integer.toString(person.getHealthBeneficiaryNumber()));
        txtbankAcc.setText(Integer.toString(person.getBankAccountNumber()));
        txtCertificate.setText(Integer.toString(person.getLicenseNumber()));
        txtvehichleNo.setText(person.getVehichleLicencePlate());
        txtdeviceIdentifier.setText(Integer.toString(person.getDeviceIndentifiers()));
        txtlinkedIn.setText(person.getLinkedIn());
        txtipAddress.setText(person.getIpAddress());
        txtidNumber.setText(person.getID());
        
        
    }
}
