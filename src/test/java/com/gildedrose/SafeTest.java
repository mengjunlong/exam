package com.gildedrose;

import com.google.common.io.Files;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author mjl
 * @since 2022-09-01
 */
public class SafeTest {
    @Test
    public void equalsWithBaseResult() throws IOException {
        String baseResult = TexttestFixture.getBaseResult();
        String originResult = Files.toString(new File("src/test/baseResult.txt"), StandardCharsets.UTF_8);
        assertEquals(originResult, baseResult);
    }
}
