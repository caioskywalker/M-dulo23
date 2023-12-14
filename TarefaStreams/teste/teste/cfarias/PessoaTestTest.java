package teste.cfarias;

import com.br.cfarias.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PessoaTestTest {

    @Test
    public void teste(){
        Pessoa pessoa = new Pessoa();
        pessoa.listaFeminina.add(new Pessoa("Janaina","feminino"));
        pessoa.listaFeminina.add(new Pessoa("João","Masculino"));
        pessoa.listaFeminina.forEach(pessoa1 -> Assert.assertEquals("feminino",pessoa1.getGenero()));
        //Aqui eu testo se cada pessoa dessa lista é classificada com o gênero feminino. Caso haja algo diferente, o teste falhará.
    }

}