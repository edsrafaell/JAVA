package Poo01;

public class Teste {
    public static void main(String[] args) {
        Pessoa People01 = new Pessoa();
        People01.nome = "Edson Rafael";
        People01.idade = 19;
        People01.sexo = 'M';

        Pessoa People02 = new Pessoa();
        People02.nome = "Sthefanne";
        People02.idade = 22;
        People02.sexo = 'F';

        System.out.println(People01.nome);
        System.out.println(People01.idade);
        System.out.println(People01.sexo);
        System.out.println(People02.nome);
        System.out.println(People02.idade);
        System.out.println(People02.sexo);
    }
}
