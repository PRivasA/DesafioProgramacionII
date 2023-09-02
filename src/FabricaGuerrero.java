public class FabricaGuerrero extends FabricaPersonajes {
    @Override
    public Personaje crearPersonaje() {
        return new JugadorGuerrero();
    }

    private class JugadorGuerrero implements Personaje {
        @Override
        public void atacar() {
            System.out.println("El jugador Guerrero ataca al enemigo Normal");
        }

        @Override
        public void recibirDanio(int cantidad) {
            System.out.println("El jugador Guerrero recibe daño si lo ataca el enemigo Normal");
        }
    }
}

