/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalTempererature;

import javax.ejb.Stateless;

/**
 *
 * @author TUFGAMING
 */
@Stateless
public class CalTemperatureBean implements CalTemperatureBeanRemote {

    @Override
    public double FtoC(double fahrenheit) {
        double celsius = (5/9)*(fahrenheit-32);
        return celsius;
    }
    
}
