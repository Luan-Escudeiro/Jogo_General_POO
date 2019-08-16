public class JogoGeneral{
  private Dado[] dados=new Dado[5];
  private int[] jogadas=new int[13];

  public void JogoGeneral(){
  }

  public void rolarDados(){
    for(int i=0;i<5;i++){
      this.dados[i].rolar();
    }
  }

  public boolean validarJogada(int escolha){
    if(escolha==1){
      for(int i=0;i<5;i++){
        if(this.dados[i]==1)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==2){
      for(int i=0;i<5;i++){
        if(this.dados[i]==2)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==3){
      for(int i=0;i<5;i++){
        if(this.dados[i]==3)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==4){
      for(int i=0;i<5;i++){
        if(this.dados[i]==4)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==5){
      for(int i=0;i<5;i++){
        if(this.dados[i]==5)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==6){
      for(int i=0;i<5;i++){
        if(this.dados[i]==6)
        pontos++;
        return pontos;
      }
    }
    else if(escolha==10){
      if(this.dados[0]==2 && this.dados[1]==3 && this.dados[2]==4 && this.dados[3]==5 && this.dados[4]==6)
      pontos=30;
      return pontos;
    }
    else if(escolha==11){
      if(this.dados[0]==1 && this.dados[1]==2 && this.dados[2]==3 && this.dados[3]==4 && this.dados[4]==5)
      pontos=40;
      return pontos;
    }
    else if(escolha==12){
      if(this.dados[0]==this.dados[1]&&this.dados[1]==this.dados[2]&&this.dados[2]==this.dados[3]&&this.dados[3]==this.dados[4]&&this.dados[4]==this.dados[5])
      pontos=50;
      return pontos;
    }
    else if(escolha==13){
      for(int i=0;i<5;i++){
        pontos+=this.dados[i];
      }
      return pontos;
    }
  }

  public int pontuarJogada(int escolha){
  }
}
