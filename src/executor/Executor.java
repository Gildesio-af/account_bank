package executor;

import java.util.Scanner;

import entities.ContaTerminal;

public class Executor {

    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ola, vamos criar uma contar. Comece digitando seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite o numero da sua agencia (Ex: 067-8): ");
        String agency = scanner.nextLine();
        System.out.print("Digite um numero de quatro digitos para sua conta:  ");
        Integer numberAgency = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite um saldo que deseja depositar: ");
        Double balance = Double.parseDouble(scanner.nextLine());

        scanner.close();

        String message = new ContaTerminal(numberAgency, agency, name, balance).toString();
        System.out.println(message);
    }
}
