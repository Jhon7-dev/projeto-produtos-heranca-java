package entities;

public class Estadual extends Produto {

    public Estadual(String nome,String descricao,double valor) {

        super(nome, descricao, valor,0.0,0.0);

    }


    @Override
    public void calculoImposto(){

        this.setImposto(this.getValor() * 0.10);

    }

    @Override
    public void relatorio(){

        System.out.println("========= PRODUTOS ESTADUAIS =========");
        System.out.println("NOME: " + getNome());
        System.out.println("DESCRIÇÃO: " + getDescricao());
        System.out.println("VALOR: " + getValor());
        System.out.println("IMPOSTO ESTADUAL: " + getImposto());
        System.out.println("=======================================");
    }
}
