package classes;

import java.sql.Date;
import java.time.LocalDate;

public class Vendas {
    private String codigo;
    private String dataVenda;
    private String produto;
    private int produtoEstoque;
    private double valorVenda;
    
    /*public Vendas(int codigo, Date dataVenda,Produtos produto, int produtoEstoque,float valorVenda ){
        this.codigo = codigo;
        this.dataVenda = dataVenda;
        this.produto = produto;
        this.produtoEstoque = produtoEstoque;
        this.valorVenda = valorVenda;

    } */
   


    public Vendas() {
    }

    



    public String getDataVenda() {
        return dataVenda;
    }





    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }





    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
 

    public int getProdutoEstoque() {
        return produtoEstoque;
    }
    public void setProdutoEstoque(int produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    public void setProduto(int nextInt) {
    }

    /*public LocalDate datahoje(LocalDate dat) {
        LocalDate todaysDate = LocalDate.now();
        System.out.println(todaysDate);
         return dat;
    }*/

    
    


    
}
