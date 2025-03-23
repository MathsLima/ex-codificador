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
    
                char novoCaractere = (char) (fimAlfabeto - (c - inicioAlfabeto));
                encoded.append(novoCaractere);
            } else {
                encoded.append(c); 
            }
        }
        return encoded.toString();
    }

    public String decodifica(String str) {
        return codifica(str); 
    }

    @Override
    public String toString() {
        return  "Nome: " + getNome() + 
                ", Versão: " + getDataCriacao() + 
                ", Nível de segurança: " + getNivelSeguranca() + ".";
    }

}
