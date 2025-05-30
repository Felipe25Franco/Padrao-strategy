public class Pagamento {

    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double executarPagamento(OpcaoPagamento opcao) {
        return opcao.pagar(valor);
    }
}
