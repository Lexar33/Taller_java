import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierApp {

    private void m1(){
        Supplier<LocalDateTime> fx= ()-> LocalDateTime.now().minusDays(1);
        System.out.println(fx.get());
    }

    //generar password aleatorio
    private void m2(){
        Supplier<String> makePassword = () -> {
            String characters= "ABCDEDDADDSDASDFGFGDSF";
            StringBuilder sb= new StringBuilder();
            for(int i=0;i<12;i++){
                int index=new Random().nextInt(characters.length());
                sb.append(characters.charAt(index));
            }
            return sb.toString();
        };
        String password= makePassword.get();
        System.out.println("Password: "+ password);
        LocalDate xxx ;
        LocalDateTime aaa;


    }

    public static void main(String[] args){
        SupplierApp app= new SupplierApp();
        app.m2();
    }

}
