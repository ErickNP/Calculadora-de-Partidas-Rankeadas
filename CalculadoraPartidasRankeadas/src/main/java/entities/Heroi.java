package entities;

public class Heroi {

    private String nome;
    private Integer vitorias;
    private Integer derrotas;

    public Heroi() {
    }

    public Heroi(String nome, Integer vitorias, Integer derrotas) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer saldoVitorias(Integer vitorias, Integer derrotas) {
       
        Integer result = vitorias - derrotas;
        
        if (result < 0){
        
            return 0;
            
        } else{
        
        return result;
        }

         
    }

    public String posicaoRank(Integer vitorias, Integer derrotas) {

        Integer saldo = vitorias - derrotas;

        if (saldo <= 10) {

            return "Ferro";

        } else if (saldo >= 11 && saldo <= 20) {

            return "Bronze";

        } else if (saldo > 21 && saldo <= 50) {

            return "Prata";

        } else if (saldo > 51 && saldo <= 80) {

            return "Ouro";

        } else if (saldo > 81 && saldo <= 90) {

            return "Diamante";

        } else if (saldo > 91 && saldo <= 100) {

            return "Lendário";

        } else {

            return "Imortal";

        }
    }

    public String imprimir() {
        return "- O Herói de nome " + this.nome
                + " tem saldo de " + saldoVitorias(vitorias, derrotas) + " vitórias"
                + " e está no nível de " + posicaoRank(vitorias, derrotas)
                + "\n";
    }
}
