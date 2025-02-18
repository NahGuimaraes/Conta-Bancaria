package conta.repository;

import conta.model.Conta;

public interface ContaRepository {

	void listarTodas();

	void procurarPorNumero(int numero);

	void cadastrar(Conta conta);

	void atualizar(Conta conta);

	void deletar(int numero);

	void sacar(int numero, float valor);

	void depositar(int numero, float valor);

	void transferir(int numeroOrigem, int numeroDestino, float valor);

}
