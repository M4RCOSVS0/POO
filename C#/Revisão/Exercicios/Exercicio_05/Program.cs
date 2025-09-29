namespace Exercicio_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            bool continuar = true;
            List<Produto> p = new List<Produto>();
            List<ItemPedido> i = new List<ItemPedido>();

            Pedido pedido01;
            Console.WriteLine("Informe seu Nome: ");
            string seunome = Console.ReadLine();
            pedido01 = new Pedido(seunome);
            while (continuar)
            {
                Console.WriteLine("-----------------------------------");
                Console.WriteLine("Menu do Sistema");
                Console.WriteLine("1 - Adicionar Produto");
                Console.WriteLine("2 - Adicionar Itens ao Pedido");
                Console.WriteLine("3 - Adicionar Pedido");
                Console.WriteLine("4 - Sair");
                Console.WriteLine("-----------------------------------");


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
                        }
                        else
                        {
                            Console.WriteLine("Informe qual produto deseja adicionar ao carrinho");
                            Console.WriteLine("Produtos disponiveis:");
                            int cont = 0;
                            foreach (var pro in p)
                            {
                                cont++;
                                Console.WriteLine($"{cont} - Nome: {pro.Nome} Preço: {pro.Preco}");
                            }
                            Console.Write("Escolha o número do produto: ");
                            int op2 = int.Parse(Console.ReadLine());

                            if (op2 >= 1 && op2 <= p.Count)
                            {
                                Console.WriteLine("Escolha a quantidade: ");
                                int quant = int.Parse(Console.ReadLine());

                                Produto produtoSelecionado = p[op2 - 1];
                                ItemPedido itemPedido = new ItemPedido(produtoSelecionado, quant);
                                i.Add(itemPedido);
                                Console.WriteLine($"Produto {produtoSelecionado.Nome} adicionado ao pedido!");
                            }
                            else
                            {
                                Console.WriteLine("Número inválido!");
                            }
                        }
                        break;
                    case 3:

                        if (i.Count == 0)
                        {
                            Console.WriteLine("Não existe itens no seu carrinho!");
                        }
                        else
                        {
                            Console.WriteLine("Quais produtos do carrinho deseja comprar agora?");
                            Console.WriteLine("Itens disponiveis no carrinho:");
                            int cont = 0;
                            foreach (var item in i)
                            {
                                cont++;
                                Console.WriteLine($"{cont} - Nome:{item.Produto.Nome} - Quantidade:{item.Quantidade}");
                            }
                            Console.Write("Escolha o número do produto: ");
                            int op3 = int.Parse(Console.ReadLine());

                            if (op3 >= 1 && op3 <= i.Count)
                            {
                                ItemPedido itemPedidoSelecionado = i[op3 - 1];

                                pedido01.AdicionarItem(itemPedidoSelecionado);
                            }
                        }
                        bool continuar2 = true;
                        while (continuar2)
                        {
                            Console.WriteLine("O que deseja fazer agora?");
                            Console.WriteLine("1 - Calcular total");
                            Console.WriteLine("2 - Voltar ao menu anterior");
                            int op4 = int.Parse(Console.ReadLine());
                            if (op4 == 1)
                            {
                                Console.WriteLine($"{pedido01.Cliente} o valor total é de {pedido01.CalcularTotal()}");
                            }
                            if (op4 == 2)
                            {
                                Console.WriteLine("voltando!");
                                continuar2 = false;
                            }
                        }

                        break;
                    case 4:
                        Console.WriteLine("Encerrando o sistema!");
                        continuar = false;
                        break;

                }
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
