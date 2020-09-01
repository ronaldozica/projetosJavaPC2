
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int escaneado = 0, codigo_escaneado = 101, quantidade_escaneado;        // foi utilizado 101 por ser um valor que não será digitado pelo usuário (provavelmente)
        
        
        ArrayList <Item> itens = new ArrayList <> ();
        Fatura fatura = new Fatura(itens, 0.0);
        
        Produto cooler = new Produto("Cooler para processador", 0, 40.00);
        Produto mouse = new Produto("Mouse Gamer sem Fio", 1, 70.00);
        Produto teclado = new Produto("Teclado e mouse", 2, 125.00);
        Produto monitor = new Produto("Monitor LED 24''", 3, 692.00);
        
        while(escaneado != 9)
        {
            switch(escaneado)
            {
                case 0:
                    System.out.println("Para adicionar um novo produto ao seu carrinho, digite 1");
                    System.out.println("Para exibir os itens do carrinho, digite 2.");
                    System.out.println("Para exibir a fatura atual, digite 3.");
                    System.out.println("Para exibir a lista de produtos disponíveis, digite 4.");
                    System.out.println("Para sair da aplicação, digite 9.");
                    
                    if(codigo_escaneado == 101)
                    {
                        System.out.println("Preço dos produtos disponíveis: ");
                        System.out.println("Cooler para processador: R$ 40,00. - Código : 0");
                        System.out.println("Mouse gamer sem fio: R$ 70,00. - Código : 1");
                        System.out.println("Teclado/mouse sem fio: R$ 125,00. - Código : 2");
                        System.out.println("Monitor LED 24'' : R$692,00. - Código : 3");
                    }
                break;
                
                case 1:
                    
                    Item item_aux = new Item ();
                    
                    System.out.println("Digite o código do produto que deseja comprar. Para exibir novamente a lista de produtos digite 4, para sair digite 5");
                    
                    codigo_escaneado = scanner.nextInt();
                    
                    if( (codigo_escaneado >= 0) && (codigo_escaneado < 4) )
                    {
                        System.out.println("Digite a quantidade desse produto que você deseja adicionar ao carrinho:");
                        quantidade_escaneado = scanner.nextInt();
                    }
                    
                    else
                    {
                        quantidade_escaneado = 1;
                    }
                    
                    if(quantidade_escaneado == 0)
                    {
                        System.out.println("Quantidade inválida, retornando ao menu de selação.");
                        codigo_escaneado = 5;
                    }
                    
                    item_aux.setQuantidade(quantidade_escaneado);
                    
                    switch(codigo_escaneado)
                    {
                        case 0:
                            if(quantidade_escaneado == 1)
                            {
                                System.out.println("Foi adicionado 1 Cooler para Processador no seu carrinho.");
                            }
                            
                            else
                            {
                                System.out.println("Foram adicionados " + quantidade_escaneado + " Coolers para Processador no seu carrinho.");
                            }
                            
                            item_aux.setProduto(cooler);
                            itens.add(item_aux);
                            
                            break;
                            
                        case 1:
                            if(quantidade_escaneado == 1)
                            {
                                System.out.println("Foi adicionado 1 Mouse Gamer sem fio no seu carrinho.");
                            }
                            
                            else
                            {
                                System.out.println("Foram adicionados " + quantidade_escaneado + " Mouses Gamer sem fio no seu carrinho.");
                            }
                            
                            item_aux.setProduto(mouse);
                            itens.add(item_aux);
                            
                            break;
                            
                        case 2:
                            if(quantidade_escaneado == 1)
                            {
                                System.out.println("Foi adicionado 1 teclado e 1 mouse no seu carrinho.");
                            }
                            
                            else
                            {
                                System.out.println("Foram adicionados " + quantidade_escaneado + " mouses e teclados no seu carrinho.");
                            }
                            
                            item_aux.setProduto(teclado);
                            itens.add(item_aux);
                            
                            break;
                            
                        case 3:
                            if(quantidade_escaneado == 1)
                            {
                                System.out.println("Foi adicionado 1 Monitor LED de 24'' no seu carrinho.");
                            }
                            
                            else
                            {
                                System.out.println("Foram adicionados " + quantidade_escaneado + " Monitores LED's de 24'' no seu carrinho.");
                            }
                            
                            item_aux.setProduto(monitor);
                            itens.add(item_aux);
                            
                            break;
                            
                        case 4:
                            System.out.println("Preço dos produtos disponíveis: ");
                            System.out.println("Cooler para processador: R$ 40,00. - Código : 0");
                            System.out.println("Mouse gamer sem fio: R$ 70,00. - Código : 1");
                            System.out.println("Teclado/mouse sem fio: R$ 125,00. - Código : 2");
                            System.out.println("Monitor LED 24'' : R$692,00. - Código : 3");
                            
                            break;
                            
                        case 5:
                            break;
                            
                        default:
                            System.out.println("Comando inválido, retornaremos a seleção de funcionalidade.");
                    }
                    
                    break;
  
                case 2:
                    fatura.exibirItens();
                    
                    break;
                    
                case 3:
                    fatura.setItens(itens);
                    fatura.exibirFatura();
                    
                    break;
                
                case 4:
                    System.out.println("Preço dos produtos disponíveis: ");
                    System.out.println("Cooler para processador: R$ 40,00. - Código : 0");
                    System.out.println("Mouse gamer sem fio: R$ 70,00. - Código : 1");
                    System.out.println("Teclado/mouse sem fio: R$ 125,00. - Código : 2");
                    System.out.println("Monitor LED 24'' : R$692,00. - Código : 3");
                            
                    break;
                    
                default:
                    System.out.println("Comando inválido, por favor digite um dos números informados. Caso queira ver os números informados novamente por favor digite 0.");
                    
                    break;
            }
            
            System.out.println("Por favor, digite agora seu comando. Para ver novamente a lista de comandos digite 0.");
            escaneado = scanner.nextInt();
        }
    }
    
}
