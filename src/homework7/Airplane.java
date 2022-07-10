package homework7;

public class Airplane {
    private Wing wing;

    static class Wing {
        float weight = 1450.2f;

        public void setWeight(float weight) {
            this.weight = weight;
        }

        public void showWeight() {
            System.out.println("Вес крыла - " + this.weight + " кг.");
        }
    }

    public static void main(String[] args) {
        Wing wing1 = new Wing();
        Wing wing2 = new Wing();

        wing1.showWeight();
        wing2.showWeight();

        wing1.setWeight(1256.32f);
        wing2.setWeight(1384.54f);

        wing1.showWeight();
        wing2.showWeight();
    }
}
