public class Aluno extends Pessoa {
    //Atributos
    private String curso, matricula;

    //Construtor
    public Aluno(String nome,String endereco, String telefone, String cpf, String curso, String matricula){
        super(nome, endereco, telefone, cpf);
        this.curso = curso;
        this.matricula = matricula;
    }

    
    //Getters and Setters
    public void setCurso(String curso){this.curso = curso;}
    public String getCurso(){return curso;}

    public void setMatricula(String matricula){this.matricula = matricula;}
    public String getMatricula(){return matricula;}

    
    
    @Override
    public void mostrarDados(){
        System.out.println("=============ALUNO=============");
        System.out.println("Nome:" + this.getNome());
        System.out.println("Endereço:" + this.getEndereco());
        System.out.println("Telefone:" + this.getTelefone());
        System.out.println("CPF:" + this.getCpf());
        System.out.println("Matricula:" + this.getMatricula());
        System.out.println("Nome do Curso:" + this.getCurso());
        System.out.println("===============================");
    }
}
