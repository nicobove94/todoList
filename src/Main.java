public class Main {
    public static void main(String[] args) {
        /* TESTER

        Model.Schedule schedule = new Model.Schedule();
        Model.Task umlClassDiagram = new Model.Assignment("IST311", LocalDateTime.of(2023, 2, 19, 23, 59), "UML Class Diagram");
        Model.Task cyber342wQuiz = new Model.Assignment("CYBER342W", LocalDateTime.of(2023, 2, 22, 23, 59), "Module 5 Quiz");

        Model.Task chillOutGig = new Model.Event("Chill Out Hookah Lounge Gig", 2, "Chill Out Hookah Lounge", LocalDateTime.of(2023, 2, 17, 20, 0));

        schedule.addTask(umlClassDiagram);
        schedule.addTask(cyber342wQuiz);
        schedule.addTask(chillOutGig);

        System.out.println(schedule);
        */

        /* Incomplete command line implementation

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("Enter the name of the event");
            String name = sc.nextLine();

            System.out.println("Enter the date in the following order separated by spaces: Year, Month, Day, Hour, Minute");
            int[] array = new int[5];
            while (true) {
                try {
                    for (int i = 0; i < 5; i++) {
                        array[i] = sc.nextInt();
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Too many variables. Try again.");
                }
                if (!(array.length == 5)) {
                    System.out.println("Incorrect number of variables. Try again");
                }
                else {
                    break;
                }
            }
        }
         */
    }
}