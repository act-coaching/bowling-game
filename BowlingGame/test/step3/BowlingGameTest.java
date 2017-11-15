package step3;

import org.junit.Before;
import org.junit.Test;
import step3.BowlingGame;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    /**
     * STEP3 : 명확하지 않은 이름에 대한 리팩토링 Frame에 대한 처리 , isSpare등 추가
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

    @Test
    public void 스페어처리를_한경우(){
        rollSpare();
        game.roll(3);
        rollMany(17,0);
        assertEquals(16,game.getScore());
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }


    private void rollMany(int number, int pins) {
        for (int i = 0; i < number; i++) {
            game.roll(pins);
        }
    }


}


