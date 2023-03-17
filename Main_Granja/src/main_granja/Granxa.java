package main_granja;

import java.util.ArrayList;

public class Granxa {

    private String nome;
    private String localizacion;
    private Empregado encargado;
    ArrayList<Empregado> empregados;
    private int[] numAnimais;

    public Granxa(String nome, String localizacion, Empregado encargado, int[] numAnimais) {
        this.nome = nome;
        this.localizacion = localizacion;
        this.encargado = encargado;
        this.numAnimais = numAnimais;
    }

    public Granxa(String nome, String localizacion, Empregado encargado) {
        this.nome = nome;
        this.localizacion = localizacion;
        this.encargado = encargado;
        this.empregados = new ArrayList<>();
        this.numAnimais = new int[5];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Empregado getEncargado() {
        return encargado;
    }

    public void setEncargado(Empregado encargado) {
        this.encargado = encargado;
    }

    public ArrayList<Empregado> getEmpregados() {
        return empregados;
    }

    public int[] getNumAnimais() {
        return numAnimais;
    }

    public void engadirAnimal(TipoAnimal t) {
        switch (t) {
            case porcos:
                numAnimais[0]++;
                break;
            case vacas:
                numAnimais[1]++;
                break;
            case galiñas:
                numAnimais[2]++;
                break;
            case coellos:
                numAnimais[3]++;
                break;
            case ovellas:
                numAnimais[4]++;
                break;
            default:
                System.out.println("Tipo de animal non recoñecido.");
                break;
        }
    }

    public void engadirEmpregado(Empregado e) {
        empregados.add(e);
    }

    public int getNumeroAnimais(boolean coidadores) {
        if (!coidadores) {
            return empregados.size();
        } else {
            int numCoidadores = 0;
            for (Empregado e : empregados) {
                if (e instanceof CoidadorAnimais) {
                    numCoidadores++;
                }
            }
            return numCoidadores;
        }
    }

    @Override
    public String toString() {
        String salida = "";
        salida += "Nome: " + nome + "\n";
        salida += "Localización: " + localizacion + "\n";
        salida += "Encargado/a: " + encargado.getNome() + "\n";
        salida += "Empregados: \n";
        for (Empregado empregado : empregados) {
            salida += "- " + empregado.getNome() + "\n";
        }
        salida += "Porcos: " + numAnimais[TipoAnimal.porcos.ordinal()];
        salida += "Vacas: " + numAnimais[TipoAnimal.vacas.ordinal()];
        salida += "Galiñas: " + numAnimais[TipoAnimal.galiñas.ordinal()];
        salida += "Coellos: " + numAnimais[TipoAnimal.coellos.ordinal()];
        salida += "Ovellas: " + numAnimais[TipoAnimal.ovellas.ordinal()];
        return salida;
    }

}
