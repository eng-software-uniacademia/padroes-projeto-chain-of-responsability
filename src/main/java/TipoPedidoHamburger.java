public class TipoPedidoHamburger implements TipoPedido {
    private static final TipoPedidoHamburger tipoPedidoHamburger = new TipoPedidoHamburger();

    public TipoPedidoHamburger() {
    }

    public static TipoPedidoHamburger getTipoPedidoHamburger() {
        return tipoPedidoHamburger;
    }
}
