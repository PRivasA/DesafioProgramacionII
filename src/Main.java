public class Main {
        public static void main(String[] args) {
            FabricaPersonajes fabricaGuerrero = new FabricaGuerrero();
            Personaje jugadorGuerrero = fabricaGuerrero.crearPersonaje();
            jugadorGuerrero.recibirDanio(10);

            FabricaPersonajes fabricaMago = new FabricaMago();
            Personaje jugadorMago = fabricaMago.crearPersonaje();
            jugadorMago.recibirDanio(5);

            FabricaEnemigos fabricaEnemigo = new FabricaEnemigoNormal();
            Enemigo enemigo = fabricaEnemigo.crearEnemigo();
            jugadorGuerrero.atacar();
            jugadorMago.atacar();
            enemigo.recibirDanio(10);
        }
    }