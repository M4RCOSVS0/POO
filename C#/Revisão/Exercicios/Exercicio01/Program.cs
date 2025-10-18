namespace Exercicio_01
{
    class Program
    {
        static ContaBancaria contaPrincipal;
        static ContaBancaria contaDestino;

        static void Main(string[] args)
        {
            Console.WriteLine("═══════════════════════════════════════");
            Console.WriteLine("   SISTEMA BANCÁRIO - DIA 8");
            Console.WriteLine("═══════════════════════════════════════\n");

            InicializarContas();
            ExibirMenu();
        }

        static void InicializarContas()
        {
            try
            {
                Console.Write("Digite o nome do titular: ");
                string titular = Console.ReadLine();

                Console.Write("Digite o número da conta: ");
                string numeroConta = Console.ReadLine();

                contaPrincipal = new ContaBancaria(titular, numeroConta);

                // Cria uma conta de destino para transferências
                contaDestino = new ContaBancaria("João Silva", "9999-9");
                contaDestino.Depositar(500); // Adiciona saldo inicial na conta destino

                Console.WriteLine("\n✓ Conta criada com sucesso!");
                Console.WriteLine($"✓ Conta de transferência criada: {contaDestino.Titular} ({contaDestino.NumeroConta})");
            }
            catch (Exception ex)
            {
                Console.WriteLine($"\n✗ Erro ao criar conta: {ex.Message}");
                Environment.Exit(1);
            }
        }

        static void ExibirMenu()
        {
            bool continuar = true;

            while (continuar)
            {
                try
                {
                    Console.WriteLine("\n═══════════════════════════════════════");
                    Console.WriteLine("              MENU PRINCIPAL");
                    Console.WriteLine("═══════════════════════════════════════");
                    Console.WriteLine("1. Depositar");
                    Console.WriteLine("2. Sacar");
                    Console.WriteLine("3. Transferir");
                    Console.WriteLine("4. Mostrar Saldo");
                    Console.WriteLine("5. Sair");
                    Console.WriteLine("═══════════════════════════════════════");
                    Console.Write("Escolha uma opção: ");

                    string opcao = Console.ReadLine();

                    switch (opcao)
                    {
                        case "1":
                            RealizarDeposito();
                            break;
                        case "2":
                            RealizarSaque();
                            break;
                        case "3":
                            RealizarTransferencia();
                            break;
                        case "4":
                            contaPrincipal.MostrarSaldo();
                            break;
                        case "5":
                            continuar = false;
                            Console.WriteLine("\n✓ Obrigado por usar nosso sistema!");
                            break;
                        default:
                            Console.WriteLine("\n✗ Opção inválida! Tente novamente.");
                            break;
                    }
                }
                catch (ValorInvalidoException ex)
                {
                    Console.WriteLine($"\n✗ ERRO DE VALIDAÇÃO:");
                    Console.WriteLine(ex.Message);
                }
                catch (SaldoInsuficenteException ex)
                {
                    Console.WriteLine($"\n✗ SALDO INSUFICIENTE:");
                    Console.WriteLine(ex.Message);
                }
                catch (Exception ex)
                {
                    Console.WriteLine($"\n✗ ERRO INESPERADO:");
                    Console.WriteLine(ex.Message);
                }
            }
        }

        static void RealizarDeposito()
        {
            Console.Write("\nDigite o valor do depósito: R$ ");

            if (decimal.TryParse(Console.ReadLine(), out decimal valor))
            {
                contaPrincipal.Depositar(valor);
            }
            else
            {
                Console.WriteLine("\n✗ Valor inválido! Digite apenas números.");
            }
        }

        static void RealizarSaque()
        {
            Console.Write("\nDigite o valor do saque: R$ ");

            if (decimal.TryParse(Console.ReadLine(), out decimal valor))
            {
                contaPrincipal.Sacar(valor);
            }
            else
            {
                Console.WriteLine("\n✗ Valor inválido! Digite apenas números.");
            }
        }

        static void RealizarTransferencia()
        {
            Console.WriteLine($"\nConta de destino: {contaDestino.Titular} ({contaDestino.NumeroConta})");
            Console.Write("Digite o valor da transferência: R$ ");

            if (decimal.TryParse(Console.ReadLine(), out decimal valor))
            {
                contaPrincipal.Transferir(contaDestino, valor);
            }
            else
            {
                Console.WriteLine("\n✗ Valor inválido! Digite apenas números.");
            }
        }
    }
}
