import br.com.viacep.infra.GeraJson;
import br.com.viacep.model.Cep;
import br.com.viacep.service.ConsultaCep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        GeraJson geraJson = new GeraJson();

        System.out.println("Digite o CEP que deseja buscar:");
        String busca = scan.nextLine();

        Cep cep = consultaCep.buscaCep(busca);

        if (cep == null) {
            System.out.println("CEP invalido!");
        } else {
            System.out.println(cep);
            geraJson.criaJson(cep);
        }
    }
}
