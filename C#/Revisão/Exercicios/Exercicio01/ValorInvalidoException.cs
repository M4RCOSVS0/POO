using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_01
{
    internal class ValorInvalidoException : Exception
    {
        public decimal Valor { get; }

        public ValorInvalidoException(string mensagem, decimal valor)
            : base(mensagem)
        {
            Valor = valor;
        }

        public override string Message
        {
            get
            {
                return $"{base.Message}\n" +
                       $"Valor fornecido: {Valor:C}";
            }
        }
    }
}
