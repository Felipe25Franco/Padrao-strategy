public class Cliente {


    private String formaPagamento;

    public void pagarComBoleto() {
        Compra compra = new Compra();
        this.formaPagamento = compra.algo(new OpcaoBoleto());
    }

    public void pagarComPix() {
        Compra compra = new Compra();
        this.formaPagamento = compra.algo(new OpcaoPix());
    }

    public void pagarComDinheiro() {
        Compra compra = new Compra();
        this.formaPagamento = compra.algo(new OpcaoDinheiro());
    }

    public void pagarComCartaoCredito() {
        Compra compra = new Compra();
        this.formaPagamento = compra.algo(new OpcaoCartaoCredito());
    }

    public void pagarComCartaoDebito() {
        Compra compra = new Compra();
        this.formaPagamento = compra.algo(new OpcaoCartaoDebito());
    }


}
