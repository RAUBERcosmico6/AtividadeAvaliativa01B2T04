package exercicio;

import java.util.Scanner;

public class terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        exercicio1(scanner);
        if (!continuar(scanner)) return;
        exercicio2(scanner);
        
        if (!continuar(scanner)) return;
        exercicio3(scanner);
        
        if (!continuar(scanner)) return;
        
        exercicio4(scanner);
        if (!continuar(scanner)) return;

       
        exercicio5(scanner);
        if (!continuar(scanner)) return;

        exercicio6(scanner);
        if (!continuar(scanner)) return;

        exercicio7(scanner);
        if (!continuar(scanner)) return;

        exercicio8(scanner);
        if (!continuar(scanner)) return;

        exercicio9(scanner);
        if (!continuar(scanner)) return;

        exercicio10(scanner);
        if (!continuar(scanner)) return;

        exercicio7(scanner);

        System.out.println("Todos os exercícios concluídos!");
        scanner.close();
    }

    public static boolean continuar(Scanner scanner) {
        scanner.nextLine(); 
        System.out.print("Deseja continuar para o próximo exercício? (sim/não): ");
        return scanner.nextLine().trim().equalsIgnoreCase("sim");
    }

    public static void  exercicio1(Scanner scanner) {
        System.out.println(" Exercício 1: Conta Bancária ");

        System.out.print("Digite o nome do titular: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o saldo inicial: R$ ");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine(); //

        ContaBancaria conta = new ContaBancaria(nome, saldoInicial);

        int opcao;
        do {
            System.out.println("\nMenu Conta Bancária");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Ver Informações da Conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;

                case 4:
                    System.out.println("Titular: " + conta.getTitular());
                    System.out.println("Saldo: R$ " + conta.getSaldo());
                    break;

                case 0:
                    System.out.println("Saindo da conta...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
    
    public static void exercicio2(Scanner scanner) {
        System.out.println("Exercício 2: Filmes");

        System.out.println("Primeiro filme:");
        System.out.print("Digite o título: ");
        String titulo1 = scanner.nextLine();

        System.out.print("Digite a avaliação (0–5): ");
        double avaliacao1 = scanner.nextDouble();
        scanner.nextLine();

        Filmes filme1 = new Filmes(titulo1, avaliacao1);

        System.out.println("\nSegundo filme:");
        System.out.print("Digite o título: ");
        String titulo2 = scanner.nextLine();

        System.out.print("Digite a avaliação (0–5): ");
        double avaliacao2 = scanner.nextDouble();
        scanner.nextLine();

        Filmes filme2 = new Filmes(titulo2, avaliacao2);

        System.out.println("\n FILMES CADASTRADOS ");
        filme1.exibir();
        filme2.exibir();
    }
    
    public static void exercicio3(Scanner scanner) {
        System.out.println("Exercício 3: Funcionário");

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, salario);

        System.out.println("\nAntes do aumento:");
        funcionario.exibirDados();

        System.out.print("\nDigite o percentual de aumento (%): ");
        double percentual = scanner.nextDouble();
        scanner.nextLine();

        funcionario.aumentarSalario(percentual);

        System.out.println("\nDepois do aumento:");
        funcionario.exibirDados();
    }

    
    
    
    
    public static void exercicio4(Scanner scanner) {
        System.out.println(" Exercício 4: Retângulo ");

        double largura;
        do {
            System.out.print("Digite a largura do retângulo: ");
            largura = scanner.nextDouble();
            scanner.nextLine(); 
            if (largura <= 0) {
                System.out.println("Erro: A largura deve ser maior que 0! Digite novamente.");
            }
        } while (largura <= 0);

        double altura;
        do {
            System.out.print("Digite a altura do retângulo: ");
            altura = scanner.nextDouble();
            scanner.nextLine(); 
            if (altura <= 0) {
                System.out.println("Erro: A altura deve ser maior que 0! Digite novamente.");
            }
        } while (altura <= 0);

        retangulo retan = new retangulo(largura, altura);

        System.out.println("Largura: " + retan.getLargura());
        System.out.println("Altura: " + retan.getAltura());
        System.out.println("Área: " + retan.area());
        System.out.println("Perímetro: " + retan.perimetro());
    }
    // Exercício 5: Música
    public static void exercicio5(Scanner scanner) {
        System.out.println("Exercício 5: Música ");

        System.out.print("Digite o título da primeira música: ");
        String titulo1 = scanner.nextLine();
        System.out.print("Digite a duração em segundos da primeira música: ");
        int duracao1 = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o título da segunda música: ");
        String titulo2 = scanner.nextLine();
        System.out.print("Digite a duração em segundos da segunda música: ");
        int duracao2 = scanner.nextInt();
        scanner.nextLine(); 

        Musica musica1 = new Musica(titulo1, duracao1);
        Musica musica2 = new Musica(titulo2, duracao2);

        System.out.println(musica1.getTitulo() + " - " + musica1.formatarDuracao());
        System.out.println(musica2.getTitulo() + " - " + musica2.formatarDuracao());
    }

  
    public static void exercicio6(Scanner scanner) {
        System.out.println("Exercício 6: Pessoa (IMC) ");

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o peso da pessoa (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura da pessoa (m): ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, peso, altura);

        double imc = pessoa.calcularIMC();
        System.out.printf("%s possui IMC = %.2f%n", pessoa.getNome(), imc);
        System.out.println("Classificação: " + pessoa.classificacaoIMC());
    }

    public static void exercicio7(Scanner scanner) {
        System.out.println(" Exercício 7: Conta de Luz ");
        ContaLuzEx.executar(scanner);
}
    
    public static void exercicio8(Scanner scanner) {
        System.out.println("Exercício 8: Bicicleta Alugada ");
        BicicletaAlugadaEx.executar(scanner);}
    
    
    public static void exercicio9(Scanner scanner) {
        System.out.println(" Exercício 9: Produto em Estoque");
        ProdutoEstoqueEx.executar(scanner);
    }
    
    public static void exercicio10(Scanner scanner) {
        System.out.println(" Exercício 10: Temperatura");
        TemperaturaEx.executar(scanner);
    }
}