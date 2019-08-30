public class Jogador{
  private String nome;
  private static JogoGeneral jogo;
  private static int pontos;

  public void Jogador(){
    this.jogo=new JogoGeneral();
    this.pontos=0;
  }

  public static void rolarDados(){
    jogo.rolarDados();
  }

  public static void mostrarDados(){
    jogo.mostrarDados();
  }

  public void setNome(String nick){
    this.nome=nick;
  }

  public String getNome(){
    return this.nome;
  }

}
