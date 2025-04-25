package factory;

import java.util.List;
import java.util.Optional;

import model.Cachorro;
import model.Gato;

public abstract class AnimalFactory {
    private static final List<String> PORTES_VALIDOS = List.of("pequeno", "medio", "grande");
    
    public static Optional<Cachorro> criarCachorro(String nome, String porte, int idade){
        if (nome.isBlank() || nome == null )return Optional.empty();
        if (!PORTES_VALIDOS.contains(porte))return Optional.empty(); 
        if (idade < 1)return Optional.empty() ;

            return Optional.of(new Cachorro(nome, porte, idade));
    }


    public static Optional<Gato> criarGato(String nome, String porte, int idade){
        if (nome.isBlank() || nome == null )return Optional.empty();
        if (!PORTES_VALIDOS.contains(porte))return Optional.empty(); 

            return Optional.of(new Gato(nome, porte));
    }
}
