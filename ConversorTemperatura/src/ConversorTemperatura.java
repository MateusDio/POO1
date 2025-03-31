
public class ConversorTemperatura {
    double tempCelcius;
    int tempFahrenheit ;
    String tipoClima;

 

    public void setTempCelcius(double tempCelcius) {
        this.tempCelcius = tempCelcius;
    }

    public void setTempFahrenheit(int tempFahrenheit) {
        this.tempFahrenheit = tempFahrenheit;
    }

    public void setTipoClima(String tipoClima) {
        this.tipoClima = tipoClima;
    }

    public double getTempCelcius() {
        return tempCelcius;
    }

    public double getTempFahrenheit() {
        return tempFahrenheit;
    }

    public String getTipoClima() {
        return tipoClima;
    }
 

    public ConversorTemperatura(double tempCelcius) {
        this.tempCelcius = tempCelcius;
        this.tempFahrenheit = (int) ((tempCelcius *9/5 ) + 32) ;
        
        if(tempFahrenheit<=64.4){
            
            this.tipoClima = "O Clima é Frio" ;
            
        } else if(66.2 <= tempFahrenheit && tempFahrenheit <= 73.4){
            this.tipoClima = "O Clima é Agradável";
            
        
        } else if(75.2 <= tempFahrenheit && tempFahrenheit <= 95){
            this.tipoClima = "O Clima é Quente";
            
        
        } else if( tempFahrenheit > 95){
            this.tipoClima = "O Clima é muito Quente";
            
        }
        
    }
    
    public ConversorTemperatura( int tempFahrenheit ) {
        this.tempFahrenheit = (tempFahrenheit - 32) * 5/9;
        
        if(tempCelcius<=20){
            
            this.tipoClima = "O Clima é Frio" ;
            
        } else if(22 <= tempCelcius && tempCelcius <= 27){
            this.tipoClima = "O Clima é Agradável";
            
        
        } else if(30 <= tempCelcius && tempCelcius <= 38){
            this.tipoClima = "O Clima é Quente";
            
        
        } else if( tempCelcius >= 41){
            this.tipoClima = "O Clima é muito Quente";
            
        }
        
    }
    
   
    
       @Override
    public String toString() {
        return "ConversorTemperatura{" + "tempCelcius=" + tempCelcius + ", tempFahrenheit=" + tempFahrenheit + ", tipoClima=" + tipoClima + '}';
    }
    
   
    
}
