package entities;

public class Importado extends Produto {
    private double taxadeImportacao;
    private double imposto;

    public Importado(String nome,String descricao, double valor) {
       super(nome, descricao,valor, 0.0,0.0);
        this.taxadeImportacao = 0.0;
    }

    public double getTaxadeImportacao() {

        return taxadeImportacao;
    }

    public void setTaxadeImportacao(double taxadeImportacao) {

        this.taxadeImportacao = taxadeImportacao;
    }
    @Override
    public void Taxa(){

       this.setTaxa(getTaxa()*0.25);
    }

    @Override
    public void calculoImposto(){

        setImposto(getImposto()*0.10);
    }

    @Override
    public void relatorio(){
        System.out.println(" ========= PRODUTOS IMPORTADOS =========");
        System.out.println("NOME: " + getNome());
        System.out.println("DESCRIÇÃO: " + getDescricao());
        System.out.println("VALOR: " + getValor());
        System.out.println("TAXA DE IMPORTAÇÃO: " + getTaxa());
        System.out.println("=======================================");
    }
}
