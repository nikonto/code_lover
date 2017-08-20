/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

/**
 *
 * @author Nikhil
 */
abstract class Instrument
{
   abstract void play();
   
}

class Piano extends Instrument
{
    
    void play()
    {
        System.out.println("piano playing tan tan tan");
    }
}

class Flute extends Instrument
{
    
    void play()
    {
        System.out.println("flute playing tu tu tu");
    }
}

class Sure extends Flute
{
    
    void playSure()
    {
        System.out.println("sususu");
    }
}




class CheckInstrument
{
    public static void main(String args[])
    {
        String arr[] = {"piano","flute","guitar","tabla","banjo","sitar","tambura"};
           Flute ob = new Flute();
           Piano ob1 = new Piano();
           Sure ob2 = new Sure();
           ob.play();
//       Instrument ob1 = new Instrument() {
//
//            @Override
//            void play() {
//                throw new UnsupportedOperationException("Not supported yet.");
//            }
//        };
       
           Flute r;
           r = ob;
           r.play();
           
           r=ob2;
           
           
       
    }
}
