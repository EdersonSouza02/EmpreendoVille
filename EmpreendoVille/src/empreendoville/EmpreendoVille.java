/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empreendoville;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucas.sbpaixao
 */
public class EmpreendoVille {

    static int admClassica;
    static int admCientifica;

    public static void main(String[] args) {
        String[] opcao = new String[2];

        Scanner s = new Scanner(System.in);

        String resp = "";
        do {
            mostraDesenho();
            mostrarMenu();
            int opcaoMenu = s.nextInt();

            switch (opcaoMenu) {
                case 1:
                    mostrarHistoria();
                    opcao = criarPersonagem();

                    String nomePersonagem = opcao[0];
                    int tipoPersonagem = Integer.parseInt(opcao[1]);

                    switch (tipoPersonagem) {
                        case 1:
                            perguntasAnimais(nomePersonagem);
                            break;
                        case 2:
                            perguntasHumanos(nomePersonagem);
                            break;
                    }

                    break;

                case 2:
                    System.exit(0);
            }
            System.out.println("");
            System.out.println("===================================================================================================================================");
            System.out.println("");

            System.out.print("Deseja voltar ao menu inicial? (S) para SIM (N) para não: ");
            resp = s.next();

            System.out.println("\n\n\n1"
                    + "");

        } while (resp.toUpperCase().equals("S"));
    }

