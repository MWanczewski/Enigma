package file.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileUtilsTest {
    private final int NUMBER_OF_FILE_LINES = 2;
    private final String PATH_TO_FILE = this.getClass().getResource("/filesUtils/test.txt").getPath();
    private final String FIRST_LINE = "Ala ma kota, kot ma Ale.";

    @Test
    protected void testIfNumberOfLineAreEquals() {
        String fileContent = FileTool.getFileContent(PATH_TO_FILE);
        String[] split = fileContent.split("\n");
        Assertions.assertEquals(NUMBER_OF_FILE_LINES, split.length);
    }

    @Test
    protected void testFirstLinesAreEqual() {
        String fileContent = FileTool.getFileContent(PATH_TO_FILE);
        String[] split = fileContent.split("\n");
        Assertions.assertEquals(FIRST_LINE, split[0]);
    }

    @Test
    protected void howDoesSplitWorks() {
        String textToSplit = PATH_TO_FILE;
        String[] split = textToSplit.split("/");
        for (String s : split) {
            System.out.print(s + " ");
        }
    }
}
