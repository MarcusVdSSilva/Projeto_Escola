public class Professor extends Pessoa{
    //Atributos
    private String departamento = "", nomeCurso = "";
    private double salario = 0;

    //Construtor
    public Professor(String nome,String endereco, String telefone, String cpf, String departamento, String nomeCurso, double salario){
        super(nome, endereco, telefone, cpf);
        this.departamento = departamento;
        this.nomeCurso = nomeCurso;
        this.salario = salario;
    }

    //Getters and Setters
    public void setDepartamento(String departamento){this.departamento = departamento;}
    public String getDeparamento(){return departamento;}

    public void setNomeCurso(String nomeCurso){this.nomeCurso = nomeCurso;}
    public String getNomeCurso(){return nomeCurso;}

    public void setSalario(double salario){this.salario = salario;}
    public Double getSalario(){return salario;}

    @Override
    public void mostrarDados(){
        System.out.println("Nome:" + this.getNome());
        System.out.println("Endereço:" + this.getEndereco());
        System.out.println("Telefone:" + this.getTelefone());
        System.out.println("CPF:" + this.getCpf());
        System.out.println("Departamento:" + this.getDeparamento());
        System.out.println("Nome do Curso:" + this.getNomeCurso());
        System.out.println("Salário:" + this.getSalario());
        System.out.println("__________________________________");
    }
}
