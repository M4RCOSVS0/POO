

namespace Exercicio_Listas
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Funcionario> funcionarios = new List<Funcionario>();

            Console.Write("Quantos Funcionários deseja registrar?");
            int qtd = int.Parse(Console.ReadLine());
            string? id;
            string nome;
            double salario;
            for (int i = 0; i < qtd; i++)
            {
                Console.WriteLine($"Empregado #{i+1}");
                Console.Write("Id: ");
                id = Console.ReadLine();
                Console.Write("Nome: ");
                nome = Console.ReadLine();
                Console.Write("Salario: ");
                salario = double.Parse(Console.ReadLine());
                funcionarios.Add(new Funcionario(id, nome, salario));
                Console.WriteLine("\n");
            }
            Console.Write("Digite o id do funcionario que o salario sera aumentado: ");
            string idfun = Console.ReadLine();
            Funcionario funcionarioEncontrado = funcionarios.Find(x => x.Id == idfun);
            if (funcionarioEncontrado != null)
            {
                Console.Write("Entre com a porcentagem");
                double p = double.Parse(Console.ReadLine());
                funcionarioEncontrado.AumentoSalario(p);

            }
            else
            {
                Console.WriteLine("Funcionario não existe");
            }

            foreach (var item in funcionarios)
            {
                Console.WriteLine(item);
            }
        }
    }
}
