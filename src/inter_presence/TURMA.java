/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter_presence;

import java.util.ArrayList;


public class TURMA {
 private int Codigo;
 private String Nome;
 private String Disciplina;
 private int Faltas;


 
 
 public TURMA (){
    
     }

    public TURMA(int Codigo,String Nome,String Disciplina,int Faltas) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Disciplina = Disciplina;
        this.Faltas = Faltas;
       
    }
    
    public int getFaltas(){
         return Faltas;
          } 
    
    public void setFaltas(int Faltas) {
        this.Faltas = Faltas;
    }
    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }

    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo){
       this.Codigo = Codigo ;   
        }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
}
    

    
