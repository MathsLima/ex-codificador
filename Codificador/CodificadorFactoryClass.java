public class CodificadorFactoryClass implements CodificadorFactory {
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
