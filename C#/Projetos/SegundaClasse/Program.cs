using System.Globalization;

namespace SegundaClasse
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Produto p = new Produto();

            Console.WriteLine("Entre os dados do produto:");
            Console.Write("Nome: ");
            p.Nome = Console.ReadLine();
            Console.Write("Preco: ");
            p.Preco = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            Console.Write("Quantidade em estoque: ");
            p.Quantidade = int.Parse(Console.ReadLine());

            Console.WriteLine($"\nDados do produto{p}\n");

            Console.Write("Digite o número de produtos a ser adcionado no estoque: ");
            int qte = int.Parse(Console.ReadLine());

            p.AdcionarProdutos(qte);

            Console.WriteLine($"Dados atualizados: {p}");

            Console.Write("Digite o número de produtos a ser removido do estoque: ");
            qte = int.Parse(Console.ReadLine());

            p.RemoverProdutos(qte);

            Console.WriteLine($"Dados atualizados: {p}");



        }
    }
}
