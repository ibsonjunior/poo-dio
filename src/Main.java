import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //new é a maneira de instanciar a classe
        Curso cursoj = new Curso();

        cursoj.setTitulo("Java");
        cursoj.setDescricao("descrição curso java");
        cursoj.setCargaHoraria(8);

        Curso cursos = new Curso();

        cursos.setTitulo("JS");
        cursos.setDescricao("Descrição js");
        cursos.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(cursoj);
        System.out.println(cursos);
        System.out.println(mentoria);


    }
}
