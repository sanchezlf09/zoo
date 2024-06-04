public class Elefante extends AnimalBase {
    public Elefante(String nombre, String comida) {
        super(nombre, comida);
    }

    @Override
    public void hacerRuido() {
        System.out.println(nombre + " está barritando.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " está caminando lentamente.");
    }
}

