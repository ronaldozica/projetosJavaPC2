
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class Cinema {

    public static void exibirComandos()
    {
        System.out.println("Caso deseje informar o valor do ingresso para os filmes digite \"valor\".");
        System.out.println("Caso deseje adicionar alguma sala ao cinema, digite \"sala\".");
        System.out.println("Caso deseje adicionar um filme para ser exibido, digite \"filme\".");
        System.out.println("Caso deseje consultar os filmes em cartaz, digite \"consultar\".");
        System.out.println("Caso deseje comprar um ingresso, digite \"comprar\".");
        System.out.println("Caso deseje verificar o valor total da compra, digite \"verificar\".");
        System.out.println("Caso deseje sair do aplicativo, digite \"sair\".");
    }
    
    public static void main(String[] args) {
        
        String comando = " ";
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Sala> salas = new ArrayList <> ();
        ArrayList <Filme> filmes = new ArrayList <> ();
        
        int numeroAux, capacidadeAux, anoAux, numeroSalaAux;
        boolean exibiuFilme, encontrouFilme;
        String tituloAux, generoAux, diretorAux, ingressoAux;
        double valorTotal = 0;
        Ingresso precoIngresso = new Ingresso(0.0);
        Ingresso ingresso = new Ingresso(0.0);
        
        System.out.println("Olá, bem vindo ao cinema!");
        exibirComandos();
        
        while( !(comando.equals("sair")) )
        {
            System.out.println("Para verificar novamente os comandos, digite \"ajuda\".");
            System.out.println("Por favor, digite agora seu comando:");
            comando = scanner.next();

            comando = comando.toLowerCase();

            switch (comando) {
                
                case "valor":
                    
                    System.out.println("Digite o preço do ingresso:");
                    precoIngresso.setValor(scanner.nextDouble());
                    
                    break;
                    
                case "sala":
                    
                    System.out.println("Digite o número da sala:");
                    numeroAux = scanner.nextInt();
                    
                    System.out.println("Digite a capacidade da sala:");
                    capacidadeAux = scanner.nextInt();
                    
                    HashMap <Integer,Ingresso> assentosAux  = new HashMap <> ();
                    
                    for(int i = 1; i <= capacidadeAux; i ++)
                    {
                        assentosAux.put(i, ingresso);
                    }
                    
                    Sala salaAux = new Sala(numeroAux, capacidadeAux, assentosAux);
                    
                    salas.add(salaAux);
                    
                    break;
                    
                case "filme":
                    
                    System.out.println("Digite o nome do filme:");
                    tituloAux = scanner.next();
                    
                    System.out.println("Digite o gênero do filme:");
                    generoAux = scanner.next();
                    
                    System.out.println("Digite o ano do filme:");
                    anoAux = scanner.nextInt();
                    
                    System.out.println("Digite o diretor do filme:");
                    diretorAux = scanner.next();
                    
                    System.out.println("Digite o número da sala do filme:");
                    numeroSalaAux = scanner.nextInt();
                    
                    Sala salaAuxFilme;
                    Sala salaAuxDefinitiva = new Sala();
                    
                    Iterator <Sala> it = salas.iterator();

                    while(it.hasNext())
                    {
                        salaAuxFilme = it.next();
                        
                        if(numeroSalaAux == salaAuxFilme.getNumero())
                        {
                            salaAuxDefinitiva.setAssentos(salaAuxFilme.getAssentos());
                            salaAuxDefinitiva.setCapacidade(salaAuxFilme.getCapacidade());
                            salaAuxDefinitiva.setNumero(salaAuxFilme.getNumero());
                            
                            break;
                        }
                    }
                    
                    if(salaAuxDefinitiva.getNumero() != 0)
                    {
                        Filme filmeAux = new Filme(tituloAux, generoAux, anoAux, diretorAux, salaAuxDefinitiva);
                        filmes.add(filmeAux);
                        System.out.println(filmeAux.getTitulo() + " foi adicionado a lista de filmes.");
                    }
                    
                    else
                    {
                        System.out.println("Ocorreu algum erro, por favor verifique se o número da sala informado está correto.");
                    }
                    
                    break;
                    
                case "consultar":
                    
                    Filme filmeAux;
                    Iterator <Filme> it2 = filmes.iterator();
                    
                    exibiuFilme = false;

                    while(it2.hasNext())
                    {
                        exibiuFilme = true;
                        
                        filmeAux = it2.next();
                        
                        System.out.println("Sala " + filmeAux.getSala().getNumero() + ":");
                        System.out.println("Nome do filme: " + filmeAux.getTitulo());
                        System.out.println("Gênero: " + filmeAux.getGenero());
                        System.out.println("Ano: " + filmeAux.getAno());
                        System.out.println("Diretor: " + filmeAux.getDiretor());
                    }
                    
                    if(exibiuFilme == false)
                    {
                        System.out.println("Ainda não foi cadastrado nenhum filme ao sistema, por favor use o comando \"filme\" para adicionar um.");
                    }
                    
                    break;
                    
                case "comprar":
                    
                    System.out.println("Digite o nome do filme que deseja comprar ingresso(s):");
                    
                    ingressoAux = scanner.next();
                    encontrouFilme = false;
                    int quantidadeIngressosAux, quantidadeAux2;
                    Filme filmeIngresso, filmeDefinitivo = new Filme();
                    Iterator <Filme> it3 = filmes.iterator();

                    while(it3.hasNext())
                    {
                        filmeIngresso = it3.next();
                        
                        if(filmeIngresso.getTitulo().equalsIgnoreCase(ingressoAux))
                        {
                            encontrouFilme = true;
                            filmeDefinitivo.setAno(filmeIngresso.getAno());
                            filmeDefinitivo.setDiretor(filmeIngresso.getDiretor());
                            filmeDefinitivo.setGenero(filmeIngresso.getGenero());
                            filmeDefinitivo.setTitulo(filmeIngresso.getTitulo());
                            filmeDefinitivo.setSala(filmeIngresso.getSala());
                            
                            break;
                            
                        }
                    }
                    
                    if(encontrouFilme)
                    {
                        System.out.println("Digite quantos ingressos você deseja comprar:");
                        
                        quantidadeIngressosAux = scanner.nextInt();
                        
                        if(quantidadeIngressosAux <= 0)
                        {
                            System.out.println("Quantidade inválida de ingressos.");
                            break;
                        }
                        
                        else if(precoIngresso.getValor() == 0)
                        {
                            System.out.println("Por favor, primeiro insira o preço do ingresso.");
                        }
                            
                        else
                        {
                            quantidadeAux2 = quantidadeIngressosAux;
                            
                            if(quantidadeAux2 > filmeDefinitivo.getSala().getCapacidade())
                            {
                                System.out.println("A quantidade de ingressos digitada é maior que a quantidade de assentos disponíveis na sala.");
                            }
                            
                            else
                            {
                                for(int i = 1; i <= filmeDefinitivo.getSala().getCapacidade(); i ++)
                                {
                                    if(filmeDefinitivo.getSala().getAssentos().get(i).getValor() == 0)
                                    {                                    
                                        quantidadeIngressosAux --;
                                    }

                                    if(quantidadeIngressosAux == 0)
                                    {
                                        break;
                                    }
                                }
                            }
                            
                            if(quantidadeIngressosAux != 0)
                            {
                                System.out.println("Não há assentos disponíveis suficientes para a compra.");
                                break;
                            }
                            
                            else
                            {
                                
                                quantidadeIngressosAux = quantidadeAux2;
                                
                                for(int i = 1; i <= filmeDefinitivo.getSala().getCapacidade(); i ++)
                                {
                                    ingresso.setValor(filmeDefinitivo.getSala().getAssentos().get(i).getValor());

                                    if(ingresso.getValor() == 0)
                                    {
                                        quantidadeIngressosAux --;
                                        filmeDefinitivo.getSala().getAssentos().remove(i);
                                        filmeDefinitivo.getSala().getAssentos().put(i, precoIngresso);
                                    }

                                    if(quantidadeIngressosAux == 0)
                                    {
                                        break;
                                    }
                                 }
                                
                                valorTotal += precoIngresso.getValor() * quantidadeAux2;
                                System.out.println("Seu pedido foi cadastrado, o valor total da compra é: " + valorTotal);
                            }

                        }
                    }
                    
                    else
                    {
                        System.out.println("Não foi encontrado um filme com o nome digitado, por favor, tente novamente.");
                    }
                    
                    break;
                    
                case "verificar":
                    
                    System.out.println("O valor total da compra é: " + valorTotal);
                    
                    break;
                    
                case "ajuda":
                    
                    exibirComandos();
                    
                    break;
                    
                case "sair":
                    break;
                    
                default:
                    
                    System.out.println("Não entendi o comando que você digitou, por favor insira um dos comandos abaixo:");
                    exibirComandos();
                    
                    break;
            }
            
            System.out.println("---------------------------------------------------------------------------");
        }
    }
    
}