    private static void mostraDesenho() {

        System.out.println("        EMPREENDOVILLE        ");

        System.out.println(" _____________   _____________");
        System.out.println(" |  HUMANOS  |   |  ANIMAIS  |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" |    ╔╗    |   |    ╔╗    |");
        System.out.println(" |    ║║    |   |    ║║    |");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("");
        System.out.println("");

    }

    private static void mostrarMenu() {
        System.out.println("|===============================|");
        System.out.println("|         EMPREENDOVILLE        |");
        System.out.println("|===============================|");
        System.out.println("| 1 - Novo Jogo                 |");
        System.out.println("| 2 - Sair                      |");
        System.out.println("| ==============================|");
        System.out.println("");
        System.out.print("Informe a opção desejada: ");

    }

    private static void mostrarHistoria() {

        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("");
        System.out.println("Contexto:");
        System.out.println("");
        System.out.println("• A história se inicia quando os animais tomaram conta do mundo,\n"
                + "onde os animais evoluíram antes dos humanos. Os animais agora são\n"
                + "o dono do mundo com suas empresas, entretanto os humanos não queriam\n"
                + "ser tratados diferentes e inferiores e começaram a desenvolver suas\n"
                + "próprias tecnologias e conhecimentos, começando a guerra fria entre\n"
                + "animais e humanos. O jogo se passa no contexto da guerra fria entre\n"
                + "ambos, onde apenas um deles saira vencedor. Os animais fizeram um\n"
                + "contrato com os humanos, na qual iriam lhe dar uma empresa para recuperar,\n"
                + "se isso fosse feito, os humanos e os animais seriam iguais na terra de\n"
                + "EmpreendoVille, se não, os animais mandariam em EmpreendoVille e os humanos\n"
                + "voltariam a ser escravos dos animais. Para se vencer o jogo seu patrimonio tem\n"
                + "que ser igual ou maior que 6000.");
        System.out.println("");

        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        input.next();

        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
    }

    private static String[] criarPersonagem() {

        Scanner s = new Scanner(System.in);

        String[] opcao = new String[2];

        System.out.println("|================================|");
        System.out.println("|        Criar Personagem        |");
        System.out.println("|================================|");
        System.out.println("|                                |");
        System.out.println("|       Tipo Personagem          |");
        System.out.println("|                                |");
        System.out.println("|================================|");
        System.out.println("|1 - Animal                      |");
        System.out.println("|2 - Humano                      |");
        System.out.println("|================================|");
        System.out.println("|                                |");
        System.out.println("|       Nome Personagem          |");
        System.out.println("|                                |");
        System.out.println("|================================|");
        System.out.print("Informe seu nome: ");
        opcao[0] = s.nextLine();

        if (opcao[0].equals("Bettina")) {
            System.out.println("Olá você já possui 1 milhão e 42 mil de patrimônio acumulado e não precisa de empresas");
            System.out.println("VLW FLW KKKKKKKKKKKK");
            System.exit(0);
        }
        System.out.println("");
        System.out.print("Informe o tipo do personagem: ");
        opcao[1] = s.nextLine();

        return opcao;

    }

    private static void perguntasAnimais(String nomePersonagem) {
        int pontuacao;
        int patrimonio = 10000;

        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("Olá " + nomePersonagem + ", sou o gato Felix, seu  analista de desempenho dos funcionários,\n"
                + "meu objetivo é te ajudar a manter a produtividade da empresa.\n"
                + "No momento, no setor de T.I, temos um porco muito promissor que está se destacando entre os demais.\n"
                + "Porém, ele não está de acordo com seu salário e seu cargo na empresa, ele pede uma oportunidade de subir de cargo e um aumento.     \n"
                + "\n"
                + "Você está disposto a aceitar essa proposta:\n"
                + "\n"
                + "1)	Aceitar\n"
                + "2)	Recusar");

        System.out.print("R: ");
        int resposta = input.nextInt();
        System.out.println("");

        Random r = new Random();
        switch (resposta) {
            case 1:

                pontuacao = r.nextInt(700);

                admClassica++;
                patrimonio -= pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
            case 2:

                admCientifica++;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            default:
                System.out.println("Ao colocar uma alternativa errada você terá um prejuizo de 1000 reais");
                patrimonio -= 1000;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }

        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        input.next();
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
        System.out.println("Patrimonio: R$ " + patrimonio);
        System.out.println("");
        System.out.println("Olá " + nomePersonagem + ", sou Falcão do RA (Recursos Animais), pensando em melhorar a produtividade,\n "
                + "tivemos uma ideia no setor de RA de criar Cursos Profissionalizantes \n"
                + "para nossos funcionários se aperfeiçoarem em sua determinada área.\n"
                + "\n"
                + "Você está disposto a aceitar essa proposta:\n"
                + " \n"
                + "1) Aceitar (Perda de R$1.000, porém, aumento em produtividade)\n"
                + "2) Recusar (Perda de produtividade)");

        System.out.print("R: ");
        resposta = input.nextInt();
        System.out.println("");

        switch (resposta) {
            case 1:

                admClassica++;

                patrimonio = patrimonio - 1000;
                pontuacao = r.nextInt(2000);
                patrimonio += pontuacao;
                System.out.println("Sua produtividade rendeu: " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
            case 2:

                admCientifica++;

                pontuacao = r.nextInt(2000);
                patrimonio -= pontuacao;
                System.out.println("Sua produtividade caiu: " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);
                break;

            default:
                System.out.println("Ao colocar uma alternativa errada você terá um prejuizo de 1000 reais");

                patrimonio -= 1000;

                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }

        System.out.println("");

        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        input.next();
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("Patrimonio: R$ " + patrimonio);
        System.out.println("");

        System.out.println("Eae chefia, eu sou do setor de montagem e meu nome é Wanderson o cachorro,\n"
                + "to passando aqui só pra te dar uma ideia pra melhorar no processo de montagem lá sabe...\n"
                + "\n"
                + "Está disposto a ouvir a proposta de Wanderson?\n"
                + "\n"
                + "1) Sim\n"
                + "2) Não");

        System.out.print("R: ");
        resposta = input.nextInt();
        System.out.println("");

        switch (resposta) {

            case 2:
                admCientifica++;
                System.out.println("Patrimonio: R$ " + patrimonio);
                break;

            case 1:

                admClassica++;

                System.out.println("...as maquinas se posicionam em um lugar muito alto e "
                        + "\nisso faz a gente ficar com fadiga nos braços bem rápido e assim não conseguimos ter total desempenho."
                        + "\nO senhor poderia deixar as maquinas um pouco mais baixas?\n"
                        + "\n"
                        + "1)	Aceitar proposta de Wanderson \n"
                        + "2)	Recusar proposta de Wanderson ");
                System.out.print("R: ");
                resposta = input.nextInt();

                if (resposta == 1) {
                    pontuacao = r.nextInt(10000);
                    System.out.println("Sua produtividade rendeu: " + pontuacao);
                    patrimonio += pontuacao;
                    System.out.println("Patrimonio: R$ " + patrimonio);

                } else {
                    System.out.println("Tudo bem chefe obrigado pela atenção!");
                    System.out.println("Patrimonio: R$" + patrimonio);
                }
                break;
            default:
                System.out.println("Ao colocar uma alternativa errada você terá um prejuizo de 1000 reais");
                patrimonio -= 1000;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

        }
        System.out.println("");
        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        input.next();

        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");

        System.out.println("Patrimonio: R$ " + patrimonio);

        System.out.println("Percebemos que um de nossos funcionários está tendo problemas com pulgas e isso está influenciando no seu trabalho\n"
                + "\n"
                + "Como deseja lidar com a situação?\n"
                + "\n"
                + "1)	Demitir funcionário \n"
                + "2)	Encaminha-lo para um tratamento");

        System.out.print("R: ");
        resposta = input.nextInt();
        System.out.println("");

        switch (resposta) {
            case 1:
                admCientifica++;
                pontuacao = r.nextInt(2000);
                patrimonio += pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
            case 2:
                admClassica++;
                pontuacao = r.nextInt(2000);
                patrimonio -= pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);
                break;

            default:
                System.out.println("Ao colocar uma alternativa errada você terá um prejuizo de 1000 reais");
                patrimonio -= 1000;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }

        System.out.println("");
        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        input.next();

        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");

        System.out.println("Ola " + nomePersonagem + ", sou a Raposa Dora do departamento de contabilidade, percebemos que o senhor tem gastado muito com fornecedores, pensando nisso eu encontrei uma solução para o problema.\n"
                + " Tive a ideia de trocarmos os produtos naturais por produtos sucintos pois isso reduziria o custo de produção.\n"
                + "\n"
                + "Como deseja lidar com a situação?\n"
                + "\n"
                + "1)	 Começar a produtos sucintos.\n"
                + "2)	 Continuar gastando com fornecedores.");

        System.out.print("R: ");
        resposta = input.nextInt();
        System.out.println("");

        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");

        switch (resposta) {

            case 1:
                System.out.println("CHEFEEEEEEEE!!! Houve uma denúncia de nossos arqui-inimigos (Humanos) negligenciando a qualidade de nossos produtos e a vigilância sanitária iniciou o processo para investigação do nosso estoque amanhã de manhã.\n "
                        + "Sabemos que possuímos produtos sintéticos por isso levaremos uma punição severa. \n"
                        + "\n"
                        + "E agora como você vai sair dessa?\n"
                        + "\n"
                        + "1)	Queimar estoque (Prejuízo de 75% do lucro)\n"
                        + "2)	Receber a punição (Valor indefinido)\n"
                        + "3)	Vender o estoque (Possível prejuízo/ Possível lucro)");

                System.out.print("R: ");
                resposta = input.nextInt();
                System.out.println("");

                if (resposta == 1) {
                    patrimonio -= 75 * patrimonio / 100;
                    System.out.println("Patrimonio: R$ " + patrimonio);

                } else if (resposta == 2) {
                    patrimonio -= 2000000;

                } else if (resposta == 3) {

                    boolean decisao = r.nextBoolean();

                    decisao = r.nextBoolean();
                    if (decisao) {
                        patrimonio += r.nextInt(60000);

                    } else {
                        patrimonio = 0;
                    }

                }

            case 2:

                boolean decisao = r.nextBoolean();

                if (!decisao) {
                    patrimonio -= 5000;
                }
                break;

        }

        if (patrimonio >= 6000) {

            System.out.println("Parabens!!! Mesmo com o prejuízo do fornecedor você conseguiu manter a empresa viva.");
            System.out.println("Patrimonio:" + patrimonio);

            if (admCientifica > admClassica) {
                System.out.println("Sua característica é forte e sua tipo de administração está baseada na administração cientifica");

            } else {
                System.out.println("Sua característica é forte e sua tipo de administração está baseada na administração classica");
            }

        } else {

            System.out.println("Poxa vida!!! Infelizmente você não foi capaz de manter sua empresa viva.");
            System.out.println("Patrimonio: R$ " + patrimonio);

            if (admCientifica > admClassica) {
                System.out.println("Sua característica é forte e sua tipo de administração está baseada na administração cientifica");

            } else {
                System.out.println("Sua característica é forte e sua tipo de administração está baseada na administração classica");
            }
        }

    }

    private static void perguntasHumanos(String nomePersonagem) {
        int pontuacao;
        int patrimonio = 7000;

        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("Olá " + nomePersonagem + " sou Matheus, gerente de RH. O CEO Daniel está tendo problemas com depêndencias quimicas.\n "
                + "Por conta de um térmido de relacionamento. Por conta disso seu rendimento caiu desde então. Como deseja lidar com a situação?");
        System.out.println("");
        System.out.println("1) Conversar pessoalmente com o Daniel");
        System.out.println("2) Cobrar Daniel");
        System.out.print("R:");
        int resposta = input.nextInt();

        Random r = new Random();
        switch (resposta) {
            case 1:
                admClassica++;
                pontuacao = r.nextInt(1000);
                patrimonio += pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 2:
                admCientifica++;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }
        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        input.next();
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
        System.out.println("Patrimonio: R$ " + patrimonio);
        System.out.println("");

        System.out.println("");
        System.out.println("Olá" + nomePersonagem + " Sou Micaella do setor de finanças, o banco acabou de ligar e o senhor precisa"
                + "\n ir lá urgentemente resolver um problema!!! Entretanto tem uma operação menos importante ocorrendo em outro"
                + "\n setor e o senhor precisa resolver tambem"
                + "\n O que deseja fazer?");
        System.out.println("");
        System.out.println("1) Ir para o imprevisto do banco e deixar a finalização da outra operação nas mãos de um estagiario.");
        System.out.println("2) Escoler resolver a operação e adiar o imprevisto do banco.");
        System.out.print("R:");
        resposta = input.nextInt();

        switch (resposta) {
            case 1:
                admClassica++;
                pontuacao = r.nextInt(2000);
                patrimonio += pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 2:
                admCientifica++;
                pontuacao = r.nextInt(3000);
                pontuacao -= pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }
        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        input.next();
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
        System.out.println("Patrimonio: R$ " + patrimonio);
        System.out.println("");

        System.out.println("");
        System.out.println("Chefe, precisamos urgente de fazer melhoras no setor de produção, mas não temos boas ideais de como fazer isso.\n"
                + "Está na hora do senhor tomar a decisão final!");
        System.out.println("");
        System.out.println("1) Buscar metodos na internet testados e outras empresas");
        System.out.println("2) Perguntar aos fúncionarios do setor de produção");
        System.out.println("3) Ignorar essa decisão");
        System.out.print("R:");
        resposta = input.nextInt();

        switch (resposta) {

            case 1:
                admCientifica++;
                pontuacao = r.nextInt(3000);
                pontuacao -= pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 2:
                admClassica++;
                pontuacao = r.nextInt(3000);
                patrimonio += pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 3:
                admCientifica++;
                pontuacao = r.nextInt(4000);
                pontuacao -= pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }
        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        input.next();
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
        System.out.println("Patrimonio: R$ " + patrimonio);
        System.out.println("");

        System.out.println("");
        System.out.println("Chefe em nosso departamento de programação, os alunos estão indo muito bem.\n"
                + "E estão criando várias tecnologias que estão melhorando nosso lucro. O senhor deseja demonstrar\n"
                + "reconhecimento de alguma forma? ");
        System.out.println("");
        System.out.println("1) Não");
        System.out.println("2) Dar aumento e reconhecimento como forma de incentivo");
        System.out.println("3) Expor para os demais funcionários");
        System.out.print("R:");
        resposta = input.nextInt();

        switch (resposta) {

            case 1:
                admCientifica++;
                pontuacao = r.nextInt(2000);
                pontuacao -= pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 2:
                admClassica++;
                pontuacao = r.nextInt(1000);
                patrimonio += pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 3:
                admCientifica++;
                pontuacao = r.nextInt(1000);
                pontuacao -= pontuacao;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }
    }

}
