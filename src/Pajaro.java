public class Pajaro extends AnimalBase {
    public Pajaro(String nombre, String comida) {
        super(nombre, comida);
    }

    @Override
    public void hacerRuido() {
        System.out.println(nombre + " está cantando y silvando.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " está volando muy lejos.");
    }
}
