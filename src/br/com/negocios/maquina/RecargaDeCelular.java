package br.com.negocios.maquina;

public class RecargaDeCelular {
    private String nomeDaEmpresa;
    private String opcoes;
    private String operadoras;
    private String valores;
    private String confirmacao;
    private int numeroDigitado;

    public void mensagem() {
        System.out.println = """
    *****************************************

    ------------ Recarga Live --------------

    *****************************************
""" + nomeDaEmpresa;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String opcoes) {
        this.opcoes = opcoes;
    }

    public String getOperadoras() {
        return operadoras;
    }

    public void setOperadoras(String operadoras) {
        this.operadoras = operadoras;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public String getConfirmacao() {
        return confirmacao;
    }

    public void setConfirmacao(String confirmacao) {
        this.confirmacao = confirmacao;
    }

    public int getNumeroDigitado() {
        return numeroDigitado;
    }

    public void setNumeroDigitado(int numeroDigitado) {
        this.numeroDigitado = numeroDigitado;
    }
}
