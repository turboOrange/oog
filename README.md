# oog (the out of grave game bulder)
The out of grave game builder

/////////////////////////warning/////////////////////////////////////////////
This project is a work in progress and is not fully fonctional at the moment.
/////////////////////////////////////////////////////////////////////////////

This project is a programing language that make text games easy to create.
With two files 

## languages

This project uses the sablecc and objectMacro combo to create two languages, ooge and oog. 

### ooge

A ooge file is a list of evenements. There will be multiple types of evenements each comming with it's own set of atributes.

here is an exemple:

``` 

# This is a comment
first choice start : {
    background : "This is a ascii background."
    character : ":*)"
    text : "A clown is standing before you."
    exit 1 : "Talking about the plants."
    exit 2 : "Talking about the dogs."
    exit 3 : "Not talking."
}

choice stoptalking : {
    background : "This is a ascii background."
    character : "8*s"
    text : "The clown looks confused."
    exit 1 : "Look confused too."
    exit 2 : "Look happy."
    exit 3 : "Become a dog."
}

end adoption : {
    background : "This is a ascii background."
    character : "8*D"
    text : "The clown just adopted you."
}

```

This language suportes comments with '#'.
Here is the structure of an event:

`<type> <name> { <attributes> }`

Here is the structure of an atribute:

`<name> : "<content>"`

Alternatively, there is a way to get the content from a file like this:

`<name> : file "<file path>"`

There is also a choice type of atribute that looks like this:

`exit <number> : "<text>"`


The exact atributes to put are related to the type of event we are using. Here is a list of the available event types and there attributes:
#### choice
- background
- character
- text
- choice (with the choice sytaxt)

#### end
- background
- character
- text
this one stops the game once completed.

Here are ideas I have to futur ones:
- text recognition choice like in the old text games like 'grab vase' of 'talk to stranger'
- combat
- shop
- maybe some silly mini games

#### how to use a ooge file
Execute the main of src/event/Event.java with the ooge file as argument. The output will be a .ser file. This file must be in the same directory then the file created by oog to be used at execution.

### oog

A oog file defines the variables, the effects of event exits and generally likes events together.
We can see events as nodes and the content of oog as the arows that connect them.

Here is an exemple of a ogg file:

```

var hp invisible 0 10 20
var mp visible 0 1 100

event start : {
    exit 1 -> start
    exit 2 -> start [hp + 1
                     mp - 1]
    exit 3 -> stoptalking
}

event stoptalking : {
    exit 1 -> start
    exit 2 -> stoptalking
    exit 3 -> adoption
}

```

The variables must be defined above the rest.

Here is the syntax of a variable definition:

`var <name> <vibility> <min> <value at start> <max>`

The visibility value can be visible or invisible. This is to allow some variables to not be shown to the player when the variables are shown.
If druing the game a variable go out of the bonderies, it will just stay at the extream value.

Here is the syntax of an event:
` event <name> : { <list of exit effect> } `
and here is the syntax of an exit effect:
` exit <exit number> -> <event name> <list of variable effect> `
and here is how we write variable effects:
` [<variable name> <operator> <number> ...] `
We only have the operators '+' and '-' cause it's the only ones that makes sense I think for that kind of game.

#### how to use a oog file

Run the main of src/oog/CodeGenerator with the oog file as argument.
This will create a java file. Once the ser file from ooge is in the same directory as the java file, execute the java file to start the game.

The oog out file type is java but I am looking to create an other objectmacro file for an other language. I didn't decide it yet cause I don't know how I could transfer a serialised java object to an other language. The goal would be to have the possibility to run the game on modern hardware but also port it to vitage ones. I mean, it's a project about brigning back a type of game from the 80's, it would be nice to play those games in a computer of this era. :)