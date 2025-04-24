package model;

public class Cachorro extends Animal{
    private int idade;

    public Cachorro(String nome, String porte, int idade) {
        super(nome, porte);
        this.idade = idade;
    }

    @Override
    public String emitirSom(){
        return "cachorro emitindo som";
    }

    public String emitirSom(String som){
        return "cachorro emitindo som" + som;
    }

    @Override
    public String correr() {
        return "cachorro correndo";
    }

    public String correr(int velocidade) {
        return "cachorro correndo a: " + velocidade + "km/h";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cachorro [idade=" + idade + ", Nome()=" + getNome() + ", Porte()=" + getPorte() + "]";
    }

}
