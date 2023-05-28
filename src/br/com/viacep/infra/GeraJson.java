package br.com.viacep.infra;

import br.com.viacep.model.Cep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeraJson {

    public void criaJson(Cep cep) {
        try {
            FileWriter writer = new FileWriter(cep.cep() + ".json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(cep).replace("logradouro", "rua").replace("localidade", "cidade"));
            writer.close();
            System.out.println("Arquivo JSON com informações criado");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }
}
