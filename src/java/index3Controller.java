
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
@ManagedBean (name="notasController")
public class index3Controller {
    private Float nota1;
    private Float nota2;
    private Float nota3;
    private Float nota4;
    private Float media;
    public String resultado;

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public Float getNota3() {
        return nota3;
    }

    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }

    public Float getNota4() {
        return nota4;
    }

    public void setNota4(Float nota4) {
        this.nota4 = nota4;
    }

    public Float getMedia() {
        return media;
    }

    public void setMedia(Float media) {
        this.media = media;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    

    
    public String confirmaAction(){
    media=(nota1+nota2+nota3+nota4)/4;
    
    if(media < 3.5){
        resultado="Reprovado";
    }else{
        if(media < 6){
            resultado="Recuperação";
        }
        else{
            resultado="Aprovado";
        }
    }

    return "";
}
}

