import java.util.regex.*;


public class Tema13 {
    public static void main(String[] args) {
        // String texto = "Podemos agrupar una parte de nuestra expresión regular con
        // paréntesis"
        // "Además de poder agrupar, podemos crear una referencia posterior de la
        // expresión, es decir, una referencia que se hace más tarde almacena la parte
        // de string que coincide con el grupo";
        Textos t = new Textos();
        String texto = t.leer("texto.txt");
        String pattern = ("(3[0-1]|[12][0-9]|0[1-9])/(0[1-9]|1[0-2])/[0-9]{4}");

        // Usar una expresión regular para crear un array con los elementos'
        String Ope[] = texto.split("[\\s]");

        
        // ahora buscamos los patrones de la expresion regular y validamos las fechas;
    
        for(int i = 0; i<=Ope.length-1; i= i + 1){
            if (Ope[i].matches(pattern)) {
                String fecha[] = Ope[i].split("/");
                 int año = Integer.parseInt(fecha[2]);
                 int dia = Integer.parseInt(fecha[0]);
                 int mes = Integer.parseInt(fecha[1]);

                 if(año % 400 == 0 || (año % 4 == 0 && año % 100 != 0) ){
                    
                    if(mes % 2 == 0 && mes < 8 && mes != 2){
                        if(dia<31){
                            System.out.println("La fecha "+"[" + Ope[i]+"]"+ " Es valida y es un año bisiesto");
                        } else {
                             System.out.println("La fecha "+"[" + Ope[i]+"]"+ " No es valida el mes: " + mes + "No tiene 31");
                        }
                    } if (mes % 2 != 0 && mes < 7 && mes != 2) {
                         System.out.println("La fecha "+"[" + Ope[i]+"]"+ " Es valida y es un año bisiesto");
                    } if (mes == 2) {
                        if(dia>29){
                             System.out.println("La fecha "+"[" + Ope[i]+"]"+ " No es valida el mes de febrero" + " solo llega hasta el dia 29");
                        } else{
                            System.out.println("La fecha "+"[" + Ope[i]+"]"+ " Es valida y es un año bisiesto");
                        }
                    } if(mes % 2 == 0 && mes >= 8){
                        System.out.println("La fecha "+"[" + Ope[i]+"]"+ " Es valida y es un año bisiesto");
                    } if(mes>=8 && mes % 2 !=0){
                        if(dia<31){
                            System.out.println("La fecha "+"[" + Ope[i]+"]"+ " Es valida y es un año bisiesto");
                        } else {
                             System.out.println("La fecha "+"[" + Ope[i]+"]"+ " No es valida el mes: " + mes + "No tiene 31");
                        }
                    }
                    
                 } else {

                    if(mes % 2 == 0 && mes < 8 && mes != 2){
                        if(dia<31){
                            System.out.println("La fecha "+"[" + Ope[i]+"]"+ " Es valida y NO es un año bisiesto");
                        } else {
                             System.out.println("La fecha "+"[" + Ope[i]+"]"+ " No es valida el mes: " + mes + "No tiene 31");
                        }
                    } if (mes % 2 != 0 && mes < 7 && mes != 2) {
                         System.out.println("La fecha "+"[" + Ope[i]+"]"+ " Es valida y NO es un año bisiesto");
                    } if (mes == 2) {
                        if(dia>28){
                             System.out.println("La fecha "+"[" + Ope[i]+"]"+ " No es valida el mes de febrero" + " solo llega hasta el dia 28");
                        } else {
                             System.out.println("La fecha "+"[" + Ope[i]+"]"+ " Es valida y NO es un año bisiesto");
                        }
                    } if(mes % 2 == 0 && mes >= 8){
                        System.out.println("La fecha "+"[" + Ope[i]+"]"+ " Es valida y NO es un año bisiesto");
                    } if(mes>=8 && mes % 2 !=0){
                        if(dia<31){
                            System.out.println("La fecha "+"[" + Ope[i]+"]"+ " Es valida y NO es un año bisiesto");
                        } else {
                             System.out.println("La fecha "+"[" + Ope[i]+"]"+ " No es valida el mes: " + mes + "No tiene 31");
                        }
                    }

                 }

            } 
        }

    }
}
