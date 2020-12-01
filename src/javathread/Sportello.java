/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author baldan.federico
 */
public class Sportello implements Runnable {
    
    Conto conto;

    public Sportello(Conto conto) {
        this.conto = conto;
    }
    
    @Override
    public void run() {
    this.Versa(500);
    }
    
    public void Versa(int somma){
        conto.Versa(somma);
//        System.out.println("Conto: " +conto.Saldo());
    }
}
