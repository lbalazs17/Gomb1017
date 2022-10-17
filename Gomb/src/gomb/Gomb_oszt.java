/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomb;

/**
 *
 * @author user11
 */
public class Gomb_oszt {
    private double _r;

    public Gomb_oszt(double _r) {
        this._r = _r;
    }
    public double felszin()
    {
    return 4 * Math.pow(_r, 2) * Math.PI;
    }
    public double terfogat()
    {
    return 4 * Math.pow(_r, 3) * Math.PI/3;
    }
    
    
}
