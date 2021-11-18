

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;


public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem ecoSystem;
    private Restaurant restaurant;

    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
         ArrayList<Restaurant> rlist = ecoSystem.getRestaurantDirectory().getRestaurentList();
         for (Restaurant res: rlist) {
             UserAccount userAccount = res.getUserAccount();
             if(userAccount.getUsername().equals(account.getUsername())) {
                 this.restaurant = res;
                 valueLabel.setText(restaurant.getRestaurentName().toString().toUpperCase());
                 
             }
         }
        //valueLabel.setText(restaurant.getRestaurentName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESTAURANT ADMIN ACCESS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        manageEmployeeJButton.setText("MANAGE MENU");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 150, -1));

        manageOrganizationJButton.setText("MANAGE ORDER ");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 150, -1));

        enterpriseLabel.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant Name : -> ");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 160, 30));

        valueLabel.setText(" ");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
       ManageMenuJPanel manageMenuJPanel = new ManageMenuJPanel(userProcessContainer, ecoSystem, restaurant);
       userProcessContainer.add("manageMenuJPanel", manageMenuJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
       ManageOrdersJPanel manageOrdersJPanel = new ManageOrdersJPanel(userProcessContainer,ecoSystem, restaurant);
       userProcessContainer.add("manageOrdersJPanel", manageOrdersJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
