namespace Exercicio_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Animal> animals = new List<Animal>() { 
                new Cachorro("Pintado",4,56),
                new Gato("Xarel",5,5),
                new Passaro("Pituco",3,2)
            };

            foreach (var animal in animals)
            {
                Console.WriteLine("------------------------");
                animal.ApresentarSe();
                Console.WriteLine(animal.FazerSom());
                Console.WriteLine(animal.Mover()); 
            }
            Console.WriteLine("------------------------");
        }
    }
}
