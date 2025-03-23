public class App {
    public static void main(String[] args) throws Exception {
          
        System.out.println("---------------------------------");

        Codificador cod = new CodificadorSimples();

        System.out.println(cod.toString());
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);
        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);

        System.out.println("---------------------------------");

        Codificador cod2 = new CodificadorMedio();

        System.out.println(cod2.toString());
        String texto2 = "Este e o string a ser codificado";
        String codificado2 = cod2.codifica(texto2);
        String decodificado2 = cod2.decodifica(codificado2);
        System.out.println("Texto original: "+texto2);
        System.out.println("Texto codificado: "+codificado2);
        System.out.println("Texto decodificado: "+decodificado2);

        System.out.println("---------------------------------");

        Codificador cod3 = new CodificadorAvancado();

        System.out.println(cod3.toString());
        String texto3 = "Este e o string a ser codificado";
        String codificado3 = cod3.codifica(texto3);
        String decodificado3 = cod3.decodifica(codificado3);
        System.out.println("Texto original: "+texto3);
        System.out.println("Texto codificado: "+codificado3);
        System.out.println("Texto decodificado: "+decodificado3);

        System.out.println("---------------------------------");

        CodificadorFactory factory = new CodificadorFactoryClass();
        Codificador cod4 = factory.getCodificador(1);

        System.out.println(cod4.toString());
        String texto4 = "Este e o string a ser codificado";
        String codificado4 = cod4.codifica(texto4);
        String decodificado4 = cod4.decodifica(codificado4);
        System.out.println("Texto original: "+texto4);
        System.out.println("Texto codificado: "+codificado4);
        System.out.println("Texto decodificado: "+decodificado4);

        System.out.println("---------------------------------");
    }
}
