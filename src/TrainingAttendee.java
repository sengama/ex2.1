import java.util.List;

interface TrainingAttendee {
    void attendTraining();
}
 class MeetingRoom {
    private List<TrainingAttendee> attendees;
    public MeetingRoom(List<TrainingAttendee> attendees) {
        this.attendees = attendees;
    }

    public void startMeeting() {
        for (TrainingAttendee attendee : attendees) {
            attendee.attendTraining();
        }
    }
}