package exercicio;

public class Atividades {
  
}


class retangulo {
    private double largura;
    private double altura;

   
    public retangulo(double largura, double altura) {
        setLargura(largura); 
        setAltura(altura);  
    }

  
    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    // SETTERS com validação
    public void setLargura(double largura) {
        if (largura <= 0)
            throw new IllegalArgumentException("Largura deve ser maior que 0!");
        this.largura = largura;
    }

    public void setAltura(double altura) {
        if (altura <= 0)
            throw new IllegalArgumentException("Altura deve ser maior que 0!");
        this.altura = altura;
    }

    
    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }
}

class Musica {
    private String titulo;
    private int duracaoSegundos;

    public Musica(String titulo, int duracaoSegundos) {
        if (titulo == null || titulo.isEmpty())
            throw new IllegalArgumentException("Título não pode ser vazio!");
        if (duracaoSegundos <= 0)
            throw new IllegalArgumentException("Duração deve ser maior que 0!");
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getTitulo() { return titulo; }
    public int getDuracaoSegundos() { return duracaoSegundos; }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) this.titulo = titulo;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        if (duracaoSegundos > 0) this.duracaoSegundos = duracaoSegundos;
    }

    public String formatarDuracao() {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }
}

class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        if (nome == null || nome.isEmpty())
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        if (peso <= 0)
            throw new IllegalArgumentException("Peso deve ser maior que 0!");
        if (altura <= 0)
            throw new IllegalArgumentException("Altura deve ser maior que 0!");

        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() { return nome; }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificacaoIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 24.9) return "Normal";
        else if (imc < 29.9) return "Sobrepeso";
        else if (imc < 34.9) return "Obesidade Grau 1";
        else if (imc < 39.9) return "Obesidade Grau 2";
        else return "Obesidade Grau 3 (mórbida)";
    }
}

