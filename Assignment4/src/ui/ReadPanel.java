/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.House;
import model.MedicalSystem;
import model.Patient;
import model.PatientDirectory;
import model.Person;

/**
 *
 * @author shashwatshrey
 */
public class ReadPanel extends javax.swing.JPanel {

    /**
     * Creates new form readPanel
     */
    MedicalSystem medicalsystem;
    PatientDirectory patientdirectory;
    public ReadPanel(MedicalSystem medicalSystem , PatientDirectory patientdirectory) {
        initComponents();
        this.medicalsystem = medicalSystem;
        this.patientdirectory = patientdirectory;
        
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitals = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtfindCommunity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtfindAge = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Records");

        jLabel3.setText("Community:");

        tblVitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Systolic", "Diastolic", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitals);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblName.setText("Name :");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        jLabel4.setText("Min Age:");

        btnFind.setText("FInd");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblAge)
                                                    .addComponent(lblGender))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnUpdate)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnView)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtfindCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfindAge, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFind)
                                        .addGap(0, 23, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtGender, txtName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtfindCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtfindAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete)
                        .addComponent(btnView)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int communityZip = Integer.parseInt(txtfindCommunity.getText());
        int minAge = Integer.parseInt(txtfindAge.getText());
        
        int selectedIndex = tblVitals.getSelectedRow();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, "select row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        Patient selectedPatient = (Patient)model.getValueAt(selectedIndex, 0);
        
        ArrayList<Patient> patients = new ArrayList<Patient>();
        HashMap<String , Patient> patientMap = medicalsystem.getPatientDirectory();
        
        for(Map.Entry mapElement : patientMap.entrySet()){
            Patient p = (Patient) mapElement.getValue();
            patients.add(p);
        }
        String name = selectedPatient.getPerson().getName();
        
         medicalsystem.getPatientDirectory().remove(name);
            
        
        //patients.remove(selectedPatient);
        
        JOptionPane.showMessageDialog(this, "Entry deleted");
        populateTable(communityZip , minAge);
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        System.out.print("-----Data STORED in readScreen -------");
        System.out.print(medicalsystem.getPatientDirectory());
        System.out.println("Cities " + medicalsystem.getCities());
        //String cityName = txtfindCity.getText();
        int communityZip = Integer.parseInt(txtfindCommunity.getText());
        int minAge = Integer.parseInt(txtfindAge.getText());
        populateTable(communityZip , minAge);
        
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int communityZip = Integer.parseInt(txtfindCommunity.getText());
        int minAge = Integer.parseInt(txtfindAge.getText());
        
        int selectedIndex = tblVitals.getSelectedRow();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, "select row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        Patient selectedPatient = (Patient)model.getValueAt(selectedIndex, 0);
        
        txtName.setText(String.valueOf(selectedPatient.getPerson().getName()));
        txtAge.setText(String.valueOf(selectedPatient.getPerson().getAge()));
        txtGender.setText(String.valueOf(selectedPatient.getPerson().getGender()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         int communityZip = Integer.parseInt(txtfindCommunity.getText());
        int minAge = Integer.parseInt(txtfindAge.getText());
        
        int selectedIndex = tblVitals.getSelectedRow();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this, "select row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        Patient selectedPatient = (Patient)model.getValueAt(selectedIndex, 0);
        
        int updatedage = Integer.parseInt(txtAge.getText());
        String name = selectedPatient.getPerson().getName();
        
        medicalsystem.getPatientDirectory().get(name).getPerson().setAge(updatedage);
        populateTable(communityZip , minAge);
        
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblVitals;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtfindAge;
    private javax.swing.JTextField txtfindCommunity;
    // End of variables declaration//GEN-END:variables

    private void populateTable(int communityZip, int minAge) {
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        model.setRowCount(0);
        
        ArrayList<Patient> patients = new ArrayList<Patient>();
        HashMap<String , Patient> patientMap = medicalsystem.getPatientDirectory();
        
        for(Map.Entry mapElement : patientMap.entrySet()){
            Patient p = (Patient) mapElement.getValue();
            if(p.getcommunityName() == communityZip && p.getPerson().getAge() > minAge &&p.getEncounterHistory().getEncounterHistory().get(0).getVitalSign().getSystolic()>100){
                patients.add(p);
            }
            
        }
        
        for(Patient p : patients){
            Object[] row = new Object[4];
           
            row[0] = p;
            row[1] = p.getEncounterHistory().getEncounterHistory().get(0).getVitalSign().getSystolic();
            row[2] = p.getEncounterHistory().getEncounterHistory().get(0).getVitalSign().getDiastolic();
            row[3] = p.getPerson().getAge();
            
            model.addRow(row);
        }
        
    }

   
}
