public class OpcaoBoleto implements OpcaoPagamento {
    @Override
    public double pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Boleto Bancário.");
        return valor;
    }
}