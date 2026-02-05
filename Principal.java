import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Principal{
    public static void main(String [] args){
        
        System.out.print("Hola mundo");
    }

    public static String fechaHora() {
        LocalDateTime present = LocarDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.offPattern("dd/MM/yyyy HH:mm:ss");

    
        return present.format(format);
    
    }
}
