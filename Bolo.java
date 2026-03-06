package bolo;

public class Bolo {

    // Variáveis de instância
    private String sabor;
    private int tamanho;
    private boolean cobertura;

    // metado pedacos

    public void pedacosfrutas(){
    System.out.println("tipo de fruta escolhida: " + fruta);

    }

    // Método para exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cobertura: " + (cobertura ? "Sim" : "Não"));
    }

    // Método para adicionar cobertura
    public void adicionarCobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }

    // Getters e Setters
    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}

