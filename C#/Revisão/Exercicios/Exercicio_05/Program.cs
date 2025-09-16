namespace Exercicio_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Produto> produtos = new List<Produto>()
            {
                new Produto("Relógio",500),
                new Produto("Anel",1000),
                new Produto("Corrente", 500)
            };

            List<ItemPedido> itemPedidos = new List<ItemPedido>()
            {
                new ItemPedido(produtos[0],3),
                new ItemPedido(produtos[2],1),
                new ItemPedido(produtos[1],2)
            };

            Pedido pedido = new Pedido("Jorge");
            pedido.AdicionarItem(itemPedidos[0]);
            pedido.AdicionarItem(itemPedidos[2]);

            Console.WriteLine($"O pedido de {pedido.Cliente} custou {pedido.CalcularTotal()}\nforam comprados:");
            foreach (var item in pedido.ItemPedidos)
            {
                Console.WriteLine($"Produto: {item.Produto.Nome}");
            }
        }
    }
}
