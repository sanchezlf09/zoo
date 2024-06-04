public class Leon extends AnimalBase {
    public Leon(String nombre, String comida) {
        super(nombre, comida);
    }

    @Override
    public void hacerRuido() {
        System.out.println(nombre + " está rugiendo ferozmente.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " está corriendo muy veloz.");
    }
}

