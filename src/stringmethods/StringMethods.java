/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmethods;

import javax.swing.JOptionPane;



public class StringMethods {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter NIC");
        int nameLength = name.length();
        double sex;
        if (nameLength == 10) {
            String vorx = name.substring(9, 10);
            String age = name.substring(0, 2);
            String xy = name.substring(2, 3);
            sex = Double.parseDouble(xy);
            if (vorx.equalsIgnoreCase("X") || vorx.equalsIgnoreCase("V")) {
                JOptionPane.showMessageDialog(null, "NIC OK");
                JOptionPane.showMessageDialog(null, "Your Birth year is 19" + age);
                if (sex < 5){
                JOptionPane.showMessageDialog(null, "You are a Male");
                }else {JOptionPane.showMessageDialog(null,"You are a Female");}
            } else {
                JOptionPane.showMessageDialog(null, "NIC Wrong Letter");
            }

        } else {
            JOptionPane.showMessageDialog(null, "NIC wrong");
        }

    }

}
