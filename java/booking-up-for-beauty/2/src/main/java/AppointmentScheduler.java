import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    private static final DateTimeFormatter APPOINTMENT_SCHEDULE_PARSER = DateTimeFormatter.ofPattern("M/d/y H:m:s");
    private static final DateTimeFormatter APPOINTMENT_DESCRIPTION_FORMATTER = DateTimeFormatter
            .ofPattern("'You have an appointment on' cccc, MMMM d, u, 'at' h:mm a.");

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, APPOINTMENT_SCHEDULE_PARSER);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return appointmentDate.format(APPOINTMENT_DESCRIPTION_FORMATTER);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
