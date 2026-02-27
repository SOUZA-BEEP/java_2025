public class Data {
    private int dia;
    private int mes;
    private int ano;

    
    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1;
    }

    
    public Data(int dia, int mes, int ano) {
        if (validarDataCompleta(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Inicializando para 1/1/1.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    
    private boolean validarDataCompleta(int dia, int mes, int ano) {
        if (ano <= 0) {
            System.out.println("Ano inválido!");
            return false;
        }

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido!");
            return false;
        }

        int maxDia;
        switch (mes) {
            case 4: case 6: case 9: case 11:
                maxDia = 30;
                break;
            case 2:
                if (anoBissexto(ano)) {
                    maxDia = 29;
                } else {
                    maxDia = 28;
                }
                break;
            default:
                maxDia = 31;
        }

        if (dia < 1 || dia > maxDia) {
            System.out.println("Dia inválido!");
            return false;
        }

        return true; 
    }

    private boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
  
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }       

    public void setDia(int dia) {
        if (validarDataCompleta(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Não foi possível alterar o dia.");
        }
    }

    public void setMes(int mes) {
        if (validarDataCompleta(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Não foi possível alterar o mês.");
        }
    }

    public void setAno(int ano) {
        if (validarDataCompleta(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Não foi possível alterar o ano.");
        }
    }

    
    }
