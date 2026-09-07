void main() {
int kuponger = 10;
boolean fortsatt = true;
while (fortsatt)
{
IO.println("Välkommen till Gröna Lund!");
IO.println("Du har:" +kuponger + " kuponger att använda!");
IO.println("Välj en attraktion!");
IO.println("1. Cirkuskarosell");
IO.println("2. Pumpen");
IO.println("3.Flygande mattan");
IO.println("4. Gå hem");
String svar = IO.readln("Ange ditt val:");
int val = Integer.parseInt(svar);
if (val == 1)
{
    int kostnad = 1;
    if (kuponger >= kostnad)
    {
        kuponger = kuponger -kostnad;
        IO.println(kuponger +" dras!");
        IO.println("Du har" + kuponger + "kvar");
        IO.println("Du får åka cirkuskarosellen");
        IO.readln("Tryck enter för att fortsätta:");
    }
    else 
    {
        IO.println("Du har inga kuponger kvar!");
        fortsatt = false;
    }
}
else if (val == 2)
{
int kostnad = 2;
String svarage = IO.readln("Ange din ålder:");
int age = Integer.parseInt(svarage);
String svarheight= IO.readln("Ange din längd:");
int height = Integer.parseInt(svarheight);
String vuxen = IO.readln("har du en vuxen med dig?:");
if (height >= 120 && (age>= 7 || vuxen.equals("ja")))
{
 if (kuponger >= kostnad)
 {
    kuponger = kuponger - kostnad;
        IO.println(kuponger +" dras!");
        IO.println("Du har" + kuponger + "kvar");
        IO.println("Du får åka pumpen");
        IO.readln("Tryck enter för att fortsätta:");
    }
    else 
    {
        IO.println("Du har inte nog med kuponger!");
    }
 }
 else {
    IO.println("Du når inte kraven!");
    IO.readln("Tryck enter för att fortsätta:");
 }
}
else if (val == 3)
{
    int kostnad = 3;
    if (kuponger >= kostnad)
    {
        kuponger = kuponger - kostnad;
        IO.println(kuponger +" dras!");
        IO.println("Du har" + kuponger + "kvar");
        IO.println("Du får åka flygande mattan");
        IO.readln("Tryck enter för att fortsätta:");
    }
    else 
    {
        IO.println("Du har inga kuponger kvar!!");

    }
}
else if (val == 4) {
IO.println("Tack för ditt besök!");
fortsatt = false;
}
else {
    IO.println("Ogiltigt val");
}
}
}