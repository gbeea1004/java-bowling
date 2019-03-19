package model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrameTest {
    @Test
    public void 한번_던지고_남은_핀수() {
        Frame frame = new Frame(0);
        assertThat(frame.remainPin()).isEqualTo(10);
    }

    @Test
    public void 한번_던지고_다맞춘경우() { // 스트라이크
        Frame frame = new Frame(10);
        assertThat(frame.status()).isEqualTo("스트라이크");
    }

    @Test
    public void 한번_던지고_한번_더_던져서_남은_핀_다맞춘경우() {  // 스페어
        Frame frame = new Frame(3);
        frame.play(7);
        assertThat(frame.status()).isEqualTo("스페어");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 핀이_0_미만인경우() {
        Frame frame = new Frame(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 핀이_10_초과한경우() {
        Frame frame = new Frame(11);
    }
}
