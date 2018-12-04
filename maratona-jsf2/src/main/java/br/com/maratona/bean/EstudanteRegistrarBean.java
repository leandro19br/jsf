package br.com.maratona.bean;

import br.com.maratona.model.Estudante;

import javax.el.ExpressionFactory;
import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.*;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"DevDojo", "eh", "foda"};
    private List<String> nomesList = Arrays.asList("William", "Wildnei", "Brenon", "Sandy");//método da classe Array
    private Set<String> nomesSet = new HashSet<>(Arrays.asList("Goku", "Luffy", "Naruto", "Kuririn"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas;
    private boolean mostrarLink;


    {
        nomesMap.put("Goku", " O mais forte");
        nomesMap.put("One Piece", "O mais longo");
        nomesMap.put("Naruto", "O com mais lenga lenga");

//        for(Map.Entry<String, String> entry : nomesMap.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
    }


    //chamando um método pelo JSF
    public void executar() {
        System.out.println("Fazendo uma busca no BD");
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    //chamando um método pelo JSF
    public void executarcomParametro(String param) {
        System.out.println("Fazendo uma busca no BD " + param);
        System.out.println("Processando os dados " + param);
        System.out.println("Exibindo os dados " + param);
    }

    //chamando um método pelo JSF
    public String executarcomRetorno(String param) {
        String retorno = "quem é o mais lindo " + param;
        return retorno;

    }

    //chamando um método pelo JSF
    public String irParaproximaPagina() {

        return "index2?faces-redirect=true";

    }

    public void mostrarNotas() {

        this.mostrarNotas = true;


    }

    public void OcultarNotas() {
        this.mostrarNotas = false;


    }

    public void calcularCubo(LambdaExpression le, long valor) {

        long resultado = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(), valor);

        System.out.println(resultado);

    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }
}
