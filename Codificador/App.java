public class App {
    public static void main(String[] args) throws Exception {
          
        System.out.println("---------------------------------");

        Codificador cod = new CodificadorSimples();

        System.out.println("Codificador: "+cod.getNome());
        System.out.println("Versao: "+cod.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
        
        String texto = "Este e o string a ser codificado";
        String codificado = cod.codifica(texto);
        String decodificado = cod.decodifica(codificado);

        System.out.println("Texto original: "+texto);
        System.out.println("Texto codificado: "+codificado);
        System.out.println("Texto decodificado: "+decodificado);

        System.out.println("---------------------------------");

        Codificador cod2 = new CodificadorMedio();

        System.out.println("Codificador: "+cod2.getNome());
        System.out.println("Versao: "+cod2.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod2.getNivelSeguranca());

        String texto2 = "Este e o string a ser codificado";
        String codificado2 = cod2.codifica(texto2);
        String decodificado2 = cod2.decodifica(codificado2);

        System.out.println("Texto original: "+texto2);
        System.out.println("Texto codificado: "+codificado2);
        System.out.println("Texto decodificado: "+decodificado2);

        System.out.println("---------------------------------");

        Codificador cod3 = new CodificadorAvancado();

        System.out.println("Codificador: "+cod3.getNome());
        System.out.println("Versao: "+cod3.getDataCriacao());
        System.out.println("Nivel de segurança: "+cod3.getNivelSeguranca());

        String texto3 = "Este e o string a ser codificado";
        String codificado3 = cod3.codifica(texto3);
        String decodificado3 = cod3.decodifica(codificado3);

        System.out.println("Texto original: "+texto3);
        System.out.println("Texto codificado: "+codificado3);
        System.out.println("Texto decodificado: "+decodificado3);

        System.out.println("---------------------------------");
    }
}
