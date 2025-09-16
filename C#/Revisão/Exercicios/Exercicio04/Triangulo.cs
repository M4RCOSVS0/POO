using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio04
{
    internal class Triangulo : IFormaGeometrica, IDesenhavel
    {
        public double Base { get; private set; }
        public double Altura { get; private set; }
        public double LadoA { get; private set; }
        public double LadoB { get; private set; }
        public double LadoC { get; private set; }

        public Triangulo(double baseTriangulo, double altura, double ladoA, double ladoB, double ladoC)
        {
            if (baseTriangulo <= 0 || altura <= 0)
                throw new ArgumentException("Base e altura devem ser maiores que zero.");

            if (!EhTrianguloValido(ladoA, ladoB, ladoC))
                throw new ArgumentException("Os lados não formam um triângulo válido.");

            Base = baseTriangulo;
            Altura = altura;
            LadoA = ladoA;
            LadoB = ladoB;
            LadoC = ladoC;
        }

        private bool EhTrianguloValido(double a, double b, double c)
        {
            return a + b > c && a + c > b && b + c > a;
        }

        public void Desenhar()
        {
            int alturaInt = (int)Math.Round(Altura);
            for (int i = 1; i <= alturaInt; i++)
            {
                Console.Write(new string(' ', alturaInt - i));
                Console.WriteLine(new string('*', 2 * i - 1));
            }
        }

        public double CalcularArea()
        {
            return Base * Altura / 2;
        }

        public double CalcularPerimetro()
        {
            return LadoA + LadoB + LadoC;
        }
    }
}
