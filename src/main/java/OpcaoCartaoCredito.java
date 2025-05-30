public class OpcaoCartaoCredito implements OpcaoPagamento {

    private int numeroParcelas;


    private static final int maxParcelas = 10;


    public OpcaoCartaoCredito(int numeroParcelas) {
        if (numeroParcelas < 1 || numeroParcelas > maxParcelas) {
            throw new IllegalArgumentException("Número de parcelas deve ser entre 1 e " + maxParcelas);
        }
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public double pagar(double valor) {

        double valorParcela = valor / numeroParcelas;


        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
        System.out.println("Valor parcelado em " + numeroParcelas + " vezes de R$" + valorParcela);

        return valor;
    }
}