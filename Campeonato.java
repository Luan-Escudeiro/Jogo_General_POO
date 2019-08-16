import java.util.Scanner;

public class Campeonato{
  private static Scanner aux = new Scanner(System.in);
  private Jogador[] jogadores=new Jogador[5];

  public void incluirJogador(){

  }

  public static void main(){
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
      else if(opçao==0){
      }
      else{
        System.out.println("Opção inválida");
      }
    }while(opcao!=0);
  }
}
