Project: midi-player
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 3.

Q47 and Q48:
public class TuneCreator
{
    // instance variables - replace the example below with your own
    private MidiPlayer player;

    /**
     * Constructor for objects of class TuneCreator
     */
    public TuneCreator()
    {
        // creates a MidiPlayer object named player
        player = new MidiPlayer();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void CreateAndPlay()
    {
        // put your code here
        
    }
    
Q49 and Q50: public void CreateAndPlay()
    {
       SimpleTune tune = new SimpleTune();
       tune.addNote("A", 10);
       tune.addNote("B", 10);
       tune.addNote("C", 10);
       tune.addNote("D", 10);
       tune.addNote("E", 10);
       tune.setInstrument(13);
       
       player.playTune(tune);
    }
    

