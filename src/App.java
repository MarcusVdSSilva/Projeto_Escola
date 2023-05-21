import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        //Importações Globais
        Scanner ss = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        ArrayList<Aluno> turma = new ArrayList();
        ArrayList<Professor> professores = new ArrayList();

        //Variaveis Global
        String nome="", endereco="", telefone="", cpf="", curso="", matricula="", departamento="", nomeCurso="", opcao2fExcluir="";
        int menu=0,cont=0,opcaoRemove=0;
        double salario=0;

        //Laço de Repetição
        do{

            //MENU
            System.out.println("===========MENU=============");
            System.out.println("1- Cadastrar Aluno");
            System.out.println("2- Cadastrar Professor");
            System.out.println("3- Ver lista de Professores");
            System.out.println("4- Ver lista de Alunos");
            System.out.println("5- Editar Aluno/Professor");
            System.out.println("6- Remover Aluno/Professor");
            System.out.println("0- Sair");
            System.out.println("==============================");
            menu = sn.nextInt();
            
            //MENU OPÇÔES
            switch(menu){
                case 1:
                //Cadastro de Aluno
                System.out.println("Qual seu nome:");
                nome = ss.nextLine();
                System.out.println("Qual seu Endereço:");
                endereco = ss.nextLine();
                System.out.println("Qual seu Telefone:");
                telefone = ss.nextLine();
                System.out.println("Qual seu CPF:");
                cpf = ss.nextLine();
                System.out.println("Qual seu Curso:");
                curso = ss.nextLine();
                System.out.println("Qual seu Matricula:");
                matricula = ss.nextLine();

                Aluno aluno = new Aluno(nome, endereco, telefone, cpf, curso, matricula);
                turma.add(aluno);
                break;

                case 2:
                //Cadastro de Professores
                System.out.println("Qual seu nome:");
                nome = ss.nextLine();
                System.out.println("Qual seu Endereço:");
                endereco = ss.nextLine();
                System.out.println("Qual seu Telefone:");
                telefone = ss.nextLine();
                System.out.println("Qual seu CPF:");
                cpf = ss.nextLine();
                System.out.println("Qual seu departamento:");
                departamento = ss.nextLine();
                System.out.println("Qual o nome do Curso:");
                nomeCurso = ss.nextLine();
                System.out.println("Qual o seu salario:");
                salario = sn.nextDouble();

                Professor prof = new Professor(nome, endereco, telefone, cpf, departamento, nomeCurso, salario);
                professores.add(prof);
                break;

                case 3: 
                // se não tiver cadastrado nenhum exiba uma msg.
                if(professores.isEmpty()){ 
                    System.out.println("Nenhum Professor cadastrado!");
                }else{
                    //Mostra dados puxando metodo da classe professores.
                 for(Professor t: professores){t.mostrarDados();}
                }
                break;

                case 4:
                // se não tiver cadastrado nenhum exiba uma msg.
                if(turma.isEmpty()){
                    System.out.println("Nenhum Aluno cadastrado");
                }else{
                    //Mostra dados puxando metodo da classe Aluno.
                    for(Aluno t: turma){t.mostrarDados();}
                }
                break;

                case 5:
                //Ainda em desenvolvimento.
                System.out.println("EM Desenvolvimento, Ainda não está funcional.");
                break;

                case 6:
                //uma escolha simples de opcões numerica.
                System.out.println("========Excluir========");
                System.out.println("1- Aluno");
                System.out.println("2- Professor");
                opcaoRemove=sn.nextInt();
                switch(opcaoRemove){
                case 1:
                    //Pergunta de nome para conferir se exite na lista.
                    System.out.println("Vamos Remover um aluno, Digite o nome de quem deseja excluir:");
                    nome = ss.nextLine();

                    // se não tiver cadastrado nenhum exiba uma msg.
                    if(turma.isEmpty()){
                        System.out.println("Nenhum Aluno cadastrado");
                    }else{
                        //Confere cada nome em cada indice do arrey
                        for(Aluno t: turma){
                            if(nome.equals(t.getNome())){
                                // Segunda confimação para poder excluir com segurança.
                                System.out.println("Tem certeza que deseja excluir o " + nome + "\ndigite: [y]Sim   [n]não");
                                opcao2fExcluir = ss.nextLine();

                                //confirmação positiva para excluir.
                                if(opcao2fExcluir.equals("y")){
                                    turma.remove(t);
                                    System.out.println("Excluido com sucesso.");
                                    //confirmação negativa para excluir.
                                }else if(opcao2fExcluir.equals("n")){System.out.println("Cadastro está seguro, não foi excluido.");}
                            }
                        }
                    }
                break;
                case 2:
                    //Pergunta de nome para conferir se exite na lista.
                    System.out.println("Vamos Remover um Professor, Digite o nome de quem deseja excluir:");
                    nome = ss.nextLine();

                    // se não tiver cadastrado nenhum exiba uma msg.
                    if(professores.isEmpty()){
                        System.out.println("Nenhum Aluno cadastrado");
                    }else{
                        //Confere cada nome em cada indice do arrey
                        for(Professor t: professores){
                            // Segunda confimação para poder excluir com segurança.
                            if(nome.equals(t.getNome())){
                                System.out.println("Tem certeza que deseja excluir o " + nome + "\ndigite: [y]Sim   [n]não");
                                opcao2fExcluir = ss.nextLine();

                                //confirmação positiva para excluir.
                                if(opcao2fExcluir.equals("y")){
                                    professores.remove(t);
                                    System.out.println("Excluido com sucesso.");
                                    //confirmação negativa para excluir.
                                }else if(opcao2fExcluir.equals("n")){System.out.println("Cadastro está seguro, não foi excluido.");}
                            }
                        }
                    }
                break;
                }
                break;

                //opcão 0 para finalizar o sistema.
                case 0: cont = 2;
                break;
            }
        }while(cont<2);



        
    }
}
