package m03_abstracao_e_encapsulamento;

public class Petshop {
    public static void main(String[] args) {
        Petshop pet = new Petshop();
        pet.abastecerAgua();
        pet.abastecerAgua();
        pet.abastecerAgua();
        pet.abastecerAgua();
        pet.abastecerShampoo();
        pet.entrarMaquina();
        pet.darBanho();
    }
    private boolean petEstaLimpo = false, temPet
            = false, maquinaLimpa = true;
    private int quantidadeAgua, quantidadeShampoo;



    //Dar banho no pet
    public void darBanho(){
        if (!temPet) System.out.println("Coloque um pet para dar banho");
        else if (quantidadeAgua < 10 || quantidadeShampoo < 2){
            System.out.println("É necessário ter 10 litros de água e 2 litros de shampoo para dar banho no pet.");
            System.out.printf("Quantidade atual\n Água %d%n Shampoo: %d%n Favor abastecer.",quantidadeAgua,quantidadeShampoo);
        }
        else {
            int resultado = (int)(Math.random() * 2);
            this.maquinaLimpa = false;
            if (resultado == 0){
                System.out.println("Pet ainda está sujo");
                this.petEstaLimpo = false;
            }
            else{
                System.out.println("Pet está limpo");
                this.petEstaLimpo = true;
            }
            this.maquinaLimpa = false;
        }
    }
    //   Abastecer com água;
    public void abastecerAgua(){
        if (quantidadeAgua == 30) System.out.println("Máquina com a capacidade de água máxima.");
        else{quantidadeAgua += 2; System.out.println("2 litros de água abastecidos. Quantidade atual: "+ quantidadeAgua);
        }}


    //Abastecer com shampoo;
    public void abastecerShampoo(){
        if (quantidadeShampoo == 10) System.out.println("Máquina com a capacidade de shampoo máxima.");
        else { quantidadeShampoo += 2; System.out.println("2 litros de shampoo abastecidos. Quantidade atual: "+ quantidadeShampoo);
        }}

    //verificar nivel de água;
    public int verificaNivelAgua(){
        return quantidadeAgua;
    }


    //verificar nivel de shampoo;
    public int verificaNivelShampoo(){
        return quantidadeShampoo;
    }
    //verificar se tem pet no banho;
    public boolean temPetNoBanho(){
        return temPet;
    }

    //colocar pet na maquina;
    public void entrarMaquina(){
        if (!maquinaLimpa){
            System.out.println("Limpe a máquina antes de colocar um pet.");
        }
        else if (!temPet){
            temPet = true;
            System.out.println("Colocando o pet na máquina");
        }
        else {
            System.out.println("Há um pet no banho. Favor aguardar");
        }
    }


    //retirar pet da máquina;
    public void retirarMaquina(){
        temPet = false;
        System.out.println("Retirando o pet da máquina");
    }

    //limpar maquina..
    public void limparMaquina(){

    }
}
