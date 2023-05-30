import java.util.ArrayList;

public abstract class Funcionario {
    protected ArrayList listaPedidos = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String obterPedido(Pedido pedido) {
        if (listaPedidos.contains(pedido.getTipoPedido())) {
            return getDescricaoCargo();
        } else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.obterPedido(pedido);
            } else {
                return "Sem pedido";
            }
        }
    }
}
