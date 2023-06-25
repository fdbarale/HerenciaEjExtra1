/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Fernando
 */
class BarcoAMotor extends Embarcaciones {

    private Integer potencia;

    public BarcoAMotor(Integer potencia, String matricula, Integer eslora, Integer anoFabr) {
        super(matricula, eslora, anoFabr);
        this.potencia = potencia;
    }

}
