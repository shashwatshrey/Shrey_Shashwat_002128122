/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class AssignDeliveryMan extends javax.swing.JPanel {
    JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Restaurant restaurant;
    private Customer cust;
    private String id;
    /**
     * Creates new form AssignDeliveryMan
     */
    public AssignDeliveryMan(JPanel userProcessContainer, EcoSystem ecoSystem,
        Restaurant restaurant,  Customer cust, String id) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.restaurant = restaurant;
        this.cust = cust;
        this.id = id;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMenuBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        deliveryStaffTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        addMenuBtn.setText("ASSIGN");
        addMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuBtnActionPerformed(evt);
            }
        });

        deliveryStaffTable.setBackground(new java.awt.Color(204, 204, 204));
        deliveryStaffTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        deliveryStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DELIVERY STAFF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deliveryStaffTable);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(522, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addMenuBtn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addMenuBtn)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuBtnActionPerformed
        // TODO add your handling code here:
       int selectedRow = deliveryStaffTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
       DeliveryMan dm = (DeliveryMan)deliveryStaffTable.getValueAt(selectedRow, 0);
       dm.setCustDetails(cust);
       for(WorkRequest wr : cust.getUserAccount().getWorkQueue().getWorkRequestList()){
           if (wr.getId() == id) {
               wr.setStatus("Assigned");
           }
           
       };
       JOptionPane.showMessageDialog(null, "Order Assigned");
    }//GEN-LAST:event_addMenuBtnActionPerformed

     public void populateTable(){
       DefaultTableModel model = (DefaultTableModel) deliveryStaffTable.getModel();
        model.setRowCount(0);
        for (DeliveryMan deliveryMan : ecoSystem.getDeliveryManDirectory().getDeliveryManList()) {
            Object[] row = new Object[model.getColumnCount()];
            row[0] = deliveryMan;
            model.addRow(row);
        }  
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageOrdersJPanel manageOrdersJPanel = (ManageOrdersJPanel) component;

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMenuBtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable deliveryStaffTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}