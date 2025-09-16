namespace Exercicio04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                // Criando as formas
                var triangulo = new Triangulo(3, 4, 3, 4, 5);
                var quadrado = new Quadrado(4);
                var circulo = new Circulo(3);

                // Array de formas para demonstrar polimorfismo
                IFormaGeometrica[] formas = { circulo, quadrado, triangulo };
                string[] nomes = { "Círculo", "Quadrado", "Triângulo" };

                for (int i = 0; i < formas.Length; i++)
                {
                    Console.WriteLine($"\n=== {nomes[i]} ===");
                    Console.WriteLine($"Área: {formas[i].CalcularArea():F2}");
                    Console.WriteLine($"Perímetro: {formas[i].CalcularPerimetro():F2}");

                    if (formas[i] is IDesenhavel desenhavel)
                    {
                        Console.WriteLine("Desenho:");
                        desenhavel.Desenhar();
                    }
                }
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine($"Erro: {ex.Message}");
            }
        }
    }
}
