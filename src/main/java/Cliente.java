public class Cliente {


    private double valorPago;
    public double getValorPago() {
        return valorPago;
    }


    public void pagarComBoleto(double valor) {
        Pagamento pagamento = new Pagamento(valor);
        this.valorPago = pagamento.executarPagamento(new OpcaoBoleto());
    }

    public void pagarComCartaoCredito(double valor, int numeroParcelas) {
        Pagamento pagamento = new Pagamento(valor);
        this.valorPago = pagamento.executarPagamento(new OpcaoCartaoCredito(numeroParcelas));
    }

    public void pagarComCartaoDebito(double valor) {
        Pagamento pagamento = new Pagamento(valor);
        this.valorPago = pagamento.executarPagamento(new OpcaoCartaoDebito());
    }

    public void pagarComPix(double valor) {
        Pagamento pagamento = new Pagamento(valor);
        this.valorPago = pagamento.executarPagamento(new OpcaoPix());
    }

    public void pagarComDinheiro(double valor) {
        Pagamento pagamento = new Pagamento(valor);
        this.valorPago = pagamento.executarPagamento(new OpcaoDinheiro());
    }



}
