package ui.AreaManagerRole;


import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Area;
import model.CarDetails;
import model.CarDetailsRecords;



public class CreateNewCarDetailsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Area area;
    public CreateNewCarDetailsJPanel(JPanel upc, Area s){
        initComponents();
        userProcessContainer = upc;
        area = s;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMakeYear = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCarName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboCategory = new javax.swing.JComboBox<>();
        ComboManufacturer = new javax.swing.JComboBox<>();
        ComboSeats = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 600));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Create New CarDetail");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Category:");

        txtModel.setEditable(false);
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Make Year:");

        btnAdd.setText("Add Product");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("SerialNumber :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Manufacturer : ");

        jLabel6.setText("Seats : ");

        jLabel7.setText("Model :");

        ComboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUV", "HatchBack", "Sedan" }));

        ComboManufacturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "Honda", "Mercedes", "BMW", "Volkswagen", "Audi", "Nissan", "Subaru" }));

        ComboSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", " " }));

        jButton1.setText("Add from import");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMakeYear, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(txtCarName, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(ComboCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboManufacturer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboSeats, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(269, 269, 269))
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMakeYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCarName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(jButton1))
                .addGap(68, 68, 68))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCarName, txtMakeYear, txtModel});

    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        CarDetails p = area.getCarDetailsRecords().addcarDetails();
        
        p.setCategory(ComboCategory.getSelectedItem().toString());
        p.setMakeYear(Integer.parseInt(txtMakeYear.getText()));
        p.setManufacturer(ComboManufacturer.getSelectedItem().toString());
        //p.setModelNumber(Integer.parseInt(txtModel.getText()));
        int seats = Integer.parseInt((String) ComboSeats.getSelectedItem());
        
        p.setSeats(seats);
        p.setcarName(txtCarName.getText());
        System.out.println("Seats set --> " + txtCarName.getText());
        //String stringPrice = txtMakeYear.getText();
        
        JOptionPane.showMessageDialog(null, "Car added!", "Info", JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageCarDetailsRecordsJPanel managecardetailsrecordsJPanel = (ManageCarDetailsRecordsJPanel) component;
        managecardetailsrecordsJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String fileLocation = File.separator + "Users" +File.separator+ "shashwatshrey"+ File.separator+ "OneDrive" + File.separator +"Northeastern_COE"+File.separator+"INFO5100_AED"+File.separator+"Shrey_Shashwat_002128122"+File.separator+"Assignment3"+File.separator+"src"+File.separator+"cars.txt";
        try{
        File inventoryFile = new File(fileLocation);
        Scanner carscanner = new Scanner(inventoryFile);
        CarDetailsRecords records = new CarDetailsRecords();
        //read a line from the file
        while(carscanner.hasNextLine()){
           String nextLine = carscanner.nextLine();
        //split the file using delimtters
        String [] cardetails = nextLine.split(",");
        String SerialNum = cardetails[0];
        String category = cardetails[1];
        String makeyear = cardetails[2];
        String manufacturer = cardetails[3];
        String seats = cardetails[4];
        String model = cardetails[5];
        
        CarDetails car =area.getCarDetailsRecords().addcarDetails();
        car.setSerialNumber(model);
        car.setCategory(category);
        car.setMakeYear(Integer.parseInt(makeyear));
        car.setManufacturer(manufacturer);
        car.setSeats(Integer.parseInt(seats));
        car.setcarName(model);
        
        
         
        }
        JOptionPane.showMessageDialog(null, "Cars added from import!", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        }catch(FileNotFoundException ex){
            System.out.println("Exception found");
        }
     
        
    }//GEN-LAST:event_jButton1ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCategory;
    private javax.swing.JComboBox<String> ComboManufacturer;
    private javax.swing.JComboBox<String> ComboSeats;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCarName;
    private javax.swing.JTextField txtMakeYear;
    private javax.swing.JTextField txtModel;
    // End of variables declaration//GEN-END:variables
}
