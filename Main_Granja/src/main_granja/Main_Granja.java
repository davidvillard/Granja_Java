package main_granja;

import java.time.LocalDate;
import java.time.Month;

public class Main_Granja {

    public static void main(String[] args) {
        CoidadorAnimais c1 = new CoidadorAnimais(1, "Pepe", LocalDate.of(2002, Month.MARCH, 2), 1500, TipoAnimal.porcos);
        CoidadorAnimais c2 = new CoidadorAnimais(2, "Ana", LocalDate.of(2020, Month.SEPTEMBER, 3), 1400, TipoAnimal.galiñas);
        CoidadorAnimais c3 = new CoidadorAnimais(3, "Helena", LocalDate.of(2019, Month.OCTOBER, 4), 1700, TipoAnimal.vacas);
        PersoalServizos p1 = new PersoalServizos(5, "Alba", LocalDate.of(2021, Month.JANUARY, 5), 1550, 'R');
        PersoalServizos p2 = new PersoalServizos(6, "Ainara", LocalDate.of(2017, Month.FEBRUARY, 6), 1550, 'C');

        Granxa g = new Granxa("Avicola de Fornelos", "Fornelos de Montes", c3);
        g.engadirEmpregado(c1);
        g.engadirEmpregado(c2);
        g.engadirEmpregado(c3);
        g.engadirEmpregado(p1);
        g.engadirEmpregado(p2);
        g.engadirAnimal(TipoAnimal.vacas);
        g.engadirAnimal(TipoAnimal.porcos);
        g.engadirAnimal(TipoAnimal.porcos);
        g.engadirAnimal(TipoAnimal.porcos);
        g.engadirAnimal(TipoAnimal.porcos);
        g.engadirAnimal(TipoAnimal.coellos);
        g.engadirAnimal(TipoAnimal.ovellas);

        System.out.println(g);

        for (Empregado e : g.getEmpregados()) {
            System.out.println(e.getNome() + " cobra " + e.determinarSalarioReal());
        }
    }
}
