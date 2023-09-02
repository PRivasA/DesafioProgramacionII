public class EnemigoNormal implements Enemigo {
    @Override
    public void atacar() {
        System.out.println("El enemigo normal ataca a los jugadores");
    }

    @Override
    public void recibirDanio(int cantidad) {
        System.out.println("El enemigo normal recibe " + cantidad + " de daño si lo atacan los jugadores");
    }
}
