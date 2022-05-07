package Projeto;

//definindo a classe Funcionario
public class Funcionario{
    private String nome_funcionario;
    private int cpf_funcionario;
    private int carteira_trabalho; 
    public String data_atendimento;

    //construtor completo
    public Funcionario(String nome_funcionario, int cpf_funcionario, int carteira_trabalho, String data_atendimento){
        this.nome_funcionario=nome_funcionario;
        this.cpf_funcionario=cpf_funcionario;
        this.carteira_trabalho=carteira_trabalho;
        this.data_atendimento=data_atendimento;
    }

    //gets e sets
    public void setFuncionario_Nome(String nome_funcionario){
        this.nome_funcionario=nome_funcionario;
    }
    public String getFuncionario_Nome(){
        return nome_funcionario;
    }

    public void setCpf_Funcionario(int cpf_funcionario){
        this.cpf_funcionario=cpf_funcionario;
    }
    public int getCpf_Funcionario(){
        return cpf_funcionario;
    }

    public void setCarteira_Trabalho(int carteira_trabalho){
        this.carteira_trabalho=carteira_trabalho;
    }
    public int getCarteira_Trabalho(){
        return carteira_trabalho;
    }
    
    public void setData_Atendimento(String data_atendimento){
        this.data_atendimento=data_atendimento;
    }
    public String getData_Atendimento(){
        return data_atendimento;
    }
}