/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.cristopheramaral.contabanco;

import java.util.Scanner;

/**
 *
 * @author MeuPerfil
 */
public class ContaTerminal {

    public static void main(String[] args) {

        int numero = 0;
        String agencia = "SEMAGENCIA";
        String nomeCliente = "SEMCLIENTE";
        Double saldo = 0.0D;
        Scanner valorInformado = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        numero = valorInformado.nextInt();
        
        System.out.println("Por favor digite o numero da Agência !");
        agencia = valorInformado.next();
        
        System.out.println("Por favor digite o nome do Cliente");
        nomeCliente = valorInformado.next();
        
        System.out.println("Por favor digite o Saldo da Conta");
        saldo = valorInformado.nextDouble();
                        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco,"
                + "sua agência é "+agencia+", conta"+numero+"e seu saldo "+saldo
                +" já está disponível para saque.");
        
        
    }

}
