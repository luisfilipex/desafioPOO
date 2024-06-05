import br.com.dio.desafio.dominio.*;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {
   public static void main(String[] args) {

   Curso curso1 = new Curso();
      curso1.setTitulo("Curso Java");
      curso1.setDescricao("Programacao Orientada Objetos");
      curso1.setCargaHoraria(20);

      Conteudo conteudo = new Curso();

      List<String> palavras = new ArrayList<>();

      Curso curso2 = new Curso();
      curso2.setTitulo("Curso SpringBoot");
      curso2.setDescricao("Programacao com SpringBoot");
      curso2.setCargaHoraria(120);

   Mentoria mentoria = new Mentoria();
   mentoria.setTitulo("Mentoria Java");
   mentoria.setDescricao("Programacao com Mentoria");
   mentoria.setData(LocalDate.now());

      Mentoria mentoria2 = new Mentoria();
      mentoria2.setTitulo("Mentoria JavaScript");
      mentoria2.setDescricao("Programacao com Mentoria JavaScript");
      mentoria2.setData(LocalDate.now());


  /* System.out.println(curso1);
   System.out.println(curso2);
   System.out.println(mentoria);
   System.out.println(mentoria2);*/

     Bootcamp bootcamp = new Bootcamp();
     bootcamp.setNome("Bootcamp Java Developer");
     bootcamp.setDescricao("Programacao com Bootcamp java");
     bootcamp.getConteudos().add(curso1);
     bootcamp.getConteudos().add(curso2);
     bootcamp.getConteudos().add(mentoria);

     Dev devLuis = new Dev();
     devLuis.setNome("Luis Filipe");
     devLuis.inscreverBootcamp(bootcamp);
     System.out.println("Conteudos Inscritos Luis" + devLuis.getConteudoInscritos());
     devLuis.progredir();
     System.out.println("--");
     System.out.println("Conteudos Inscritos Luis" + devLuis.getConteudoInscritos());
     System.out.println("Conteudos Concluidos Luis" + devLuis.getConteudoConcluidos());;
     System.out.print("XP: " + devLuis.calcularTotalXp());


     System.out.println("------");

     Dev devMariana = new Dev();
     devMariana.setNome("Mariana");
     devMariana.inscreverBootcamp(bootcamp);
     System.out.println("Conteudos Inscritos Mariana" + devMariana.getConteudoInscritos());
     devMariana.progredir();
     devMariana.progredir();
     System.out.println("--");
     System.out.println("Conteudos Inscritos Mariana" + devMariana.getConteudoInscritos());
     System.out.println("Conteudos Concluidos Mariana" + devLuis.getConteudoConcluidos());
     System.out.print("XP: " + devMariana.calcularTotalXp());
   }
}