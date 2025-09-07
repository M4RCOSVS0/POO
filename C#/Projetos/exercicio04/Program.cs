namespace exercicio04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Pessoa p = new Pessoa();
            Console.Write("Nome: ");
            p.Nome = Console.ReadLine();
            Console.Write("Salário bruto: ");
            p.SalarioBruto = double.Parse(Console.ReadLine());
            Console.Write("Imposto: ");
            p.Imposto = double.Parse(Console.ReadLine());

            Console.WriteLine($"Funcionário: {p}");

            Console.Write("Qual a porcentagem do aumento do salário: ");
            double pct = double.Parse(Console.ReadLine());
            p.AumentarSalario(pct);
            Console.WriteLine($"Dados Atualizados: {p}");
        }
    }
}
