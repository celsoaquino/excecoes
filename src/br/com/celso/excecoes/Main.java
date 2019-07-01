package br.com.celso.excecoes;

public class Main {

    public static void main(String[] args) {

    try {


        ItemVenda camisa = new ItemVenda();
        camisa.setDescricao("camisa polo");
        camisa.setPreco(30.0);

        ItemVenda bone = new ItemVenda();
        bone.setDescricao("bone infantil");
        bone.setPreco(21.0);

        Venda venda = new Venda();
        venda.adicionar(camisa);
        venda.adicionar(bone);

        System.out.println("Total da Venda: " + venda.getTotal());
    }catch (VendaException e){
        System.out.println("Erros ao processar total: " + e.getMessage() + " - codigo: " + e.getCodigo());
    }finally {
        System.out.println("Processamento encerrado");
    }
    }
}
