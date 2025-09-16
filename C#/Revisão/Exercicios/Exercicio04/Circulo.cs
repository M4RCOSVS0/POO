using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio04
{
    public class Circulo : IFormaGeometrica, IDesenhavel
    {
        public double Raio { get; private set; }

        public Circulo(double raio)
        {
            if (raio <= 0)
                throw new ArgumentException("O raio deve ser maior que zero.");
            Raio = raio;
        }

        public double CalcularArea()
        {
            return Math.Pow(Raio,2) * Math.PI;
        }

        public double CalcularPerimetro()
        {
            return 2 * Math.PI * Raio;
        }

        public void Desenhar()
        {
            int tamanho = (int)Math.Round(Raio);
            for (int y = -tamanho; y <= tamanho; y++)
            {
                for (int x = -tamanho; x <= tamanho; x++)
                {
                    if (x * x + y * y <= tamanho * tamanho)
                        Console.Write("* ");
                    else
                        Console.Write("  ");
                }
                Console.WriteLine();
            }
        }
    }
}
