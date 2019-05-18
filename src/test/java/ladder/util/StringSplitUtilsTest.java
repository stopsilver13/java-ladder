package ladder.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class StringSplitUtilsTest {

    @Test
    void 쉼표로_문자열_구분하기() {
        assertThat(StringSplitUtils.splitString("pobi,honux,crong,jk"))
                .isEqualTo(Arrays.asList("pobi", "honux", "crong", "jk"));
    }
}
