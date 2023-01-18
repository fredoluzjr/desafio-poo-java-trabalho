package desafio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Funcao {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private Set<Funcionario> functrabalho = new HashSet<>();
    private Set<Atividade> atividades = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public Set<Funcionario> getFunctrabalho() {
        return functrabalho;
    }

    public void setFunctrabalho(Set<Funcionario> functrabalho) {
        this.functrabalho = functrabalho;
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcao funcao = (Funcao) o;
        return Objects.equals(nome, funcao.nome) && Objects.equals(descricao, funcao.descricao) && Objects.equals(dataInicial, funcao.dataInicial) && Objects.equals(functrabalho, funcao.functrabalho) && Objects.equals(atividades, funcao.atividades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, functrabalho, atividades);
    }
    
}
