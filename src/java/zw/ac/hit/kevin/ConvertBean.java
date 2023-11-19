/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package zw.ac.hit.kevin;

import jakarta.ejb.Stateless;




/**
 *
 * @author KevinGwindingwi
 */
@Stateless
public class ConvertBean  {

    private Double usd ,value;
    private Double cny = 7.21 ,cad = 1.37  , aud =1.54;
    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

    public Double getCny() {
        return cny;
    }

    public void setCny(Double cny) {
        this.cny = cny;
    }

    public Double getCad() {
        return cad;
    }

    public void setCad(Double cad) {
        this.cad = cad;
    }

    public Double getAud() {
        return aud;
    }

    public void setAud(Double aud) {
        this.aud = aud;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    public void exchangeRate(){
      switch (currency) {
            case "cad" -> value = usd * cad;
            case "aud" -> value = usd * aud;
            case "cny" -> value = usd * cny;
            default -> {
            }
        }
    }
}
