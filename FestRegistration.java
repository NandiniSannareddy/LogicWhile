class Participant {
    private int participantId;
    private String name;
    private double baseRegistrationFee;
    private int numberOfEvents;
    private double eventChargePerEvent;

    void setParticipantId(int id) {
        participantId = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBaseRegistrationFee(double basefee) {
        baseRegistrationFee = basefee;
    }

    void setNumberOfEvents(int count) {
        numberOfEvents = count;
    }

    void setEventChargePerEvent(double charge) {
        eventChargePerEvent = charge;
    }

    int getParticipantId() {
        return participantId;
    }

    String getName() {
        return name;
    }

    double getBaseRegistrationFee() {
        return baseRegistrationFee;
    }

    int getNumberOfEvents() {
        return numberOfEvents;
    }

    double getEventChargePerEvent() {
        return eventChargePerEvent;
    }

    double calculateTotalFee() {
        return baseRegistrationFee + (numberOfEvents * eventChargePerEvent);
    }

    void displayDetails() {
        System.out.println("\nParticipant Record");
        System.out.println("ID: " + getParticipantId());
        System.out.println("Name: " + getName());
        System.out.println("Base Registration Fee: " + getBaseRegistrationFee());
        System.out
                .println("Event Charges: " + getNumberOfEvents() + " events @ " + getEventChargePerEvent() + "/event");
        System.out.println("Total Fee: " + calculateTotalFee());
    }

}

public class FestRegistration {
    public static void main(String[] args) {
        Participant p = new Participant();
        p.setParticipantId(501);
        p.setName("Nandini");
        p.setBaseRegistrationFee(200);
        p.setEventChargePerEvent(100);
        p.setNumberOfEvents(3);
        p.displayDetails();

    }
}
