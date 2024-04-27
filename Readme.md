## Context
This project aims to implement a lexical and syntactic analyzer in Java for a given grammar. I use a formal grammar to specify the syntactic structure of the programs that my analyzer will be able to recognize.

## Grammar
```P -> S
S -> debut { S }
S -> D ; S 
S -> I ; S 
S -> I ;
S -> D ;
D -> TYPE id
TYPE -> entier 
TYPE -> float
TYPE -> char
TYPE -> boolean
I -> id = E
I -> ecrire E 
I -> lire id
I -> si E alors I fsi
I -> si E alors I sinon I fsi
I -> pour id dans [ id .. id ] faire I fpour
E -> PE opr E
E -> PE 
PE -> - PE
PE -> non PE
PE -> id
```

## Lexical and Syntactic Analysis
- **Lexical analysis test:** ```java TestLexer.java lexer04.txt``` 
- **Syntactic analysis test:** ```java Main```

## Tables
- **Items Table**
- **SLR Table**
- You can use this [link](https://jsmachines.sourceforge.net/machines/slr.html) to generate tables for the chosen grammar.
- These tables are used in the code of ```parser.java```.

## Note
- The chosen grammar is of type LL1 and does not admit duplicates in the SLR table.