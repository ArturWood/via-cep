package br.com.viacep.model;

public record Cep(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
}
