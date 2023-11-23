/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author Admin
 */
public class Questao2JornadaC {

    private int voto40;
    private int voto44;
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public int getVoto40() {
        return voto40;
    }

    public void setVoto40(int voto40) {
        this.voto40 = voto40;
    }

    public int getVoto44() {
        return voto44;
    }

    public void setVoto44(int voto44) {
        this.voto44 = voto44;
    }

    public int voto40OF() {
        if (matriculaPreenchida()) {
            this.voto40 += 1;
        }
        return this.voto40;
    }

    public int voto44OF() {
        if (matriculaPreenchida()) {
            this.voto44 += 1;
        }
        return this.voto44;
    }

    public int votosTotais() {
        return this.voto44 + this.voto40;
    }

    public String maiorVoto() {
        if (this.voto40 > this.voto44) {
            return "40 hrs";
        } else if (this.voto40 < this.voto44) {
            return "44 hrs";
        } else {
            return "Empate";
        }
    }

    public boolean matriculaPreenchida() {
       return matricula != null && !matricula.trim().isBlank();
    }
}
