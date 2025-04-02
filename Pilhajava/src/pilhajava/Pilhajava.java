package pilhajava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Pilhajava {
    	static Scanner scanner = new Scanner(System.in);
        
    private static int menu() {
        System.out.println("\n--- Menu Pilha ---");
        System.out.println("1. Inserir elemento");
        System.out.println("2. Remover elemento");
        System.out.println("3. Mostrar topo");
        System.out.println("4. Mostrar pilha");
        System.out.println("0. Sair");
        System.out.printf("Digite a opção desejada:" );
    	return scanner.nextInt();
    }
    
    // leiaRecorde
    public static void lerRecorde(Atividade1 recorde) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Digite o nome do atleta: ");
          recorde.setNome(scanner.nextLine());
 
          System.out.println("Digite a data do recorde (dd/MM/yyyy): ");
          String dataStr = scanner.nextLine();
          LocalDate dataFormatada = LocalDate.parse(dataStr,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
          recorde.setDataRecorde(dataFormatada) ;
          System.out.println("Digite o tempo do recorde (em segundos): ");
          recorde.setTempo(scanner.nextDouble());
}


    
    public static void main(String[] args) {
        int opcao;
        System.out.println("Tamanho da pilha:");
        int tamanho = scanner.nextInt();
        Pilha<Atividade1> minhaPilha = new Pilha(tamanho);
        do{
            opcao = menu();
            switch(opcao){
                case 1:
                    //ler dados do novoRecorde
                    if (!minhaPilha.isFull()){
                        Atividade1 novoRecorde = new Atividade1();
                        lerRecorde(novoRecorde);
                        minhaPilha.push(novoRecorde);}
                    else
                        System.out.println("Pilha Cheia!");
                    break;
                case 2: if(!minhaPilha.isEmpty())
                            System.out.println("Topo removido: "
                                +minhaPilha.pop());
                        else
                            System.out.println("Pilha vazia!");
                    break;
                case 3: if(!minhaPilha.isEmpty())
                            System.out.println("Topo: "
                            +minhaPilha.peek());
                case 4:
                    System.out.println(minhaPilha);
                    break;
                case 0:
                    System.out.println("SAINDO...");
                    break;
            }
        }while(opcao != 0);
    }
    
}
