

package main_granja;

import java.time.LocalDate;
import java.time.Period;


public class Empregado {
    private int numEmpregado;
    private String nome;
    protected LocalDate dataInicio;
    protected double salarioBase;

    /**
     * 
     * @param numEmpregado numero del trabajador
     * @param nome nombre del trabajador
     * @param dataInicio fecha de inicio de trabajo en la granja
     * @param salarioBase salario del trabajador al mes
     */
    public Empregado(int numEmpregado, String nome, LocalDate dataInicio, double salarioBase) {
        
        if (numEmpregado > 0) {
            this.numEmpregado = numEmpregado; //El numero tiene que ser mayor de 0
        }else{
            System.err.println("Numero no Valido");
        }
        
        this.nome = nome;
        
        if (dataInicio.isAfter(LocalDate.now())) {
            this.dataInicio = LocalDate.now(); //La fecha de inicio de trabajo no puede se posterior a la actual
        }else{
            this.dataInicio = dataInicio;
        }
        
        if (salarioBase >= 1000) {
            this.salarioBase = salarioBase; //el salario base debe ser mayor al SMI que es 1000 euros    
        }else{
            System.out.println("Salario base no valido");
        }
        
    }

    public int getNumEmpregado() {
        return numEmpregado;
    }

    public void setNumEmpregado(int numEmpregado) {
        this.numEmpregado = numEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    /*
    METODOS
    */
    
    /**
     * El metodo calacula los trienios que tiene el trabajador y dependiendo del numero que tenga lo multiplica por 30 
     * que es lo que se le suma al salario del trabajador por trienio trabajado
     * @return devuelve el salario real del trabajador
     */
    public double determinarSalarioReal(){
       Period periodo = Period.between(dataInicio, LocalDate.now());
       int trienios = periodo.getYears()/3;
       return salarioBase + (30 * trienios);
    }
    
    
}
