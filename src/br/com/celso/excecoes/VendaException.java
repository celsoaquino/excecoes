package br.com.celso.excecoes;

public class VendaException  extends RuntimeException{

    private int codigo;

    public VendaException(int codigo, String message){
        super(message);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}

