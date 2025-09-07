namespace Exercicio02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Funcionario f1, f2;
            f1 = new Funcionario();
            f2 = new Funcionario();

            Console.WriteLine("Dados do primeiro funcionário:");
            Console.Write("Nome: ");
            f1.Nome = Console.ReadLine();
            Console.Write("salário: ");
            f1.Salario = double.Parse(Console.ReadLine());

            Console.WriteLine("Dados do segunda funcionário:");
            Console.Write("Nome: ");
            f2.Nome = Console.ReadLine();
            Console.Write("salário: ");
            f2.Salario = double.Parse(Console.ReadLine());

            Console.WriteLine($"Salário médio = {(f1.Salario+f2.Salario)/2}");
        }
    }
}
