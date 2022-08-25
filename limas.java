/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherilimas;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class limas extends segitiga {
    public double Tinggi ;
    public void setTinggi(double nilaiBaru){
        this.Tinggi=nilaiBaru;
    }
    public double volumelimas (){
        return (luassegitiga()*Tinggi)/3;
    }
    public double luaspermukaanlimas (){
        return  luassegitiga()+ luastegak();
    }
}
