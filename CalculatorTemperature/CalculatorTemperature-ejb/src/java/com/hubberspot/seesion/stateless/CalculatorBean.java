/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubberspot.seesion.stateless;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author TUFGAMING
 */
@Stateless
@LocalBean
public class CalculatorBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public double fToC(double fahrenheit){
        double celsius = (5/9)*(fahrenheit-32);
        return celsius;
    }
}
