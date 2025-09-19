namespace Exercicio_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Menu do Sistema");
            Console.WriteLine("1 - Adicionar Produto");
            Console.WriteLine("2 - Adicionar Itens ao Pedido");
            Console.WriteLine("3 - Adicionar Pedido");

            List<Produto> p = new List<Produto>();
            List<ItemPedido> i = new List<ItemPedido>();
            int op = int.Parse(Console.ReadLine());
            switch (op)
            {
                case 1:
                    Console.WriteLine("Informe o nome e preço");
                    string nome = Console.ReadLine();
                    Console.WriteLine("Informe o preço");
                    decimal price = decimal.Parse(Console.ReadLine());
                    Produto prod = new Produto(nome, price);
                    p.Add(prod);
                    break;
                case 2:
                    
                    if (p.Count == 0)
                    {
                        Console.WriteLine("Não existe produtos ainda!");
                        return;
                    }
                    else
                    {
                        Console.WriteLine("Informe qual produto deseja adicionar ao carrinho");
                        Console.WriteLine("Produtos disponiveis:");
                        int cont = 0;
                        foreach (var pro in p)
                        {
                            cont++;
                            Console.WriteLine($"{cont} - ${pro.Nome}");
                        }
                        Console.Write("Escolha o número do produto: ");
                        int op2 = int.Parse(Console.ReadLine());

                        Console.WriteLine("Escolha a quantidade: ");
                        int quant = int.Parse(Console.ReadLine());

                        Produto produtoSelecionado = p[op2 - 1];
                        ItemPedido itemPedido = new ItemPedido(produtoSelecionado, quant);
                        i.Add(itemPedido);
                        Console.WriteLine($"Produto {produtoSelecionado.Nome} adicionado ao pedido!");
                    }
                    break;
                
            }

            /*
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
            */
        }
    }
}
