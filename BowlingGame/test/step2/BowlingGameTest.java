package step2;

import org.junit.Before;
import org.junit.Test;
import step2.BowlingGame;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    /**
     * STEP 2 에서는 Before 를 통한 셋업, For문을 공통화 시키는 리펙토링을 진행해야 한다. (setup, RollMany)
     */

    BowlingGame game ;

    @Before
    public void setup(){
        game = new BowlingGame();
    }

    @Test
    public void testGutterGame(){
        rollMany(20,0);
        assertEquals(0,game.getScore());
    }

    @Test
    public void 모든프레임에서_핀하나씩_쓰러드린경우(){
        rollMany(20,1);
        assertEquals(20,game.getScore());
    }

    private void rollMany(int number, int pins) {
        for (int i = 0; i < number; i++) {
            game.roll(pins);
        }
    }


}


