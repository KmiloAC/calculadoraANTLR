grammar LabeledExpr;

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   ID '=' expr NEWLINE         # assign
    |   NEWLINE                     # blank
    ;

expr:   expr op=('*'|'/') expr      # MulDiv
    |   expr op=('+'|'-') expr      # AddSub
    |   FLOAT                       # float
    |   INT                         # int
    |   ID                          # id
    |   '(' expr ')'                # parens
    ;

MUL :   '*' ; 
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;     
INT :   '-'?[0-9]+ ;         // match integers, now with optional negative sign
FLOAT : '-'?([0-9]+[.][0-9]* | [0-9]*[.][0-9]+) ;  // match floats, with optional negative sign
NEWLINE:'\r'? '\n' ;     
WS  :   [ \t]+ -> skip ; 

