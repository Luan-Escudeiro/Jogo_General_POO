public class JogoGeneral{
  private Dado[] dados=new Dado[5];
  private int[] jogadas=new int[13];

  public void JogoGeneral(){
    for(int i=0;i<5;i++){
      dados[i]=new Dado();
    }
  }

  public void rolarDados(){
    for(int i=0;i<5;i++){
      this.dados[i].rolar();
    }
  }

  public boolean validarJogada(int escolha){
    int pontos;
    if(escolha==1){
      for(int i=0;i<5;i++){
        if(this.dados[i].mostrarDado()==1)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==2){
      for(int i=0;i<5;i++){
        if(this.dados[i].mostrarDado()==2)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==3){
      for(int i=0;i<5;i++){
        if(this.dados[i].mostrarDado()==3)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==4){
      for(int i=0;i<5;i++){
        if(this.dados[i].mostrarDado()==4)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==5){
      for(int i=0;i<5;i++){
        if(this.dados[i].mostrarDado()==5)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==6){
      for(int i=0;i<5;i++){
        if(this.dados[i].mostrarDado()==6)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==10){
      if(this.dados[0].mostrarDado()==2 && this.dados[1].mostrarDado()==3 && this.dados[2].mostrarDado()==4 && this.dados[3].mostrarDado()==5 && this.dados[4].mostrarDado()==6)
      pontos=30;
      return pontos;
    }
    else if(escolha==11){
      if(this.dados[0].mostrarDado()==1 && this.dados[1].mostrarDado()==2 && this.dados[2].mostrarDado()==3 && this.dados[3].mostrarDado()==4 && this.dados[4].mostrarDado()==5)
      pontos=40;
      return pontos;
    }
    else if(escolha==12){
      if(this.dados[0].mostrarDado()==this.dados[1].mostrarDado()&&this.dados[1].mostrarDado()==this.dados[2].mostrarDado()&&this.dados[2].mostrarDado()==this.dados[3].mostrarDado()&&this.dados[3].mostrarDado()==this.dados[4].mostrarDado()&&this.dados[4].mostrarDado()==this.dados[5].mostrarDado())
      pontos=50;
      return pontos;
    }
    else if(escolha==13){
      for(int i=0;i<5;i++){
        pontos+=this.dados[i].mostrarDado();
      }
      return pontos;
    }
  }

  public int pontuarJogada(int escolha){
  }
}
