
import java.util.ArrayList;

public class LEZIONE17 {   //dovete chiamare il file cosi
  
    


  public static void main(String[] args) {

    // Qui vado a inizializare l'Array tramire la classe array list
    ArrayList<String> CaniBelli = new ArrayList<String>();
    
    // qui usiamo il comando --> [ nomearray.add ] ad aggiungere un elemento al nostra array che andra nella posizione?
    CaniBelli.add("DOGGO");

    // qui usiamo il comando --> [ nomearray.get ] stampo un elemento dell'array selezionandolo per index/ posizione
    CaniBelli.get(0);

    CaniBelli.add("Lessy");
    CaniBelli.add("Scobby doo");

    // STAMPA TUTTI GLI ELEMENTI DELL ARRAY
    System.out.println(CaniBelli);

    // qui usiamo il comando --> [ nomearray.set ] andiamo a decidere che un eleemtno verrà posizionato in quella posizione
    CaniBelli.set(0, "doggoancorapiùbello");
  

    // qui usiamo il comando --> [ nomearray.remove ] per rimuovere un singolo dato nella posizione indicata
    CaniBelli.remove(2);

    // qui usiamo il comando --> [ nomearray.clear ] per rimuovere tutti gli elementi nell ArrayList 
    CaniBelli.clear();











//Esempi di contesto
//--------------------------------------------------------------


//FOR
// Usiamo il nostro Array come elemento da cilare col for?
for (int i = 0; i < CaniBelli.size(); i++) {
        System.out.println(CaniBelli.get(i));
      }





//WHILE
// usiamo una variabile che creiamo per il controllo l'esattenza di un campo STRING 

String x = "Lessy"; // questa è la nostra "password" in formtato strinf

int verifica = 0; // questo è l'iteratore ci servirà dopo
      
while(x.equals(CaniBelli.get(1))){

    System.out.println("hai le crendenziali bau");
};



//WHILE E IF

while(verifica < CaniBelli.size()){

    //verifica++; perchè qui no?
   
    if(x.equals(CaniBelli.get(verifica))){

     System.out.println("hai le crendenziali bau");
    
    }else{
     
     System.out.println("Ehy tu! non hai le crendenziali bau");
    
    };
    verifica++; // oppure x+1=x serve per aumentare il contartore di controllo

}


// QUI RESETTO LA VERIFICA IN INT
if(verifica == CaniBelli.size()){

    verifica = 0;

}




//DO WHILE E IF

do{

    verifica++; // oppure x+1=x serve per aumentare il contartore di controllo


    if(x.equals(CaniBelli.get(verifica))){

        System.out.println("hai le crendenziali bau");
       
    }else{
        
        System.out.println("Ehy tu! non hai le crendenziali bau");
       
       };


}while(!(x.equals(CaniBelli.get(verifica))));



// QUI RESETTO LA VERIFICA IN INT
if(verifica == CaniBelli.size()){

    verifica = 0;

}


}}