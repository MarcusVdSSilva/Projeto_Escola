public class Pessoa {
    //Atributos
    private String nome, endereco, telefone, cpf;

    //Construtor
    public Pessoa (String nome,String endereco, String telefone, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    //Getters and Setters
    public void setNome(String nome){this.nome = nome;}
    public String getNome(){return nome;}

    public void setEndereco(String endereco){this.endereco = endereco;}
    public String getEndereco(){return endereco;}

    public void setTelefone(String telefone){this.telefone = telefone;}
    public String getTelefone(){return telefone;}

    public void setCpf(String cpf){this.cpf = cpf;}
    public String getCpf(){return cpf;}

    //Metodo de mostrar Dados.
    public void mostrarDados(){
        System.out.println("Nome:" + this.getNome());
        System.out.println("Endereço:" + this.getEndereco());
        System.out.println("Telefone:" + this.getTelefone());
        System.out.println("CPF:" + this.getCpf());
    }
}
