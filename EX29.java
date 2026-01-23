public class EX29 {
    public static void main(String[] args) {
        int idade = 30;
        double tempo = 30.5;
        float feramheit = 305.9F;

        String idade2 = Integer.toString(idade);
        String temp2 = Double.toString(tempo);
        String feramheit2 = Float.toString(feramheit);

        System.out.println("valor de int idade em Sting"+idade2);
        System.out.println("valor double tempo em String"+ tempo);
        System.out.println("valor Float feramheit em String"+ feramheit);

    }
}
