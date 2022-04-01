import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso voltado para ensinamentos em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso voltado para ensinamentos em JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Java");
        mentoriaJava.setDescricao("Mentoria para as aulas de Java");
        mentoriaJava.setData(LocalDate.now().format(formatado));

        Mentoria mentoriaJavaScript = new Mentoria();
        mentoriaJavaScript.setTitulo("JavaScript");
        mentoriaJavaScript.setDescricao("Mentoria para as aulas de JavaScript");
        mentoriaJavaScript.setData(LocalDate.now().plusDays(1).format(formatado));


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Neste Bootcamp você irá aprender mais sobre o mundo Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoriaJava);
        bootcamp.getConteudos().add(mentoriaJavaScript);



        Dev Sara = new Dev();
        Sara.setNome("\nSara Conceição");
        Sara.inscricaoBootcamp(bootcamp);
        System.out.println("Bem vindo(a) "+Sara.getNome()+ " ao " +bootcamp.getNome());
        System.out.println(("\nInício do Bootcamp: "+ bootcamp.getDataInicialFormatada()));
        System.out.println("\nConteúdos inscritos: ");
        Sara.mostrarConteudosInscritos();
        System.out.println (("Prazo final: "+bootcamp.getDataFinalFormatada() + "\n"));
        System.out.println("Acompanhe seu progresso: \n");
        Sara.progresso();
        Sara.progresso();
        System.out.println("Conteúdos inscritos: ");
        Sara.mostrarConteudosInscritos();
        System.out.println("Conteúdos concluídos: ");
        Sara.mostrarConteudosConcluidos();
        System.out.println("XP: " + Sara.TotalXP());

        System.out.println("\n-------------------------\n");

        Dev luiz = new Dev();
        luiz.setNome("\nLuiz Alberto");
        luiz.inscricaoBootcamp(bootcamp);
        System.out.println("Bem vindo(a) "+luiz.getNome()+ " ao " +bootcamp.getNome());
        System.out.println(("\nInício do Bootcamp: "+ bootcamp.getDataInicialFormatada()));
        System.out.println("\nConteúdos inscritos: ");
        luiz.mostrarConteudosInscritos();
        System.out.println (("Prazo final: "+bootcamp.getDataFinalFormatada() + "\n"));
        System.out.println("Acompanhe seu progresso: \n");
        luiz.progresso();
        luiz.progresso();
        luiz.progresso();
        System.out.println("Conteúdos inscritos: ");
        luiz.mostrarConteudosInscritos();
        System.out.println("Conteúdos concluídos: ");
        luiz.mostrarConteudosConcluidos();
        System.out.println("XP: " + luiz.TotalXP());

    }
}