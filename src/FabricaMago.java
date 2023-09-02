public class FabricaMago extends FabricaPersonajes {
    @Override
    public Personaje crearPersonaje() {
        return new JugadorMago();
    }

    private class JugadorMago implements Personaje {
        @Override
        public void atacar() {
            System.out.println("El jugador Mago ataca al enemigo Normal");
        }

        @Override
        public void recibirDanio(int cantidad) {
            System.out.println("El jugador Mago recibe daño si lo ataca el enemigo Normal");
        }
    }
}
