import java.util.Scanner;

/**
 * provaq01
 * Aluno: MARCOS VINÍCIUS SANTANA OLIVEIRA
 */

public class ex1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a data mais antiga (dd mm yyyy):");
    int diaAntigo = scan.nextInt();
    int mesAntigo = scan.nextInt();
    int anoAntigo = scan.nextInt();
    System.out.println("Digite a data mais recente (dd mm yyyy):");
    int diaNovo = scan.nextInt();
    int mesNovo = scan.nextInt();
    int anoNovo = scan.nextInt();

    int diasAntigo = calcularDias(diaAntigo, mesAntigo, anoAntigo);
    int diasNovo = calcularDias(diaNovo, mesNovo, anoNovo);

    int diasDecorridos = diasNovo - diasAntigo;

    System.out.println("O número de dias decorridos entre as duas datas é " + diasDecorridos);
  }

  public static int calcularDias(int dia, int mes, int ano) {
    int dias = 0;

    for (int i = 1; i < ano; i++) {
      if (isAnoBissexto(i)) {
        dias += 366;
      } else {
        dias += 365;
      }
    }

    for (int i = 1; i < mes; i++) {
      dias += diasPorMes(i, ano);
    }

    dias += dia;

    return dias;
  }

  public static int diasPorMes(int mes, int ano) {
    switch (mes) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        return 31;
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      case 2:
        if (isAnoBissexto(ano)) {
          return 29;
        } else {
          return 28;
        }
      default:
        return 0;
    }
  }

  public static boolean isAnoBissexto(int ano) {
    return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
  }
}
