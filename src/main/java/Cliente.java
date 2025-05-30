public class Cliente {
    private double valorPago;
    public double getValorPago() {
        return valorPago;
    }
    public void pagarComBoleto(double valor) {
        Opcao opcao = new Opcao(valor);
        this.valorPago = opcao.executarPagamento(new OpcaoBoleto());
    }

    public void pagarComCartaoCredito(double valor, int numeroParcelas) {
        Opcao opcao = new Opcao(valor);
        this.valorPago = opcao.executarPagamento(new OpcaoCartaoCredito(numeroParcelas));
    }

    public void pagarComCartaoDebito(double valor) {
        Opcao opcao = new Opcao(valor);
        this.valorPago = opcao.executarPagamento(new OpcaoCartaoDebito());
    }

    public void pagarComPix(double valor) {
        Opcao opcao = new Opcao(valor);
        this.valorPago = opcao.executarPagamento(new OpcaoPix());
    }

    public void pagarComDinheiro(double valor) {
        Opcao opcao = new Opcao(valor);
        this.valorPago = opcao.executarPagamento(new OpcaoDinheiro());
    }
}
