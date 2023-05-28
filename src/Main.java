import br.com.viacep.model.Cep;
import br.com.viacep.service.ConsultaCep;

public class Main {
    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();
        Cep cep = consultaCep.buscaCep("12345");
        if (cep == null) {
            System.out.println("CEP invalido!");
        } else {
            System.out.println(cep);
        }
    }
}
