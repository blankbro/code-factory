package io.github.amzexin.commons.test.all.util;

import io.github.amzexin.commons.util.io.FileUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * Description: FileUtilTest
 *
 * @author Lizexin
 * @date 2022-07-15 15:33
 */
public class FileUtilsTest {

    @Test
    public void test20220715_1533() throws IOException {
        System.out.println(FileUtils.getFileContent("logback.xml"));

    }
}
