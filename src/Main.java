import javax.management.InvalidApplicationException;

public class Main {
    public static void main(String[] args) {
        
            IApartamentoService service = new ApartamentoService();
            service.cadastarApartamento(new Apartamento(1L, "Endereco"));
    }
}