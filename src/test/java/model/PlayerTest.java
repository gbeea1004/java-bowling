package model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    @Test
    public void 점수확인() {
        Player player = new Player("포비");
        player.play(3);
        player.play(4);
//        assertThat(player.showScore()).isEqualTo(7);
    }
}
