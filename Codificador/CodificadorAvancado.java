import java.time.LocalDate;

public class CodificadorAvancado implements Codificador {

    public String getNome() {
        return "Codificador Avançado";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 13);
    }

    public int getNivelSeguranca(){
        return 3;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();
        int deslocamentoInicial = 3; 

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
        
            if (Character.isLetter(c)) {
                char inicioAlfabeto = Character.isLowerCase(c) ? 'a' : 'A';
                int novoIndice = (c - inicioAlfabeto + deslocamentoInicial) % 26; 
                encoded.append((char) (inicioAlfabeto + novoIndice));
                deslocamentoInicial++; 
            } else {
                encoded.append(c); 
            }
        }
    
        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder decoded = new StringBuilder();
        int shift = 3; 

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetter(c)) {
                char inicioAlfabeto = Character.isLowerCase(c) ? 'a' : 'A';
                int novoIndice = (c - inicioAlfabeto - shift + 26) % 26; 
                decoded.append((char) (inicioAlfabeto + novoIndice));
                shift++; 
            } else {
                decoded.append(c); 
            }
        }

        return decoded.toString();
    }

    @Override
    public String toString() {
        return  "Nome: " + getNome() + 
                ", Versão: " + getDataCriacao() + 
                ", Nível de segurança: " + getNivelSeguranca() + ".";
    }

    

}
