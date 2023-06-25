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
abstract class Embarcaciones {

    protected String matricula;
    protected Integer eslora;
    protected Integer anoFabr;

    public Embarcaciones(String matricula, Integer eslora, Integer anoFabr) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabr = anoFabr;
    }

}
