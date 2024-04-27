//package parserexemple;

import java.util.ArrayList;

//import compilateurnewversion.parser;
//import  parserexemple.Categorie;
//import parserexemple.Scanner;
//import parserexemple.UniteLexicale;



 
public class Main {
   
/*static ArrayList<String> tab= new ArrayList<String>();
    public static void main(String[] args) {
        Scanner anaLex=new Scanner("compilation/test.txt");
        //System.out.println(anaLex);


        UniteLexicale ul=null;
        do {
            ul=anaLex.lexemeSuivant();
            tab.add(ul.toString());
            //System.out.println(ul);
           
        } while(ul.getCategorie()!=Categorie.EOF);


for( int i=0; i<tab.size();i++)
       	
       	System.out.println(" " + 
       			tab.get(i));



    
    }*/
    public static void main(String[] args) {
        parser a=new parser();
        a.analyzeSLnew();

    }
   
}
