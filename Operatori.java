public class Operatori {
    


/* 

operatori basilari

+	Addition	SOMMIAMO	x + y	
-	Subtraction	SOTTRAIAMO	x - y	
*	Multiplication	MOLTIPLICHIAMO	x * y	
/	Division	DIVIDIAMO	x / y	
%	RETORNA LA RIMANENZA DI UNA DIVISIONE	x % y	
++	Increment	Increases the value of a variable by 1	++x	
--	Decrement	Decreases the value of a variable by 1	--x 





&& 	Solo se entrambe sono true puoi eseguire il codice		
|| 	Basta uno degli elemtni true per eseguire il codice		
!	Puoi eseguire il codice solo se l'affermazione della condizione è falsa	

*/







    
    public static void main(String[] args) {
        
        
        int x = 17;
        int y = 13;
        System.out.println(x > y); // STAMPA TRUE! PERCHè?
        
        int z = 123;

        // Minima testing
        // Cosi facciamo stampare direttamente cosa è successo
        if(x > y) {
            
            System.out.println(" il test di x > y ha dato come risultato");
            System.out.println( x > y);
        }





        


        
        //&& 	Solo se entrambe sono true puoi eseguire il codice
        if(x > y &&  z < x) {
            
            System.out.println(" RIESCI A FARMI STAMPARE?");
            
        }
        

        //|| 	Basta uno degli elementi true per eseguire il codice	
        if(x < y ||  z > x) {
            
            System.out.println(" RIESCI A FARMI STAMPARE? ");
            
        }

        //!	Puoi eseguire il codice solo se l'affermazione della condizione è falsa	
        if(!(x < y &&  z > x)) {
            
            System.out.println(" RIESCI A FARMI STAMPARE? ");
            
        }



      }


    
}
 

