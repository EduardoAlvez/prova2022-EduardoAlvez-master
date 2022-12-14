package br.ufpb.dcx.rodrigor.vendasImpressora;

import java.util.LinkedList;
import java.util.List;

public class SistemaControleVendas {

    private Impressora impressora;

    private LeitorCodigoBarras leitorCodigo;

    private List<Pedido> pedidos = new LinkedList<>();


    public void setLeitorCodigo(LeitorCodigoBarras leitor){
        this.leitorCodigo = leitor;
    }


    public void setImpressora(Impressora impressora){
        this.impressora = impressora;
    }



    private void registrarPedido(Pedido pedido){
        this.pedidos.add(pedido);
        impressora.imprimirCupomVenda(pedido);
    }

    public Impressora getImpressora() {
        return this.impressora;
    }

    public LeitorCodigoBarras getLeitorCodigo(){
        return this.leitorCodigo;
    }
}
