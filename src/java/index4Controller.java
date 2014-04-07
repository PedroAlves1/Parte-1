
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
@ManagedBean (name="ladosController")
public class index4Controller {
    private Float a;
    private Float b;
    private Float c;
    private String resultado;

    public Float getA() {
        return a;
    }

    public void setA(Float a) {
        this.a = a;
    }

    public Float getB() {
        return b;
    }

    public void setB(Float b) {
        this.b = b;
    }

    public Float getC() {
        return c;
    }

    public void setC(Float c) {
        this.c = c;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public String confirmaAction(){
        if(a>(b+c)){
            resultado="Números Válidos! ";
            
        }
        else{
            if(b>(a+c)){
                resultado="Numeros Válidos! ";
                
            }
            else{

                if(c>(a+b)){
                    resultado="Números Válidos!";
                }
                else{
                                                    resultado="Números Inválidos";

                }
            }
            
        }
        return "";
    }
}
