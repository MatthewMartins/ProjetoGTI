/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Venda;

/**
 *
 * @author Matheus
 */
public class Venda {
    
    //pelo ID do produto, ja consegue pegar os dados relativos ao produto que foi vendido
    private int quantVendida;
    private String dataVenda;
    private int IDVenda;
    private int IDProduto;

    public Venda(int quantVendida, String dataVenda, int IDVenda, int IDProduto) {
        this.quantVendida = quantVendida;
        this.dataVenda = dataVenda;
        this.IDVenda = IDVenda;
        this.IDProduto = IDProduto;
    }

    public int getQuantVendida() {
        return quantVendida;
    }

    public void setQuantVendida(int quantVendida) {
        this.quantVendida = quantVendida;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIDVenda() {
        return IDVenda;
    }

    public void setIDVenda(int IDVenda) {
        this.IDVenda = IDVenda;
    }

    public int getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto) {
        this.IDProduto = IDProduto;
    }
    
    
    
    
}
