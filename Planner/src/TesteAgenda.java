
import java.util.Scanner;


/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class TesteAgenda {
    public static void exibeMensagens()
    {
        System.out.println("Se quiser adicionar mais um compromisso a sua agenda, digite \"adicionar\".");
        System.out.println("Se quiser exibir sua agenda da semana, digite \"conferir\".");
        System.out.println("Para sair da agenda, digite \"sair\".");   
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String escaneado, diaEscaneado, nomeCompromisso;
        Semana novaSemana = new Semana();
        int duracaoCompromisso, horarioCompromisso;
        Compromisso compromissoAux = new Compromisso();
        
        System.out.println("Olá, bem vindo à sua Agenda Virtual!");
        
        do
        {
            exibeMensagens();
            escaneado = scanner.next();
            escaneado = escaneado.toLowerCase();
            
            if(escaneado.equals("adicionar"))
            {
                System.out.println("Digite o dia da semana:");
                diaEscaneado = scanner.next();
                diaEscaneado = diaEscaneado.toLowerCase();
                
                switch (diaEscaneado) {
                    
                    case "segunda":
                    case "segunda-feira":
                        
                        System.out.println("Digite o nome do compromisso:");
                        nomeCompromisso = scanner.next();
                        
                        System.out.println("Digite a duração do compromisso em horas:");
                        duracaoCompromisso = scanner.nextInt();
                        
                        System.out.println("Digite o horário do começo do compromisso:");
                        horarioCompromisso = scanner.nextInt();
                        
                        compromissoAux.setDescricao(nomeCompromisso);
                        compromissoAux.setDuracao(duracaoCompromisso);
                        
                        if(novaSemana.adicionarCompromissoAoDia(0, compromissoAux, horarioCompromisso))
                        {
                            System.out.println("Compromisso adicionado com sucesso!");
                        }
                        
                        else
                        {
                            System.out.println("Houve algum erro na hora de adicionar o compromisso, por favor, tente novamente.");
                        }
                        
                        break;
                        
                    case "terça":
                    case "terça-feira":
                        
                        System.out.println("Digite o nome do compromisso:");
                        nomeCompromisso = scanner.next();
                        
                        System.out.println("Digite a duração do compromisso em horas:");
                        duracaoCompromisso = scanner.nextInt();
                        
                        System.out.println("Digite o horário do começo do compromisso:");
                        horarioCompromisso = scanner.nextInt();
                        
                        compromissoAux.setDescricao(nomeCompromisso);
                        compromissoAux.setDuracao(duracaoCompromisso);
                        
                        if(novaSemana.adicionarCompromissoAoDia(1, compromissoAux, horarioCompromisso))
                        {
                            System.out.println("Compromisso adicionado com sucesso!");
                        }
                        
                        else
                        {
                            System.out.println("Houve algum erro na hora de adicionar o compromisso, por favor, tente novamente.");
                        }
                        
                        break;
                        
                    case "quarta":
                    case "quarta-feira":
                        
                        System.out.println("Digite o nome do compromisso:");
                        nomeCompromisso = scanner.next();
                        
                        System.out.println("Digite a duração do compromisso em horas:");
                        duracaoCompromisso = scanner.nextInt();
                        
                        System.out.println("Digite o horário do começo do compromisso:");
                        horarioCompromisso = scanner.nextInt();
                        
                        compromissoAux.setDescricao(nomeCompromisso);
                        compromissoAux.setDuracao(duracaoCompromisso);
                        
                        if(novaSemana.adicionarCompromissoAoDia(2, compromissoAux, horarioCompromisso))
                        {
                            System.out.println("Compromisso adicionado com sucesso!");
                        }
                        
                        else
                        {
                            System.out.println("Houve algum erro na hora de adicionar o compromisso, por favor, tente novamente.");
                        }
                        
                        break;
                        
                    case "quinta":
                    case "quinta-feira":
                        
                        System.out.println("Digite o nome do compromisso:");
                        nomeCompromisso = scanner.next();
                        
                        System.out.println("Digite a duração do compromisso em horas:");
                        duracaoCompromisso = scanner.nextInt();
                        
                        System.out.println("Digite o horário do começo do compromisso:");
                        horarioCompromisso = scanner.nextInt();
                        
                        compromissoAux.setDescricao(nomeCompromisso);
                        compromissoAux.setDuracao(duracaoCompromisso);
                        
                        if(novaSemana.adicionarCompromissoAoDia(3, compromissoAux, horarioCompromisso))
                        {
                            System.out.println("Compromisso adicionado com sucesso!");
                        }
                        
                        else
                        {
                            System.out.println("Houve algum erro na hora de adicionar o compromisso, por favor, tente novamente.");
                        }
                        
                        break;
                        
                    case "sexta":
                    case "sexta-feira":
                        
                        System.out.println("Digite o nome do compromisso:");
                        nomeCompromisso = scanner.next();
                        
                        System.out.println("Digite a duração do compromisso em horas:");
                        duracaoCompromisso = scanner.nextInt();
                        
                        System.out.println("Digite o horário do começo do compromisso:");
                        horarioCompromisso = scanner.nextInt();
                        
                        compromissoAux.setDescricao(nomeCompromisso);
                        compromissoAux.setDuracao(duracaoCompromisso);
                        
                        if(novaSemana.adicionarCompromissoAoDia(4, compromissoAux, horarioCompromisso))
                        {
                            System.out.println("Compromisso adicionado com sucesso!");
                        }
                        
                        else
                        {
                            System.out.println("Houve algum erro na hora de adicionar o compromisso, por favor, tente novamente.");
                        }
                        
                        break;
                        
                    default:
                        
                        System.out.println("Desculpe, não entendi o dia que você dgiitou. Por favor, insira o dia da semana por extenso. Ex: \"segunda\".");
                        
                        break;
                }
            }
            
            else if(escaneado.equals("conferir"))
            {
                novaSemana.exibeHorarioTodosOsDias();
            }
            
        }while(!escaneado.equals("sair"));
        
        System.out.println("*-------------------------------------------*");
        System.out.println("Obrigado por utilizar nosso sistema!");
        System.out.println("*-------------------------------------------*");
    }
}
