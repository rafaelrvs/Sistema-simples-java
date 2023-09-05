package TelefoneMovel;
import TelefoneMovel.AparelhoTelefonico;
public class ReprodutorMusical {
  private boolean tocar;
  private boolean pausar;
  private boolean selecionarMusica;
  public boolean getTocar() {
    return tocar;
  }
  public void setTocar(int tocar) {
    
    if( tocar == 8){
      System.out.println("A musica está tocando");
        this.tocar = true;
    }
      else
      this.tocar = false;
  
  }
  public boolean getPausar() {  
    System.out.println("Você pausou a musica");
    return pausar;
  }
  public void setPausar(int pausar) {
 
    if(tocar == true && pausar == 9){
      this.pausar = true;
    }
    else
    this.pausar = false;

  }
  public boolean getSelecionarMusica() {
    System.out.println("Você mudou de musica ");
    return selecionarMusica;
  }
  public void setSelecionarMusica(int selecionarMusica) {

    if(selecionarMusica == 0){
    this.selecionarMusica = true;
    }
           

  }



}
