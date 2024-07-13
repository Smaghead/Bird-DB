# Big year
## Details
In this exercise you will design and implement a database for bird-watchers. The database contains birds, each of which has a name (string) and a name in Latin (string). The database also counts the observations of each bird.

The program must implement the following commands:

    Add - adds a bird
    Observation - adds an observation
    All - prints all birds
    One - prints one bird
    Quit - ends the program
Incorrect input must also be handled. The following is an example of the program functionality:

    ? Add
    Name: Crow
    Name in Latin: Corvus Corvus
    ? Add
    Name: Hawk
    Name in Latin: Dorkus Dorkus
    ? Observation
    Bird? Hawk
    ? Observation
    Bird? Lion
    Not a bird!
    ? Observation
    Bird? Hawk
    ? All
    Hawk (Dorkus Dorkus): 2 observations
    Crow (Corvus Corvus): 0 observations
    ? One
    Bird? Hawk
    Hawk (Dorkus Dorkus): 2 observations
    ? Quit
