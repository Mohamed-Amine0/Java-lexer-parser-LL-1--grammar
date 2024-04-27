//package lexer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class TestLexer {
	public static void main(String[] args) throws IOException {
		if (args.length == 0)
			System.err.println("No file arguments given");
		else {
			// parse each file argument given
			for (int i = 0; i < args.length; i++) {
				FileReader file;
				// attempt to open file
				try {
					file = new FileReader(args[i]);
				} catch (FileNotFoundException e) {
					System.err.println(args[i] + " was not found!");
					continue; // try next file
				}
				
				// create lexer
				Lexer lexer = new Lexer(file);
				
				// start tokenizing file
				System.out.println("Analyse lexicale de " + args[i] + "...");
				long startTime = System.currentTimeMillis();
				int numTokens = 0;
				Token token;
				do {
					token = lexer.getToken();
					numTokens++;
					
					if(token.getType() == TokenType.UNKNOWN){
						// print token type and location
						System.err.print(token.getType());
						System.err.print(" (" + token.getLineNumber() + "," + token.getColumnNumber() + ")");
						System.out.println();
						continue;
					}
					
					System.out.print(token.getType());
					System.out.print(" (" + token.getLineNumber() + "," + token.getColumnNumber() + ")");
					
					// print out semantic values for ID and INT_CONST tokens
					if (token.getType() == TokenType.ID)
						System.out.println(": " + token.getAttribute().getIdVal());
					else if (token.getType() == TokenType.ENTIER)
						System.out.println(": " + token.getAttribute().getIntVal());
					else if (token.getType() == TokenType.REEL)
						System.out.println(": " + token.getAttribute().getFloatVal());
					else if (token.getType() == TokenType.CHAR)
						System.out.println(": " + token.getAttribute().getCharVal());
					else if (token.getType() == TokenType.BOOLEAN)
						System.out.println(": " + token.getAttribute().getBooleanVal());
					else
						System.out.println();
					
				} while (token.getType() != TokenType.EOF);
				
				long endTime = System.currentTimeMillis();
				
				// print out statistics
				System.out.println("---");
				System.out.println("Nombre d'elements: " + numTokens);
				System.out.println("Temps d'execution: " + (endTime - startTime) + "ms");
				System.out.println();
			}
		}
	}
}