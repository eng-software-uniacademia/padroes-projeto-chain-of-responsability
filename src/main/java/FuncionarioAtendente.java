public class FuncionarioAtendente extends Funcionario {

    public FuncionarioAtendente(Funcionario superior) {
        listaPedidos.add(TipoPedidoRefrigerante.getTipoPedidoRefrigerante());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Atendente";
    }
}
