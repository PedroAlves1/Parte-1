
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
@ManagedBean (name="comparaController")
public class index2Controller {
    private Float n1;
    private Float n2;
    private Float n3;
    private Float maior;
    private Float menor;
    
    public Float getN1() {
        return n1;
    }

    public void setN1(Float n1) {
        this.n1 = n1;
    }

    public Float getN2() {
        return n2;
    }

    public void setN2(Float n2) {
        this.n2 = n2;
    }

    public Float getN3() {
        return n3;
    }

    public void setN3(Float n3) {
        this.n3 = n3;
    }

    public Float getmaior() {
        return maior;
    }

    public void setMaior(Float maior) {
        this.maior = maior;
    }

    public Float getMenor() {
        return menor;
    }

    public void setMenor(Float menor) {
        this.menor = menor;
    }
    public String confirmaAction(){
    if(n1 > n2){ //Maior
        if(n1 > n3){
            maior=n1;
        }
    }
        else{
            if(n2>n3){
                maior=n2;
            }
            else{
                maior=n3;
            }
        }
    
    // Menor
        if(n1 < n2){
        if(n1 < n3){
            menor=n1;
        }
    }
        else{
            if(n2<n3){
                menor=n2;
            }
            else{
                menor=n3;
            }
        }
    
    return "";
}
}
