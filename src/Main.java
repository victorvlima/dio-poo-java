import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Descrição curso 1");
        curso1.setCargaHoraria(8);
        System.out.println(curso1.toString());

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 1");
        curso2.setDescricao("Descrição curso 1");
        curso2.setCargaHoraria(8);
        System.out.println(curso2.toString());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria em JAVA");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1.toString());
    }
}
