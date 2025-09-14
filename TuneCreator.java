
/**
 * Write a description of class TuneCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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
       SimpleTune tune = new SimpleTune();
       tune.addNote("A", 10);
       tune.addNote("B", 10);
       tune.addNote("C", 10);
       tune.addNote("D", 10);
       tune.addNote("E", 10);
       tune.setInstrument(13);
       
       player.playTune(tune);
    }
}