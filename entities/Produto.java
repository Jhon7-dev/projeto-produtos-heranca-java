package entities;


public class Produto {
    private String nome;
    private String descricao;
    private double valor;
    private double imposto;
    private double taxa;

    public Produto(String nome,String descricao, double valor, double imposto, double taxa) {
        this.imposto = imposto;
        this.valor = valor;
        this.taxa = taxa;
        this.descricao = descricao;
        this.nome = nome;
    }




    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public double getTaxa() {

        return taxa = this.valor*0.05;
    }

    public void setTaxa(double taxa) {
        this.taxa = this.valor*0.05;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   public void calculoImposto(){

        this.setImposto(this.getValor());

     }
    public void Taxa(){
        this.setTaxa(this.getValor());
     }
    public void relatorio(){

        System.out.println("PRODUTO");
        System.out.println("NOME: " + getNome());
        System.out.println("DESCRIÇÃO: " + getDescricao());
        System.out.println("VALOR: " + getValor());
        System.out.println("IMPOSTO: " + getImposto());
        System.out.println("TAXA: " + getTaxa());

    }

}
