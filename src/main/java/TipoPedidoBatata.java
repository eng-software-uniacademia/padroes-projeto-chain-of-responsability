public class TipoPedidoBatata implements TipoPedido {
    private static final TipoPedidoBatata tipoPedidoBatata = new TipoPedidoBatata();

    public TipoPedidoBatata() {
    }

    public static TipoPedidoBatata getTipoPedidoBatata() {
        return tipoPedidoBatata;
    }
}
