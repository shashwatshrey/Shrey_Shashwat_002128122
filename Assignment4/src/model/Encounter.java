/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author shashwatshrey
 */
public class Encounter {
    VitalSigns VitalSign;
    Date VisitDate;

  
    public Encounter(){
        VitalSign = new VitalSigns();
        VisitDate = new Date();
        
    }
    
    public VitalSigns getVitalSign() {
        return VitalSign;
    }

    public void setVitalSign(VitalSigns VitalSign) {
        this.VitalSign = VitalSign;
    }

    public Date getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(Date VisitDate) {
        this.VisitDate = VisitDate;
    }

   
    
}
