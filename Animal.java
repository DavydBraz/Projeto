package Projeto;

//definindo a classe animal
public class Animal{
    private String nome_animal;
    private String especie;
    private Funcionario funcionario_atendeu;
    private int id; 
    public int idade;
  
    //construtor completo
    public Animal(String nome_animal, String especie, Funcionario funcionario_atendeu, int id, int idade){
        this.nome_animal=nome_animal;
        this.especie=especie;
        this.funcionario_atendeu=funcionario_atendeu;
        this.id=id;
        this.idade=idade;
    }

    //gets e sets
    public void setAnimal_Nome(String nome_animal){
        this.nome_animal=nome_animal;
    }
    public String getAnimal_Nome(){
        return nome_animal;
    }

    public void setEspecie(String especie){
        this.especie=especie;
    }
    public String getEspecie(){
        return especie;
    }

    public void setFuncionario_atendeu(Funcionario funcionario_atendeu){
        this.funcionario_atendeu=funcionario_atendeu;
    }
    public Funcionario getFuncionario_atendeu(){
        return funcionario_atendeu;
    }

    public void setID(int id){
        this.id=id;
    }
    public int getID(){
        return id;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }
    public int getIdade(){
        return idade;
    }
}