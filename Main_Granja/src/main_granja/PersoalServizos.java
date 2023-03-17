


package main_granja;

import java.time.LocalDate;


public class PersoalServizos extends Empregado{

    private char posto; //Puesto de trabajo
    
    /**
     * 
     * @param numEmpregado numero del trabajador
     * @param nome nombre del trabajador
     * @param dataInicio fecha de inicio de trabajo
     * @param salarioBase salario base del trabajador
     * @param posto puesto de trabajo
     */
    public PersoalServizos(int numEmpregado, String nome, LocalDate dataInicio, double salarioBase, char posto) {
        super(numEmpregado, nome, dataInicio, salarioBase);
        if (posto == 'R' || posto == 'C') {
            this.posto = posto;
        } else {
            this.posto = 'R';
        }
    }

    public char getPosto() {
        return posto;
    }

    
    
    

}
