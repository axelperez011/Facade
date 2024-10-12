// Subsistema que maneja los gráficos del juego
class SistemaGraficos {
    public void cargarGraficos() {
        System.out.println("Cargando graficos...");
    }

    public void renderizarPantallaPrincipal() {
        System.out.println("Renderizando la pantalla principal...");
    }
}

// Subsistema que maneja el sonido del juego
class SistemaSonido {
    public void inicializarSonido() {
        System.out.println("Inicializando el sistema de sonido...");
    }

    public void reproducirMusicaDeFondo() {
        System.out.println("Reproduciendo musica de fondo...");
    }
}

// Subsistema que maneja la inteligencia artificial del juego
class SistemaInteligenciaArtificial {
    public void inicializarIA() {
        System.out.println("Inicializando la IA del juego...");
    }

    public void activarEnemigos() {
        System.out.println("Activando enemigos...");
    }
}

// Clase Facade que proporciona una interfaz simplificada para iniciar el juego
class JuegoFacade {
    private final SistemaGraficos graficos;
    private SistemaSonido sonido;
    private final SistemaInteligenciaArtificial ia;

    public JuegoFacade() {
        this.graficos = new SistemaGraficos();
        this.sonido = new SistemaSonido();
        this.ia = new SistemaInteligenciaArtificial();
    }

    // Método para iniciar el juego, que coordina los subsistemas
    public void iniciarJuego() {
        System.out.println("Iniciando el juego...");
        graficos.cargarGraficos();
        graficos.renderizarPantallaPrincipal();
        sonido.inicializarSonido();
        sonido.reproducirMusicaDeFondo();
        ia.inicializarIA();
        ia.activarEnemigos();
        System.out.println("El juego ha comenzado.");
    }
}

// Clase principal para probar el patrón Facade
public class Main {
    public static void main(String[] args) {
        // Utilizamos la fachada para simplificar el inicio del juego
        JuegoFacade juego = new JuegoFacade();
        juego.iniciarJuego();
    }
}
