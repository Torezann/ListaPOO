/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author Admin
 */
public class Questao1CarroC {
    
    private double custoFabrica;
    private double impostos;
    private double distribuidor;
    
    
    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }
    
    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public double getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(double distribuidor) {
        this.distribuidor = distribuidor;
    }
    
    public double custoFinal() {
        return this.custoFabrica + ((this.distribuidor/100) * this.custoFabrica) + ((this.impostos/100) * this.custoFabrica);
    }
    
    public double custoFinalPNE() {
        return (this.custoFabrica + ((this.distribuidor/100) * this.custoFabrica) + ((this.impostos/100) * this.custoFabrica))-
                ((this.custoFabrica + ((this.distribuidor/100) * this.custoFabrica) + ((this.impostos/100) * this.custoFabrica))*0.20);
    }
}
