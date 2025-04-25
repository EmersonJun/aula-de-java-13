package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.AnimalController;
import factory.AnimalFactory;
import model.Animal;

public class AnimalView {
        public static void main(String[] args, Scanner in) {
        AnimalController controller = new AnimalController(new ArrayList<Animal>());

        AnimalFactory.criarCachorro("pluto", "grande", 12)
            .ifPresentOrElse(controller::adicionarAnimal, () -> System.out.println("erro ao adicionar cachorro")
            );

        AnimalFactory.criarGato("Salem", "medio", 3)
        .ifPresentOrElse(controller::adicionarAnimal, () -> System.out.println("erro ao adicionar cachorro")
        );

        System.out.println("animais correndo");
        controller.cachorroCorrendoVelozes(50).forEach(System.out::println);
        controller.cachorroCorrendo(50).forEach(System.out::println);
    }

}
