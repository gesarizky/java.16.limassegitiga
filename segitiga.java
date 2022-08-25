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
public class segitiga {
    public double Sisi ;
    public double Siting;
    public double Tinglas ;
    public void setSisi(double nilaiBaru){
        this.Sisi=nilaiBaru;
    }
    public void setSiting(double nilaiBaru){
        this.Siting=nilaiBaru;
    }
    public void setTinglas(double nilaiBaru){
        this.Tinglas=nilaiBaru;
    }
    public double luassegitiga(){
        return Sisi * Siting /2;
    }
    public double simir(){
        return Math.sqrt((Math.pow((Sisi/2),2)) + (Math.pow(Tinglas,2)));
    }
    public int hasilsimir(){
        return (int) simir();
    }
    public double luastegak(){
        return 3*(hasilsimir()*Sisi/2);
    }
}
