package entities;

public   class Nacional extends Produto {

    public Nacional(String nome,String descricao, double valor) {
        super(nome,descricao,valor,0.0,0.0);
    }


    @Override
    public void  calculoImposto(){

        this.setImposto(getValor()*0.10);

    }
    @Override
    public void  Taxa(){

         this.setTaxa(getValor()*0.05);

    }
    @Override
    public void relatorio(){

        System.out.println("========= PRODUTOS NACIONAL =========");
        System.out.println("NOME: " + getNome());
        System.out.println("DESCRIÇÃO: " + getDescricao());
        System.out.println("VALOR: " + getValor());
        System.out.println("IMPOSTO NACIONAL: " + getImposto());
        System.out.println("TAXA: " + getTaxa());
        System.out.println("=======================================");

    }
}
