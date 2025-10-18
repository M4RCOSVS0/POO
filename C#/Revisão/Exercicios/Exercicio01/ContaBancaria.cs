using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_01
{
    /// <summary>
    /// Representa uma conta bancária com operações validadas
    /// </summary>
    public class ContaBancaria
    {
        private decimal saldo;

        public string Titular { get; private set; }
        public string NumeroConta { get; private set; }
        public decimal Saldo => saldo;

        public ContaBancaria(string titular, string numeroConta)
        {
            if (string.IsNullOrWhiteSpace(titular))
                throw new ArgumentException("O titular não pode ser vazio.");

            if (string.IsNullOrWhiteSpace(numeroConta))
                throw new ArgumentException("O número da conta não pode ser vazio.");

            Titular = titular;
            NumeroConta = numeroConta;
            saldo = 0;
        }

        /// <summary>
        /// Deposita um valor na conta
        /// </summary>
        public void Depositar(decimal valor)
        {
            if (valor <= 0)
            {
                throw new ValorInvalidoException(
                    "O valor do depósito deve ser maior que zero.",
                    valor);
            }

            saldo += valor;
            Console.WriteLine($"\n✓ Depósito de {valor:C} realizado com sucesso!");
        }

        /// <summary>
        /// Saca um valor da conta
        /// </summary>
        public void Sacar(decimal valor)
        {
            if (valor <= 0)
            {
                throw new ValorInvalidoException(
                    "O valor do saque deve ser maior que zero.",
                    valor);
            }

            if (saldo < valor)
            {
                throw new SaldoInsuficenteException(
                    "Saldo insuficiente para realizar o saque.",
                    saldo,
                    valor);
            }

            saldo -= valor;
            Console.WriteLine($"\n✓ Saque de {valor:C} realizado com sucesso!");
        }

        /// <summary>
        /// Transfere um valor para outra conta
        /// </summary>
        public void Transferir(ContaBancaria destino, decimal valor)
        {
            if (destino == null)
                throw new ArgumentNullException(nameof(destino), "A conta de destino não pode ser nula.");

            if (destino == this)
                throw new InvalidOperationException("Não é possível transferir para a mesma conta.");

            // Validações são feitas dentro dos métodos Sacar e Depositar
            Console.WriteLine($"\n→ Iniciando transferência de {valor:C}...");

            Sacar(valor);
            destino.Depositar(valor);

            Console.WriteLine($"✓ Transferência concluída para {destino.Titular} (Conta: {destino.NumeroConta})");
        }

        /// <summary>
        /// Exibe o saldo atual da conta
        /// </summary>
        public void MostrarSaldo()
        {
            Console.WriteLine($"\n╔════════════════════════════════════╗");
            Console.WriteLine($"║         EXTRATO DA CONTA           ║");
            Console.WriteLine($"╠════════════════════════════════════╣");
            Console.WriteLine($"║ Titular: {Titular,-24}             ║");
            Console.WriteLine($"║ Conta:   {NumeroConta,-24}         ║");
            Console.WriteLine($"║ Saldo:   {saldo,-24:C}             ║");
            Console.WriteLine($"╚════════════════════════════════════╝");
        }
    }
}
