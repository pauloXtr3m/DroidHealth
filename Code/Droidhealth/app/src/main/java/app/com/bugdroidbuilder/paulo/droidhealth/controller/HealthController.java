package app.com.bugdroidbuilder.paulo.droidhealth.controller;

import android.app.Activity;
import android.widget.TextView;

import app.com.bugdroidbuilder.paulo.droidhealth.R;
import app.com.bugdroidbuilder.paulo.droidhealth.model.CalcHealth;
import app.com.bugdroidbuilder.paulo.droidhealth.model.Pessoa;
import app.com.bugdroidbuilder.paulo.droidhealth.view.Leitor;

/**
 * Created by paulo on 07/04/16.
 */
public class HealthController {
    private Pessoa pessoa = new Pessoa();
    private Activity activity;

    private Leitor leitor;
    private CalcHealth calculator;

    private final int MAX_PESO = 400;
    private final int MAX_ALTURA = 260;
    private final int MIN_PESO = 30;
    private final int MIN_ALTURA = 100;
    private final int MAX_IDADE = 120;
    private final int MIN_IDADE = 5;

    public HealthController(Activity _activity){
        this.activity = _activity;
        this.leitor = new Leitor(_activity);
        this.calculator = new CalcHealth();
    }

    public Leitor getLeitor() {
        return leitor;
    }


    public CalcHealth getCalculator() {
        return calculator;
    }

    public void updateActivity(Activity _activity){
        this.activity = _activity;
        this.leitor.updateActivity(_activity);
    }


    public void mostrarHDR(){
        TextView hdrView = (TextView)this.activity.findViewById(R.id.hdr_view);
        String hdrString = this.calculator.calcAgua(this.leitor.lerPeso("hdr"));
        hdrView.setText(hdrString);
    }
    public void mostrarIMC(){
        TextView imcView = (TextView)this.activity.findViewById(R.id.imc_view);
        String imcString = this.calculator.calcIMC(this.leitor.lerPeso("imc"), this.leitor.lerAltura("imc"));
        imcView.setText(imcString);
    }
    public void mostrarIMB(){
        TextView imbView = (TextView) this.activity.findViewById(R.id.imb_view);
        //String imbString = this.calculator.calcIMB(this.leitor.lerPeso("imb"), this.leitor.lerAltura("imb"), this.leitor.lerIdade() , this.leitor.lerSpinner("sexo"), this.leitor.lerSpinner("exercicios"))
    }
    public int getMIN_ALTURA() {
        return MIN_ALTURA;
    }

    public int getMIN_PESO() {
        return MIN_PESO;
    }

    public int getMAX_ALTURA() {
        return MAX_ALTURA;
    }

    public int getMAX_PESO() {
        return MAX_PESO;
    }

    public int getMAX_IDADE() {
        return MAX_IDADE;
    }

    public int getMIN_IDADE() {
        return MIN_IDADE;
    }
}