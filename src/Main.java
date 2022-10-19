import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

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

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição muito massa do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMario = new Dev();
        devMario.setNome("Mario");
        devMario.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devMario.getConteudosInscritos());
        System.out.println("-");
        devMario.progredir();
        devMario.progredir();
        System.out.println("Conteúdos Inscritos: " + devMario.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devMario.getConteudosConcluidos());
        System.out.println("XP: " + devMario.calcularTotalXP());

        System.out.println("--------------------------");

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devFernando.getConteudosInscritos());
        System.out.println("-");
        devFernando.progredir();
        devFernando.progredir();
        devFernando.progredir();
        System.out.println("Conteúdos Inscritos: " + devFernando.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devFernando.getConteudosConcluidos());
        System.out.println("XP: " + devFernando.calcularTotalXP());
    }
}
