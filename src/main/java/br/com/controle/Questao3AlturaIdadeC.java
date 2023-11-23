/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author Admin
 */
public class Questao3AlturaIdadeC {

    private int idade;
    private int idade50;
    private double peso;
    private double peso40;
    private double altura;
    private double altura1020;
    private int qtdSistemaRodou;
    private int qtdAltura1020;

    public double getAltura1020() {
        return altura1020;
    }

    public void setAltura1020(double altura1020) {
        this.altura1020 = altura1020;
    }

    public int getIdade50() {
        return idade50;
    }

    public void setIdade50(int idade50) {
        this.idade50 = idade50;
    }

    public double getPeso40() {
        return peso40;
    }

    public void setPeso40(double peso40) {
        this.peso40 = peso40;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        if (this.idade > 50) {
            idade50 += 1;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        if (this.peso < 40) {
            peso40 += 1;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura, int idade) {
        this.altura = altura;
        if (idade >= 10 && idade <= 20) {
            qtdAltura1020 += 1;
            altura1020 += altura;
        }
    }

    public int getQtdSistemaRodou() {
        return qtdSistemaRodou;
    }

    public int idade50() {
        return idade50;
    }

    public String medAltura1020() {
        return formataNumero(this.altura1020 / qtdAltura1020);
    }

    public String perc40() {
        return formataNumero((this.peso40 * 100) / this.qtdSistemaRodou);
    }
    
    private String formataNumero(double formata){
        String s = Double.toString(formata);
        int idx = s.indexOf(".");
        if (idx != -1) {
            if (idx + 3 < s.length()) {
                s = s.substring(0, idx + 3);
            }
        }
        return s;
    }

    public int sistemaRodou() {
        return this.qtdSistemaRodou += 1;
    }
}
