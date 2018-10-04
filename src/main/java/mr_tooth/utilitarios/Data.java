package mr_tooth.utilitarios;
import java.util.Date;
/**
 *
 * @author Pedro
 */
public class Data {

    public static String semana, dia, mes, mes_num, ano;


    public void verData(){

        Date data = new Date();
        dia = ""+data.getDate();
        ano = ""+(1900 + data.getYear());

         switch(data.getDay()){
            case 0: semana = "Domingo";
                break;
            case 1: semana = "Segunda-Feira";
                break;
            case 2: semana = "Terça-Feira";
                break;
            case 3: semana = "Quarta-Feira";
                break;
            case 4: semana = "Quinta-Feira";
                break;
            case 5: semana = "Sexta-Feira";
                break;
            case 6: semana = "Sábado";
                break;
        }
        
        switch(data.getMonth()){
            case 0: mes = "Janeiro";
                break;
            case 1: mes = "Fevereiro";
                break;
            case 2: mes = "Março";
                break;
            case 3: mes = "Abril";
                break;
            case 4: mes = "Maio";
                break;
            case 5: mes = "Junho";
                break;
            case 6: mes = "Julho";
                break;
            case 7: mes = "Agosto";
                break;
            case 8: mes = "Setembro";
                break;
            case 9: mes = "Outubro";
                break;
            case 10: mes = "Novembro";
                break;
            case 11: mes = "Dezembro";
                break;           
        }

        switch(data.getMonth()){
            case 0: mes_num = "01";
                break;
            case 1: mes_num = "02";
                break;
            case 2: mes_num = "03";
                break;
            case 3: mes_num = "04";
                break;
            case 4: mes_num = "05";
                break;
            case 5: mes_num = "06";
                break;
            case 6: mes_num = "07";
                break;
            case 7: mes_num = "08";
                break;
            case 8: mes_num = "09";
                break;
            case 9: mes_num = "10";
                break;
            case 10: mes_num = "11";
                break;
            case 11: mes_num = "12";
                break;
        }
    }
}