class ContaBancaria {
    private String titular;
    private double saldo;


    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            System.out.println("Titular não pode estar vazio");
        } else {
            this.titular = titular;
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo não pode ser negativo");
        } else {
            this.saldo = saldo;
        }
    }
    
    public void depositar(double valor) {
        if(valor <= 0) {
            System.out.println("Depósito deve ser positivo");
        } else {
            this.saldo = this.saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        }
    }
    
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo");
        } else if (this.saldo - valor < 0) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        }
    }
}


 class Filmes {
    private String titulo;
    private double avaliacao;
    
    public Filmes() {
    }
    

    public Filmes(String titulo, double avaliacao) {
        setTitulo(titulo);
        setAvaliacao(avaliacao);
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Título não pode ser vazio");
            System.exit(0);
        }
        this.titulo = titulo;
    }
    
    public double getAvaliacao() {
        return avaliacao;
    }
    
    public void setAvaliacao(double avaliacao) {
        if (avaliacao < 0 || avaliacao > 5) {
            System.out.println("Avaliação deve estar entre 0 e 5");
            System.exit(0);
        }
        this.avaliacao = avaliacao;
    }
    
    public void exibir() {
        System.out.println("Filme:" + titulo + " Avaliação:" + avaliacao);
    }
}

 class Funcionario {
	    private String nome;
	    private double salario;
	   
	    public Funcionario() {
	    	
	    }
	    
	    public Funcionario(String nome, double salario) {
	        setNome(nome);
	        setSalario(salario);
	    }
	    
	    public String getNome() {
	        return nome;
	    }
	    
	    public void setNome(String nome) {
	        if (nome == null || nome.trim().isEmpty()) {
	          System.out.println("Nome não pode ser vazio");
	        }
	        this.nome = nome;
	    }
	    
	    public double getSalario() {
	        return salario;
	    }
	    
	    public void setSalario(double salario) {
	        if (salario < 0) {
	        	 System.out.println("Salário não pode ser negativo");
	        }
	        this.salario = salario;
	    }
	    
	    public void aumentarSalario(double percentual) {
	        if (percentual < 0) {
	        	 System.out.println("Percentual não pode ser negativo");
	        }
	        double aumento = this.salario * (percentual / 100);
	        this.salario += aumento;
	    }
	    
	    public void exibirDados() {
	        System.out.println("Nome:  " + nome + "Salario: R$ "+ salario);

	    }
	}

 class ContaLuzEx {
     public static void executar(java.util.Scanner sc) {
         double consumo;
         do {
             System.out.print("Consumo em kWh: ");
             consumo = sc.nextDouble();
             if (consumo < 0)
                 System.out.println("Consumo inválido chefia! Digita de novo.");
         } while (consumo < 0);

         double valorKwh;
         do {
             System.out.print("Valor por kWh: ");
             valorKwh = sc.nextDouble();
             if (valorKwh <= 0)
                 System.out.println("Valor inválido chefia! Digita de novo.");
         } while (valorKwh <= 0);

         double total = consumo * valorKwh;
         System.out.println("Valor a pagar: R$ " + total);
     }
 }


 class BicicletaAlugadaEx {
     public static void executar(java.util.Scanner sc) {
         int horas;
         do {
             System.out.print("Alugou por quantas horas, patrão? ");
             horas = sc.nextInt();
             if (horas < 1)
                 System.out.println("Hora inválida! Digita de novo.");
         } while (horas < 1);

         double valorHora;
         do {
             System.out.print("Valor por hora: ");
             valorHora = sc.nextDouble();
             if (valorHora <= 0)
                 System.out.println("Valor inválido! Digita de novo.");
         } while (valorHora <= 0);

         double total = horas * valorHora;
         System.out.println("Vai pagar isso aqui chefia: R$ " + total);
     }
 }
 
   class ProdutoEstoqueEx {
     public static void executar(java.util.Scanner sc) {
         System.out.print("O que que era o produto? ");
         String nome = sc.nextLine().trim();
         while (nome.isEmpty()) {
             System.out.println("Nome inválido! Digita de novo.");
             System.out.print("O que que era o produto? ");
             nome = sc.nextLine().trim();
         }

         int q;
         do {
             System.out.print("Tinha quantos? ");
             while (!sc.hasNextInt()) {
                 System.out.println("Quantidade inválida! Digita de novo.");
                 sc.nextLine();
                 System.out.print("Tinha quantos? ");
             }
             q = sc.nextInt();
             sc.nextLine();
             if (q < 0) System.out.println("Quantidade inválida! Digita de novo.");
         } while (q < 0);

         int add;
         do {
             System.out.print("Trouxe quantos? ");
             while (!sc.hasNextInt()) {
                 System.out.println("Valor inválido! Digita de novo.");
                 sc.nextLine();
                 System.out.print("Trouxe quantos? ");
                 
             }
             add = sc.nextInt();
             sc.nextLine();
             if (add < 0) System.out.println("Valor inválido! Digita de novo.");
         } while (add < 0);

         int rem;
         do {
             System.out.print("Tirou quantos? ");
             while (!sc.hasNextInt()) {
                 System.out.println("Valor inválido! Digita de novo.");
                 sc.nextLine();
                 System.out.print("Tirou quantos? ");
             }
             rem = sc.nextInt();
             sc.nextLine();
             if (rem < 0) System.out.println("Valor inválido! Digita de novo.");
         } while (rem < 0);

         q = q + add - rem;
         if (q < 0) q = 0;
         System.out.println("Tá tendo: " + q + " unidades de " + nome);
     }
 }
 
   class TemperaturaEx {
	    public static void executar(java.util.Scanner sc) {
	        sc.nextLine();

	        double celsius;
	        do {
	            System.out.print("Temperatura em Celsius: ");
	            while (!sc.hasNextDouble()) {
	                System.out.println("Valor inválido! Digita um número, chefia!");
	                sc.nextLine(); 
	            }
	            celsius = sc.nextDouble();
	            sc.nextLine(); 
	            if (celsius < -273.15) {
	                System.out.println("Não pode ser menor que -273.15°C, chefia! Digita de novo.");
	            }
	        } while (celsius < -273.15);

	        double fahrenheit = (celsius * 9 / 5) + 32;
	        double kelvin = celsius + 273.15;

	        System.out.println("Fahrenheit: " + fahrenheit + " °F");
	        System.out.println("Kelvin: " + kelvin + " K");
	    }
	}
   