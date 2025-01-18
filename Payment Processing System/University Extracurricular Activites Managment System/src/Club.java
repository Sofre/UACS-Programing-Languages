public class Club implements Activity{
    @Override
    public void registerStudent(String student) {
        System.out.println("Registered student : "+student);

    }

    @Override
    public void scheduledEvent(String date) {
        System.out.println("Event set date : "+ date);

    }

    @Override
    public String getActivityDetails() {
        System.out.println("Club has registered new student !");
        System.out.println("Event date has been set ! ");
        return null;
    }
}
