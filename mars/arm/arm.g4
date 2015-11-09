// rules
grammar arm;
file : root? EOF;
root : instruction root?;
instruction : operation REGISTER ',' REGISTER ',' op2;
operation : OPCODE TEST?;
op2 : IMMEDIATE | REGISTER;

// tokens
OPCODE: [A-Za-z]+;
TEST : 'eq' | 's';
IMMEDIATE : '#'[0-9]+;
REGISTER : 'r'[0-9][0-9]?;
WS : [ \t\r\n]+ -> skip;