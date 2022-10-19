import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição muito massa do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso C#");
        curso2.setDescricao("Descrição 2 muito massa do curso");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição muito massa da mentoria");

        System.out.println(curso1);
    }
}
