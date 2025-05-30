import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void devePagarComBoleto() {
        Cliente cliente = new Cliente();
        cliente.pagarComBoleto(100.0);
        assertEquals(100.0, cliente.getValorPago());
    }

    @Test
    void devePagarComCartaoCredito() {
        Cliente cliente = new Cliente();
        cliente.pagarComCartaoCredito(150.0,1);
        assertEquals(150.0, cliente.getValorPago());
    }

    @Test
    void devePagarComCartaoDebito() {
        Cliente cliente = new Cliente();
        cliente.pagarComCartaoDebito(200.0);
        assertEquals(200.0, cliente.getValorPago());
    }

    @Test
    void devePagarComPix() {
        Cliente cliente = new Cliente();
        cliente.pagarComPix(50.0);
        assertEquals(50.0, cliente.getValorPago());
    }

    @Test
    void devePagarComDinheiro() {
        Cliente cliente = new Cliente();
        cliente.pagarComDinheiro(300.0);
        assertEquals(300.0, cliente.getValorPago());
    }

    @Test
    void devePagarComCartaoCreditoParcelado() {
        Cliente cliente = new Cliente();
        cliente.pagarComCartaoCredito(1500.0, 5);
        assertEquals(1500.0, cliente.getValorPago());
    }

    @Test
    void devePagarComCartaoCreditoParceladoComMaximoParcelas() {
        Cliente cliente = new Cliente();
        cliente.pagarComCartaoCredito(1500.0, 10);
        assertEquals(1500.0, cliente.getValorPago());
    }

    @Test
    void naoDevePagarComCartaoCreditoParceladoComParcelasExcedentes() {
        Cliente cliente = new Cliente();
        try {
            cliente.pagarComCartaoCredito(1500.0, 11);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de parcelas deve ser entre 1 e 10", e.getMessage());
        }
    }
}

