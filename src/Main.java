import desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //new é a maneira de instanciar
        Curso cursoj = new Curso();

        cursoj.setTitulo("Java");
        cursoj.setDescricao("descrição curso java");
        cursoj.setCargaHoraria(8);

        Curso cursos = new Curso();

        cursos.setTitulo("JS");
        cursos.setDescricao("Descrição js");
        cursos.setCargaHoraria(5);

        //Polimorfismo
//        Tudo o que tem conteudo tem em curso, mas nem tudo o que tem em curso tem em conteudo
//        Conteudo conteudo = new Curso();
//        List<String> = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(cursoj);
//        System.out.println(cursos);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoj);
        bootcamp.getConteudos().add(cursos);
        bootcamp.getConteudos().add(mentoria);

        Dev devAila = new Dev();
        devAila.setNome("Aila");
        devAila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devAila.getConteudosInscritos());
        devAila.progredir();
        devAila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + devAila.getConteudosInscritos());
        System.out.println("Conteúdos inscritos " + devAila.getConteudosConcluidos());
        System.out.println("XP" + devAila.calcularTotalXp());

        System.out.println("-----------------");

        Dev devJo = new Dev();
        devJo.setNome("Jó");
        devJo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devJo.getConteudosInscritos());
        devJo.progredir();
        devJo.progredir();
        devJo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + devJo.getConteudosInscritos());
        System.out.println("Conteúdos inscritos " + devJo.getConteudosConcluidos());
        System.out.println("XP" +  devJo.calcularTotalXp());




    }
}
