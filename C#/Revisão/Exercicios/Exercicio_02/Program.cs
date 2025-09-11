namespace Exercicio_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Veiculo> list = new List<Veiculo>()
            {
                new Moto("Yamaha","factor",2010,120),
                new Carro("GM","Impala",1975,2),
                new Moto("Honda","Bros",2024,160)
            };
            list.Insert(0, new Carro("Fiat", "Uno", 1998, 4));
            foreach (var item in list)
            {
                item.Acelerar();
            }
        }
    }
}
