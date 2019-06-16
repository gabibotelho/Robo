/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;

/**
 *
 * @author Gabi
 */
public class Teste {
    public static void main(String[] args) throws InterruptedException{
        ContaCaminhos cc = new ContaCaminhos(10,20);
        long inicio = System.currentTimeMillis();
        int resultado = cc.compute();
        long decorrido = System.currentTimeMillis();
        System.out.println("tempo "+ (decorrido - inicio) );
        System.out.println(resultado);
    }
}
