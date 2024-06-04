import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animales;

    public Zoologico() {
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        System.out.println("Animal agregado: " + animal.obtenerInformacion());
    }

    public void mostrarAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal.obtenerInformacion());
        }
    }

    public void realizarAcciones() {
        for (Animal animal : animales) {
            animal.hacerRuido();
            animal.moverse();
        }
    }
}

