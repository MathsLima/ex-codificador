public class CodificadorFactoryClass implements CodificadorFactory {

    private static CodificadorFactoryClass instance;

    private CodificadorFactoryClass() {
    }

    public static CodificadorFactoryClass getInstance() {
        if (instance == null) {
            instance = new CodificadorFactoryClass();
        }
        return instance;
    }

    @Override
    public Codificador getCodificador(int nivelSeguranca) {
        if (nivelSeguranca <= 1) {
            return new CodificadorSimples();
        } else if (nivelSeguranca == 2) {
            return new CodificadorMedio();
        } else {
            return new CodificadorAvancado();
        }
    }
}
