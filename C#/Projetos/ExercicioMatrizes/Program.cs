using System.Globalization;

namespace ExercicioMatrizes
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[,] mat = new int[n, n];

            for (int i = 0; i < n; i++)
            {

                string[] values = Console.ReadLine().Split(' ');

                for(int j = 0; j < n; j++)
                {
                    mat[i,j] = int.Parse(values[j]);
                }
            }

            Console.WriteLine("Diagonal menor: ");
            for(int i = 0; i < n; i++)
            {
                Console.Write(mat[i,i] +" ");
            }
            Console.WriteLine();
            int c = 0;
            for (int i = 0; i < n; i++)
            {
                for(int j = 0;i < j; j++)
                {
                    if (mat[i,j] < 0)
                    {
                        c++;
                    }
                }
            }
            Console.WriteLine("Números negaticos: ");
        }
    }
}
