package mr_tooth.utilitarios;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pedroh
 */
public class ConverterData {

    public void novadata(String date){

        String [] d1 = date.split("/"); //separa o dia,mes e ano
        String data = d1[2]+"/"+d1[1]+"/"+d1[0]; // colocando ano,mês e dia
        String formato = "yyyy/MM/dd";
        SimpleDateFormat dataformatada = new SimpleDateFormat(formato);

        try {
         Date hoje = dataformatada.parse(data);
         String dat = dataformatada.format(hoje);
         System.out.println("VAlor da DATA : " + dat);

     } catch (ParseException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
     }
    }

}
