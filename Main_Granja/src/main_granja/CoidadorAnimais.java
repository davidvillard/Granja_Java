package main_granja;

import java.time.LocalDate;
import java.time.Period;

public class CoidadorAnimais extends Empregado implements Gandeiro {

    private int cantidadeAnimais;
    private TipoAnimal tipoAnimalExperto;

    /**
     *
     * @param numEmpregado numero del trabajador
     * @param nome nombre del trabajador
     * @param dataInicio fecha de inicio de trabajo
     * @param salarioBase salario del trabajador
     * @param tipoAnimalExperto tipo de animales en los que es experto el trabajador
     */
    public CoidadorAnimais(int numEmpregado, String nome, LocalDate dataInicio, double salarioBase, TipoAnimal tipoAnimalExperto) {
        super(numEmpregado, nome, dataInicio, salarioBase);
        this.tipoAnimalExperto = tipoAnimalExperto;
    }

    public TipoAnimal getTipoAnimalExperto() {
        return tipoAnimalExperto;
    }

    public double determinarSalarioRealCoidador() {
        Period periodo = Period.between(dataInicio, LocalDate.now());
        int trienios = periodo.getYears() / 3;
        
        if (tipoAnimalExperto == TipoAnimal.porcos) {
            return salarioBase + (30 * trienios) + 10;
        } else if (tipoAnimalExperto == TipoAnimal.vacas) {
            return salarioBase + (30 * trienios) + 5;
        }else{
            return salarioBase + (30 * trienios);
        }
    }
    
    @Override
    public void alimentarAnimais() {
        System.out.println("Alimentando " + tipoAnimalExperto);
    }

    @Override
    public void limpiarCortes() {
        System.out.println("Limpiando cortes de " + tipoAnimalExperto);
    }
    

}
