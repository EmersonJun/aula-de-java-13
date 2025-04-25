package controller;

import java.util.List;

import model.Animal;
import model.Cachorro;
import model.Gato;

public class AnimalController {
    private List<Animal> animais;

    public AnimalController(List<Animal> animais) {
        this.animais = animais;
    }

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public List<String> listarSons(){
        return animais.parallelStream()
            .map(a -> a.getNome() + " tipo " + a.emitirSom())
            .toList();
    }
    public List<String> listarCorrer(){
        return animais.parallelStream()
            .map(a -> a.getNome() + " tipo " + a.correr())
            .toList();
    }
    public List<String> cachorroCorrendo(){
        return animais.parallelStream()
            .filter(a -> a instanceof Cachorro)
            .map(a -> a.getNome() + " tipo " + a.correr())
            .toList();
    }
    public List<String> cachorroCorrendoVelozes(int velocidade){
        return animais.parallelStream()
            .filter(a -> a instanceof Cachorro)
            .map(a -> {
                Cachorro c = (Cachorro) a;
                return c.getNome() + " tipo " + c.correr(velocidade);
            })
            .toList();
    }

    public List<String> gatoCorrendo(){
        return animais.parallelStream()
            .filter(a -> a instanceof Gato)
            .map(a -> a.getNome() + " tipo " + a.correr())
            .toList();
    }

    private List<Cachorro> listaCachorros(){
        return animais.stream()
            .filter(a -> a instanceof Cachorro)
            .map(c -> (Cachorro) c)
            .toList();
    }
    private List<Gato> listaGatos(){
        return animais.stream()
            .filter(a -> a instanceof Gato)
            .map(g -> (Gato) g)
            .toList();
    }
}
