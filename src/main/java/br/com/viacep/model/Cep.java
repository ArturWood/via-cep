package br.com.viacep.model;

public record Cep(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
    @Override
    public String toString() {
        return "Cep{" +
                "cep = '" + cep + '\'' +
                ", rua = '" + logradouro + '\'' +
                ", complemento = '" + complemento + '\'' +
                ", bairro = '" + bairro + '\'' +
                ", cidade = '" + localidade + '\'' +
                ", uf = '" + uf + '\'' +
                '}';
    }
}
