import desafio.Funcao;
import desafio.Projeto;
import desafio.Funcionario;
import desafio.Teste;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Projeto equipamento1 = new Projeto();
        equipamento1.setTitulo("Smartphone Blue Pen");
        equipamento1.setDescricao("É o celular do Caneta Azul!");
        equipamento1.setCargaHoraria(10);

        Projeto equipamento2 = new Projeto();
        equipamento2.setTitulo("Notebook Blue Pen");
        equipamento2.setDescricao("É o Notebook do Caneta Azul");
        equipamento2.setCargaHoraria(8);

        Teste teste1 = new Teste();
        teste1.setTitulo("teste elétrico");
        teste1.setDescricao("É o teste elétrico");
        teste1.setData(LocalDate.now());

        Teste teste2 = new Teste();
        teste2.setTitulo("teste mecânico");
        teste2.setDescricao("É o teste mecânico");
        teste2.setData(LocalDate.now());

        Funcao funcao1 = new Funcao();
        funcao1.setNome("Desenvolvedor Smartphone");
        funcao1.setDescricao("É o cargo de Dev para o celular");
        funcao1.getAtividades().add(equipamento1);
        funcao1.getAtividades().add(teste1);
        funcao1.getAtividades().add(teste2);

        Funcao funcao2 = new Funcao();
        funcao2.setNome("Desenvolvedor Notebook");
        funcao2.setDescricao("É o cargo de Dev para o notebook");
        funcao2.getAtividades().add(equipamento2);
        funcao2.getAtividades().add(teste1);
        funcao2.getAtividades().add(teste2);

        Funcionario funcJoao = new Funcionario();
        funcJoao.setNome("João");
        funcJoao.assumirFuncao(funcao1);
        System.out.println("Atividades Assumidas João" + funcJoao.getAtividadesAFazer());
        funcJoao.progredir();
        System.out.println("-");
        System.out.println("Atividades Assumidas João" + funcJoao.getAtividadesAFazer());
        System.out.println("Atividades Concluidas João" + funcJoao.getAtividadesConcluidos());
        System.out.println("XP:" + funcJoao.calcularTotalXp());

        System.out.println("-------");

        Funcionario funcAna = new Funcionario();
        funcAna.setNome("Ana");
        funcAna.assumirFuncao(funcao2);
        System.out.println("Atividades Assumidas Ana" + funcAna.getAtividadesAFazer());
        funcAna.progredir();
        funcAna.progredir();
        System.out.println("-");
        System.out.println("Atividades Assumidas Ana" + funcAna.getAtividadesAFazer());
        System.out.println("Atividades Concluidas Ana" + funcAna.getAtividadesConcluidos());
        System.out.println("XP:" + funcAna.calcularTotalXp());

    }
}
