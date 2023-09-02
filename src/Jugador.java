public class Jugador implements Personaje {
    @Override
    public void atacar() {
        System.out.println("El jugador ataca");
    }

    @Override
    public void recibirDanio(int cantidad) {
        System.out.println("El jugador recibe " + cantidad + " de daño");
    }
}
