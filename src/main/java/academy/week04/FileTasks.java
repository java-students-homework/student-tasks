package academy.week04;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * Week 4 · Lesson 6 — files: Files and Path.
 * Hint: Files.readAllLines, Files.write, Files.exists.
 * Declare throws IOException — do not swallow it with try-catch here.
 */
public class FileTasks {

    /**
     * How many lines the file has.
     * Example: file with "a\nb" → 2, empty file → 0.
     */
    public long countLines(Path file) throws IOException {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * All non-blank lines of the file, in order.
     * A line made of spaces only is blank too (hint: String.isBlank).
     */
    public List<String> readNonBlankLines(Path file) throws IOException {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Write the lines into the file (one per line).
     * If the file exists, it is overwritten.
     */
    public void writeLines(Path file, List<String> lines) throws IOException {
        throw new UnsupportedOperationException("TODO");
    }
}
