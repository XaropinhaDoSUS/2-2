import java.util.Scanner;

 class VerificaNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("insira um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("Não é primo");
        } else if (ehPrimo(numero)) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

        scanner.close();
    }

    public static boolean ehPrimo(int num) {
        if (num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0 || num < 2) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}