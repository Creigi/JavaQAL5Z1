import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        System.out.println(service.countOfSqrFor(100, 11000));

    }
}
