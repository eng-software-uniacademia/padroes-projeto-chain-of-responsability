public class TipoPedidoRefrigerante implements TipoPedido {
    private static final TipoPedidoRefrigerante tipoPedidoRefrigerante = new TipoPedidoRefrigerante();

    public TipoPedidoRefrigerante() {
    }

    public static TipoPedidoRefrigerante getTipoPedidoRefrigerante() {
        return tipoPedidoRefrigerante;
    }
}
