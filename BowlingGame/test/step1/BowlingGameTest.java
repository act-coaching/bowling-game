package step1;

import org.junit.Test;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;
import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    @Test
    public void testGutterGame(){
        BowlingGame game = new BowlingGame();
        for(int i = 0 ; i < 20 ; i++){
            game.roll(0);
        }
        assertEquals(0,game.getScore());
    }
}


