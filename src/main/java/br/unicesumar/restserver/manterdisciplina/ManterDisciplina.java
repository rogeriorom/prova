package br.unicesumar.restserver.manterdisciplina;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ManterDisciplina {
    @Id
    private Long id;
    private String nome;
    private Integer cargaHoraria;
    private Double peso;

    public ManterDisciplina() {
    }

    public ManterDisciplina(Long id, String nome, Integer cargaHoraria, Double peso) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.peso = peso;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ManterDisciplina other = (ManterDisciplina) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ManterDisciplina{" + "id=" + id + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", peso=" + peso + '}';
    }
    
}
