public class OpcaoCartaoCredito implements OpcaoPagamento {

    private int numeroParcelas;  // Número de parcelas desejado

    // Número máximo de parcelas permitidas
    private static final int MAX_PARCELAS = 10;

    // Construtor que permite configurar o número de parcelas
    public OpcaoCartaoCredito(int numeroParcelas) {
        if (numeroParcelas < 1 || numeroParcelas > MAX_PARCELAS) {
            throw new IllegalArgumentException("Número de parcelas deve ser entre 1 e " + MAX_PARCELAS);
        }
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public double pagar(double valor) {
        // Calcular o valor de cada parcela
        double valorParcela = valor / numeroParcelas;

        // Exibir a informação de parcelamento
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
        System.out.println("Valor parcelado em " + numeroParcelas + " vezes de R$" + valorParcela);

        return valor;
    }
}