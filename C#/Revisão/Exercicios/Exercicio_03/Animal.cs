using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_03
{
    public abstract class Animal
    {
        protected string Nome { get; set; }

        protected int Idade { get; set; }

        protected double Peso { get; set; }

        protected Animal(string nome, int idade, double peso)
        {
            Nome = nome;
            Idade = idade;
            Peso = peso;
        }

        public void Dormir()
        {
            Console.WriteLine("Zzz... dormindo");
        }

        public abstract string FazerSom();

        public abstract string Mover();

        public abstract double CalcularVelocidade();

        public void ApresentarSe()
        {
            Console.WriteLine($"Nome: {Nome}, Idade: {Idade}, Peso: {Peso}, Velocidade máxima: {CalcularVelocidade()}");
        }
    }
}
