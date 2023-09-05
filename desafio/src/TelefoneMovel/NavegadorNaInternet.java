package TelefoneMovel;

import TelefoneMovel.AparelhoTelefonico;

public class NavegadorNaInternet {
  private boolean exibirPagina;
  private boolean adicionarNovaAba;
  private boolean atualizarPagina;

  public boolean isExibirPagina() {
    System.out.println("Abrindo navegador");
    return exibirPagina;
  }
  
  public void setExibirPagina(int opcaoExibirPagina) {
    AparelhoTelefonico iphone = new AparelhoTelefonico();
    if (iphone.isLigar() == true && opcaoExibirPagina == 5){
      this.exibirPagina = true;
    }
    else
      this.exibirPagina = false;

  }

  public boolean isAdicionarNovaAba() {
    System.out.println("Pagina adicionada");
    return adicionarNovaAba;
  }
  
  public void setAdicionarNovaAba(int adicionarNovaAba) {
    if(exibirPagina == true && adicionarNovaAba == 6){
      this.adicionarNovaAba = true;
    }
     else
       this.adicionarNovaAba = false;

  }

  public boolean isAtualizarPagina() {
    System.out.println("Pagina atualizada");
    return atualizarPagina;
  }
  
  public void setAtualizarPagina(int atualizarPagina) {
    if (exibirPagina == true && atualizarPagina == 7){
        this.atualizarPagina = true;
    }
    else
      this.atualizarPagina = false;
  }
}
