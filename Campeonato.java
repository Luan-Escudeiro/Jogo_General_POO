import java.util.Scanner;

public class Campeonato{
  private static Scanner aux = new Scanner(System.in);
  private static Jogador[] jogadores=new Jogador[5];
  private static int verdade;

  public static boolean checaNome(String nome){
    String nome1;
    for(int i=0;i<5;i++){
      if(jogadores[i]!=null){
        nome1=jogadores[i].getNome();
        if(nome1.equals(nome)){
          return true;
        }
      }
    }
    return false;
  }

  public static void incluirJogador(){
    System.out.println("\nInsira o nome do jogador: ");
    String nome=aux.next();
    for(int i=0;i<5;i++){
      if(jogadores[i]==null&&checaNome(nome)==false){
        jogadores[i]=new Jogador();
        jogadores[i].setNome(nome);
        System.out.println("Inserido com sucesso");
        return;
      }
      if(i==4&&jogadores[i]!=null){
        System.out.println("Número de jogadores excedido.");
        return;
      }
    }
  }

  public static void removerJogador(){
    System.out.println("\nLista de jogadores:");
    for(int i=0;i<5;i++){
      if(jogadores[i]!=null){
        System.out.println(jogadores[i].getNome());
      }
    }
    System.out.println("\nQual dos jogadores deseja retirar?");
    String nome=aux.next();
    if(checaNome(nome)==false){
      System.out.println("Não há jogador com esse nome.");
    }
    else{
      for(int i=0;i<5;i++){
        if(jogadores[i]!=null&&jogadores[i].getNome()==nome){
          jogadores[i]=null;
        }
      }
    }
  }
  public static void iniciar(){
  }

  public static void mostrar(){
  }

  public static void gravar(){
  }

  public static void ler(){
  }


  public static void main(String[] args){
    int opcao;
    do{
      System.out.println("\nJogo General");
			System.out.println("1-Incluir jogador.");
			System.out.println("2-Remover jogador.");
			System.out.println("3-Iniciar/Reiniciar o campeonato.");
			System.out.println("4-Mostrar cartela de resultados.");
			System.out.println("5-Gravar dados.");
			System.out.println("6-Ler dados.");
			System.out.println("0-Sair.\n");
      opcao=aux.nextInt();
      if(opcao==1){
        incluirJogador();
      }
      else if(opcao==2){
        removerJogador();
      }
      else if(opcao==3){
        iniciar();
      }
      else if(opcao==4){
        mostrar();
      }
      else if(opcao==5){
        gravar();
      }
      else if(opcao==6){
        ler();
      }
      else if(opcao==0){
      }
      else{
        System.out.println("Opção inválida");
      }
    }while(opcao!=0);
  }
}
