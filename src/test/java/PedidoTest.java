import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {
    FuncionarioAtendente atendente;
    FuncionarioChapeiro chapeiro;
    FuncionarioCozinheiro cozinheiro;

    @BeforeEach
    void setUp() {
        cozinheiro = new FuncionarioCozinheiro(null);
        chapeiro = new FuncionarioChapeiro(cozinheiro);
        atendente = new FuncionarioAtendente(chapeiro);
    }

    @Test
    void deveRetornarAtendenteParaPedidoRefrigerante() {
        assertEquals("Atendente", atendente.obterPedido(new Pedido(TipoPedidoRefrigerante.getTipoPedidoRefrigerante())));
    }

    @Test
    void deveRetornarChapeiroParaPedidoHamburger() {
        assertEquals("Chapeiro", atendente.obterPedido(new Pedido(TipoPedidoHamburger.getTipoPedidoHamburger())));
    }

    @Test
    void deveRetornarCozinheiroParaPedidoBatata() {
        assertEquals("Cozinheiro", atendente.obterPedido(new Pedido(TipoPedidoBatata.getTipoPedidoBatata())));
    }
}
