package entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name = "autoresPorUltimoNome",
query = "select a from Autor a where a.ultimoNome = :ultimoNome")
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(nullable = false)
    private String primeiroNome;
    @Column(nullable = false)
    private String ultimoNome;

    public int getCodigo() {
        return codigo;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    @Override
    public String toString() {
        return codigo + "," + primeiroNome + "," + ultimoNome;
    }
}
