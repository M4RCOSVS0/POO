namespace Exercicio_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ContaBancaria conta = new ContaBancaria("João");

            conta.Depositar(1000);
            conta.Sacar(200);
            conta.MostrarSaldo(); // Deve mostrar 800

            // Testando validações
            conta.Sacar(1000); // Tentativa de saque com saldo insuficiente
            conta.Depositar(-100); // Tentativa de depósito negativo
        }
    }
}
