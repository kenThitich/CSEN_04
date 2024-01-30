/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalTempererature;

import javax.ejb.Remote;

/**
 *
 * @author TUFGAMING
 */
@Remote
public interface CalTemperatureBeanRemote {

    double FtoC(double fahrenheit);
    
}
