package br.com.maratona.View;

import br.com.maratona.session.TesteSessionBean;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class TesteViewBean implements Serializable {

    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();



    @PostConstruct
    public void init() {
        System.out.println(" Entrou no PostConstruct do ViewScoped ");
        personagens = asList("Naruto", "Hinata", "Yondaime");
    }

    public void selecionarPersonagem() {


            int index = ThreadLocalRandom.current().nextInt(3);
            String personagem = personagens.get(index);
            personagemSelecionado.add(personagem);


    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }


    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }
}
