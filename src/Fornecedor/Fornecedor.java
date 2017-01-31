/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fornecedor;

/**
 *
 * @author Matheus
 */
public class Fornecedor {
    private String nomeFor;
    private int ID;
    private String endereco;
    private String telefone;
    //tem uma lista com todos os produtos que o mesmo pode entregar

    public Fornecedor(String nomeFor, int ID, String endereco, String telefone) {
        this.nomeFor = nomeFor;
        this.ID = ID;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNomeFor() {
        return nomeFor;
    }

    public void setNomeFor(String nomeFor) {
        this.nomeFor = nomeFor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
