public abstract class AnimalBase implements Animal {
    protected String nombre;
    protected String comida;

    public AnimalBase(String nombre, String comida) {
        this.nombre = nombre;
        this.comida = comida;
    }

    @Override
    public void hacerRuido() {
        System.out.println(nombre + " está haciendo ruido.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se está moviendo.");
    }

    @Override
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Comida: " + comida;
    }
}
