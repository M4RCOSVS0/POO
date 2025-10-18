using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_01
{
    internal class SaldoInsuficenteException : Exception
    {
        public decimal SaldoAtual { get; }
        public decimal ValorSaque { get; }

        public SaldoInsuficenteException(string mensagem, decimal saldoAtual, decimal valorSaque)
            : base(mensagem)
        {
            SaldoAtual = saldoAtual;
            ValorSaque = valorSaque;
        }

        public override string Message
        {
            get
            {
                return $"{base.Message}\n" +
                       $"Saldo atual: {SaldoAtual:C}\n" +
                       $"Valor solicitado: {ValorSaque:C}\n" +
                       $"Diferença: {(ValorSaque - SaldoAtual):C}";
            }
        }
    }
}
