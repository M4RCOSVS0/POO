using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio04
{
    public class Quadrado : IFormaGeometrica, IDesenhavel
    {

        public double Lado { get; set; }

        public Quadrado(double lado)
        {
            if (lado <= 0)
                throw new ArgumentException("O lado deve ser maior que zero.");
            Lado = lado;
        }

        public double CalcularArea()
        {
            return Lado * Lado;
        }

        public double CalcularPerimetro()
        {
            return 4 * Lado;
        }

        public void Desenhar()
        {
            int tamanho = (int)Math.Round(Lado);
            for (int i = 0; i < tamanho; i++)
            {
                Console.WriteLine(new string('*', tamanho));
            }
        }
    }
}
