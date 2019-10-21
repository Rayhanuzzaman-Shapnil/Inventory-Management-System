/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO_Inventory_s;

import java.awt.event.KeyEvent;

/**
 *
 * @author A
 */
public class icTax {
    public double mcTax_Rate = 0.90;
    public Double cFindTax(double cAmount){
        double FindTax = cAmount - (cAmount*mcTax_Rate);
        return FindTax;
    }
     
    public void ClearText(java.awt.event.KeyEvent evt) {                                    
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))||(iNumber == KeyEvent.VK_BACK_SPACE)||(iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    } 
    
}
