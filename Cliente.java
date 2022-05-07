package Projeto;

//definindo a classe Cliente
public class Cliente{
    private String nome_cliente;
    private String contato_cliente;
    private int cpf_cliente;
    private Animal pet; 
    
    //Construtor completo
    public Cliente(String nome_cliente, String contato_cliente, int cpf_cliente, Animal pet){
        this.nome_cliente=nome_cliente;
        this.contato_cliente=contato_cliente;
        this.cpf_cliente=cpf_cliente;
        this.pet=pet;
    }

    //gets e sets
    public void setCliente_Nome(String nome_cliente){
        this.nome_cliente=nome_cliente;
    }
    public String getCliente_Nome(){
        return nome_cliente;
    }

    public void setContato_Cliente(String contato_cliente){
        this.contato_cliente=contato_cliente;
    }
    public String getContato_Cliente(){
        return contato_cliente;
    }

    public void setCpf_Cliente(int cpf_cliente){
        this.cpf_cliente=cpf_cliente;
    }
    public int getCpf_Cliente(){
        return cpf_cliente;
    }

    public void setPet(Animal pet){
        this.pet=pet;
    }
    public Animal getPet(){
        return pet;
    }
}