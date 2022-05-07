package Projeto;
import java.util.ArrayList;

public class pet_shop implements CrudAnimal {// implements CrudAnimal
	ArrayList<Animal> PetShop = new ArrayList<Animal>();

    public void Animais_Em_PetShop() {
        System.out.println(" Animais que estão no PetShop:\n");
        if (PetShop.size() == 0){//Se o tamanho de PetShop, ou seja, a quantidade de itens dentro de PetShop for igual a zero.
            System.out.println(" Nenhum no momento :( .");
        }else{
            for (int i = 0; i < PetShop.size(); i++) {
			    System.out.println("\t==> " + PetShop.get(i).getAnimal_Nome());
                }
		    System.out.println("\n");
	    }
    }

    //Metodos para adicionar, remover e procurar itens na colecao PetShop
    @Override
    public void adicionar(Animal x) {
		PetShop.add(x);
	}

    @Override
	public void remover(Animal y) {
        if (PetShop.size() == 0) {
            System.out.println("\n Pet Shop está vazio, não tem como remover");
        } else {
            int pegar_ind = PetShop.indexOf(y);//retorna o primeiro indice em que o elemento pode ser encontrado no array, se não encontrar nada ele retorna -1.
            System.out.println("\n O indice " + Integer.toString(pegar_ind) + " será retirado da colecao Pet Shop");
            PetShop.remove(y);
        }

	}

    @Override
	public void procurar(Animal z) {
		int busca = PetShop.indexOf(z);
        System.out.println("Pet Chamado ==> " + PetShop.get(busca).getAnimal_Nome() + ", foi encontrado no indice " + Integer.toString(busca) + " na coleção Pet Shop.\n");
	}
}