/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caltemperatureclient;

import CalTempererature.CalTemperatureBeanRemote;
import java.util.Scanner;
/**
 *
 * @author TUFGAMING
 */
public class Main {

    @javax.ejb.EJB
    private static CalTemperatureBeanRemote calTemperatureBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter degree in Farenheit : ");
        double f = sc.nextDouble();
        System.out.println("result " +  calTemperatureBean.FtoC(f)+ " Celsius");
    }
    
}
