
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
@ManagedBean (name="indexController")
public class indexController {
    private String nome;
    private Integer horas;
    private String resultado;
    private Integer minutos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }
    
    
    
    public String confirmarAction (){
        if(minutos >=0 && minutos <60){            
        
        if(horas >24){
            resultado="Hora inexistente, digite um horário entre 0:00 ~ 23:59 e tente novamente.";
            nome=" ";
        }   
        else{
           if(horas >=0 && horas <12){
               resultado="Bom dia, ";
            }
           else{
                  if(horas >=12 && horas <18){
                  resultado="Boa tarde, ";
                 }
                  else{
                        resultado="Boa noite, ";
                  }
               }
        }
        
        
    }
        else{
            resultado="Minutos inexistentes, digite corretamente e tente novamente.";
            nome=" ";
        }
        return "";
    }
}
