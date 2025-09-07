namespace Exercicio_Matrizes
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int l = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());


            int[,] mat = new int[l, c];

            for (int i = 0; i < l; i++)
            {

                string[] values = Console.ReadLine().Split(' ');

                for (int j = 0; j < c; j++)
                {
                    mat[i, j] = int.Parse(values[j]);
                }
            }

            int n = int.Parse(Console.ReadLine());


            for (int i = 0; i < l; i++)
            {
                for (int j = 0; j < c; j++)
                {
                    if (mat[i,j] == n)
                    {
                        Console.WriteLine($"Position {i},{j}");
                        if (j != 0)
                        {
                            Console.WriteLine($"Esquerda: {mat[i, j-1]}");
                        }
                        if (j != c-1)
                        {
                            Console.WriteLine($"Direita: {mat[i,j+1]}");
                        }
                        if (i != 0)
                        {
                            Console.WriteLine($"Cima: {mat[i-1, j]}");
                        }
                        if(i != l - 1)
                        {
                            Console.WriteLine($"Baixo: {mat[i + 1, j]}");
                        }
                    }
                    
                }
                
            }
        }
    }
}
