using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_05
{
    internal class Pedido
    {
        public List<ItemPedido> ItemPedidos { get; set; }
        public string Cliente { get; set; }
        
        public Pedido(string cliente)
        {
            Cliente = cliente;
            ItemPedidos = new List<ItemPedido>();
        }

        public decimal CalcularTotal()
        {
            decimal total = 0;
            foreach (var item in ItemPedidos)
            {
                total += item.CalcularSubtotal();
            }
            return total;
        }

        public void AdicionarItem(ItemPedido item)
        {
            ItemPedidos.Add(item);
        }

        public void RemoverItem(ItemPedido item)
        {
            ItemPedidos.Remove(item);
        }

        public void LimparPedido()
        {
            ItemPedidos.Clear();
        }


        
    }
}
