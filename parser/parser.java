//package compilateurnewversion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class parser {


public String[] LRGS = {
"S->debut { S }",
"S->D ; S",
"S->I ; S",
"S->I ;",
"S->D ;",
"D->TYPE id",
"TYPE->entier",
"TYPE->float",
"TYPE->char",
"TYPE->boolean",
"I->id = E",
"I->ecrire E",
"I->lire id",
"I->si E alors I fsi",
"I->si E alors I sinon I fsi",
"I->pour id dans [ id .. id ] faire I fpour",
"E->PE opr E",
"E->PE",
"PE->- PE",
"PE->non PE",
"PE->id"};

public String[][] tableSLR = {
{"etat/VT",	"debut",	"{",	"}",	";",	"id",	"entier",	"float",	"char",	"boolean",	"=",	"ecrire",	"lire",	"si",	"alors",	"fsi",	"sinon",	"pour",	"dans",	"[",	"..",	"]",	"faire",	"fpour",	"opr",	"-",	"non",	"$",	"S",	"D",	"TYPE",	"I",	"E",	"PE"},
{"0",    "s2",	"err",	"err",	"err",	"s6",	"s11",	"s12",	"s13",	"s14",	"err",	"s7",	"s8",	"s9",	"err",	"err",	"err",	"s10",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"1",	"3",	"5",	"4",	"err",	"err"},
{"1",    "err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"acc",	"err",	"err",	"err",	"err",	"err",	"err"},
{"2",    "err",	"s15",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"3",    "err",	"err",	"err",	"s16",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"4",    "err",	"err",	"err",	"s17",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"5",    "err",	"err",	"err",	"err",	"s18",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"6",    "err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s19",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"7",    "err",	"err",	"err",	"err",	"s24",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s22",	"s23",	"err",	"err",	"err",	"err",	"err",	"20",	"21"},
{"8",    "err",	"err",	"err",	"err",	"s25",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"9",    "err",	"err",	"err",	"err",	"s24",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s22",	"s23",	"err",	"err",	"err",	"err",	"err",	"26",	"21"},
{"10",	"err",	"err",	"err",	"err",	"s27",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"11",	"err",	"err",	"err",	"err",	"r7",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"12",	"err",	"err",	"err",	"err",	"r8",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"13",	"err",	"err",	"err",	"err",	"r9",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"14",	"err",	"err",	"err",	"err",	"r10",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"15",	"s2",	"err",	"err",	"err",	"s6",	"s11",	"s12",	"s13",	"s14",	"err",	"s7",	"s8",	"s9",	"err",	"err",	"err",	"s10",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"28",	"3",	"5",	"4",	"err",	"err"},
{"16",	"s2",	"err",	"r5",	"err",	"s6",	"s11",	"s12",	"s13",	"s14",	"err",	"s7",	"s8",	"s9",	"err",	"err",	"err",	"s10",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r5",	"29",	"3",	"5",	"4",	"err",	"err"},
{"17",	"s2",	"err",	"r4",	"err",	"s6",	"s11",	"s12",	"s13",	"s14",	"err",	"s7",	"s8",	"s9",	"err",	"err",	"err",	"s10",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r4",	"30",	"3",	"5",	"4",	"err",	"err"},
{"18",	"err",	"err",	"err",	"r6",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"19",	"err",	"err",	"err",	"err",	"s24",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s22",	"s23",	"err",	"err",	"err",	"err",	"err",	"31",	"21"},
{"20",	"err",	"err",	"err",	"r12",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r12",	"r12",	"err",	"err",	"err",	"err",	"err",	"err",	"r12",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"21",	"err",	"err",	"err",	"r18",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r18",	"r18",	"r18",	"err",	"err",	"err",	"err",	"err",	"err",	"r18",	"s32",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"22",	"err",	"err",	"err",	"err",	"s24",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s22",	"s23",	"err",	"err",	"err",	"err",	"err",	"err",	"33"},
{"23",	"err",	"err",	"err",	"err",	"s24",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s22",	"s23",	"err",	"err",	"err",	"err",	"err",	"err",	"34"},
{"24",	"err",	"err",	"err",	"r21",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r21",	"r21",	"r21",	"err",	"err",	"err",	"err",	"err",	"err",	"r21",	"r21",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"25",	"err",	"err",	"err",	"r13",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r13",	"r13",	"err",	"err",	"err",	"err",	"err",	"err",	"r13",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"26",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s35",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"27",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s36",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"28",	"err",	"err",	"s37",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"29",	"err",	"err",	"r2",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r2",	"err",	"err",	"err",	"err",	"err",	"err"},
{"30",	"err",	"err",	"r3",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r3",	"err",	"err",	"err",	"err",	"err",	"err"},
{"31",	"err",	"err",	"err",	"r11",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r11",	"r11",	"err",	"err",	"err",	"err",	"err",	"err",	"r11",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"32",	"err",	"err",	"err",	"err",	"s24",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s22",	"s23",	"err",	"err",	"err",	"err",	"err",	"38",	"21"},
{"33",	"err",	"err",	"err",	"r19",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r19",	"r19",	"r19",	"err",	"err",	"err",	"err",	"err",	"err",	"r19",	"r19",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"34",	"err",	"err",	"err",	"r20",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r20",	"r20",	"r20",	"err",	"err",	"err",	"err",	"err",	"err",	"r20",	"r20",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"35",	"err",	"err",	"err",	"err",	"s6",	"err",	"err",	"err",	"err",	"err",	"s7",	"s8",	"s9",	"err",	"err",	"err",	"s10",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"39",	"err",	"err"},
{"36",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s40",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"37",	"err",	"err",	"r1",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r1",	"err",	"err",	"err",	"err",	"err",	"err"},
{"38",	"err",	"err",	"err",	"r17",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r17",	"r17",	"r17",	"err",	"err",	"err",	"err",	"err",	"err",	"r17",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"39",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s41",	"s42",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"40",	"err",	"err",	"err",	"err",	"s43",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"41",	"err",	"err",	"err",	"r14",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r14",	"r14",	"err",	"err",	"err",	"err",	"err",	"err",	"r14",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"42",	"err",	"err",	"err",	"err",	"s6",	"err",	"err",	"err",	"err",	"err",	"s7",	"s8",	"s9",	"err",	"err",	"err",	"s10",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"44",	"err",	"err"},
{"43",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s45",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"44",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s46",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"45",	"err",	"err",	"err",	"err",	"s47",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"46",	"err",	"err",	"err",	"r15",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r15",	"r15",	"err",	"err",	"err",	"err",	"err",	"err",	"r15",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"47",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s48",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"48",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s49",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"49",	"err",	"err",	"err",	"err",	"s6",	"err",	"err",	"err",	"err",	"err",	"s7",	"s8",	"s9",	"err",	"err",	"err",	"s10",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"50",	"err",	"err"},
{"50",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"s51",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"},
{"51",	"err",	"err",	"err",	"r16",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"r16",	"r16",	"err",	"err",	"err",	"err",	"err",	"err",	"r16",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err",	"err"}


};    
    
     


   
    
    public Stack<String> stackState = new Stack<>();
    
    
    public Stack<String> analyse = new Stack<>();
    
    public Stack<String> stackSymbol = new Stack<>();
    String ch[]= {"debut","{","entier","id",";","entier","id",";","pour","id","dans","[","id","..","id","]","faire","id","=","id","opr","id","fpour",";","}","$"};
    public String strInput ;
    
   
    public String action = "";
    
    
    
    int index = 0;

   
    public void analyzeSLnew() {
    	
        action = "";
        index = 0;
       
        analyse.push("0");
        
       
        System.out.println("********pile     Entrée   Action			   ");
        this.AfficherSLR();
    
       while(index<ch.length) 
        
        {
              
            String s = analyse.peek();
            
            String act=Action(s,ch[index]);
          System.out.println(act);
            if (Action(s,ch[index]).charAt(0) == 's') {
                   	
                
                analyse.push(ch[index]);
                analyse.push(Action(s, ch[index]).substring(1));
               
                              
              
                index++;
                action = "shift";
                
                AfficherSLR();
            }
            // Réduction
            else if (Action(s,ch[index]).charAt(0) == 'r') {
                
                String str = LRGS[Integer.parseInt(Action(s, ch[index]).substring(1)) - 1];
                
                int pos= str.indexOf('>');

               
                String tabparties[]= str.split("->");
                System.out.println(tabparties[0]);
                
                System.out.println(tabparties[1]);
                String Partiegauche=tabparties[0];
                System.out.println("Partiegauche"+Partiegauche); 
                
                String Partiedroite=tabparties[1];
                System.out.println("Partiedroite"+Partiedroite); 
                
                String tabtoken[]= Partiedroite.split(" ");
                int taillepile= tabtoken.length +tabtoken.length;
               
               
                for (int i = 0; i < taillepile; i++) {
                	
                  
                    
                    analyse.pop();
                    
                }
                String sommetpile = analyse.peek();
                analyse.push(Partiegauche);
                String tetesucc = analyse.peek();
                
                analyse.push(Action(sommetpile, Partiegauche));
                
               
                action = "reduce:" + str;
                AfficherSLR();
            } 
            //acceptation
            else if (Action(s,ch[index]) == "acc")
            	{
            	System.out.println("analyze SLR successfully"); 
            	break;}
            	
            else
            	//erreur
            	{
            	
            	System.out.println("texterreur"+Action(s,ch[index])+s+ch[index]+index); 
            	System.out.println("analyze SLR failled"); 
        	break;
            	}
               
        }
        
    }
  
   
    
    public void analyzeSLnew(String []tt) {
    	
        action = "";
        index = 0;
       
        analyse.push("0");
        
       
        System.out.println("********pile     	    Entrée            Action***********");
        this.AfficherSLRnew(tt);
    
       while(index<tt.length) 
        
        {
        	
    	   
          //  String s = stackState.peek();
            
            String s = analyse.peek();
            
            String act=Action(s,tt[index]);
          
            if (Action(s,tt[index]).charAt(0) == 's') {
            	
            	
                stackState.push(Action(s, ch[index]).substring(1));
                stackSymbol.push(ch[index]);
                
                analyse.push(tt[index]);
                analyse.push(Action(s, tt[index]).substring(1));
               
                
                
              
                index++;
                action = "shift ";
                
                AfficherSLRnew(tt);
            }
            // Réduction
            else if (Action(s,tt[index]).charAt(0) == 'r') {
    
                String str = LRGS[Integer.parseInt(Action(s, tt[index]).substring(1)) - 1];
                int pos= str.indexOf('>');
               
                String tabparties[]= str.split("->");
                
                
                String Partiegauche=tabparties[0];
                System.out.println("Partiegauche"+Partiegauche); 
                
                String Partiedroite=tabparties[1];
                System.out.println("Partiedroite"+Partiedroite); 
                
                String tabtoken[]= Partiedroite.split(" ");
                int taillepile= tabtoken.length +tabtoken.length;
               
               
                for (int i = 0; i < taillepile; i++) {
                	
                  
                    
                    analyse.pop();
                    
                }
                String sommetpile = analyse.peek();
                analyse.push(Partiegauche);
                String tetesucc = analyse.peek();
                
                analyse.push(Action(sommetpile, Partiegauche));
                
               
                action = "reduce:" + str;
                AfficherSLRnew(tt);
            } 
            //acceptation
            else if (Action(s,tt[index]) == "acc")
            	{
            	System.out.println("analyze SLR successfully"); 
            	break;}
            	
            else
            	//erreur
            	{
            	
            	System.out.println("texterreur"+Action(s,ch[index])+s+ch[index]+index); 
            	System.out.println("analyze SLR failled"); 
        	break;
            	}
               
        }
        
    }
    
    
    
    
    public String Action(String s, String a) {
        for (int i = 1; i <52 ; i++)
            if (tableSLR[i][0].equals(s))
                for (int j = 1; j <34; j++)
                    if (tableSLR[0][j].equals(a))
                        return tableSLR[i][j];
        return "r16";
    }

    
 


    public void AfficherSLR() {
        //  SLR
    	
    	
    	String ss= "--";
    	String ss1= "--";
    	 int taillepile=analyse.size();
    	int taillepilediv2= taillepile /2;
         for(int i=0;i<taillepilediv2;i++)
     		ss=ss + "--" ;
         int tailleinput=ch.length;
         for(int i=0;i<tailleinput;i++)
     		ss1=ss1 + "--" ;
    	
    	
    	
        
       
        strInput="";
        for(int i=index; i<ch.length;i++)
        	strInput= strInput+ ch[i];
       
        System.out.printf("%s", analyse + ss1);
        System.out.printf("%s", strInput+ ss);
        System.out.printf("%s", action);
        System.out.println();
    }

    public void AfficherSLRnew(String []tt) {
        //  SLR
    	
    	
    	String ss= "--";
    	String ss1= "--";
    	 int taillepile=analyse.size();
    	int taillepilediv2= taillepile /2;
         for(int i=0;i<taillepilediv2;i++)
     		ss=ss + "--" ;
         int tailleinput=tt.length;
         for(int i=0;i<tailleinput;i++)
     		ss1=ss1 + "--" ;
    	
    	
    	
        
       
        strInput="";
        for(int i=index; i<tt.length;i++)
        	strInput= strInput+ tt[i];
       
        System.out.printf("%s", analyse + ss1);
        System.out.printf("%s", strInput+ ss);
        System.out.printf("%s", action);
        System.out.println();
    }

    public void ouput() {
        
        
        System.out.println("**********Tableau SLR¨********");

        for (int i = 0; i < 52 ; i++) {
            for (int j = 0; j <34; j++) {
                System.out.printf("%6s", tableSLR[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("**********Fin tableau SLR********");

    }
    
   
 

    
    
    
    
    

}





