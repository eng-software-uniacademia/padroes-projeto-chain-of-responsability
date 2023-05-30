public class FuncionarioChapeiro extends Funcionario {

    public FuncionarioChapeiro(Funcionario superior) {
        listaPedidos.add(TipoPedidoHamburger.getTipoPedidoHamburger());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Chapeiro";
    }
}
