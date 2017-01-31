/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedido;

/**
 *
 * @author Matheus
 */
public class Pedido {
    
    private String nomePedido;
    private int IDPedido;
    private int quantidade;
    private String dataPedido;
    //Ligado ao produto

    public Pedido(String nomePedido, int IDPedido, int quantidade, String dataPedido) {
        this.nomePedido = nomePedido;
        this.IDPedido = IDPedido;
        this.quantidade = quantidade;
        this.dataPedido = dataPedido;
    }
    
    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public int getIDPedido() {
        return IDPedido;
    }

    public void setIDPedido(int IDPedido) {
        this.IDPedido = IDPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }
}
