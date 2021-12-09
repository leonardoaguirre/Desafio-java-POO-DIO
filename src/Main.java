import br.com.dio.deseafio.dominio.Curso;
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

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
