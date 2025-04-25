package model;

public class Gato extends Animal{

    public Gato(String nome, String porte) {
        super(nome, porte);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String correr() {
        return "gato correndo";
    }

    @Override
    public String emitirSom() {
        return "gato emitindo som";
    }
    
}
