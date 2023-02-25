package Escola;



public enum StatusAluno {

    APROVADO("Aprovado"),
    NÃO_APROVADO("Reprovado"),
    RECUPERACAO("Recuperação");


    public String descricao;

    // Construtor
    StatusAluno(String descricao) {
        this.descricao = descricao;
    }


    // Método que criado que identifica se o aluno está aprovado
    // Passei as 4 variáveis e será identificado a regra (condicional)...
    // e decidi qual o estado do aluno
    public StatusAluno identificaAprovacao(double media,
                                           double notaCorte,
                                           double minimoRecuperacao) {
        if (media > notaCorte ) {
            return StatusAluno.APROVADO;
        } else if (media > minimoRecuperacao) {
            return StatusAluno.RECUPERACAO;
        } else {
            return StatusAluno.NÃO_APROVADO;
        }
    }
}



