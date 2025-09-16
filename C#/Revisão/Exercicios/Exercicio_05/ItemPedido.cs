using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_05
{
    internal class ItemPedido
    {
        public Produto Produto { get; private set; }
        public int Quantidade { get; private set; }

        public ItemPedido(Produto produto, int quantidade)
        {
            Produto = produto;
            Quantidade = quantidade;
        }

        public decimal CalcularSubtotal()
        {
            return Produto.Preco * Quantidade;
        }
    }
}
