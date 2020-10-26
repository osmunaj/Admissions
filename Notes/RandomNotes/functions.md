# Functions: 

Naming a process
advantages: 
*Reusable
*Isolate changes 
*Abstraction

The fewer details we have to think about, the easier it is to think in big chunks of code

# In Java:

method

functions have imputs and outputs, not nessesary though. 

two types of functions:

1. Commands  -->  Without outputs
2. Queries   -->  With outputs

Side effects: Any changes to data that doesn't involve imputs or outputs


        static
accessibility static returntype name (Parameters){

}

public static int name(type a, ...){

}

public = accessable to all code
private = only functions within the same file or class can access
protected = worry about later

static = called from main

*Can only ever output one thing*

void = no output

doStuff();
doStuff(int x);

doStuff();
doStuff(3);

Overloading: 
useful when default data can change

Parameter = int x
argument = 3

