public class JogoGeneral{
  private Dado[] dados=new Dado[5];
  private int[] jogadas=new int[13];

  public void JogoGeneral(){
    for(int i=0;i<5;i++){
      this.dados[i]=new Dado();
    }
    for(int i=0;i<13;i++){
      this.jogadas[i]=-1;
    }
  }

  public void rolarDados(){
    for(int i=0;i<5;i++){
      this.dados[i].rolar();
    }
  }

  public void mostrarDados(){
    for(int i=0;i<5;i++){
      System.out.print(dados[i].mostrarDado()+"  ");
    }
  }

  public boolean validarJogada(int escolha){
    if(escolha==1){
      if(jogadas[0]!=-1){
        System.out.println("Jodada já utilizada.");
        return false;
      }
      for(int i=0;i<5;i++){
        if(dados[i].mostrarDado()==1){
        }
        else{
          System.out.println("Jogada inválida.");
          return false;
        }
      }
      return true;
    }
    else if(escolha==2){
      if(jogadas[1]!=-1){
        System.out.println("Jodada já utilizada.");
        return false;
      }
      for(int i=0;i<5;i++){
        if(this.dados[i].mostrarDado()==2){
        }
        else{
          System.out.println("Jogada inválida.");
          return false;
        }
      }
      return true;
    }
    else if(escolha==3){
      if(jogadas[2]!=-1){
        System.out.println("Jodada já utilizada.");
        return false;
      }
      for(int i=0;i<5;i++){
        if(this.dados[i].mostrarDado()==3){
        }
        else{
          System.out.println("Jogada inválida.");
          return false;
        }
      }
      return true;
    }
    else if(escolha==4){
      if(jogadas[3]!=-1){
        System.out.println("Jodada já utilizada.");
        return false;
      }
      for(int i=0;i<5;i++){
        if(this.dados[i].mostrarDado()==4){
        }
        else{
          System.out.println("Jogada inválida.");
          return false;
        }
      }
      return true;
    }
    else if(escolha==5){
      if(jogadas[4]!=-1){
        System.out.println("Jodada já utilizada.");
        return false;
      }
      for(int i=0;i<5;i++){
        if(this.dados[i].mostrarDado()==5){
        }
        else{
          System.out.println("Jogada inválida.");
          return false;
        }
      }
      return true;
    }
    else if(escolha==6){
      if(jogadas[5]!=-1){
        System.out.println("Jodada já utilizada.");
        return false;
      }
      for(int i=0;i<5;i++){
        if(this.dados[i].mostrarDado()==6){
        }
        else{
          System.out.println("Jogada inválida.");
          return false;
        }
      }
      return true;
    }
    else if(escolha==10){
      if(jogadas[9]!=-1){
        System.out.println("Jodada já utilizada.");
        return false;
      }
      if(this.dados[0].mostrarDado()==2 && this.dados[1].mostrarDado()==3 && this.dados[2].mostrarDado()==4 && this.dados[3].mostrarDado()==5 && this.dados[4].mostrarDado()==6){
        return true;
      }
      else{
        System.out.println("Jogada inválida.");
        return false;
      }
    }
    else if(escolha==11){
      if(jogadas[10]!=-1){
        System.out.println("Jodada já utilizada.");
        return false;
      }
      if(this.dados[0].mostrarDado()==1 && this.dados[1].mostrarDado()==2 && this.dados[2].mostrarDado()==3 && this.dados[3].mostrarDado()==4 && this.dados[4].mostrarDado()==5){
        return true;
      }
      else{
        System.out.println("Jogada inválida.");
        return false;
      }
    }
    else if(escolha==12){
      if(jogadas[11]!=-1){
        System.out.println("Jodada já utilizada.");
        return false;
      }
      if(this.dados[0].mostrarDado()==this.dados[1].mostrarDado()&&this.dados[1].mostrarDado()==this.dados[2].mostrarDado()&&this.dados[2].mostrarDado()==this.dados[3].mostrarDado()&&this.dados[3].mostrarDado()==this.dados[4].mostrarDado()){
        return true;
      }
      else{
        System.out.println("Jogada inválida.");
        return false;
      }
    }
    else if(escolha==13){
      if(jogadas[12]!=-1){
        System.out.println("Jodada já utilizada.");
        return false;
      }
      else{
        return true;
      }
    }
  }

  public int pontuarJogada(int escolha){
    int pontos=0;
    if(validarJogada(escolha)==true){
      if(escolha==1){
        for(int i=0;i<5;i++){
          if(dados[i].mostrarDado()==1){
            pontos+=1;
          }
        }
        jogadas[0]=1;
        return pontos;
      }
      else if(escolha==2){
        for(int i=0;i<5;i++){
          if(dados[i].mostrarDado()==2){
            pontos+=2;
          }
        }
        jogadas[1]=1;
        return pontos;
      }
      else if(escolha==3){
        for(int i=0;i<5;i++){
          if(dados[i].mostrarDado()==3){
            pontos+=3;
          }
        }
        jogadas[2]=1;
        return pontos;
      }
      else if(escolha==4){
        for(int i=0;i<5;i++){
          if(dados[i].mostrarDado()==4){
            pontos+=4;
          }
        }
        jogadas[3]=1;
        return pontos;
      }
      else if(escolha==5){
        for(int i=0;i<5;i++){
          if(dados[i].mostrarDado()==5){
            pontos+=5;
          }
        }
        jogadas[4]=1;
        return pontos;
      }
      else if(escolha==6){
        for(int i=0;i<5;i++){
          if(dados[i].mostrarDado()==6){
            pontos+=6;
          }
        }
        jogadas[5]=1;
        return pontos;
      }
      else if(escolha==10){
        return 30;
      }
      else if(escolha==11){
        return 40;
      }
      else if(escolha==12){
        return 50;
      }
      else if(escolha==13){
        for(int i=0;i<5;i++){
          pontos+=dados[i].mostrarDado();
        }
      }
      else{
        System.out.println("Escolha inválida.");
        return -1;
      }
    }
  }
}
