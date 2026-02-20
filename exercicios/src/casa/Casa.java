package casa;

public class Casa{
    private int quartos;
    private int banheiro;
    private String rua;

    // Construtor
    public Casa(int quartos, int banheiro, String rua) {
        this.quartos = quartos;
        this.banheiro = banheiro;
        this.rua = rua;
    }

    // Getters e Setters
    public void setRua(String rua){
        this.rua = rua;
    }
    public String getRua(){
        return this.rua;
    }
    public void setQuartos(int quartos){
        this.quartos = quartos;
    }
    public int getQuartos(){
        return this.quartos;
    }
    public void setBanheiro(int banheiro){
        this.banheiro = banheiro;
    }
    public int getBanheiro(){
        return this.banheiro;
    }
}
