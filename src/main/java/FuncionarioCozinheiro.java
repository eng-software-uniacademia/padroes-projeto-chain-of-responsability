public class FuncionarioCozinheiro extends Funcionario {

    public FuncionarioCozinheiro(Funcionario superior) {
        listaPedidos.add(TipoPedidoBatata.getTipoPedidoBatata());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Cozinheiro";
    }
}
