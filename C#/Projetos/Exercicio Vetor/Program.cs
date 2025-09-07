namespace Exercicio_Vetor
{
    internal class Program
    {
        static void Main(string[] args)
        {
            

            Console.Write("Quantos quartos serão alugados? ");
            int qtd = int.Parse(Console.ReadLine());

            ClientePousada[] c = new ClientePousada[10];

            for (int i = 0; i < qtd; i++)
            {
                Console.WriteLine($"Aluguel #{i+1}");
                Console.Write("Nome: ");
                string nome = Console.ReadLine();
                Console.Write("Email: ");
                string email = Console.ReadLine();
                Console.Write("Quarto: ");
                int quarto = int.Parse(Console.ReadLine());
                c[quarto] = new ClientePousada(nome, email);  
            }

            Console.WriteLine("Quartos Ocupados");
            for (int i = 0; i < 10; i++)
            {
                if (c[i] != null)
                {
                    Console.WriteLine($"{i}: {c[i].Nome}, {c[i].Email}");
                }
            }

            foreach (var item in c)
            {
                if (item != null) // Verifica se o objeto não é null
                {
                    Console.WriteLine(item.Nome);
                }
            }
        }
    }
}
