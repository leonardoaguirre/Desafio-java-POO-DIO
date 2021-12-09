import br.com.dio.deseafio.dominio.Bootcamp;
import br.com.dio.deseafio.dominio.Curso;
import br.com.dio.deseafio.dominio.Dev;
import br.com.dio.deseafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setDescricao("Descricao curso java");
        curso.setTitulo("Curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setDescricao("Descricao curso javascript");
        curso2.setTitulo("Curso js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeo = new Dev();
        devLeo.setNome("Leonardo");
        devLeo.inscreverBootcamp(bootcamp);
        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos leo..."+devLeo.getConteudosInscritos());
        System.out.println("Conteudos inscritos carlos..."+devCarlos.getConteudosInscritos());

        devLeo.progredir();
        devLeo.progredir();
        devLeo.progredir();
        devCarlos.progredir();

        System.out.println("Conteudos concluidos leo..."+devLeo.getConteudosConcluidos());
        System.out.println("Conteudos concluidos carlos..."+devCarlos.getConteudosConcluidos());

        System.out.println("Conteudos inscritos leo..."+devLeo.getConteudosInscritos());
        System.out.println("Conteudos inscritos carlos..."+devCarlos.getConteudosInscritos());

        System.out.println("XP Leo:  "+devLeo.calcularTotalXp());
        System.out.println("XP Carlos:  "+devCarlos.calcularTotalXp());


    }
}
