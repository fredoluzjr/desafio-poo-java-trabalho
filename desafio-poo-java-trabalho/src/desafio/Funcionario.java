package desafio;

import java.util.*;

public class Funcionario {

    private String nome;
    private Set<Atividade> atividadesAFazer = new LinkedHashSet<>();
    private Set<Atividade> atividadesConcluidos = new LinkedHashSet<>();

    public void assumirFuncao(Funcao funcao){
        this.atividadesAFazer.addAll(funcao.getAtividades());
        funcao.getFunctrabalho().add(this);
    }

    public void progredir() {
        Optional<Atividade> atividade = this.atividadesAFazer.stream().findFirst();
        if(atividade.isPresent()) {
            this.atividadesConcluidos.add(atividade.get());
            this.atividadesAFazer.remove(atividade.get());
        } else {
            System.err.println("Você não está em nenhuma função!");
        }
    }

    public double calcularTotalXp() {
        Iterator<Atividade> iterator = this.atividadesConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Atividade> getAtividadesAFazer() {
        return atividadesAFazer;
    }

    public void setAtividadesAFazer(Set<Atividade> atividadesAFazer) {
        this.atividadesAFazer = atividadesAFazer;
    }

    public Set<Atividade> getAtividadesConcluidos() {
        return atividadesConcluidos;
    }

    public void setAtividadesConcluidos(Set<Atividade> atividadesConcluidos) {
        this.atividadesConcluidos = atividadesConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario funcionario = (Funcionario) o;
        return Objects.equals(nome, funcionario.nome) && Objects.equals(atividadesAFazer, funcionario.atividadesAFazer) && Objects.equals(atividadesConcluidos, funcionario.atividadesConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, atividadesAFazer, atividadesConcluidos);
    }

}
