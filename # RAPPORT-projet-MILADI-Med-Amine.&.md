## Contexte
Ce projet vise à implémenter un analyseur lexical et syntaxique en Java pour une grammaire donnée. J'utilise une grammaire formelle pour spécifier la structure syntaxique des programmes que notre analyseur sera capable de reconnaître.
## Grammaire
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
## Analyse Lexicale et Syntaxique
- **Test analyse lexicale :** ```java TestLexer.java lexer04.txt``` 
- **Test analyse syntaxique :** ```java Main```
## Tables
- **Table des Items**
- **Table SLR**
- vous pouvez utiliser ce [site](https://jsmachines.sourceforge.net/machines/slr.html) pour generer les tables de la grammaire choisie
- ces tables sont untilisées dans le code de ````parser.java````

## Remarque
- La grammaire choisie est de type LL1 et n’admet pas de doublons dans la table SLR
