namespace Exercicio_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Funcionario> funcionarios = new List<Funcionario>()
            {
                new Funcionario("Caio",2000m, Cargo.Desenvolvedor),
                new Funcionario("Marcos",2500m, Cargo.Analista),
                new Funcionario("Leonado",3200m, Cargo.Gerente)
            };

            foreach (var item in funcionarios)
            {
                item.ExibirInfo();
            }
        }
    }
}
