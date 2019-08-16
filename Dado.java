import java.util.Random;

public class Dado{
  private int valor;

  public void Dado(){
  }

  public void rolar(){
    this.valor=random.nextInt(5)+1;
  }

  public int mostrarDado(){
    return this.valor;
  }

  public String toString(){
    System.out.println(this.valor);
    return this.valor;
  }
}
