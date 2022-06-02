import dio.desafio.funcionarios.Consultor;
import dio.desafio.funcionarios.Vendedor;
import dio.desafios.Macaco;
import dio.desafios.NumeroReverso;

public class Main {
    public static void main(String[] args) {
        //PROGRAMA NUMERO REVERSO:
        //NumeroReverso.numeroReverso();


        //PROGRAMA MACACO
       /* Macaco macaco1 = new Macaco();
        Macaco macaco2 = new Macaco();

        macaco1.comer("banana");
        macaco1.comer("maca");
        macaco1.comer("uva");

        macaco2.comer("pera");
        macaco2.comer("melancia");
        macaco2.comer("manga");
        macaco2.comer("pera");
        System.out.println("--------------");

        macaco1.digerir();
        macaco1.digerir();
        macaco1.digerir();

        macaco2.digerir();
        macaco2.digerir();
        macaco2.digerir();
        macaco2.digerir();*/

        //PROGRAMA FUNCIONÁRIO

        Vendedor vendedor = new Vendedor("Giana Vendedora", 254188752, 10d,5);
        System.out.println(vendedor.calcularSalario());

        Consultor consultor = new Consultor("Giana", 152444857, 100.5d, 10);
        System.out.println(consultor.calcularSalario());

    }
}
