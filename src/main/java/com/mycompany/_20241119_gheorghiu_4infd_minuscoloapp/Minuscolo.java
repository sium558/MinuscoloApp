/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._20241119_gheorghiu_4infd_minuscoloapp;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class Minuscolo {
    static final int TANTI = 30;
    private String Parola;
    char[] maiuscolo = new char[TANTI];

    public void Utente() {
        Scanner in = new Scanner(System.in);
        System.out.print("INSERISCI UNA PAROLA: ");
        Parola = in.next(); 
    }
    public void Controllo() {
        for (int i = 0; i < Parola.length(); i++) {
            maiuscolo[i] = Parola.charAt(i);
        }
        System.out.print("LA PAROLA IN MINUSCOLO: ");
        for (int i=0;i< Parola.length();i++) {
            maiuscolo[i] = Character.toLowerCase(maiuscolo[i]); 
        } 
        for (int i= 0;i< maiuscolo.length; i++) {
            System.out.print(maiuscolo[i]);
        }
    }
    public void Minuscolo() { 
        String Par = new String(maiuscolo);
        System.out.print("La parola in minuscolo (oggetto): ");
        System.out.println(Par);

    }
}
