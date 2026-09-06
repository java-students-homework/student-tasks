package academy.week04;

import java.time.LocalDate;

/**
 * Week 4 · Lesson 7 — date and time: LocalDate, Period, ChronoUnit.
 * Never use java.util.Date here.
 */
public class DateTimeTasks {

    /**
     * How many full days between from and to (to is later).
     * Hint: ChronoUnit.DAYS.
     * Example: 2024-01-01 → 2024-01-03 = 2.
     */
    public long daysBetween(LocalDate from, LocalDate to) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Is the date a Saturday or a Sunday?
     * Hint: getDayOfWeek().
     */
    public boolean isWeekend(LocalDate date) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * The last day of the month of the given date.
     * Example: 2024-02-10 → 2024-02-29 (leap year!).
     * Hint: lengthOfMonth() or TemporalAdjusters.
     */
    public LocalDate lastDayOfMonth(LocalDate date) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Full years between birthDate and today.
     * Hint: Period.between.
     * Example: born 2000-05-20, today 2024-05-19 → 23.
     */
    public int ageInYears(LocalDate birthDate, LocalDate today) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Format the date as "dd.MM.yyyy".
     * Example: 2024-03-07 → "07.03.2024".
     * Hint: DateTimeFormatter.ofPattern.
     */
    public String format(LocalDate date) {
        throw new UnsupportedOperationException("TODO");
    }
}
