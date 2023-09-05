package TelefoneMovel;

public class AparelhoTelefonico {
  private boolean ligar;
  private boolean atender;
  private boolean iniciarCorreioDeVoz;

  public boolean isLigar() {
    return ligar;
  }
  
  public void setLigar(int opcao) {
    if(opcao != 1){
      System.out.println("Esta desligado");
      this.ligar = false;
    }
    else{
      System.out.println("Ligando o aparelho");
      this.ligar = true;
    }
    
  }
  public boolean isAtender() {
    System.out.println("Atendendo o aparelho");
    return atender;
  }
  public void setAtender(int opcaoParaAtender) {
    if(ligar == true && opcaoParaAtender == 3){
      this.atender = true;
    }
    else
    this.atender = false;
    
  }

  public boolean isIniciarCorreioDeVoz() {
    System.out.println("Gravando correio de voz");
      return iniciarCorreioDeVoz;
  }
  public void setIniciarCorreioDeVoz(int gravarCorreioDeVoz) {
      if(ligar == true && atender == false && gravarCorreioDeVoz == 4){
          this.iniciarCorreioDeVoz = true;
      }
      else 
        this.iniciarCorreioDeVoz = false;
  }


}
