using Exercicio03;

namespace exercicio03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Retangulo r1 = new Retangulo();

            Console.WriteLine("Entre com a altura e largura do retângulo:");
            r1.Largura =  double.Parse(Console.ReadLine()); 
            r1.Altura = double.Parse(Console.ReadLine());

            Console.WriteLine(r1);
        }
    }
}
