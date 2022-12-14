package br.ufpb.dcx.rodrigor.banco;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Conta {



    private List<Transacao> transacoes = new LinkedList<>();

    public void depositar(double valor){
        this.transacoes.add(new Transacao(valor));
    }

    public void sacar(double valor){
        this.transacoes.add(new Transacao(valor));
    }

    public BigDecimal getSaldo(){
        return new BigDecimal(0.0);
    }

    List<Transacao> getTransacoes(){
        return this.transacoes;
    }
}
