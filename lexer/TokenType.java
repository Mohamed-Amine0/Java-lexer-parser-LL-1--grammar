//package lexer;

public enum TokenType {
	ID, // [a-zA-Z][a-zA-Z0-9_]*
	ENTIER, // entier
	CHAR, // char
	REEL, // reel
	BOOLEAN, // boolean
	EOF, // input stream has been consumed
	UNKNOWN, // character/token could not be processed
	
	// opr
	AND, // &&
	OR, // ||

	EQ, // ==
	NEQ, // !=
	LT, // <
	RT, // >
	LT_EQ, // <=
	RT_EQ, // >=

	PLUS, // +
	MINUS, // -
	TIMES, // *
	DIV, // /
	MOD, // %

	// reserved words
	DEBUT,
	TYPE_entier,
	TYPE_reel,
	TYPE_char,
	TYPE_boolean,
	SI,
	ALORS,
    SINON,
    FSI,
    FPOUR,
    POUR,
    FAIRE,
	NON,

	// punctuation
	LPAREN, // (
	RPAREN, // )
	LBRACKET, // [
	RBRACKET, // ]
	LBRACE, // {
	RBRACE, // }
	SEMI, // ;
	COMMA, // ,
	ASSIGN; // =
}