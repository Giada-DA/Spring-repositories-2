package co.develhope.springrepositories2.entities;

import javax.persistence.*;

@Entity
@Table
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String nome;

    private int AnnoCreazione;

    @Column(nullable = false)
    private String inventore;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(long id, String nome, int annoCreazione, String inventore) {
        this.id = id;
        this.nome = nome;
        AnnoCreazione = annoCreazione;
        this.inventore = inventore;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnnoCreazione() {
        return AnnoCreazione;
    }

    public void setAnnoCreazione(int annoCreazione) {
        AnnoCreazione = annoCreazione;
    }

    public String getInventore() {
        return inventore;
    }

    public void setInventore(String inventore) {
        this.inventore = inventore;
    }
}