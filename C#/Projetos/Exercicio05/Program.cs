namespace Exercicio05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Aluno aluno = new Aluno();
            Console.Write("Digite o nome do aluno: ");
            aluno.Nome = Console.ReadLine();
            Console.WriteLine("Digite as 3 notas");
            for (int i = 0; i < aluno.Notas.Length; i++)
            {
               aluno.Notas[i] = double.Parse(Console.ReadLine());
            }
            aluno.Situacao();
        }
    }
}
