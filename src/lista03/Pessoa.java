package lista03;
import java.time.LocalDate;
public class Pessoa {
private String nome;
private long cpf;
private LocalDate data_nasc;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public long getCpf() {
	return cpf;
}

public void setCpf(long cpf) {
	this.cpf = cpf;
}

public LocalDate getDatanasc() {
	return data_nasc;
}

public void setDatanasc(LocalDate localDate) {
	this.data_nasc = localDate;
}
}
