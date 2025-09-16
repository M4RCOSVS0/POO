using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_01
{
    public class ContaBancaria
    {
        public string Titular { get; set; }
        private decimal Saldo;
     
        public ContaBancaria(string titular)
        {
            Titular = titular;
            Saldo = 0;
        }

        public void MostrarSaldo()
        {
            Console.WriteLine($"Saldo atual: R$ {Saldo:F2}");
        }

        public void Sacar(decimal valor)
        {
            if (valor <= 0)
            {
                Console.WriteLine("Erro, Valor para saque deve seve ser maior que 0");
                return;
            }

            if (valor > Saldo)
            {
                Console.WriteLine("Erro, valor pedido é maior que o saldo");
                return;
            }

            Saldo -= valor;
            Console.WriteLine($"Saque de R$ {valor:F2} realizado com sucesso!");
        }

        public void Depositar(decimal valor)
        {
            if (valor <= 0)
            {
                Console.WriteLine("Erro, valor depositado precisa ser maior que 0");
                return;
            }

            Saldo += valor;
            Console.WriteLine($"Deposito de {valor:F2} realizado com sucesso.");
        }


    }
}
