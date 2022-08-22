/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investimento;

import java.text.DecimalFormat;

/**
 *
 * @author Pedro Viana
 */
public class Investimento {
 
private double valorDoInvestimento;
private double taxaDeJuros;
private double alvo;

    public Investimento(double valor, double taxa){
	valorDoInvestimento = valor;
	taxaDeJuros = taxa;
    }

    public void investirAteValor(double valorAlvo){
        int ano = 0;
        while(valorDoInvestimento < valorAlvo){
            ano = ano + 1;
            DecimalFormat formatador = new DecimalFormat("0.00");
            double juros = valorDoInvestimento * taxaDeJuros;
            formatador.format(valorDoInvestimento = valorDoInvestimento + juros);
        } 
        alvo = ano;
    }
    
    public  void  investirPorPeriodo(int periodoFixo){
        for(int i=1; i <= periodoFixo; i+=1){
            DecimalFormat formatador = new DecimalFormat("0.00");
            double juros = valorDoInvestimento * taxaDeJuros;
            formatador.format(valorDoInvestimento = valorDoInvestimento + juros);
        }
    }

   public int getPeriodo(){
       int m;
        m = (int)alvo;
        return m; 
   }

    public double getSaldo(){
        DecimalFormat formatador = new DecimalFormat("0.00");
        double saldo = valorDoInvestimento;
        formatador.format(saldo);
        return  saldo;
    }
    
}
