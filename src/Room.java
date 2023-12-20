public class Room {
    private String type;
    private double size;
    private String amenities;
    private double rent;

    public Room(String type, double size, String amenities, double rent){
        this.type = type;
        this.size = size;
        this.amenities = amenities;
        this.rent = rent;
    }
    public double calculateRent(int duration) {
        return rent * duration;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Size: " + size + " sq.ft");
        System.out.println("Amenities: " + amenities);
        System.out.println("Rent: $" + rent + " per day");
    }

}
