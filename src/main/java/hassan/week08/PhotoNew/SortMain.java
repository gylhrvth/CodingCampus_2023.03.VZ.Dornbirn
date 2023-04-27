package hassan.week08.PhotoNew;

public class SortMain {
    public static void main(String[] args) {

        NewMemory[] memories = {
                new NewMemory("Lexar", 15, 5),
                new NewMemory("Samsung", 100, 50),
                new NewMemory("SanDisk", 200, 0),
                new NewMemory("Lexar", 10, 5),
                new NewMemory("Transcend", 111, 22),
                new NewMemory("Lexar", 25, 5),
                new NewMemory("Lexar", 20, 5)

        };

        sortByCapacityAndModel(memories);
        for (NewMemory memory : memories) {
            System.out.println(memory.getModel() + " - " + memory.getCapacity() + "GB");
        }

    }

    public static void sortByCapacityAndModel(NewMemory[] memories) {
        for (int i = 0; i < memories.length - 1; i++) {
            for (int j = 0; j < memories.length - i - 1; j++) {
                if (memories[j].getModel().compareTo(memories[j + 1].getModel()) > 0 ||
                        (memories[j].getModel().compareTo(memories[j + 1].getModel()) == 0 && memories[j].getCapacity() < memories[j +1].getCapacity())

                ) {
                    NewMemory temp = memories[j];
                    memories[j] = memories[j + 1];
                    memories[j + 1] = temp;
                }
            }
        }
    }


}
