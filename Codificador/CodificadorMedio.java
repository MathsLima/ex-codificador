import java.time.LocalDate;

public class CodificadorMedio implements Codificador {

    public String getNome() {
        return "Codificador Médio";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public int getNivelSeguranca(){
        return 2;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { // Verifica se é uma letra
                char inicioAlfabeto = Character.isLowerCase(c) ? 'a' : 'A';
                char fimAlfabeto = Character.isLowerCase(c) ? 'z' : 'Z';
    
                // Inverte a posição no alfabeto
                char novoCaractere = (char) (fimAlfabeto - (c - inicioAlfabeto));
                encoded.append(novoCaractere);
            } else {
                encoded.append(c); // Mantém caracteres não alfabéticos inalterados
            }
        }
        return encoded.toString();
    }

    public String decodifica(String str) {
        return codifica(str); // A codificação é simétrica
    }

}
