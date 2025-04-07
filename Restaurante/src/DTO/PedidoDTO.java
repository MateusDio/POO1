
package DTO;


public class PedidoDTO {
    
    String cliente, itens;
    int numeroPE;
    double total;

  

    public String getCliente() {
        return cliente;
    }
      public int getNumeroPE() {
        return numeroPE;
    }

    public String getItens() {
        return itens;
    }

    public double getTotal() {
        return total;
    }

    public void setNumeroPE(int numeroPE) {
        this.numeroPE = numeroPE;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PedidoDTO{" + "numeroPE=" + numeroPE + ", cliente=" + cliente + ", itens=" + itens + ", total=" + total + '}';
    }

    public PedidoDTO(String cliente, String itens, int numeroPE, double total) {
        this.cliente = cliente;
        this.itens = itens;
        this.numeroPE = numeroPE;
        this.total = total;
    }

   
    
}
