/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que simula una clase Controlador
 * @author fabian.giraldo
 */
public class Controller implements ActionListener{
    private View view;
    private Model model;
    
    public Controller (Model mod, View view){ 
      this.model=mod;
      this.view=view;
      this.view.setController(this);
      
    }    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.model.setAnnual_Interest_Rate(this.view.getField().getText());
        this.model.setNumber_of_Years(this.view.getField2().getText());
        this.model.setLoan_Amount(this.view.getField3().getText());
        double interes_anual=Double.parseDouble(this.model.getAnnual_Interest_Rate());
        double numero_de_años=Double.parseDouble(this.model.getNumber_of_Years());
        double monto=Double.parseDouble(this.model.getLoan_Amount());
        
        double cuota=(monto*((interes_anual/12)/100))/(1-(Math.pow((1+((interes_anual/12)/100)),(-12*numero_de_años))));
        this.view.setTextField4(String.valueOf(cuota));
        this.view.setTextField5(String.valueOf(cuota*(12*numero_de_años)));
        
    }
    public void mostrar(){
        this.view.setVisible(true);
    }
            
    
}
