package Projeto;
public class Main{
    public static void main(String[] args){
        //Objetos e atributos
        Funcionario funcionario1= new Funcionario("Julius", 1233123123, 1892922, "22/03/2022");
        Animal animal1 = new Animal("Patolino", "Pato", funcionario1, 12, 5);
        Cliente cliente1= new Cliente("Carlos", "981122765", 1322123122, animal1);

        Funcionario funcionario2= new Funcionario("Cleiton", 1735641123, 1000223, "21/04/2022");
        Animal animal2 = new Animal("Pernalonga", "Coelho", funcionario2, 15, 1);
        Cliente cliente2= new Cliente("Olivia", "990467895", 1423478513, animal2);
    
        Funcionario funcionario3= new Funcionario("Robisvaldo", 1235483123, 1441289, "20/05/2022");
        Animal animal3 = new Animal("Frajola", "Gato", funcionario3, 24, 3);
        Cliente cliente3= new Cliente("Arnold", "987654321", 1233219944, animal3);
    
        System.out.println("\n ---------------------------------------------------------------------------------------------------------------- ");
        pet_shop Bichinhos1 = new pet_shop();//Coleção criada
        
        //Registros
        Registro R1=new Registro();
        R1.cliente_atendido=cliente1;
        R1.funcionario_atendeu=funcionario1;

        Registro R2=new Registro();
        R2.cliente_atendido=cliente2;
        R2.funcionario_atendeu=funcionario2;

        Registro R3=new Registro();
        R3.cliente_atendido=cliente3;
        R3.funcionario_atendeu=funcionario3;

        //Adicionando os itens para a colecao Bichinhos1
        Bichinhos1.adicionar(animal1);
        Bichinhos1.adicionar(animal2);
        Bichinhos1.adicionar(animal3);

        //Mostrando os animais que estão no Pet shop
        Bichinhos1.Animais_Em_PetShop();

        //Removendo os itens da colecao Bichinhos1
        Bichinhos1.remover(animal3);
        System.out.println("\n");
        
        //Mostrando os animais que estão no Pet shop
        Bichinhos1.Animais_Em_PetShop();

        //Procurando os animais que estão no Pet shop
        Bichinhos1.procurar(animal2);

        //prints dos registros, no caso do cliente que solicitou atendimento ao seu pet e o funcionario que atendeu, além dos dados deles.
        System.out.println(" Registro 1: \n" + "\tCliente==> " + R1.cliente_atendido.getCliente_Nome() + "\t\tContato==> " + R1.cliente_atendido.getContato_Cliente() +"\tCPF==>"+ R1.cliente_atendido.getCpf_Cliente() + "\n\tNome do Animal ==> " + R1.cliente_atendido.getPet().getAnimal_Nome() + "\tEspecie ==> " + R1.cliente_atendido.getPet().getEspecie() + "\tID do pet==> " + R1.cliente_atendido.getPet().getID() + "\t\tIdade do pet==> " + R1.cliente_atendido.getPet().getIdade() + "\n\tAtendido por==> " + R1.funcionario_atendeu.getFuncionario_Nome() + "\t\tCarteira de Trabalho ==> " + R1.funcionario_atendeu.getCarteira_Trabalho() + "\t\tNa Data ==> "+ R1.funcionario_atendeu.getData_Atendimento() + "\n");
        System.out.println(" Registro 2: \n" + "\tCliente==> " + R2.cliente_atendido.getCliente_Nome() + "\t\tContato==> " + R2.cliente_atendido.getContato_Cliente() +"\tCPF==>"+ R2.cliente_atendido.getCpf_Cliente() + "\n\tNome do Animal ==> " + R2.cliente_atendido.getPet().getAnimal_Nome() + "\tEspecie ==> " + R2.cliente_atendido.getPet().getEspecie() + "\tID do pet==> " + R2.cliente_atendido.getPet().getID() + "\t\tIdade do pet==> " + R2.cliente_atendido.getPet().getIdade() + "\n\tAtendido por==> " + R2.funcionario_atendeu.getFuncionario_Nome() + "\t\tCarteira de Trabalho ==> " + R2.funcionario_atendeu.getCarteira_Trabalho() + "\t\tNa Data ==> "+ R2.funcionario_atendeu.getData_Atendimento() + "\n");
        System.out.println(" Registro 3: \n" + "\tCliente==> " + R3.cliente_atendido.getCliente_Nome() + "\t\tContato==> " + R3.cliente_atendido.getContato_Cliente() +"\tCPF==>"+ R3.cliente_atendido.getCpf_Cliente() + "\n\tNome do Animal ==> " + R3.cliente_atendido.getPet().getAnimal_Nome() + "\tEspecie ==> " + R3.cliente_atendido.getPet().getEspecie() + "\tID do pet==> " + R3.cliente_atendido.getPet().getID() + "\t\tIdade do pet==> " + R3.cliente_atendido.getPet().getIdade() + "\n\tAtendido por==> " + R3.funcionario_atendeu.getFuncionario_Nome() + "\tCarteira de Trabalho ==> " + R3.funcionario_atendeu.getCarteira_Trabalho() + "\t\tNa Data ==> "+ R3.funcionario_atendeu.getData_Atendimento() + "\n");

        System.out.println("\n ---------------------------------------------------------------------------------------------------------------- ");
    }
}