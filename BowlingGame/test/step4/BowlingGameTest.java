package step4;

import org.junit.Before;
import org.junit.Test;
import step4.BowlingGame;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    /**
     * STEP4 : Strike에 대한 처리 필요 / 리펙토링 지속적으로 수행
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


    @Test
    public void 스트라이크를_한경우(){
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16,0);
        assertEquals(24,game.getScore());
    }

    private void rollStrike() {
        game.roll(10); //Strike
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


