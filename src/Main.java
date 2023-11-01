import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TrainingAttendee> attendees;
        attendees = List.of(
                new TrainingAttendee() {
                    public void attendTraining() {
                        System.out.println("Attending training!");
                    }
                },
                new TrainingAttendee() {
                    public void attendTraining() {
                        System.out.println("Also attending training!");
                    }
                }
        );

        MeetingRoom meetingRoom = new MeetingRoom(attendees);

        meetingRoom.startMeeting();
    }
}