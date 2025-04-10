/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package demo;

import business.security.AutheticationService;

/**
 *
 * @author HP Pavilion
 */
public class main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        AutheticationService AS= new AutheticationService();
        
        String username = "admin";
        String password = "#12345$";
        
        long verificacion= AS.signin(username,password);
        
        if (verificacion != -1){
            System.out.println("Inicio de sesion Exitoso.");
        }else{
            System.out.println("Inicio de sesion No Exitoso.");
        }
        
        
    }
}
