/* Para ligar o aparelho digite 1
/* Para desligar o aparelho digite 2
 * Para atender digite 3
 * Para gravar correio de voz digite 4
 * Para Exibir aba digite 5
 * Para adicionar nova aba digite 6
 * Para atualizar pagina digite 7
 * Para tocar musica digite 8
 * Para pausar digite 9
 * Para  mudar de musica digite 0
 */

package TelefoneMovel;

import TelefoneMovel.NavegadorNaInternet;

import java.util.Scanner;

import TelefoneMovel.AparelhoTelefonico;
import TelefoneMovel.ReprodutorMusical;

public class Iphone {
  public static void main(String[] args) {
    int ligandoIphone;
    int atenderLigacao;  
    int gravarCorreioDeVoz;
    int exibirPagina;
    int adicionarPagina;
    int atualizarPagina;
    int tocarMusica;
    int pausarMusica;
    int mudarDeMusica;
    
    








    AparelhoTelefonico meuIphone = new AparelhoTelefonico();
    NavegadorNaInternet usandoInternet = new NavegadorNaInternet();
    ReprodutorMusical escutandoMusica = new ReprodutorMusical();

    Scanner entrada = new Scanner(System.in);
    System.out.println("Ola:\n Para ligar o celular digite 1"+ "\n Digite 2 para desligar");
    ligandoIphone = entrada.nextInt();
    boolean iniciando = true;
    while(iniciando){
      System.out.println(
          "\n para desligar o celular digite 2" +
          "\n para atender o celular digite 3" +
          "\n para gravar correio de voz digite 4"+
          "\n Exibir aba na internet digite 5 "+
          "\n Para adicionar nova aba digite 6"+
          "\n Para atualizar pagina digite 7"+
          "\n Para tocar musica digite 8"+
          "\n Para pausar digite 9"+
          "\n Para  mudar de musica digite 0"
          
          );
          
      int opcao = entrada.nextInt();
      switch(opcao){
        case 2:
        iniciando = false;
        meuIphone.setLigar(opcao);
        break;
        case 3:
        meuIphone.setAtender(opcao);
        meuIphone.isAtender();

        break;
        case 4:
        meuIphone.setIniciarCorreioDeVoz(opcao);
        meuIphone.isIniciarCorreioDeVoz();
        break;
        case 5:
        usandoInternet.setExibirPagina(opcao);
        usandoInternet.isExibirPagina();
        break;
        case 6:
        usandoInternet.setAdicionarNovaAba(opcao);
        usandoInternet.isAdicionarNovaAba();
        break;
        case 7:
        usandoInternet.setAtualizarPagina(opcao);
        usandoInternet.isAtualizarPagina();
        break;
        case 8:
        escutandoMusica.setTocar(opcao);
        escutandoMusica.getTocar();
        break;
        case 9:
        escutandoMusica.setPausar(opcao);
        escutandoMusica.getPausar();
        break;
        case 0:
        escutandoMusica.setSelecionarMusica(opcao);
        escutandoMusica.getSelecionarMusica();
        break;
      default: 
      System.out.println("Opção invalida");
      iniciando = false;
      break;
      }
      
    }
  
    }

}
